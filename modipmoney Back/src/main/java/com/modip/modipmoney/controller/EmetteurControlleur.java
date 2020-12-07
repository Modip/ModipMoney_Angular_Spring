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

import com.modip.modipmoney.dao.IEmetteur;
import com.modip.modipmoney.entities.Emetteur;

@RestController
public class EmetteurControlleur {
	@Autowired
	
	private IEmetteur  emetteurdao ;
	
	//Pour Afficher la liste des emetteurs 
	
	@RequestMapping(value="/modipmoney/Emetteur", method= RequestMethod.GET)
	public List<Emetteur> listeEmetteur(){
		List<Emetteur> emetteurs = emetteurdao.findAll();
		return emetteurs;
	}

	
	//Pour ajouter des emetteurs 
	
	@PostMapping("/modipmoney/Emetteur/add")
	public String ajoutEmetteur(@RequestBody Emetteur emetteur) {
		try {
			emetteurdao.save(emetteur);
			return "Bien Ajoutéé";
			
		} catch (Exception e) {
			return "Erreur lors de l'ajout!!";
		}
	}
	
	@DeleteMapping(value="/modipmoney/Emetteur/delete/{id}")
	
	public void deleteEmetteur(@PathVariable("id") int id) {
		emetteurdao.deleteById(id);
	}
}
