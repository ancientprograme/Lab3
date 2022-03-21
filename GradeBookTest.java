import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1,g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(45);
		g1.addScore(35);
		g2.addScore(55);
		g2.addScore(15);
		System.out.println(g1);
		System.out.println(g2);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testScoreSize() {
		assertEquals(2,g1.getScoreSize());
		assertEquals(2,g2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(80,g1.sum());
		assertEquals(70,g2.sum());
	}
	
	@Test
	void testMinimum() {
		assertEquals(35,g1.minimum());
		assertEquals(15,g2.minimum());
	}
	@Test
	void testFinalScore() {
		assertEquals(45,g1.finalScore());
		assertEquals(55,g2.finalScore());
	}
}
