package maciej.kubis.carweb.vehiclemodule.support;

import maciej.kubis.carweb.vehiclemodule.api.request.VehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.request.UpdateVehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.response.VehicleResponse;
import maciej.kubis.carweb.vehiclemodule.domain.Vehicle;
import org.springframework.stereotype.Component;


@Component
public class VehicleMapper {

    public Vehicle toVehicle(VehicleRequest vehicleRequest) {
        return Vehicle.builder().name(vehicleRequest.getName())
                .carBrand(vehicleRequest.getCarBrand())
                .carType(vehicleRequest.getCarType())
                .picture(vehicleRequest.getPicture())
                .speed(vehicleRequest.getSpeed())
                .controllability(vehicleRequest.getControllability())
                .acceleration(vehicleRequest.getAcceleration())
                .braking(vehicleRequest.getBraking())
                .offRoadDriving(vehicleRequest.getOffRoadDriving())
                .power(vehicleRequest.getPower())
                .torque(vehicleRequest.getTorque())
                .weight(vehicleRequest.getWeight())
                .engineCapacity(vehicleRequest.getEngineCapacity()).build();
    }

    public VehicleResponse toVehicleResponse(Vehicle vehicle) {
        return VehicleResponse.builder().vehicleId(vehicle.getVehicleId())
                .name(vehicle.getName())
                .carBrand(vehicle.getCarBrand())
                .carType(vehicle.getCarType())
                .picture(vehicle.getPicture())
                .speed(vehicle.getSpeed())
                .controllability(vehicle.getControllability())
                .acceleration(vehicle.getAcceleration())
                .braking(vehicle.getBraking())
                .offRoadDriving(vehicle.getOffRoadDriving())
                .power(vehicle.getPower())
                .torque(vehicle.getTorque())
                .weight(vehicle.getWeight())
                .engineCapacity(vehicle.getEngineCapacity())
                .tuningTirePressure(vehicle.getTuningTirePressure())
                .tuningwheelAlignment(vehicle.getTuningwheelAlignment())
                .tuningStabilizers(vehicle.getTuningStabilizers())
                .tuningSprings(vehicle.getTuningSprings())
                .tuningSuspensionHeight(vehicle.getTuningSuspensionHeight())
                .tuningSuspensionStiffness(vehicle.getTuningSuspensionStiffness())
                .tuningBrakingForce(vehicle.getTuningBrakingForce())
                .tuningFrontDifferential(vehicle.getTuningFrontDifferential())
                .tuningRearDifferential(vehicle.getTuningRearDifferential()).build();
    }

    public Vehicle toUpdate(Vehicle vehicle, UpdateVehicleRequest updateVehicleRequest) {
        return Vehicle.builder().vehicleId(updateVehicleRequest.getVehicleId())
                .name(updateVehicleRequest.getName())
                .carBrand(updateVehicleRequest.getCarBrand())
                .carType(updateVehicleRequest.getCarType())
                .picture(updateVehicleRequest.getPicture())
                .speed(updateVehicleRequest.getSpeed())
                .controllability(updateVehicleRequest.getControllability())
                .acceleration(updateVehicleRequest.getAcceleration())
                .braking(updateVehicleRequest.getBraking())
                .offRoadDriving(updateVehicleRequest.getOffRoadDriving())
                .power(updateVehicleRequest.getPower())
                .torque(updateVehicleRequest.getTorque())
                .weight(updateVehicleRequest.getWeight())
                .engineCapacity(updateVehicleRequest.getEngineCapacity()).build();
    }
}
