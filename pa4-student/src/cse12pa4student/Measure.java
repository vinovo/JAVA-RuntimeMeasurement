package cse12pa4student;

import java.util.ArrayList;
import java.util.List;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		long start,end;
		List<Measurement> lst = new ArrayList<Measurement>();
		for (int i = 0; i < toRun.length; i++){
			if (toRun[i].charAt(0) == 'A'){
				for (int j = startN; j <= stopN; j++){
					start = System.nanoTime();
					mysteryA(j);
					end = System.nanoTime();
					Measurement m = new Measurement("A",j,end-start);
					lst.add(m);
				}
			}
			if (toRun[i].charAt(0) == 'B'){
				for (int j = startN; j <= stopN; j++){
					start = System.nanoTime();
					mysteryB(j);
					end = System.nanoTime();
					Measurement m = new Measurement("B",j,end-start);
					lst.add(m);
				}
			}
			if (toRun[i].charAt(0) == 'C'){
				for (int j = startN; j <= stopN; j++){
					start = System.nanoTime();
					mysteryC(j);
					end = System.nanoTime();
					Measurement m = new Measurement("C",j,end-start);
					lst.add(m);
				}
			}
			if (toRun[i].charAt(0) == 'D'){
				for (int j = startN; j <= stopN; j++){
					start = System.nanoTime();
					mysteryD(j);
					end = System.nanoTime();
					Measurement m = new Measurement("D",j,end-start);
					lst.add(m);
				}
			}
			if (toRun[i].charAt(0) == 'E'){
				for (int j = startN; j <= stopN; j++){
					start = System.nanoTime();
					mysteryE(j);
					end = System.nanoTime();
					Measurement m = new Measurement("E",j,end-start);
					lst.add(m);
				}
			}
			if (toRun[i].charAt(0) == 'F'){
				for (int j = startN; j <= stopN; j++){
					start = System.nanoTime();
					mysteryF(j);
					end = System.nanoTime();
					Measurement m = new Measurement("F",j,end-start);
					lst.add(m);
				}
			}
		}
		
		//Example call to mystery method
		//mysteryA(50);
		return lst;
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		String re = new String();
		for (Measurement m : toConvert){
			re += m.name + "," + m.valueOfN + "," + m.nanosecondsToRun + "\n";
		}
		return re;
	}
	
	/* Add any helper methods you find useful */
		
}
