package Bit.example.ErrorLoggingService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="Vehichle")
public class Vehichle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vehichle_id")
    private int vehichleId;

    @Column(name="vehichle_name")
    private String vehichleName;

    @OneToMany(mappedBy = "vehichleId")
    private List<VehichleDefect> vehichleDefects;


}
