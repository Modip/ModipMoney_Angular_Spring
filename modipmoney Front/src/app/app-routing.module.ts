import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmetteurComponent } from './emetteur/emetteur.component';
import { RecepteurComponent } from './recepteur/recepteur.component';
import { EnvoieComponent } from './envoie/envoie.component';
import { ListeComponent } from './liste/liste.component';


const routes: Routes = [
  {path: "envoie", component : EnvoieComponent},
  {path: "liste", component : ListeComponent},
  {path: "emetteur", component : EmetteurComponent},
  {path: "recepteur", component : RecepteurComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
