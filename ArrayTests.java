import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 1, 1};
    int[] input2 = {5, 4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 1, 1}, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvgWithoutLowest() {
    double[] input3 = {1, 1, 1, 1, 1, 1};
    double[] input4 = {3, 3, 4, 5, 6};
    assertEquals(1, ArrayExamples.averageWithoutLowest(input3), 0);
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input4), 0);
  }
}
