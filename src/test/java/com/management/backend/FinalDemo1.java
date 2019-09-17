package com.management.backend;

import io.swagger.models.auth.In;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @ClassName FinalDemo1
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/9/9 17:56
 * @Version 1.0
 **/
public final class FinalDemo1 {

    public FinalDemo1() {
    }

    public static String function1(){

        String a ="“This is racecar and madam, but the number is 121”";

        a=a.replace(","," ");
        String[] s = a.split(" ");
        String result="";
        for (int i = 0; i <s.length ; i++) {
            String tmp="";
//            tmp=s[i];
            for (int j = i; j <s.length ; j++) {
                if(s[i].length() > s[j].length()){
                    tmp=s[i];
//                    result=tmp;
                }else{
                    tmp=s[j];
                }
                if(result.length()<tmp.length()){
                    result=tmp;
                }

            }
        }

        return result;
    }

    public static Integer function2(){
        LinkedList<Integer> a=new LinkedList<>();
        LinkedList<Integer> b=new LinkedList<>();

        a.add(4);a.add(5);a.add(11);a.add(12);a.add(13);
        b.add(1);b.add(2);b.add(3);b.add(11);b.add(12);b.add(13);
        Integer result=null;

        for (int i = a.size(); i >0; i--) {
            int aTmp=a.get(i-1);
            for (int j = b.size(); j >0 ; j--) {
                int bTmp=b.get(j-1);
                if (aTmp==bTmp){
                    result=bTmp;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = function1();
        System.out.println(s);
        Integer s1 = function2();
        System.out.println(s1);

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        String put = stringStringHashMap.put("11", "22");
        System.out.println(put.isEmpty());


    }


}

