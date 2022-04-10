package maciej.kubis.carweb.vehiclemodule.api.request;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import maciej.kubis.carweb.vehiclemodule.domain.CarTypeEnum;

@Data
@Jacksonized
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleTypePowerRequest {

    private CarTypeEnum carTypeEnum;
    private float power;
}
