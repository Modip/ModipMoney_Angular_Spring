package com.modip.modipmoney.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modip.modipmoney.entities.Emetteur;

public interface IEmetteur extends JpaRepository<Emetteur, Integer> {

}
