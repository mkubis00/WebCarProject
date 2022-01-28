package maciej.kubis.carweb.vehiclemodule.api.request;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import maciej.kubis.carweb.vehiclemodule.domain.CarBrandEnum;
import maciej.kubis.carweb.vehiclemodule.domain.CarTypeEnum;


@Data
@Jacksonized
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleRequest {

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
}
