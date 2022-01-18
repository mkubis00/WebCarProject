package maciej.kubis.carweb.vehicleModule.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import maciej.kubis.carweb.vehicleModule.domain.CarBrandEnum;

import java.util.UUID;

@Data
@Jacksonized
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleRequest {

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
