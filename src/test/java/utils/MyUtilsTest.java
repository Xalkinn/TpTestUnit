package utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import utlis.MyUtils;

public class MyUtilsTest {

	@Test
	public void testSum() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int sum = MyUtils.sum(list);
		Assert.assertThat(sum, Is.is(10));
	}
	
	@Test
	public void testFilterEvenNumber() {
		List<Integer> list = Arrays.asList(1, 2, 3, null, 5, 6, 7, 8, 9);
		List<Integer> even = MyUtils.filterEvenNumbers(list);
		Assert.assertThat(even, Is.is(Arrays.asList(2, 6, 8)));
	}
	
	@Test
	public void testFilterEvenNumber2() {
		List<Integer> list =null;
		List<Integer> list2 = Arrays.asList();
		List<Integer> even = MyUtils.filterEvenNumbers(list);
		Assert.assertThat(even, Is.is(list2));
	}
	
}
