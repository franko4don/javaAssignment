package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class DivisorSquareSum {

    public void calculate(){
        Scanner sc = new Scanner(System.in);
        int range = 6000000;
        long [] divisors = new long[range + 1];
        Arrays.fill(divisors, 1);

        for(long i = 2; i <= range; i++){
            for(long j = i; j <= range; j += i){
                divisors[(int)j] += (i * i);
            }
        }

        System.out.println("yes");
    }
}
