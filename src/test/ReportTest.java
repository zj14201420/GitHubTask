package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.ReportFunction;

public class ReportTest {
	ReportFunction reportFunction = new ReportFunction();
	@Test
	public void TestSort() {
		ArrayList<Integer> report = new ArrayList<>();
		report.add(40);
		report.add(10);
		report.add(20);
		ArrayList<Integer> test = new ArrayList<>();
		test.add(10);
		test.add(20);
		test.add(40);
		assertArrayEquals(test.toArray(),reportFunction.ReportSort(report).toArray());
	}
	@Test
	public void TestMinMax() {
		ArrayList<Integer> report = new ArrayList<>();
		report.add(40);
		report.add(10);
		report.add(20);
		assertEquals(10,reportFunction.minReport(report));
		assertEquals(40,reportFunction.MaxReport(report));
	}
	@Test
	public void TestNumber() {
		ArrayList<Integer> report = new ArrayList<>();
		report.add(40);
		report.add(10);
		report.add(20);
		assertEquals(2,reportFunction.AnyNumber(report, 11, 41));
	}
}
