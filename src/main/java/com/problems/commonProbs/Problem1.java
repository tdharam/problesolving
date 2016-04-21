package com.problems.commonProbs;

import java.util.*;

/**
 * Created by thakurd on 21/04/16.
 */
public class Problem1 {

   static LinkedList<Integer> llist= new LinkedList<Integer>();
static Set<Integer> sett = new LinkedHashSet<Integer>();
    static  Map<Integer,String> mapp = new LinkedHashMap<Integer,String>();

   static void  fun(){
       sett.add(5);

       sett.add(1);

       sett.add(3);



       //mapp.put(3,"k");
       mapp.put(2,"2");
       mapp.put(3,"3");
       mapp.put(2,"4");



       Iterator<Integer> itr = mapp.keySet().iterator();
       while (itr.hasNext()){
           System.out.println(mapp.get(itr.next()));
       }


    }

}
