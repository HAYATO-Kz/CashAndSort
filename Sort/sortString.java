import java.util.Comparator;
public class sortString implements Comparator<String>{

    @Override
    public int compare(String o, String o2){
        return o.compareTo(o2);
    }
}