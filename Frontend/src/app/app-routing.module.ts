import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {KameramodusComponent} from "./kameramodus/kameramodus.component";
import {KameraOeffnenComponent} from "./kamera-oeffnen/kamera-oeffnen.component";

const routes: Routes = [
  { path: 'kameraoeffnen', component: KameraOeffnenComponent },
  { path: 'kameramodus', component: KameramodusComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { scrollPositionRestoration: 'enabled' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
