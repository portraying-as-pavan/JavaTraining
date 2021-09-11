package com.moneytap.movies;

import com.moneytap.company.Employee;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MovieDemo {

    public static void main(String[] args) {
        TreeMap<Movie,Integer> movieMap=new TreeMap<>();

        Movie m1=new Movie("Shawshank Redemptiom",1994,7.3,28.34);
        Movie m2=new Movie("God Father",1972,9.2,134.4);
        Movie m3=new Movie("The Dark Knight",2008,6.0,534);
        Movie m4=new Movie("LoTR: Return of king",2003,8.9,337.54);

        movieMap.put(m2,2);
        movieMap.put(m4,4);
        movieMap.put(m1,1);
        movieMap.put(m3,3);

       // System.out.println(movieMap.get(m1));
        Iterator<Map.Entry<Movie,Integer>> mapEntrySet=movieMap.entrySet().iterator();

        while (mapEntrySet.hasNext()){
            Map.Entry<Movie,Integer> entry=mapEntrySet.next();
            //System.out.println(movieMap.get(entry.getKey()));
          //  System.out.println(entry.getKey());
            Movie m= entry.getKey();
            if(movieMap.containsKey(m))
                System.out.println("KeyFound");
            else
                System.out.println("Value Not Found");
            System.out.println(m+" ");
        }

/*
        System.out.println("===============================");
        System.out.println("Sorted By collection in $Mn");
        TreeMap<Movie,Integer> sortedByCollection=new TreeMap<>(new collectionsComparator());
        sortedByCollection.putAll(movieMap);
        System.out.println(sortedByCollection);

        System.out.println("===============================");
        System.out.println("Sorted By ReleaseDate  in year");
        TreeMap<Movie,Integer> sortedbyReleaseDate=new TreeMap<>(new releaseDateComparator());
        sortedbyReleaseDate.putAll(movieMap);
        System.out.println(sortedbyReleaseDate);
*/
    }
}
