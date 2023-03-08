package Bit.example.ErrorLoggingService.entity;

import jakarta.persistence.*;

@Entity
@Table(name="VehichleDefect")
public class VehichleDefect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vehichle_defect_id")
    private int vehichleDefectId;

    @ManyToOne
    @JoinColumn(name = "vehichle_id",referencedColumnName = "vehichle_id")
    private int vehichleId;

    @ManyToOne
    @JoinColumn(name = "image_id",referencedColumnName = "image_id")
    private byte[] imageId;


    @Column(name="vehichle_defect_description")
    private String vehichleDefectDescription;


    public VehichleDefect() {
    }

    public VehichleDefect(int vehichleDefectId, int vehichleId, String vehichleDefectDescription) {
        this.vehichleDefectId = vehichleDefectId;
        this.vehichleId = vehichleId;
        this.vehichleDefectDescription = vehichleDefectDescription;
    }

    public int getVehichleDefectId() {
        return vehichleDefectId;
    }

    public void setVehichleDefectId(int vehichleDefectId) {
        this.vehichleDefectId = vehichleDefectId;
    }

    public int getDefectedVehichleId() {
        return vehichleId;
    }

    public void setDefectedVehichleId(int vehichleId) {
        this.vehichleId = vehichleId;
    }

    public String getVehichleDefectDescription() {
        return vehichleDefectDescription;
    }

    public void setVehichleDefectDescription(String vehichleDefectDescription) {
        this.vehichleDefectDescription = vehichleDefectDescription;
    }
}
