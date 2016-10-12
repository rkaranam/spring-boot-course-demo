package com.boot.shipwrecks.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.shipwrecks.controller.ShipwreckController;
import com.boot.shipwrecks.model.Shipwreck;
import com.boot.shipwrecks.repository.ShipwreckRepository;

@SpringBootTest
public class ShipwreckControllerTests {
	
	@InjectMocks
	private ShipwreckController shipwreckController;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getShipwreckIdTest() {
		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(1L);
		when(shipwreckRepository.findOne(1L)).thenReturn(shipwreck);
		
		Shipwreck wreck = shipwreckController.get(1L);
		verify(shipwreckRepository).findOne(1L);
		assertEquals(1L, wreck.getId().longValue());
	}
	
	@Test
	public void deleteShipwreckTest() {
		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(2L);
		when(shipwreckRepository.findOne(2L)).thenReturn(shipwreck);
		
		Shipwreck wreck = shipwreckController.delete(2L);
		verify(shipwreckRepository).findOne(2L);
		// assertEquals(2L, wreck.getId().longValue());
		assertThat(wreck.getId(), is(2l));
	}

}
