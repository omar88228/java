package app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import builder.Builder;
import builder.BuilderAddress;
import entity.*;
import enumeration.Type;

public class Main {

	public static void main(String[] args) {
		int surface = 0;
		
		int localNumber = 0;		
		int floor = 0;	
		String type = null;	
		String street = null			
		String	city = null	
		String province = null
		String region = null;
		int cap = 0;
		Singleton sing = Singleton.getInstance();
		Builder builder = new Builder();
		BuilderAddress builderAddress = new BuilderAddress();
		ArrayList<String> data = sing.getList();
		String[] firstRowOfData = attributeList.get(0).split(",");

		for (int i = 1; i < data.size(); i++) {
			String[] attributes = data.get(i).split(",");

			for (int j = 0; j < attributes.length; j++) {
				if (attributesName[j].equals("surface")) {
					surface = Integer.parseInt(attributes[j]);

				}
				if (attributesName[j].equals("localNumber")) {
					localNumber = Integer.parseInt(attributes[j]);
				}
				if (attributesName[j].equals("floor")) {
					floor = Integer.parseInt(attributes[j]);
				}
				if (attributesName[j].equals("type")) {
					type = attributes[j];

				}
				if (attributesName[j].equals("street")) {
					street = attributes[j];

				}
				if (attributesName[j].equals("city")) {
					city = attributes[j];

				}
				if (attributesName[j].equals("province")) {
					province = attributes[j];

				}
				if (attributesName[j].equals("region")) {
					region = attributes[j];

				}
				if (attributesName[j].equals("cap")) {
					cap = Integer.parseInt(attributes[j]);

				}
			}
			Address address = builderAddress.cap(cap).city(city).street(street).region(region).province(province)
					.build();

			Immobile immobile = builder.localNumber(localNumber).surface(surface).floor(floor).type(type)
					.address(address).build();
			System.out.println(street);
		}

	}

}
