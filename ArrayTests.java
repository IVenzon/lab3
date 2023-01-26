import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {5, 4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
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
    double[] input3 = {1, 1, 1};
    assertEquals(0.5, ArrayExamples.averageWithoutLowest(input3), 0);
  }
}
