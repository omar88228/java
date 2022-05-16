package app;

import java.util.*;
import builder.*;
import entity.*;

public class Main {

	public static void main(String[] args) {
		int surface = 0;
		int localNumber = 0;
		int floor = 0;
		int numberOfSwimmingpools = 0;
		String gateType = null;
		String type = null;
		String street = null, city = null, province = null, region = null;
		int cap = 0;
		Singleton sing = Singleton.getInstance();
		Immobile immobile = null;
		BuilderImmobile builder = new BuilderImmobile();
		BuilderAddress builderAddress = new BuilderAddress();
		ArrayList<String> data = sing.getList();
		String[] firstRowOfData = data.get(0).split(",");

		for (int i = 1; i < data.size(); i++) {
			String[] attributesImmobile = data.get(i).split(",");

			for (int j = 0; j < attributesImmobile.length; j++) {
				if (firstRowOfData[j].equals("surface")) {
					surface = Integer.parseInt(attributesImmobile[j]);

				}
				if (firstRowOfData[j].equals("localNumber")) {
					localNumber = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equals("floor") && !attributesImmobile[j].isBlank()) {
					floor = Integer.parseInt(attributesImmobile[j]);
				}
				if (firstRowOfData[j].equals("type")) {
					type = attributesImmobile[j];

				}
				if (firstRowOfData[j].equals("street")) {
					street = attributesImmobile[j];

				}
				if (firstRowOfData[j].equals("city")) {
					city = attributesImmobile[j];

				}
				if (firstRowOfData[j].equals("province")) {
					province = attributesImmobile[j];

				}
				if (firstRowOfData[j].equals("region")) {
					region = attributesImmobile[j];

				}
				if (firstRowOfData[j].equals("cap")) {
					cap = Integer.parseInt(attributesImmobile[j]);

				}
				if (firstRowOfData[j].equalsIgnoreCase("numberOfSwimmingpools") && !attributesImmobile[j].isBlank()) {
					numberOfSwimmingpools = Integer.parseInt(attributesImmobile[j]);

				}
				if (firstRowOfData[j].equals("gateType")) {
					gateType = attributesImmobile[j];

				}
			}
			Address address = builderAddress.cap(cap).city(city).street(street).region(region).province(province)
					.build();

			if (type.equalsIgnoreCase("VILLA")) {

				immobile = builder.address(address).gateType(gateType).localNumber(localNumber)
						.numberOfSwimmingpools(numberOfSwimmingpools).surface(surface).type(type).buildVilla();

			}
			if (type.equalsIgnoreCase("GARAGE")) {

				immobile = builder.address(address).gateType(gateType).localNumber(localNumber).surface(surface)
						.type(type).buildGarage();

			}
			if (type.equalsIgnoreCase("APARTMENT")) {

				immobile = builder.address(address).floor(floor).localNumber(localNumber).surface(surface).type(type)
						.buildAppartment();

			}
			System.out.println(immobile.estateType());
		}

	}

}
