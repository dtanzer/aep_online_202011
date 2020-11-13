package com.example.evilfizzbuzz;

import java.util.Map;

import com.example.evilfizzbuzz.fizz.Fizz;

public class EvilFizzBuzz {

    public EvilFizzBuzz() {

        // generate numbers

        Map<Integer, String> dummy = null;
        // add fizz
        Validator fizz = new Fizz();
        fizz.update(dummy);

        // add buzz
        Validator buzz = new Buzz();
        buzz.update(dummy);

        // add wizz

        // combine fizz & buzz & wizz

        // output

    }
}
