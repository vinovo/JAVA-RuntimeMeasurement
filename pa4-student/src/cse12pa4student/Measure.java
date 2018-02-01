package cse12pa4student;

import java.util.ArrayList;
import java.util.List;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {
	public static long time(String m, int n) {
		long start = System.nanoTime();
		if(m.equals("A")) { mysteryA(n); }
		else if(m.equals("B")) { mysteryB(n); }
		else if(m.equals("C")) { mysteryC(n); }
		else if(m.equals("D")) { mysteryD(n); }
		else if(m.equals("E")) { mysteryE(n); }
		else if(m.equals("F")) { mysteryF(n); }
		long end = System.nanoTime();
		return end - start;
	}
	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		List<Measurement> lst = new ArrayList<>();
		for(int i = startN; i <= stopN; i += 1) {
			for(String s: toRun) {
				long result = time(s, i);
				lst.add(new Measurement(s, i, result));
			}
		}
		return lst;
	}
	public static String measurementsToCSV(List<Measurement> toConvert) {
		String s = "name,n,nanoseconds";
		for(Measurement m: toConvert) {
			s += m.name + "," + m.valueOfN + "," + m.nanosecondsToRun + "\n";
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println("Running");
		List<Measurement> l = measure(new String[]{"a", "c"}, 40, 100);
		System.out.println(l);
	}
}
