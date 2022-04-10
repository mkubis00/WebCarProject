package maciej.kubis.carweb.vehiclemodule.support;

import lombok.Data;
import maciej.kubis.carweb.vehiclemodule.domain.Vehicle;
import org.springframework.stereotype.Component;

@Component
@Data
public class VehicleManager {

    public void calculate(Vehicle vehicle) {
        calculateSpeed(vehicle);
        calculateControllability(vehicle);
        calculateOffRoadDriving(vehicle);
        calculateWeight(vehicle);
        calculateEngineCapacity(vehicle);
        calculateBraking(vehicle);
        calculateAcceleration(vehicle);
        calculatePower(vehicle);
        calculateTorque(vehicle);
    }

    private void calculateSpeed(Vehicle vehicle) {
        vehicle.setSpeed((float) (5 + 6.7/vehicle.getTuningStabilizers() + vehicle.getTuningTirePressure()/10));
    }

    private void calculateControllability(Vehicle vehicle) {
        float a = (vehicle.getTuningStabilizers() * vehicle.getTuningSuspensionStiffness() / 100);
        float b = (vehicle.getTuningRearDifferential() + vehicle.getTuningFrontDifferential() / 5);
        if ( a + b > 10) {
            vehicle.setControllability(10);
        } else {
            vehicle.setControllability((a + b / 3));
        }
    }

    private void calculateAcceleration(Vehicle vehicle) {
        vehicle.setAcceleration((vehicle.getWeight()/3 + vehicle.getTuningSuspensionHeight()) / 2);
    }

    private void calculateBraking(Vehicle vehicle) {
        vehicle.setBraking((float) ( vehicle.getTuningSuspensionStiffness()/10 + vehicle.getWeight()/1000 + 4.5));
    }

    private void calculateOffRoadDriving(Vehicle vehicle) {
        switch (vehicle.getCarType()) {
            case SUPER_GT:
            case HYPERCARS:
            case CLASSIC_MUSCLE:
            case CLASS_SPORT_CARS:
                vehicle.setOffRoadDriving((float) ((Math.random() * (10 - 7)) + 7));
                break;
            default:
                vehicle.setOffRoadDriving((float) ((Math.random() * (8 - 3)) + 3));
                break;
        }
    }

    private void calculatePower(Vehicle vehicle) {
        float power = vehicle.getSpeed() + vehicle.getAcceleration() / 2;
        vehicle.setPower(power);
    }

    private void calculateTorque(Vehicle vehicle) {
        vehicle.setTorque(vehicle.getEngineCapacity()%10);
    }

    private void calculateWeight(Vehicle vehicle) {
        switch (vehicle.getCarType()) {
            case SUPER_GT:
            case HYPERCARS:
            case CLASSIC_MUSCLE:
            case CLASS_SPORT_CARS:
            case RETRO_SUPER_CARS:
            case MORDER_MUSCLE:
                vehicle.setWeight((float) ((Math.random() * (1000 - 1500)) + 1000));
                break;
            default:
                vehicle.setWeight((float) ((Math.random() * (2000 - 3500)) + 2000));
                break;
        }
    }

    private void calculateEngineCapacity(Vehicle vehicle) {
        vehicle.setEngineCapacity((float) ((Math.random() * (8 - 1)) + 1));
    }
}
