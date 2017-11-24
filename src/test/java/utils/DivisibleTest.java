package utils;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import utlis.Divisible;;

public class DivisibleTest {
	
	@Test
	public void divisiblepar3() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> even = Divisible.nombre(liste);
		Assert.assertThat(even, Is.is(Arrays.asList(3, 6, 9)));
	}
	
	@Test
	public void divisiblepar5() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> even = Divisible.nombre(liste);
		Assert.assertThat(even, Is.is(Arrays.asList(5, 10)));
	}
	
	@Test
	public void divisiblepar3et5() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> even = Divisible.nombre(liste);
		Assert.assertThat(even, Is.is(Arrays.asList(3, 5, 6, 9, 10)));
	}
}
