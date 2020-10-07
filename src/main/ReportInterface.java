package main;

import java.util.ArrayList;

public interface ReportInterface {
	public ArrayList<Integer> ReportSort(ArrayList<Integer> report);
	public int MaxReport(ArrayList<Integer> report);
	public int minReport(ArrayList<Integer> report);
	public int AnyNumber(ArrayList<Integer> report,int maxlimit,int minlimit);
}
