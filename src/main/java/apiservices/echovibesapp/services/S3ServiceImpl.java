//package apiservices.echovibesapp.services;
//
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class S3ServiceImpl implements S3Service{
//
//    private final AmazonS3Client s3Client;
//
//    public S3ServiceImpl(AmazonS3Client s3Client) {
//        this.s3Client = s3Client;
//    }
//
//    @Override
//    public void uploadFile(String bucketName, String fileName, MultipartFile multipartFile) {
//        try {
//            ObjectMetadata metadata = new ObjectMetadata();
//            metadata.setContentLength(multipartFile.getSize());
//
//            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName,
//                    multipartFile.getInputStream(), metadata);
//
//            s3Client.putObject(putObjectRequest);
//        } catch (IOException e) {
//            // Handle the exception (e.g., log it or throw a custom exception)
//        }
//    }
//
//    @Override
//    public void downloadFile(String bucketName, String fileName, File file) {
//        // todo
//    }
//
//    @Override
//    public void deleteFile(String bucketName, String fileName) {
//        // todo
//    }
//
//    @Override
//    public List<String> listFiles(String bucketName) {
////        ListObjectsRequest listObjectsRequest = new ListObjectsRequest(bucketName);
////        ListObjectsResponse listObjectsResult = s3Client.listObjects(listObjectsRequest);
////
////        List<String> fileNames = new ArrayList<>();
////        for (S3ObjectSummary objectSummary : listObjectsResult.getObjectSummaries()) {
////            fileNames.add(objectSummary.getKey());
////        }
//
////        return fileNames;
//        return null;
//    }
//}
