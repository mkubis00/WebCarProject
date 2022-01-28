package maciej.kubis.carweb.vehiclemodule.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue
    @Column(unique = true, nullable = false)
    private UUID vehicleId;

    @Column(name = "name", nullable = true, length = 200, updatable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "carbrand", nullable = false, updatable = false)
    private CarBrandEnum carBrand;

    @Enumerated(EnumType.STRING)
    @Column(name = "cartype", nullable = false, updatable = false)
    private CarBrandEnum carType;

    @Column(name = "picture", length = 400)
    private String picture;

    @Column(name = "speed")
    private float speed;
    @Column(name = "controllability")
    private float controllability;
    @Column(name = "acceleration")
    private float acceleration;
    @Column(name = "braking")
    private float braking;
    @Column(name = "offRoadDriving")
    private float offRoadDriving;
    @Column(name = "power")
    private float power;
    @Column(name = "torque")
    private float torque;
    @Column(name = "weight")
    private float weight;
    @Column(name = "engineCapacity")
    private float engineCapacity;

    @Column(name = "tuningTirePressure")
    private float tuningTirePressure;
    @Column(name = "tuningwheelAlignment")
    private float tuningwheelAlignment;
    @Column(name = "tuningStabilizers")
    private float tuningStabilizers;
    @Column(name = "tuningSprings")
    private float tuningSprings;
    @Column(name = "tuningSuspensionHeight")
    private float tuningSuspensionHeight;
    @Column(name = "tuningSuspensionStiffness")
    private float tuningSuspensionStiffness;
    @Column(name = "tuningBrakingForce")
    private float tuningBrakingForce;
    @Column(name = "tuningFrontDifferential")
    private float tuningFrontDifferential;
    @Column(name = "tuningRearDifferential")
    private float tuningRearDifferential;
}
