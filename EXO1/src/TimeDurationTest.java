import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeDurationTest {

	@Test
	void test() throws BadBadValueException {
		TimeDuration tester = new TimeDuration(0);
		assertEquals("0s", tester.toString());
	}
	
	@Test
	void test2() throws BadBadValueException {
		TimeDuration tester = new TimeDuration(7242);
		assertEquals("2h 0m 42s", tester.toString());
	}

}
