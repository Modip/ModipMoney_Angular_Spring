import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Envoie } from "../model/envoieModel";

@Injectable({
  providedIn: 'root'
})

export class EnvoieService {

  url = 'http://localhost:8080/modipmoney/'; //variable pour avoir le lien de l'API

  constructor(private http: HttpClient) {}


  ajouterEnvoie(envoi: Envoie): Observable<Object>{

    return this.http.post(this.url+'Envoie/add',envoi);  
  }



}
