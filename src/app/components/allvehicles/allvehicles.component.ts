import {Component, HostListener} from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {GetVehiclesService, VehicleObject} from "../services/get-vehicles.service";
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-allvehicles',
  templateUrl: './allvehicles.component.html',
  styleUrls: ['./allvehicles.component.scss']
})
export class AllvehiclesComponent {
  vehicles!: Array<VehicleObject>;
  cols = 4;
  public innerWidth: any;
  vehicle!: VehicleObject;
  status!: any;


  constructor(private getVehiclesService: GetVehiclesService, private breakpointObserver: BreakpointObserver, private _snackBar: MatSnackBar) {}

  ngOnInit(): void {
    this.getVehicles();

    this.innerWidth = window.innerWidth;
    this.setCols();
  }

  getVehicles() {
    this.getVehiclesService.getVehicles().subscribe(value => {
      this.vehicles = value;
    });
  }

  @HostListener('window:resize', ['$event'])
  onResize(event: any) {
    this.innerWidth = window.innerWidth;
    this.setCols();
  }

  setCols() {
    if (this.innerWidth > 1800) {
      this.cols = 4
    } else if (this.innerWidth <= 1800 && this.innerWidth > 1200) {
      this.cols = 3
    } else if (this.innerWidth <= 1200 && this.innerWidth > 800) {
      this.cols = 2
    } else {
      this.cols = 1;
    }
  }

  deleteVehicle(vehicle: VehicleObject) {
    this.getVehiclesService.deleteVehicle(vehicle.vehicleId).subscribe({
      next: data => {
        this.status = 'Delete successful';
        this.openSnackBar(this.status);
        this.getVehicles();
      },
        error: error => {
        this.status = 'Cannot delete Vehicle';
        this.openSnackBar(this.status);
      }
    });

  }

  openSnackBar(message: string) {
    this._snackBar.open(message, 'OK', {duration: 2500});
  }

  editVehicle(vehicle: VehicleObject){
    this.getVehiclesService.setVehicleToEdit(vehicle.vehicleId);
  }
}
