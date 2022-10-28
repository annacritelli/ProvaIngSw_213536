package ProvaLaboratorio.it.unical.AnnaCritelli213536;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


import org.joda.time.*;

public class FunnyAlgorithmsTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
		DateTime time = new DateTime();
		System.out.print(time.getHourOfDay() + ":");
		System.out.print(time.getMinuteOfHour() + ":");
		System.out.print(time.getSecondOfMinute() + ":");
		System.out.println(time.getMillisOfSecond());
	}
	
	@Test
	public void binarySearchWorks1() {
		System.out.println("target not found");
		int nums[] = {1, 2, 3, 4};
		int target = 5;
		assertEquals(-1, FunnyAlgorithms.binarySearch(nums, target));
	}
	
	@Test public void binarySearchWorks2() {
		System.out.println("target found");
		int nums[] = {1, 2, 3, 4};
		int target = 2;
		assertEquals(1, FunnyAlgorithms.binarySearch(nums, target));
	}
	
	
	@AfterClass
	public static void afterClass() {
		DateTime time = new DateTime();
		System.out.print(time.getHourOfDay() + ":");
		System.out.print(time.getMinuteOfHour() + ":");
		System.out.print(time.getSecondOfMinute() + ":");
		System.out.println(time.getMillisOfSecond());
	}
}
