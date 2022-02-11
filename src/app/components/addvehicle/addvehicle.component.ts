import {Component, HostListener} from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {CarBrand, CarType, PostVehicleObject} from "../services/get-vehicles.service";

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

  nameChange(event: any){
    this.name = event.target.value;
  }

  pictureChange(event: any){
    this.picture = event.target.value;
  }
}
