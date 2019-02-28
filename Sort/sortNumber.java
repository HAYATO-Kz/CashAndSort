import java.util.Comparator;

public class sortNumber implements Comparator<Integer>{

    @Override
    public int compare(Integer o, Integer o2){
        if(o < o2)return -1;
        if(o > o2)return 1;
        return 0;
    }
}