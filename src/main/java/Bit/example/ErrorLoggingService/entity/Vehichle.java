package Bit.example.ErrorLoggingService.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Vehichle")
public class Vehichle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vehichle_id")
    private int vehichleId;
    @Column(name="vehichle_name")
    private String vehichleName;

    public Vehichle() {
    }

    public Vehichle(int vehichleId, String vehichleName) {
        this.vehichleId = vehichleId;
        this.vehichleName = vehichleName;
    }

    public int getVehichleId() {
        return vehichleId;
    }

    public void setVehichleId(int vehichleId) {
        this.vehichleId = vehichleId;
    }

    public String getVehichleName() {
        return vehichleName;
    }

    public void setVehichleName(String vehichleName) {
        this.vehichleName = vehichleName;
    }
}
