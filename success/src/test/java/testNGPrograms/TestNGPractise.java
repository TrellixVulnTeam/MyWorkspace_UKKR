package testNGPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestNGPractise {

	@Test
	public void stringBuffer() {
		String[] dataHolder = new String[] { "Karthik" };

		String[] parseDataValue = new String[dataHolder.length];

		for (int i = 0; i < dataHolder.length; i++) {

			parseDataValue[i] = dataHolder[i];
			System.out.print(Arrays.toString(parseDataValue));
		}
		System.out.print(Arrays.toString(parseDataValue));

	}

}
