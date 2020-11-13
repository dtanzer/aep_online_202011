package com.example.aep201111;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.evilfizzbuzz.Buzz;

public class BuzzTest {
	@Test
	public void test(){
		Map<Integer,String> dummy = new HashMap<Integer, String>(){
			{
				put(1, "");
				put(3, "");
				put(5, "");
				put(15, "");
			}
		};
		new Buzz().update(dummy);
		Assertions.assertEquals(dummy.get(1),"");
		Assertions.assertEquals(dummy.get(3),"");
		Assertions.assertEquals(dummy.get(5),"Buzz");
	}
}
