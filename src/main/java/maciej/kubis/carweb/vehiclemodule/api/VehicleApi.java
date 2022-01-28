package maciej.kubis.carweb.vehiclemodule.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import maciej.kubis.carweb.vehiclemodule.api.request.VehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.request.UpdateVehicleRequest;
import maciej.kubis.carweb.vehiclemodule.api.response.VehicleResponse;
import maciej.kubis.carweb.vehiclemodule.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Api(tags = "Vehicle")
@RequestMapping("/api/v1/vehicle")
public class VehicleApi {

    private final VehicleService vehicleService;

    public VehicleApi(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    @ApiOperation("Create vehicle")
    public ResponseEntity<VehicleResponse> create(@RequestBody VehicleRequest vehicleRequest){
        VehicleResponse vehicleResponse = vehicleService.create(vehicleRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicleResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find vehicle")
    public ResponseEntity<VehicleResponse> find(@PathVariable UUID id) {
        VehicleResponse vehicleResponse = vehicleService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(vehicleResponse);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete vehicle")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        vehicleService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    @ApiOperation("Find all vehicles")
    public ResponseEntity<List<VehicleResponse>> findAll() {
        List<VehicleResponse> vehicleResponses = vehicleService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(vehicleResponses);
    }

    @PutMapping
    @ApiOperation("Update vehicle")
    public ResponseEntity<VehicleResponse> update(@RequestBody UpdateVehicleRequest updateVehicleRequest) {
        VehicleResponse productResponse = vehicleService.update(updateVehicleRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update vehicle by id")
    public ResponseEntity<VehicleResponse> updateById(@PathVariable UUID id, UpdateVehicleRequest updateVehicleRequest) {
        VehicleResponse productResponse = vehicleService.updateById(id, updateVehicleRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
}
