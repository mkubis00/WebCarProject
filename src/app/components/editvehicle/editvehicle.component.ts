import { Component } from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {GetVehiclesService, VehicleObject} from "../services/get-vehicles.service";
import {AllvehiclesComponent} from "../allvehicles/allvehicles.component";

@Component({
  selector: 'app-editvehicle',
  templateUrl: './editvehicle.component.html',
  styleUrls: ['./editvehicle.component.scss']
})
export class EditvehicleComponent {

  vehicle!: VehicleObject;
  vehicleId!: String;

  constructor(private getVehiclesService: GetVehiclesService) {

  }

  ngOnInit() {
    this.getVehiclesService.getVehicle(this.getVehiclesService.vehicleId).subscribe( value => {
      this.vehicle = value;
    });
  }
}
