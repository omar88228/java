package entity;

public class Fiat extends Car {

	public Fiat(CarColor carColor) {
		super(carColor);
	}

	@Override
	
	public String getCar() {
		return "questa machina � di typo fiat il suo colore � : " + super.getCarColor().getColor();
	}

}
