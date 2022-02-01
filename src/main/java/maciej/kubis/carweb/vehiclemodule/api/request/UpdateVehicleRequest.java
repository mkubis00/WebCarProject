package maciej.kubis.carweb.vehiclemodule.api.request;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import maciej.kubis.carweb.vehiclemodule.domain.CarBrandEnum;
import maciej.kubis.carweb.vehiclemodule.domain.CarTypeEnum;

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
    private CarTypeEnum carType;
    private String picture;

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
