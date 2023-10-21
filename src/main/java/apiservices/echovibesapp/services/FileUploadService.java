package apiservices.echovibesapp.services;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    void uploadFile(MultipartFile file, String title, Integer artistId, Integer albumId, Integer genreId);
}
