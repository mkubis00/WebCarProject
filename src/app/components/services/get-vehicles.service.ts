import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {catchError, Observable, Subscription} from "rxjs";



@Injectable({
  providedIn: 'root'
})
export class GetVehiclesService {

  private apiAddress = "http://localhost:8080/api/v1/vehicle/";
  status!: any;
  helper!: String;
  help!: any;
  vehicleId!: String;

  constructor(private httpClient: HttpClient) {}


  public getVehicles(): Observable<Array<VehicleObject>> {
    return this.httpClient.get<Array<VehicleObject>>(this.apiAddress);
  }

  public getVehicle(id: String): Observable<VehicleObject> {
    return this.httpClient.get<VehicleObject>((this.apiAddress + id));
  }

  public deleteVehicle(id: String){
    const endpoint = this.apiAddress + id;
    return this.httpClient.delete(endpoint);
  }

  public setVehicleToEdit(id: String) {
    this.vehicleId = id;
  }

  public addVehicle(vehicle: any){
    this.httpClient.post<any>(this.apiAddress, vehicle).subscribe({
      next: data => {
        console.log(data);
      },
      error: error => {
        console.log(error);
      }
    });
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

export interface PostVehicleObject {
  name: string;
  tuningBrakingForce: number;
  tuningFrontDifferential: number;
  tuningRearDifferential: number;
  tuningSprings: number;
  tuningStabilizers: number;
  tuningSuspensionHeight: number;
  tuningSuspensionStiffness: number;
  tuningTirePressure: number;
  tuningwheelAlignment: number;
  carBrand: CarBrand;
  carType: CarType;
  picture: string;
}

export enum CarBrand {
  ASTON_MARTIN = "ASTON MARTIN",
  AUDI = "AUDI", BAC = "BAC", BWM = "BMW", BUICK = "BUICK", CHEVROLET = "CHEVROLET",
  FERRARI = "FERRARI", FORD = "FORD", HOONIGAN = "Hoonigan", JAGUAR = "Jaguar", KOENIGSEGG = "KOENIGSEGG",
  LAMBORGHINI = "LAMBORGHINI", LOTU = "LOTU", MAZDA = "MAZDA", MCLAREN = "MCLAREN", MERCEDES_BEZN = "MERCEDES BENZ",
  MINI = "MINI" , MORGAN = "MORGAN", NISSAN = "NISSAN", PAGANI = "PAGANI", PORSHE = "PORSHE", RENAULT = "RENAULT",
  TOYOTA = "TOYOTA", VOLKSWAGEN = "VOLKSWAGEN",
}

export enum CarType {
  BUGGIES = "BUGGIES", CLASS_SPORT_CARS = "CLASS SPORT CARS", CLASSIC_MUSCLE = "CLASSIC MUSCLE", DRIFT_CARS = "DRIFT CARS",
  RALLY_MONSTERS = "RALLY_MONSTERS", RETRO_SUPER_CARS = "RETRO SUPER_CARS", SUPER_GT = "SUPER GT", TRACK_TOYS = "TRACK TOYS",
  TRUCKS = "TRUCKS", HYPERCARS = "HYPERCARS", HOT_HATCH = "HOT HATCH", MORDER_MUSCLE = "MORDER MUSCLE", OFFROAD = "OFFROAD",
  VINTAGE_RACERS = "VINTAGE RACERS", VANS_UTILITY = "VANS UTILITY",  UTS = "UTS",  UNLIMITED_OFFROAD = "UNLIMITED OFFROAD",
  UNLIMITED_BUGGIES = "UNLIMITED BUGGIES",
}
