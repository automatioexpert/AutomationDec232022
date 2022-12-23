package tests;

import org.testng.annotations.Test;

public class TestCase2 {

	Add add;

	@Test(priority = 0)
	public void t2() {
		System.out.println("I am the best expert on the Planet");
		add = new Add();
		add.display();
	}

	@Test(priority = 1)
	public void t3() {
		add.display();
	}
}
