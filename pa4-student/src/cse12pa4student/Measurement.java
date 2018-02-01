package cse12pa4student;

public class Measurement {
	public final String name;
	public final int valueOfN;
	public final long nanosecondsToRun;
	public Measurement(String name, int valueOfN, long nanosecondsToRun) {
		this.name = name;
		this.valueOfN = valueOfN;
		this.nanosecondsToRun = nanosecondsToRun;
	}
	
	@Override
	public String toString() {
		return "\nMeasuring:\t"+name+"\nInput value:\t"+valueOfN+"\nTime taken:\t"+nanosecondsToRun+"ns\n";
	}
}
