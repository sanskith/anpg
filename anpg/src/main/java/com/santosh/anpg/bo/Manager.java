package com.santosh.anpg.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import com.santosh.anpg.dto.Result;
import com.santosh.anpg.util.Util;

@Controller
public class Manager {

	public Result generate(String phoneNUmber) {
		/*
		 * 1.Create a map with number and alphabets 2.Loop through char set 3.Replace
		 * number with chars 4.Identify pagination logic
		 */
		Map<Integer, List<Character>> map = Util.inti();

		List<String> generatedValues = new ArrayList<>();

		for (int i = 0; i < phoneNUmber.length(); i++) {
			Integer digit = Integer.parseInt(phoneNUmber.charAt(i) + "");
			List<Character> letters = map.get(digit);
			for (Character c : letters) {
				String generatedValue = phoneNUmber.substring(0, i) + c + phoneNUmber.substring(i + 1);
				generatedValues.add(generatedValue);
			}
		}

		Result result = new Result(generatedValues.size(), generatedValues);
		return result;
	}

}
