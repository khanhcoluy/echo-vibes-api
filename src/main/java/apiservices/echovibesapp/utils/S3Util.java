package apiservices.echovibesapp.utils;

import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.InputStream;

public class S3Util {
    private final String bucketName;
    private final S3Client s3Client;

    public S3Util(@Value("${aws.s3.bucketName}") String bucketName, S3Client s3Client) {
        this.bucketName = bucketName;
        this.s3Client = s3Client;
    }

    public void uploadFile(String fileName, InputStream inputStream, long contentLength) {
        PutObjectRequest objectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(fileName)
                .build();

        s3Client.putObject(objectRequest, RequestBody.fromInputStream(inputStream, contentLength));
    }
}
