package apiservices.echovibesapp.services;

import java.io.InputStream;

public interface S3Service {
    void uploadFile(String fileName, InputStream inputStream, long contentLength);
}
