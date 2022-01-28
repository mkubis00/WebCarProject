package maciej.kubis.carweb.vehiclemodule.api.request;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import maciej.kubis.carweb.vehiclemodule.domain.CarBrandEnum;

import java.util.UUID;

@Data
@Jacksonized
@Builder(builderMethodName = "UpdateVehicleBuilder")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateVehicleRequest extends VehicleRequest {

    private UUID vehicleId;
    private String name;
    private CarBrandEnum carBrand;
    private CarBrandEnum carType;
    private String picture;

    private float speed;
    private float controllability;
    private float acceleration;
    private float braking;
    private float offRoadDriving;
    private float power;
    private float torque;
    private float weight;
    private float engineCapacity;
}
