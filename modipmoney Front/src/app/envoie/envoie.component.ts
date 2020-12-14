import { Component, OnInit } from '@angular/core';
import { Emetteur } from '../model/emetteurModel';
import { Envoie } from '../model/envoieModel';
import { Recepteur } from '../model/recepteurModel';
import { EnvoieService } from '../services/envoie.service';




@Component({
  selector: 'app-envoie',
  templateUrl: './envoie.component.html'
})
export class EnvoieComponent implements OnInit {

  newEnvoie = new Envoie();
  

  constructor(private envoieService : EnvoieService) { }

  ajouterEnvoie(){

      //C'est pour appeller ajouterEnvoi qui sur le bouton submit (onclick)
      this.envoieService.ajouterEnvoie(this.newEnvoie).subscribe(
      data => console.log(data)
      
   );


  }

  ngOnInit(): void {
    this.newEnvoie.emetteur = new Emetteur();     //Pour inserer un emetteur
    this.newEnvoie.recepteur = new Recepteur();  //Pour inserer un recepteur
  }

}
