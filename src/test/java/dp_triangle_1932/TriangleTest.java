package dp_triangle_1932;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	int [][] n= {{0,0,0,0,0,0},
			     {0,7,0,0,0,0},
				 {0,3,8,0,0,0},
			 	 {0,8,1,0,0,0},
				 {0,2,7,4,4,0},
				 {0,4,5,2,6,5}};
	
	@Test
	public void inputTest_0_0() {
		assertThat(n[0][0], is(0));
	}

	@Test
	public void inputTest_5_5() {
		assertThat(n[5][5], is(5));
	}
	
	@Test
	public void inputTest_1_1() {
		assertThat(n[1][1], is(7));
	}
	
	@Test
	public void inputTest_4_3() {
		assertThat(n[4][3], is(4));
	}
	
	@Test
	public void inputTest_5_3() {
		assertThat(n[5][3], is(2));
	}
}
