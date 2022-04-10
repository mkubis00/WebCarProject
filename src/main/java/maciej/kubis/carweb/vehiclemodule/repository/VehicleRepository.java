package maciej.kubis.carweb.vehiclemodule.repository;

import maciej.kubis.carweb.vehiclemodule.domain.CarBrandEnum;
import maciej.kubis.carweb.vehiclemodule.domain.CarTypeEnum;
import maciej.kubis.carweb.vehiclemodule.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {

    @Transactional
    List<Vehicle> findAllByCarBrand(CarBrandEnum carBrandEnum);
}