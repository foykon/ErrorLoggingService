package Bit.example.ErrorLoggingService.repository;

import Bit.example.ErrorLoggingService.entity.Vehichle;
import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehichleDefectRepository extends JpaRepository<VehichleDefect,Long> {
    List<VehichleDefect> findByVehichle(Vehichle vehichle);
}
