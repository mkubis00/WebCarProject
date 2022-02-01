import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class GetVehiclesService {

  constructor(private httpClient: HttpClient) {

  }

  public  getVehicle(): Observable<VehicleObject> {
    return this.httpClient.get<VehicleObject>("http://localhost:8080/api/v1/vehicle/bfaa004b-74bd-4844-bc60-77dbd2957ce3");
  }

  public getVehicles(): Observable<Array<VehicleObject>> {
    return this.httpClient.get<Array<VehicleObject>>("http://localhost:8080/api/v1/vehicle");
  }
}

export interface VehicleObject {
  acceleration: number;
  braking: number;
  carBrand: CarBrand;
  carType: CarType;
  controllability: number;
  engineCapacity: number;
  name: string;
  offRoadDriving: number;
  picture: string;
  power: number;
  speed: number;
  torque: number;
  tuningBrakingForce: number;
  tuningFrontDifferential: number;
  tuningRearDifferential: number;
  tuningSprings: number;
  tuningStabilizers: number;
  tuningSuspensionHeight: number;
  tuningSuspensionStiffness: number;
  tuningTirePressure: number;
  tuningwheelAlignment: number;
  vehicleId: string;
  weight: number;
}

export enum CarBrand {
  ASTON_MARTIN, AUDI, BAC, BWM, BUICK, CHEVROLET,
  FERRARI, FORD, HOONIGAN, JAGUAR, KOENIGSEGG,
  LAMBORGHINI, LOTU, MAZDA, MCLAREN, MERCEDES_BEZN,
  MINI, MORGAN, NISSAN, PAGANI, PORSHE, RENAULT,
  TOYOTA, VOLKSWAGEN,
}

export enum CarType {
  BUGGIES, CLASS_SPORT_CARS, CLASSIC_MUSCLE, DRIFT_CARS,
  RALLY_MONSTERS, RETRO_SUPER_CARS, SUPER_GT, TRACK_TOYS,
  TRUCKS, HYPERCARS, HOT_HATCH, MORDER_MUSCLE, OFFROAD,
  VINTAGE_RACERS, VANS_UTILITY,  UTS,  UNLIMITED_OFFROAD,
  UNLIMITED_BUGGIES,
}
