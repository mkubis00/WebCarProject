import {Component, HostListener} from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {CarBrand, CarType, PostVehicleObject} from "../services/get-vehicles.service";
import {FormControl} from "@angular/forms";

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
  name!: string;
  picture!: string;
  springs = 0;
  brakingForce = 0;
  frontDifferential = 0;
  rearDifferential = 0;
  stabilizers = 0;
  suspensionHeight = 0;
  suspesionStiffness = 0;
  tirePressure = 0;
  wheelAlignment = 0;
  carBrand!: CarBrand;
  carType!: CarType;



  constructor(private breakpointObserver: BreakpointObserver) {
    this.innerWidth = window.innerWidth;
    this.setCols();
  }

  ngOnInit(): void {
    this.innerWidth = window.innerWidth;
    this.setCols();
  }

  @HostListener('window:resize', ['$event'])
  onResize(event: any) {
    this.innerWidth = window.innerWidth;
    this.setCols();
  }

  setCols() {
    if (this.innerWidth > 1100) {
      this.cols = 2;
    } else {
      this.cols = 1;
    }
  }

  getBrandEnum(): CarBrand {
    // @ts-ignore
    return CarBrand;
  }

  getTypeEnum(): CarType {
    // @ts-ignore
    return CarType;
  }

  setName(event: any){
    this.name = event.target.value;
  }

  setPicture(event: any){
    this.picture = event.target.value;
  }

  setSprings(event: any) {
    this.springs = event.value;
  }

  setBrakingForce(event: any) {
    this.brakingForce = event.value;
  }

  setFrontDifferential(event: any) {
    this.frontDifferential = event.value;
  }

  setRearDifferential(event: any) {
    this.rearDifferential = event.value;
  }

  setStabilizers(event: any) {
    this.stabilizers = event.value;
  }

  setSuspensionHeight(event: any) {
    this.suspensionHeight = event.value;
  }

  setSuspensionStiffness(event: any) {
    this.suspesionStiffness = event.value;
  }

  setTirePressure(event: any) {
    this.tirePressure = event.value;
  }

  setWheelAlignment(event: any) {
    this.wheelAlignment = event.value;
  }


}
