package com.hawkins.LeetCode.BloombergPrep;

import java.util.*;

public class MostFrequentWords {

    public void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"},2));
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String c : words){
            map.merge(c, 1, Integer::sum);
        }
        // Make a list of the keys, sorted by frequency.
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,new MyComparator());

        List<String> res = new ArrayList<>();
        for(int i = 0; i < k; i++){
            res.add(list.get(i).getKey());
        }

        return res;
    }

    public static class MyComparator implements Comparator<Map.Entry<String,Integer>>{
        @Override
        public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
            if(o1.getValue()<o2.getValue()) {
                return 1;
            }else if(o1.getValue()>o2.getValue()){
                return -1;
            }
            return o1.getKey().compareTo(o2.getKey());
        }
    }
}
