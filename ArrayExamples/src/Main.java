
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		List<String> list = new ArrayList<>(Arrays.asList(array));
		list.remove("test2");
		
		array= list.toArray(new String[list.size()]);
		
//		System.out.println(Arrays.toString(array));
		
		

	}

}
