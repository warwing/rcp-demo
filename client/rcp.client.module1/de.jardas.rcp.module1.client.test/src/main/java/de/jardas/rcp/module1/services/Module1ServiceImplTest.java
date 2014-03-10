package de.jardas.rcp.module1.services;

import org.junit.Test;

import de.jardas.rcp.module1.client.pub.SharedClientInterface;

public class Module1ServiceImplTest {

	private SharedClientInterface clientService;

	@Test
	public void basic() {
		clientService.doSomething();
	}

}
