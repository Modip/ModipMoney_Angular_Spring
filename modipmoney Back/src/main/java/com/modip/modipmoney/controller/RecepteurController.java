package com.modip.modipmoney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modip.modipmoney.dao.IRecepteur;
import com.modip.modipmoney.entities.Recepteur;

@RestController
public class RecepteurController {
	@Autowired
	private IRecepteur recepteurdao;

	//Pour Afficher la liste des recepteurs
	
	@RequestMapping(value="/modipmoney/Recepteur", method=RequestMethod.GET)
	
	//Liste
	public List<Recepteur> listeEmetteur(){
		List<Recepteur> recepteurs = recepteurdao.findAll();
		return recepteurs;
	}
	
	//Ajout
	
	@PostMapping("/modipmoney/Recepteur/add")
	public String ajoutRecepteur(@RequestBody Recepteur recepteur) {
		try {
			recepteurdao.save(recepteur);
			return "Bien Ajoutéé";
			
		} catch (Exception e) {
			return "Erreur lors de l'ajout!!";
		}
	}
	
	//Supression
	@DeleteMapping(value="/modipmoney/Recepteur/delete/{id}")
	
	public void deleteRecepteur(@PathVariable("id") int id) {
		recepteurdao.deleteById(id);
	}
	
	
}

