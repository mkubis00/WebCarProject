import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AllvehiclesComponent} from "./components/allvehicles/allvehicles.component";
import {EditvehicleComponent} from "./components/editvehicle/editvehicle.component";
import {AddvehicleComponent} from "./components/addvehicle/addvehicle.component";


const routes: Routes = [
  { path:'allVehicles', component:AllvehiclesComponent },
  { path:'addVehicle', component:AddvehicleComponent},
  { path:'editVehicle/:id', component:EditvehicleComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
