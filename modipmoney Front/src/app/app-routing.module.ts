import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmetteurComponent } from './emetteur/emetteur.component';
import { RecepteurComponent } from './recepteur/recepteur.component';
import { EnvoieComponent } from './envoie/envoie.component';



const routes: Routes = [
  {path: "emetteur", component : EmetteurComponent},
  {path: "recepteur", component : RecepteurComponent},
  {path: "envoie", component : EnvoieComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
