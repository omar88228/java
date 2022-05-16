package it.omar.builder;

import it.omar.entity.*;

public interface IBuilderImmobile {
	
	IBuilderImmobile surface(int surface);

	IBuilderImmobile localNumber(int localNumber);

	IBuilderImmobile floor(int floor);

    IBuilderImmobile address(Address address);

	IBuilderImmobile type(String type);
	
	IBuilderImmobile numberOfSwimmingPools(int numberOfSwimmingpools);
	
	IBuilderImmobile gateType(String gateType);
	
	Villa buildVilla();
	
	Garage buildGarage();
	
	Appartment buildAppartment();
	
}
