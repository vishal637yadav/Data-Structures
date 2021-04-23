package com.collections.api.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMain {

    static Integer a[] = new Integer[]{1,4,5,56,76};
    static String s[] = new String[]{"abc","xyz","sachin"};
    static String name = "Vishal";


    public static void main(String[] args) {
        createInputArray();
        List<Object> inputList = createInputArray();
        int i = sumOfSpecialArray(inputList,1);
        System.out.println("i :---"+i);
    }

    public static List<Object> createInputArray(){
        List<Object> arrayList=new ArrayList<>();
        //    //[5, 2, [7, -1], 3, [6, [-13, 8], 4]]

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(new ArrayList(Arrays.asList(new Integer[]{7,-1})));
        arrayList.add(3);
        List<Object> ls = new ArrayList<>();
        ls.add(6);
        ls.add(new ArrayList(Arrays.asList(new Integer[]{-13,8})));
        ls.add(4);
        arrayList.add(ls);

        System.out.println(" ::"+arrayList);
        return arrayList;
    }

    public static int sumOfSpecialArray(List<Object> list,int level){
        int sum = 0;
        for(int i=0;i<list.size();i++){
            Object currObject = list.get(i);
            System.out.println("currObject : "+currObject);
            //boolean iscurrObjectArray = currObject.getClass().isArray();
            boolean iscurrObjectArray = currObject instanceof List;
            System.out.println("iscurrObjectArray : "+iscurrObjectArray);
            if(iscurrObjectArray){
                sum += sumOfSpecialArray((List<Object> )currObject,level+1);
            }else{
                sum += (int)currObject;
            }
        }
        System.out.println("(leverl"+level+" sum :-->"+sum);
        return level*sum;
    }
    
}
