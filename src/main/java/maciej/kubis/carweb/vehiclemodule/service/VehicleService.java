package maciej.kubis.carweb.vehiclemodule.service;

import lombok.RequiredArgsConstructor;
import maciej.kubis.carweb.exception.NotFoundException;
import maciej.kubis.carweb.vehiclemodule.api.request.VehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.request.UpdateVehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.response.VehicleResponse;
import maciej.kubis.carweb.vehiclemodule.domain.CarBrandEnum;
import maciej.kubis.carweb.vehiclemodule.domain.Vehicle;
import maciej.kubis.carweb.vehiclemodule.repository.VehicleRepository;
import maciej.kubis.carweb.vehiclemodule.support.VehicleManager;
import maciej.kubis.carweb.vehiclemodule.support.VehicleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;
    private final VehicleManager vehicleManager;



    public VehicleResponse create(VehicleRequest vehicleRequest) {
        Vehicle vehicle = vehicleMapper.toVehicle(vehicleRequest);
        vehicleManager.calculate(vehicle);
        vehicleRepository.save(vehicle);
        return vehicleMapper.toVehicleResponse(vehicle);
    }

    public VehicleResponse find(UUID id) {
        Vehicle vehicle = isExists(id);
        return vehicleMapper.toVehicleResponse(vehicle);

    }

    public void delete(UUID id) {
        Vehicle vehicle = isExists(id);
        vehicleRepository.deleteById(vehicle.getVehicleId());
    }

    public List<VehicleResponse> findAll() {
        return vehicleRepository.findAll().stream().map(vehicleMapper::toVehicleResponse).collect(Collectors.toList());
    }

    public VehicleResponse update(UpdateVehicleRequest updateVehicleRequest) {
        Vehicle vehicle = isExists(updateVehicleRequest.getVehicleId());
        vehicle = vehicleMapper.toUpdate(vehicle, updateVehicleRequest);
        vehicleManager.calculate(vehicle);
        vehicleRepository.save(vehicle);
        return vehicleMapper.toVehicleResponse(vehicle);
    }

    public VehicleResponse updateById(UUID id, UpdateVehicleRequest updateVehicleRequest) {
        Vehicle vehicle = isExists(id);
        vehicleManager.calculate(vehicle);
        vehicleRepository.save(vehicleMapper.toUpdate(vehicle, updateVehicleRequest));
        return vehicleMapper.toVehicleResponse(vehicle);
    }

    public Vehicle isExists(UUID id) {
        return vehicleRepository.findById(id).orElseThrow(() -> new NotFoundException());
    }

    public List<VehicleResponse> findByBrand(CarBrandEnum carBrandEnum) {
        return vehicleRepository.findAllByCarBrand(carBrandEnum).stream().map(vehicleMapper::toVehicleResponse).collect(Collectors.toList());
    }
}
