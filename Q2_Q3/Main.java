package Q2_Q3;

import java.util.ArrayList;

public class Main {
    //max number in array list
    public static Integer max(ArrayList<Integer> list){
        if(list == null || list.size() == 0)
            return null;
        Integer max = list.get(0);
        for(int i =1;i < list.size();i++){
            if(list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
    //sort number in array list
    public static void sort(ArrayList<Integer> list){
        if(list == null || list.size() == 0)
            return;
        list.sort(null);
    }
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<>();
        x.add(3);
        x.add(-2132);
        x.add(21355);
        sort(x);
        for(int i = 0;i < x.size();i++)
            System.out.print(x.get(i)+" ");
    }
}
