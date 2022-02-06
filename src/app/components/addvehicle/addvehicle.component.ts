import {Component, HostListener} from '@angular/core';
import { map } from 'rxjs/operators';
import { Breakpoints, BreakpointObserver } from '@angular/cdk/layout';

@Component({
  selector: 'app-addvehicle',
  templateUrl: './addvehicle.component.html',
  styleUrls: ['./addvehicle.component.scss']
})
export class AddvehicleComponent {
  /** Based on the screen size, switch from standard to one column per row */
  // cards = this.breakpointObserver.observe(Breakpoints.Handset).pipe(
  //   map(({ matches }) => {
  //     if (matches) {
  //       return [
  //         { title: 'Card 2', cols: 2, rows: 1 },
  //         { title: 'Card 3', cols: 2, rows: 1 },
  //         { title: 'Card 4', cols: 2, rows: 1 }
  //       ];
  //     }
  //
  //     return [
  //       { title: 'Card 2', cols: 1, rows: 1 },
  //       { title: 'Card 3', cols: 1, rows: 2 },
  //       { title: 'Card 4', cols: 1, rows: 1 }
  //     ];
  //   })
  // );

  card3Rows!: number;
  public innerWidth: any;
  cols!: number;

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

}
