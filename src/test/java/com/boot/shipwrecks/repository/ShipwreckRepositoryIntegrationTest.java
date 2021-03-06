package com.boot.shipwrecks.repository;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.shipwrecks.model.Shipwreck;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {
	
	@Autowired
	private ShipwreckRepository shipwreckRepository;

	@Test
	public void findAllTest() {
		List<Shipwreck> shipwrecks = shipwreckRepository.findAll();
		assertThat(shipwrecks.size(), is(greaterThanOrEqualTo(0)));
	}
}
