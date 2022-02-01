import {Component, HostListener} from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';
import {GetVehiclesService, VehicleObject} from "../services/get-vehicles.service";

@Component({
  selector: 'app-allvehicles',
  templateUrl: './allvehicles.component.html',
  styleUrls: ['./allvehicles.component.scss']
})
export class AllvehiclesComponent {
  vehicles!: Array<VehicleObject>;
  cols =4;
  public innerWidth: any;

  constructor(private getVehiclesService: GetVehiclesService,private breakpointObserver: BreakpointObserver) {}

  ngOnInit(): void {
    this.getVehiclesService.getVehicles().subscribe(value => {
      this.vehicles = value;
    });
    this.innerWidth = window.innerWidth;
    this.setCols();
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
}
