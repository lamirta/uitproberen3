package nl.novi.uitproberen3.controllers;

import nl.novi.uitproberen3.models.Image;
import nl.novi.uitproberen3.services.ImageService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ImageController {
    private ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @PostMapping("/images")
    public String uploadImage(@RequestBody MultipartFile file) {
        return service.saveImage(file);
        // whitedragon fileUpload even checken, single upload > filesystem controller.
        // Geef URL terug, wanneer ze die afbeelding uploaden.
    }

    //produces = MediaType.MULTIPART_MIXED_VALUE
    @GetMapping(value = "/images/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getImageById(@PathVariable String imageName) {
        Image img = service.getImageById(imageName).get();
        return img.image;
    }

//    @GetMapping(value = "/images/{username}", produces = MediaType.IMAGE_JPEG_VALUE)
//    public @ResponseBody byte[] getImageByUsername(@PathVariable String username) {
//        Image img = imageRepository.findById(id).get();
//        return img.image;
//    }
//
    @DeleteMapping(value = "/images/{id}")
    public void deleteImage(@PathVariable("id") Long id) {

//        imageService.deleteImage(id);

    }
}
