package Bit.example.ErrorLoggingService.entity;

import jakarta.persistence.*;

@Entity
@Table(name="DefectLocation")
public class DefectLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="defect_location_id")
    private int defectLocationId;

    @ManyToOne
    @JoinColumn(name = "vehichle_defect_id",referencedColumnName = "vehichle_defect_id")
    private int vehichleDefectId;


    @Column(name="defect_location_x")
    private String defectLocationX;

    @Column(name="defect_location_y")
    private String defectLocationY;

    public DefectLocation() {
    }

    public DefectLocation(int defectLocationId, int vehichleDefectId, String defectLocationX, String defectLocationY) {
        this.defectLocationId = defectLocationId;
        this.vehichleDefectId = vehichleDefectId;
        this.defectLocationX = defectLocationX;
        this.defectLocationY = defectLocationY;
    }

    public int getDefectLocationId() {
        return defectLocationId;
    }

    public void setDefectLocationId(int defectLocationId) {
        this.defectLocationId = defectLocationId;
    }

    public int getVehichleDefectId() {
        return vehichleDefectId;
    }

    public void setVehichleDefectId(int vehichleDefectId) {
        this.vehichleDefectId = vehichleDefectId;
    }

    public String getDefectLocationX() {
        return defectLocationX;
    }

    public void setDefectLocationX(String defectLocationX) {
        this.defectLocationX = defectLocationX;
    }

    public String getDefectLocationY() {
        return defectLocationY;
    }

    public void setDefectLocationY(String defectLocationY) {
        this.defectLocationY = defectLocationY;
    }
}
