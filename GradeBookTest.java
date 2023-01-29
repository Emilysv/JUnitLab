import static org.junit.jupiter.api.Assertions.*;

//Emily Vides
//CMSC 204

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook g1;
	GradeBook g2;
	GradeBook g3;

	@BeforeEach
	void setUp() throws Exception {
		
		g1= new GradeBook(5);
		g2= new GradeBook(5);
		g3= new GradeBook(5);
		
		g1.addScore(45);
		g1.addScore(50);
		g1.addScore(20);
		
		g2.addScore(20);
		g2.addScore(60);
		g2.addScore(10);
		g2.addScore(7);
		
		g3.addScore(70);
		g3.addScore(12);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1=null;
		g2=null;
		g3=null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("45.0 50.0 20.0 "));
		assertTrue(g2.toString().equals("20.0 60.0 10.0 7.0 "));
		assertTrue(g3.toString().equals("70.0 12.0 "));
		
		assertEquals(3, g1.getScoreSize());
		assertEquals(4, g2.getScoreSize());
		assertEquals(2, g3.getScoreSize());
	}

	@Test
	void testSum() {
		
		assertEquals(115, g1.sum(), .0001);
		assertEquals(97, g2.sum(), .0001);
		assertEquals(82, g3.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(20, g1.minimum(), .001);
		assertEquals(7, g2.minimum(), .001);
		assertEquals(12, g3.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(95.0, g1.finalScore());
		assertEquals(90.0, g2.finalScore());
		assertEquals(70.0, g3.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(3, g1.getScoreSize());
		assertEquals(4, g2.getScoreSize());
		assertEquals(2, g3.getScoreSize());
	}

	@Test
	void testToString() {
		
	}

}
