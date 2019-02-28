import java.util.Arrays;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] lis =  { "C", "A", "B" };
        Integer[] lin = {4,2,1,3};
        Sort ss = new Sort();
        ss.sort(lis,new sortString());
        ss.sort(lin,new sortNumber());
        for(Object i : lin){
            System.out.println(i);
        }
        for(String i : lis){
            System.out.println(i);
        }
    }
}