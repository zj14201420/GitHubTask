package main;

import java.util.ArrayList;
import java.util.List;

public class ReportShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> report = new ArrayList<>();
		report.add(40);
		report.add(10);
		report.add(20);
		report.add(30);
		report.add(50);
		report.add(60);
		report.add(70);
		report.add(80);
		report.add(90);
		ReportFunction reportFunction = new ReportFunction();
		//System.out.println(report);
		System.out.println("成绩按照从小到大排序为：");
		System.out.println(reportFunction.ReportSort(report));
		System.out.println("成绩最大值为：");
		System.out.println(reportFunction.MaxReport(report));
		System.out.println("成绩最小值为：");
		System.out.println(reportFunction.minReport(report));
		System.out.println("成绩可以区间计数比如25~75的个数为：");
		System.out.println(reportFunction.AnyNumber(report, 25, 75));
	}

}
