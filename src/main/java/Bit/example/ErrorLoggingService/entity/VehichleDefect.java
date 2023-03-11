package Bit.example.ErrorLoggingService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="VehichleDefect")
public class VehichleDefect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vehichle_defect_id")
    private int vehichleDefectId;

    @ManyToOne
    @JoinColumn(name = "vehichle_id",referencedColumnName = "vehichle_id")
    private Vehichle vehichleId;

    @OneToMany(mappedBy = "vehichleDefectId")
    private List<DefectLocation> defectLocations;

    @Column(name="vehichle_defect_description")
    private String vehichleDefectDescription;


}
