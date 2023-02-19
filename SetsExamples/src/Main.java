import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put(10, "ten");
		tm.put(4, "four");
		tm.put(1, "one");
		tm.put(12, "twelve");
		System.out.println(tm.firstKey());
	}}
