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
		System.out.println("�ɼ����մ�С��������Ϊ��");
		System.out.println(reportFunction.ReportSort(report));
		System.out.println("�ɼ����ֵΪ��");
		System.out.println(reportFunction.MaxReport(report));
		System.out.println("�ɼ���СֵΪ��");
		System.out.println(reportFunction.minReport(report));
		System.out.println("�ɼ����������������25~75�ĸ���Ϊ��");
		System.out.println(reportFunction.AnyNumber(report, 25, 75));
	}

}
