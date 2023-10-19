package apiservices.echovibesapp.services;

import apiservices.echovibesapp.models.song.Song;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadServiceImp implements FileUploadService {
    private final S3Service s3Service;
    private final SongService songService;

    public FileUploadServiceImp(S3Service s3Service, SongService songService) {
        this.s3Service = s3Service;
        this.songService = songService;
    }

    @Override
    public void uploadFile(MultipartFile file) {
        try {
            String fileName = file.getOriginalFilename();
            String url = s3Service.uploadFile(fileName, file.getInputStream(), file.getSize());

            // Extract song information (e.g., title, artist, album, genre, URL)
//            String title = "";
//            Artist artist = "...";
//            Album album = ...;
//            Genre genre = ...;
//            String url = ...;

            // Create and save the song record
            Song song = new Song("haha", url);
            songService.save(song);
        } catch (Exception e) {
            // Handle exception (e.g., log it or throw a custom exception)
        }
    }
}
