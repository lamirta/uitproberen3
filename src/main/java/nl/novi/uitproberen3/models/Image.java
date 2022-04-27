package nl.novi.uitproberen3.models;

import javax.persistence.*;

@Entity
public class Image {

    @Id
    private String imageName;

    @Lob
    public byte[] image;

    private String mediaType;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id", referencedColumnName = "id")
//    private Student student;
// uitzoek of dit welke precies bij student en welke bij image moet staan. is het bidirectional of niet?

    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getMediaType() {
        return mediaType;
    }
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
}
