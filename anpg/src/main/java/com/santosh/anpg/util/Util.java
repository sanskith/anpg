package com.santosh.anpg.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {

	public static Map<Integer, List<Character>> inti() {
		Map<Integer, List<Character>> map = new HashMap<>();
		map.put(1, new ArrayList<>());
		map.put(2, new ArrayList<>(List.of('A', 'B', 'C')));
		map.put(3, new ArrayList<>(List.of('D', 'E', 'F')));
		map.put(4, new ArrayList<>(List.of('G', 'H', 'I')));
		map.put(5, new ArrayList<>(List.of('J', 'K', 'L')));
		map.put(6, new ArrayList<>(List.of('M', 'N', 'O')));
		map.put(7, new ArrayList<>(List.of('P', 'Q', 'R', 'S')));
		map.put(8, new ArrayList<>(List.of('T', 'U', 'V')));
		map.put(9, new ArrayList<>(List.of('W', 'X', 'Y', 'Z')));
		map.put(0, new ArrayList<>());
		return map;
	}

}
