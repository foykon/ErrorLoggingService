package Bit.example.ErrorLoggingService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="DefectLocation")
public class DefectLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="defect_location_id")
    private int defectLocationId;

    @ManyToOne
    @JoinColumn(name = "vehichle_defect_id",referencedColumnName = "vehichle_defect_id")
    private VehichleDefect vehichleDefectId;


    @Column(name="defect_location_x")
    private int defectLocationX;

    @Column(name="defect_location_y")
    private int defectLocationY;

}
