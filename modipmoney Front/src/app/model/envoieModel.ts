
import { Emetteur } from './emetteurModel';
import { Recepteur } from './recepteurModel';

export class Envoie{
    
    public id!: number;
    public montant!: number;
    public date!: string;
    public emetteur!: Emetteur;
    public recepteur!: Recepteur;

}