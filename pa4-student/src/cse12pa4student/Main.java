package cse12pa4student;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Measurement> lst = Measure.measure
				(new String[] { "A", "B", "C", "D", "E", "F"},1,20);
		System.out.println(Measure.measurementsToCSV(lst));
		//System.out.println("Remember, the code milestone is due Monday 11:59pm!");
	}
}