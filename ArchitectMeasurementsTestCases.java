import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArchitectMeasurementsTestCases {
	ArchitectMeasurements measurementobj = new ArchitectMeasurements();

	@Test
	public void centimeterValidationTesting() {

		assertEquals("100.0", ArchitectMeasurements.CentimeterValidation(100));

	}

	@Test
	public void meterToCentiMeterTesting() {

		assertEquals("100.0", ArchitectMeasurements.meterToCm(1));

	}

	@Test
	public void centiMeterToKilogramTesting() {
		assertEquals("1.0", ArchitectMeasurements.centiToKilometer(100000));
	}

	@Test
	public void SumofCentiMeterAndMeterTesting() {
		assertEquals("2.0", ArchitectMeasurements.SumofCentiAndMeter(1, 100));
	}

	@Test
	public void sumofCentiMeterAndMeterAndOutputInCentiMeterTesting() {
		assertEquals("2.0", ArchitectMeasurements.SumofCentiAndMeter(1, 100));
	}

	@Test
	public void SubtractionOfCentimeterAndMeterAndOutputInCentiMetersTesting() {
		assertEquals("1.0", ArchitectMeasurements.SubofCentiAndMeterinCm(2, 100));
	}

	@Test
	public void SubtractionOfCentimeterAndMeterAndOutputInMetersTesting() {
		assertEquals("1.0", ArchitectMeasurements.SubofCentiAndMeterinCm(2, 100));
	}

	@Test
	public void gramTesting() {
		assertEquals("1.0", ArchitectMeasurements.gram(1));
	}

	@Test  
	    public void kilogramToGramTesting(){  
			assertEquals("1000.0",ArchitectMeasurements.KgTogram(1)); 
		}

	@Test
	public void additionofGramAndKilogramTesting() {
		assertEquals("2000.0", ArchitectMeasurements.AddofGmAndKg(1000, 1));
	}

	@Test
	public void SubtractionofGramToKilogramTesting() {
		assertEquals("1.0", ArchitectMeasurements.SubofGmtoKg(1,2000));
	}

	@Test
	public void CelsiusToFahrenheitTesting() {
		assertEquals("33.8", ArchitectMeasurements.CelToFah(1));
	}

	@Test
	public void KelvinToCelsiusTesting() {
		assertEquals("-272.15", ArchitectMeasurements.KelToCel(1));
	}

}
