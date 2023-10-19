package apiservices.echovibesapp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetUrlRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;

import java.io.InputStream;

@Service
public class S3ServiceImpl implements S3Service{

    private final String bucketName;
    private final S3Client s3Client;

    public S3ServiceImpl(@Value("${aws.s3.bucketName}")String bucketName, S3Client s3Client) {
        this.bucketName = bucketName;
        this.s3Client = s3Client;
    }

    @Override
    public String uploadFile(String fileName, InputStream inputStream, long contentLength) {
        PutObjectRequest objectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(fileName)
                .build();

        PutObjectResponse response = s3Client.putObject(objectRequest, RequestBody.fromInputStream(inputStream, contentLength));
        // Extract the URL from the response
        GetUrlRequest getUrlRequest = GetUrlRequest.builder()
                .bucket(bucketName)
                .key(fileName)
                .build();
        String url = s3Client.utilities().getUrl(getUrlRequest).toString();

        return url;
    }
}
