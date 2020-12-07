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

import com.modip.modipmoney.dao.IEnvoie;
import com.modip.modipmoney.entities.Envoie;

@RestController
public class EnvoiController {
	@Autowired
	private IEnvoie envoiedao;
	
	//Liste
	@RequestMapping(value="/modipmoney/Envoie", method=RequestMethod.GET)
	public List<Envoie> listeEnvoie(){
		List<Envoie> envoies = envoiedao.findAll();
		return envoies;
	}
	
	//Ajout
	@PostMapping("/modipmoney/Envoie/add")
	public String ajoutEmetteur(@RequestBody Envoie envoie) {
		try {
			envoiedao.save(envoie);
			return "Bien Envoyéé";
			
		} catch (Exception e) {
			return "Erreur lors de l'Envoiee!!";
		}
	}
	
	//Supression
	@DeleteMapping(value="/modipmoney/Envoie/delete/{id}")
	
	public void deleteEnvoie(@PathVariable("id") int id) {
		envoiedao.deleteById(id);
	}

}
