package model;

import java.math.BigDecimal;

public class TempConverter {
	private int userTemp;
	boolean celsiusEntered;
	
	
	public TempConverter() {
		super();
	}

	public TempConverter(int userTemp, boolean celsiusEntered) {
		super();
		this.userTemp = userTemp;
		this.celsiusEntered = celsiusEntered;
	}

	
	@Override
	public String toString() {
		return "TempConverter [userTemp=" + userTemp + ", celsiusEntered=" + celsiusEntered + "]";
	}
	
	public int ConvertTemp() {
		if (this.celsiusEntered == true) {
			return this.convertCelsiusToFarenheit(this.userTemp);

		} else
			return this.convertFarenheitToCelsius(this.userTemp);		
		
	}

	public int convertFarenheitToCelsius(int farenTemp) {
		BigDecimal conversionRate = new BigDecimal(0.5555555556);
		BigDecimal conversionDeduct = new BigDecimal(32);		
		BigDecimal input = new BigDecimal(farenTemp);
		BigDecimal result = new BigDecimal(0);		
		int inputTemp = farenTemp;
		result = input.subtract(conversionDeduct).multiply(conversionRate) ;
		return result.intValue();		
	}
	
	public int convertCelsiusToFarenheit(int celsiusTemp) {
		BigDecimal conversionRate = new BigDecimal(1.8);
		BigDecimal conversionAdd = new BigDecimal(32);		
		BigDecimal input = new BigDecimal(celsiusTemp);
		BigDecimal result = new BigDecimal(0);
		int inputTemp = celsiusTemp;
		result = input.multiply(conversionRate).add(conversionAdd) ;
		return result.intValue();		
	}
	
	public int convertStuff() {
		int farenTemp = this.userTemp;
		System.out.print("Farentemp: " + farenTemp);
		return farenTemp;
	}
	
	public int getUserTemp() {
		return userTemp;
	}
	public void setUserTemp(int userTemp) {
		this.userTemp = userTemp;
	}
	public boolean isCelsiusEntered() {
		return celsiusEntered;
	}
	public void setCelsiusEntered(boolean celsiusEntered) {
		this.celsiusEntered = celsiusEntered;
	}
	
	
	
	
}
