package apiservices.echovibesapp.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

public interface S3Service {

    void uploadFile(String bucketName, String fileName, MultipartFile multipartFile);

    void downloadFile(String bucketName, String fileName, File file);

    void deleteFile(String bucketName, String fileName);

    List<String> listFiles(String bucketName);
}
