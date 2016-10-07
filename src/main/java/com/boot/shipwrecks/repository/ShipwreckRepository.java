package com.boot.shipwrecks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.shipwrecks.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
