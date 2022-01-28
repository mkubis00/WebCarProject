package maciej.kubis.carweb.vehiclemodule.api.response;

import lombok.*;
import maciej.kubis.carweb.vehiclemodule.domain.CarBrandEnum;
import maciej.kubis.carweb.vehiclemodule.domain.CarTypeEnum;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleResponse {
    private UUID vehicleId;
    private String name;
    private CarBrandEnum carBrand;
    private CarTypeEnum carType;
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

    private float tuningTirePressure;
    private float tuningwheelAlignment;
    private float tuningStabilizers;
    private float tuningSprings;
    private float tuningSuspensionHeight;
    private float tuningSuspensionStiffness;
    private float tuningBrakingForce;
    private float tuningFrontDifferential;
    private float tuningRearDifferential;
}
