package cse12pa4student;

import java.util.List;

public class Main {

	/* Put your method calls and calculation here */
	public static void main(String[] args) {
		List<Measurement> list_ac = Measure.measure(new String[]
									{ "A", "B", "C", "D", "E", "F" }, 5, 25);
		String csv = Measure.measurementsToCSV(list_ac);
		System.out.println(csv);
	}
}