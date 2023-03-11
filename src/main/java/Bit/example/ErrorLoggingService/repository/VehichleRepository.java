package Bit.example.ErrorLoggingService.repository;

import Bit.example.ErrorLoggingService.entity.Vehichle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehichleRepository extends JpaRepository<Vehichle,Long> {

}


