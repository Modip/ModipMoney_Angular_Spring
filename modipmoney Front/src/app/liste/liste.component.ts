import { Component, OnInit } from '@angular/core';
import { EnvoieService } from '../services/envoie.service';

@Component({
  selector: 'app-liste',
  templateUrl: './liste.component.html',

})
export class ListeComponent implements OnInit {


  public navigation_url: any;//pour recuperer l'url saisie au niveau de navigateur

  listerEnvoie: any //pour recuperer la liste des envoie


  constructor(private envoieService: EnvoieService) {

    envoieService.listerEnvoie() //Appelle de la methode lister dans envoie service    
    .subscribe(
      resultat=>{

        console.log(resultat);
        this.listerEnvoie = resultat;
    },
      error=>{
        console.log(error);
      }

    );

  }

  ngOnInit(): void {
  }

}
