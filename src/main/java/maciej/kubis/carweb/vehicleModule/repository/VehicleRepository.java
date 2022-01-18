package maciej.kubis.carweb.vehicleModule.repository;

import maciej.kubis.carweb.vehicleModule.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
}