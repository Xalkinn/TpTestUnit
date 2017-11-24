package utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import utlis.MyUtils;

public class MyUtilsTest {
	/*
	 * Les test unitaire : En gros les test ici vont me permettre de vérifier si le
	 * code est bon on fournissant des valeurs qui marche en fonction de mon
	 * programme. En effet je code une liste qui m'additionne 4 chffre pour faire
	 * 10. 
	 * L'opperation est : 1 + 2 + 3 + 4 = 10
	 * On fournit donc a notre test unitaire que la liste en question contient 1, 2, 3 et 4.
	 * On lui indique donc que le resultat est 10. Si le test est bon cela signifie que le programme est bon.
	 */

	@Test
	public void testSum() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int sum = MyUtils.sum(list);
		Assert.assertThat(sum, Is.is(10));
	}
	/* 
	 * Meme principe que precedemment. Le resultat est de nous renvoyé les chiffres paires. 
	 * Cependendant 4 n'exsite pas donc il y a une exception.
	 * Voir le programme MyUtils pour plus de détail
	 */
	@Test
	public void testFilterEvenNumber() {
		List<Integer> list = Arrays.asList(1, 2, 3, null, 5, 6, 7, 8, 9);
		List<Integer> even = MyUtils.filterEvenNumbers(list);
		Assert.assertThat(even, Is.is(Arrays.asList(2, 6, 8)));
	}

	@Test
	public void testFilterEvenNumber2() {
		List<Integer> list = null;
		List<Integer> list2 = Arrays.asList();
		List<Integer> even = MyUtils.filterEvenNumbers(list);
		Assert.assertThat(even, Is.is(list2));
	}

}
