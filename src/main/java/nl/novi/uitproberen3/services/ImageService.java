package nl.novi.uitproberen3.services;

import org.springframework.util.StringUtils;
import nl.novi.uitproberen3.exceptions.RecordNotFoundException;
import nl.novi.uitproberen3.models.Image;
import nl.novi.uitproberen3.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.Optional;

@Service
public class ImageService {
    private ImageRepository imageRepository;

    @Value("${my.upload_location}")
    private Path fileStrongPath;
    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }


    public Optional<Image> getImageById(String imageName) {
        if (!imageRepository.existsById(imageName)) throw new RecordNotFoundException("Afbeelding niet gevonden.");
        return imageRepository.findById(imageName);
    }

    public String saveImage (MultipartFile file) {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        Path filePath = Paths.get(fileStrongPath + "\\" + fileName);
        try {
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException iex){
            throw new RuntimeException("Error while saving file");
        }
        return fileName;
    }



}




//        Image img = new Image();
//        img.setMediaType(file.getContentType()); //dit moet dan in de service opgeslagen worden..
//        var a = file.getResource();
//        try {
//            img.image = file.getBytes();
//        }
//        catch (IOException iex){
//            return "Error while uploading image"; // kan deze error nog specificeren.
//        }
//        imageRepository.save(img);  //die methode aanmaken in service
//        return "Image uploaded";
