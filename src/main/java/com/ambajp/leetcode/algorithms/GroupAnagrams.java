package com.ambajp.leetcode.algorithms;

import java.util.*;

/**
 * Created by bajpa001 on 10/24/17.
 */
public class GroupAnagrams {

    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List> ana = new HashMap<String, List>();

        for(String s : strs) {
            String s1 = StringSort(s);
            if(ana.containsKey(s1)) {
                ana.get(s1).add(s);
            }else {
                List<String> arr = new ArrayList<String>();
                arr.add(s);
                ana.put(s1, arr);
            }
        }

        Iterator<String> it = ana.keySet().iterator();
        while(it.hasNext()) {
            String s = it.next();
            result.add(ana.get(s));
        }
        return result;
    }

    public String StringSort(String s) {
        char[] chrs = s.toCharArray();
        Arrays.sort(chrs);
        return new String(chrs);
    }
}
