package maciej.kubis.carweb.vehiclemodule.service;

import maciej.kubis.carweb.exception.NotFoundException;
import maciej.kubis.carweb.vehiclemodule.api.request.VehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.request.UpdateVehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.response.VehicleResponse;
import maciej.kubis.carweb.vehiclemodule.domain.Vehicle;
import maciej.kubis.carweb.vehiclemodule.repository.VehicleRepository;
import maciej.kubis.carweb.vehiclemodule.support.VehicleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    public VehicleService(VehicleRepository vehicleRepository, VehicleMapper vehicleMapper) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleMapper = vehicleMapper;
    }

    public VehicleResponse create(VehicleRequest vehicleRequest) {
        vehicleValidate(vehicleRequest);
        Vehicle vehicle = vehicleRepository.save(vehicleMapper.toVehicle(vehicleRequest));
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
        vehicleValidate(updateVehicleRequest);
        vehicleRepository.save(vehicleMapper.toUpdate(vehicle, updateVehicleRequest));
        return vehicleMapper.toVehicleResponse(vehicle);
    }

    public VehicleResponse updateById(UUID id, UpdateVehicleRequest updateVehicleRequest) {
        Vehicle vehicle = isExists(id);
        vehicleValidate(updateVehicleRequest);
        vehicleRepository.save(vehicleMapper.toUpdate(vehicle, updateVehicleRequest));
        return vehicleMapper.toVehicleResponse(vehicle);
    }

    private void vehicleValidate(VehicleRequest productRequest) {
//        if (!(productSupportService.findSizeById(productRequest.getSize())
//                && productSupportService.findSexById(productRequest.getSex())
//                && productSupportService.findCategoryById(productRequest.getCategory()))) {
//            throw new ConflictException();
//        }
        System.out.println("tal");
    }

    public Vehicle isExists(UUID id) {
        return vehicleRepository.findById(id).orElseThrow(() -> new NotFoundException());
    }
}
