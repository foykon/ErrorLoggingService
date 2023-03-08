package Bit.example.ErrorLoggingService.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Vehichle")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="image_id")
    private int imageId;

    @Column(name="image_name")
    private String imageName;

    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] imageData;
}
