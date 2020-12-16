import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EnvoieComponent } from './envoie/envoie.component';
import { EmetteurComponent } from './emetteur/emetteur.component';
import { RecepteurComponent } from './recepteur/recepteur.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ListeComponent } from './liste/liste.component';
import { EnvoieService } from './services/envoie.service';



@NgModule({
  declarations: [
    AppComponent,
    EnvoieComponent,
    EmetteurComponent,
    RecepteurComponent,
    ListeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    EnvoieService
  ],
  bootstrap: [AppComponent]
  
})
export class AppModule { }
