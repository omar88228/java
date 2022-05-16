package entity;

import enumeration.Type;

public class Immobile implements IEstate {
	private int surface;
	private int localNumber;
	private Address address;
	private Type type;
	
	public Immobile(int surface, int localNumber, Address address, Type type) {
		super();
		this.surface = surface;
		this.localNumber = localNumber;
		this.address = address;
		this.type = type;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String estateType() {
		return " immobile type : " + this.type.name() + " -";
	}

}
