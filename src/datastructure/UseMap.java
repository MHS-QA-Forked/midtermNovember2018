package datastructure;

import java.util.*;


public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Arif");
		map.put(2,"Joshua");
		map.put(3, "Mafi");
		map.put(4, "Tofael");

		System.out.println("using for each loop to get keys and values");

		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("Using iterator to get keys and values");

		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Object keys = it.next();
			System.out.println(keys);

		}

		List<String> nissanModels = new ArrayList<>();
		nissanModels.add("Rogue");
		nissanModels.add("PathFinder");
		nissanModels.add("Murano");

		List<String> PorcheModels = new ArrayList<>();
		PorcheModels.add("Cayman");
		PorcheModels.add("Boxter");
		PorcheModels.add("GTS");

		List<String> teslaModels = new ArrayList<>();
		teslaModels.add("Model 3");
		teslaModels.add("Model S");
		teslaModels.add("Model X");

		HashMap<String, List<String>> makesAndModles = new LinkedHashMap<>();
		makesAndModles.put("Nissan", nissanModels);
		makesAndModles.put("Porche", PorcheModels);
		makesAndModles.put("Tesla", teslaModels);

		System.out.println("Heres my 3 favorite car makes with their most popular models");
		System.out.println();
		for (HashMap.Entry<String, List<String>> entry : makesAndModles.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}







	}

}
