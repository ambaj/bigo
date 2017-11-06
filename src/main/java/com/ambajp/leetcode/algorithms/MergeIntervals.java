package com.ambajp.leetcode.algorithms;

import java.util.*;

/**
 * Created by bajpa001 on 11/2/17.
 */
public class MergeIntervals {

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {

        Collections.sort(intervals, new Comparator<Interval>() {

            public int compare(Interval v1, Interval v2) {
                if(v1.start != v2.start)
                    return v1.start - v2.start;
                else
                    return v1.end - v2.end;
            }
        });

        List<Interval> result = new ArrayList<Interval>();

        Interval pre = intervals.get(0);
        for (Interval i : intervals) {
            Interval curr = i;
            if (curr.start > pre.end){
                result.add(curr);
                pre = curr;
            } else {
                Interval merge = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = merge;
            }
        }
        result.add(pre);
        return result;
    }
}
