
public class ArchitectMeasurements {

	public static String CentimeterValidation(float d) {
		return String.valueOf(d);
	}

	public static String meterToCm(float d){
		float centimeterConversion = 100 * d;
		return String.valueOf(centimeterConversion);
	}

	public static String centiToKilometer(float centimeter) {
		float kilometer = (float) (centimeter * 0.00001);
		return String.valueOf(kilometer);
	}

	public static String SumofCentiAndMeter(float meter, float centimeter) {
		float sumOfCentiAndMeter = (float) (meter + (0.01 * centimeter));

		return String.valueOf(sumOfCentiAndMeter);
	}

	public static String SumofCentiAndMeterinCm(float meter, float centimeter) {
		float sumOfCentiAndMeter = (float) ((meter * 100) + centimeter);

		return String.valueOf(sumOfCentiAndMeter);
	}

	public static String SubofCentiAndMeterinCm(float meter, float centimeter) {
		float subtractOfCentiAndMeter = (float) (meter - (0.01 * centimeter));

	return String.valueOf(subtractOfCentiAndMeter);
	}

	public static String SubofCentiAndMeterinm(float meter, float centimeter) {
		float subtractOfCentiAndMeter = (float) (centimeter - (meter * 100));

		return String.valueOf(subtractOfCentiAndMeter);
	}

	public static String gram(float grams) {
		return String.valueOf(grams);
	}

	public  static String KgTogram(float kilogram) {
		float gramConversion = (int) (1000 * kilogram);

		return String.valueOf(gramConversion);
	}

	public  static String AddofGmAndKg(float gram, float kilogram) {
		float sumOfKilogramAndGram = (float) (gram + (1000 * kilogram));

		return String.valueOf(sumOfKilogramAndGram);
	}

	public  static String SubofGmtoKg(float gram, float kilogram) {
		float subtractOfKilogramAndGram = (float) ((0.001 * kilogram) - gram);

		return String.valueOf(subtractOfKilogramAndGram);
	}

	public static String CelToFah(float celsius) {
		float fahrenheit = ((celsius * 9) / 5) + 32;

		return String.valueOf(fahrenheit);
	}

	public static String KelToCel(float kelvin) {
		float celsius = kelvin - 273.15F;

		return String.valueOf(celsius);
	}

}
