package com.RonitCodes.MovieApi.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {

        // 1. get name of the file
        if(Files.exists(Paths.get(path + file.getOriginalFilename()))){
            throw new FileAlreadyExistsException("File already exists");
        }
        String fileName = file.getOriginalFilename();

        // 2. to get the file path
        String filePath = path + File.separator + fileName;

        // create file object
        File f = new File(path);
        if(!f.exists()) {
            f.mkdir();
        }

        // copy the file or upload file to the path
        Files.copy(file.getInputStream(), Paths.get(filePath));

        return fileName;
    }

    @Override
    public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {
        String filePath = path + File.separator + fileName;
        return new FileInputStream(filePath);
    }
}