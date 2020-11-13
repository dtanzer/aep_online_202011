package com.example.evilfizzbuzz;

import java.util.Map;

public class Buzz implements Validator {

	@Override
	public void update(final Map<Integer, String> numbers) {
		for (Map.Entry<Integer, String> entry : numbers.entrySet()){
			Integer nr = entry.getKey();
			if (nr%5==0)
				numbers.put(nr,"Buzz");
		}
	}
}
