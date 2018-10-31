package guestList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GuestListTest {


	@Test
	public void testGetCount1() {
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);

		int actual = guestList.getCount();

		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCount2() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);

		int actual = guestList.getCount();

		int expected = 1;
		assertEquals(expected, actual);

	}
	
	@Test
	public void testGetCount3() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("David", -47, true);

		int actual = guestList.getCount();

		int expected = 2;
		assertEquals(expected, actual);

	}
	@Test
	public void testGetCount4() {
		GuestList guestList = new GuestList();
		guestList.add("Pops", -13, true);
		int actual = guestList.getCount();

		int expected = 1;
		assertEquals(expected, actual);

	}
	@Test
	public void testMemberCount1() {
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);

		int actual = guestList.getMemberCount();

		int expected = 1;
		assertEquals(expected, actual);

	}

	@Test
	public void testMemberCount2() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);

		int actual = guestList.getMemberCount();

		int expected = 0;
		assertEquals(expected, actual);

	}
	
	@Test
	public void testmemberCount3() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("David", -47, true);

		int actual = guestList.getMemberCount();

		int expected = 1;
		assertEquals(expected, actual);

	}
	@Test
	public void testmemberCount4() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, true);
		guestList.add("David", -47, false);

		int actual = guestList.getMemberCount();

		int expected = 1;
		assertEquals(expected, actual);

	}
	@Test
	public void testmemberCount5() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("Jim", 43, false);
		guestList.add("Kim", 77, true);
		guestList.add("David", 4, true);

		int actual = guestList.getMemberCount();

		int expected = 2;
		assertEquals(expected, actual);

	}
	@Test
	public void testmemberCount6() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, true);
		guestList.add("Jim", 43, true);
		guestList.add("Kim", 77, false);
		guestList.add("David", 4, false);

		int actual = guestList.getMemberCount();

		int expected = 2;
		assertEquals(expected, actual);

	}
	@Test
	public void testGetSum1() {
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);

		int actual = guestList.getSum();

		int expected = 47;
		assertEquals(expected, actual);

	}

	@Test
	public void testGetSum2() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("Pops", -13, true);
		guestList.add("David", 47, true);

		int actual = guestList.getSum();

		int expected = 137;
		assertEquals(expected, actual);

	}
	
	@Test
	public void testGetSum3() {
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("David", 47, true);
		int actual = guestList.getSum();
		int expected = 150;
		assertEquals(expected, actual);
	}
	

}
