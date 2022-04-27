package nl.novi.uitproberen3.models;

public class Account {
    private String personalInfo;
    private byte[] profilePicture;
    // moet ik een aparte entiteit aanmaken voor profiel foto?
    private String activiteitenLog;
    // moet ik een aparte entiteit aanmaken voor activiteiten log?
}




//example:
//public class Image {
//    @Id
//    @Column(name = "image_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long imageId;
//
//    @Column(name = "image_name")
//    private String imageName;
//
//    @Column(name = "image_type")
//    private String imageType;
//
//    @Lob
//    @Column(name = "image")
//    private byte[] image;
//
//    @OneToOne(mappedBy = "userProfilePicture")
//    private User userProfilePicture;
//}