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
                .tuningTirePressure(vehicleRequest.getTuningTirePressure())
                .tuningwheelAlignment(vehicleRequest.getTuningwheelAlignment())
                .tuningStabilizers(vehicleRequest.getTuningStabilizers())
                .tuningSprings(vehicleRequest.getTuningSprings())
                .tuningSuspensionHeight(vehicleRequest.getTuningSuspensionHeight())
                .tuningSuspensionStiffness(vehicleRequest.getTuningSuspensionStiffness())
                .tuningBrakingForce(vehicleRequest.getTuningBrakingForce())
                .tuningFrontDifferential(vehicleRequest.getTuningFrontDifferential())
                .tuningRearDifferential(vehicleRequest.getTuningRearDifferential()).build();
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
                .tuningTirePressure(updateVehicleRequest.getTuningTirePressure())
                .tuningwheelAlignment(updateVehicleRequest.getTuningwheelAlignment())
                .tuningStabilizers(updateVehicleRequest.getTuningStabilizers())
                .tuningSprings(updateVehicleRequest.getTuningSprings())
                .tuningSuspensionHeight(updateVehicleRequest.getTuningSuspensionHeight())
                .tuningSuspensionStiffness(updateVehicleRequest.getTuningSuspensionStiffness())
                .tuningBrakingForce(updateVehicleRequest.getTuningBrakingForce())
                .tuningFrontDifferential(updateVehicleRequest.getTuningFrontDifferential())
                .tuningRearDifferential(updateVehicleRequest.getTuningRearDifferential()).build();
    }
}
