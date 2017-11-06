package com.ambajp.leetcode.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by bajpa001 on 11/3/17.
 */
public class KClosestPoints {

    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public Point[] kClosest(Point[] points, Point origin, int k) {

        Comparator<Point> co = new mycompare(origin);
        Arrays.sort(points, co);

        Point[] result = new Point[k];

        for (int i = 0; i < k; i++){
            result[i] = points[i];
        }

        return result;
    }

    class mycompare implements Comparator<Point>{
        Point origin;

        mycompare(Point origin) {
            this.origin = origin;
        }

        public int compare(Point p1, Point p2) {
            double d1 = Math.sqrt(Math.pow((p1.x - origin.x),2) + Math.pow((p1.y - origin.y),2));
            double d2 = Math.sqrt(Math.pow((p2.x - origin.x),2) + Math.pow((p2.y - origin.y),2));

            if(d1 == d2)
                return p1.x - p2.x;
            else
                return p1.y - p2.y;
        }
    }
}
