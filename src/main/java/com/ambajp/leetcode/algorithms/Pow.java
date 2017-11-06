package com.ambajp.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bajpa001 on 10/24/17.
 */
public class Pow {

    public static void main(String[] args){
        Map<String, Integer> t = new HashMap<String, Integer>();
        t.put("a", 1);
        t.put("b", 0);
        double d = 1/Double.NaN;

        int t1 = t.get("a")/t.get("b");
        System.out.println(d);
        Pow p = new Pow();
        System.out.println(p.myPow(2.00000 , -2147483648));
    }

    public double myPow(double x, int n) {
        if(n < 0)
            return 1/myPower(x, n * -1);
        else
            return myPower(x ,n);
    }

    public double myPower(double x, int n) {
        if(n == 0)
            return 1;

        double temp = myPow(x, n/2);

        if(n%2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }
}
