import {Component, HostListener} from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {CarBrand, CarType, GetVehiclesService, PostVehicleObject} from "../services/get-vehicles.service";
import {FormControl} from "@angular/forms";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-addvehicle',
  templateUrl: './addvehicle.component.html',
  styleUrls: ['./addvehicle.component.scss']
})
export class AddvehicleComponent {
  card3Rows!: number;
  public innerWidth: any;
  cols!: number;
  brands!: CarBrand;
  carBrand!: CarBrand;
  carType!: CarType;



  constructor(private breakpointObserver: BreakpointObserver, private _snackBar: MatSnackBar, private getVehiclesService: GetVehiclesService) {
    this.innerWidth = window.innerWidth;

  }

  ngOnInit(): void {
    this.innerWidth = window.innerWidth;
  }

  @HostListener('window:resize', ['$event'])
  onResize(event: any) {
    this.innerWidth = window.innerWidth;
  }


  getBrandEnum(): CarBrand {
    // @ts-ignore
    return CarBrand;
  }

  getTypeEnum(): CarType {
    // @ts-ignore
    return CarType;
  }




  submitVehicle(data: any) {
    if (this.vehicleValidate(data)) {
      this.getVehiclesService.addVehicle(data);
      this.openSnackBar("Create vehicle!");
    }
    else {
      this.openSnackBar("Cannot create vehicle!");
    }
  }

  vehicleValidate(data: any): boolean {
    return true;
  }

  openSnackBar(message: string) {
    this._snackBar.open(message, 'OK', {duration: 2500});
  }

}
