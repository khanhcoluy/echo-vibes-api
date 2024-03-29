package apiservices.echovibesapp.controllers.files;

import apiservices.echovibesapp.services.FileUploadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/files")
public class FilesController {
    private final FileUploadService fileUploadService;

    public FilesController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(
            @RequestParam("file") MultipartFile[] files,
            @RequestParam("title") String title,
            @RequestParam("artistId") Integer artistId,
            @RequestParam("albumId") Integer albumId,
            @RequestParam("genreId") Integer genreId
    ) {
        try {
            for (MultipartFile file : files) {
                fileUploadService.uploadFile(file, title, artistId, albumId, genreId);
            }
            return ResponseEntity.ok("File uploaded successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File upload failed: " + e.getMessage());
        }
    }
}
