package com.assignment;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Sort implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        return a.compareTo(b);
    }
}
public class SortMaps {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new Sort());
        map.put("Riya", "Patil");
        map.put("Sandhya","Singh");
        map.put("Akanksha", "Deshmukh");
        map.forEach((k,v)-> System.out.println(k +" "+v));
    }
}