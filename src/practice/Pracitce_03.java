package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pracitce_03 {
	public static void main(String[] agrs) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");
		set1.add("いちご");
		set1.add("ぶどう");

		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));

		System.out.println(set1.size());
		
		set1.remove("スイカ");
		set1.remove("なし");
		
		System.out.println(set1.size());
		
	}

}
