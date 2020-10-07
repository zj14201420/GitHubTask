package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReportFunction implements ReportInterface{

	@Override
	public ArrayList<Integer> ReportSort(ArrayList<Integer> report) {
		// TODO Auto-generated method stub
		Collections.sort(report, new Comparator<Integer>() {

			@Override
			public int compare(Integer grade1, Integer grade2) {
				// TODO Auto-generated method stub
				if(grade1>grade2) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		//System.out.println("≈≈–Ú÷Æ∫Û:"+report);
		return report;
	}
	@Override
	public int MaxReport(ArrayList<Integer> report) {
		// TODO Auto-generated method stub
		//int maxReport=0;
		Collections.sort(report, new Comparator<Integer>() {

			@Override
			public int compare(Integer grade1, Integer grade2) {
				// TODO Auto-generated method stub
				if(grade1>grade2) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		return report.get(report.size()-1);
	}

	@Override
	public int minReport(ArrayList<Integer> report) {
		// TODO Auto-generated method stub
		Collections.sort(report, new Comparator<Integer>() {

			@Override
			public int compare(Integer grade1, Integer grade2) {
				// TODO Auto-generated method stub
				if(grade1>grade2) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		return report.get(0);
	}

	@Override
	public int AnyNumber(ArrayList<Integer> report,int minlimit,int maxlimit) {
		// TODO Auto-generated method stub
		int getNumber = 0;
		for(int i=0;i<report.size();i++) {
			if(report.get(i)>=minlimit&&report.get(i)<maxlimit) {
				getNumber++;
			}
		}
		return getNumber;
	}

}
