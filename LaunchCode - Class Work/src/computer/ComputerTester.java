package computer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTester {

	@Test
	public void testAddMemory() {
		Computer c = new Computer(4, 100, 100, "Dell");
		assertTrue("Problem setting memory in constuctor", c.getMemory() == 4);
		c.addMemory(2);
		assertTrue("Problem updating memory in addMemory", c.getMemory() == 9);
	}
	@Test
	public void testAddMemoryMax() {
		Computer c = new Computer(8, 100, 100, "Dell");
		assertTrue("Problem setting memory in constuctor", c.getMemory() == 8);
		c.addMemory(2);
		assertTrue("Problem updating memory in addMemory(), when we hit the maximum allowed memory", c.getMemory() == 9);
	}
}
