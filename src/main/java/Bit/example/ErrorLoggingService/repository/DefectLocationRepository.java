package Bit.example.ErrorLoggingService.repository;

import Bit.example.ErrorLoggingService.entity.DefectLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefectLocationRepository extends JpaRepository<DefectLocation,Long> {

}
