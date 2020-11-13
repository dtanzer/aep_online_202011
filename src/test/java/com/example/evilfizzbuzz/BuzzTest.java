package com.example.evilfizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.evilfizzbuzz.Buzz;

public class BuzzTest {
	@Test
	public void test(){
		Map<Integer,String> dummy = new HashMap<Integer,String>(){
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

	@Test
	public void betterImplementation(){

		IntStream.range(1,100).boxed().map(nr->{
			return Arrays.asList(
					nr%3==0?"Fizz":"",
					nr%5==0?"Buzz":"",
					Primes.isPrime(nr)?"Wizz":""
			);
		})
		.reduce(new ArrayList<String>(),
				(acc, cur)->{
					String word = String.join("",cur);
					acc.add(word.length()==0?(acc.size()+1)+"":word);
					return acc;
		})
		.forEach( str->System.out.println(str));
	}
}
