package Bit.example.ErrorLoggingService.repository;

import Bit.example.ErrorLoggingService.entity.DefectLocation;
import Bit.example.ErrorLoggingService.entity.VehichleDefect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefectLocationRepository extends JpaRepository<DefectLocation,Long> {

}
