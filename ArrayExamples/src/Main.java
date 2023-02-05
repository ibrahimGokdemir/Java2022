
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		int[]	sayilar1 ={3,4};
		int[]	sayilar2 =new int[3];
		sayilar2[2]=3;
//		System.out.println(sayilar2[2]);
		String[]	harfler = {"a","b","c"};
		
		Integer[] initial = { 127, Integer.valueOf( 42 ) };
		List<Integer> toList = Arrays.asList( initial );
		String[] canlar = new String[] { "Sare", "Zeynep" };
		
		int[] arr = {1, 2, 3, 4, 5};
//		System.out.println(Arrays.toString(arr));
		
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
//		System.out.println(Arrays.deepToString(arr2)); //multidimentional to string
		
		// remove element from Array
		String[] array = new String[] {"test1","test2","test3" };
		
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		list.remove("test2");
		
		array= list.toArray(new String[list.size()]);
		
//		System.out.println(Arrays.toString(array));
		
		//Data Ekleme
		List<String> data = Arrays.asList("ab", "bc", "cd", "ab", "bc", "cd");
		
		List<String> liste = new ArrayList<>(data); // Olduğu gibi alır dataları
		Set<String> set1 = new HashSet<>(data); //Her eşten bir adet alır
		SortedSet<String> set2 = new TreeSet<>(data);  // Hem eşlerden birini alır hem sıralar
		Set<String> set3 = new LinkedHashSet<>(data); // Eşlerden biri ama sırayı korur
		
		List<String> names = new ArrayList<>(Arrays.asList("Sare","Zeynep","İbrahim"));
//		names.forEach(System.out::println);

		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Hello");
		liste1.add("Hello2");
		
//		liste1.forEach(System.out::println);
		
		List<String> liste2 = liste.subList(0, 1);
		
		liste2.add("Hello3");
//		liste2.forEach(System.out::println);
//		liste1.forEach(System.out::println);
		
		List<String> unmodifiableList = Collections.unmodifiableList(liste1);
		
		
		
		
	}

}
