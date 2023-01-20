import java.util.HashMap;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {
        Map<Integer, String > map=new HashMap<>();
    int n=10;
    for (int i=0;i<n;i++){
        int key;
        if (i%2==0){
            key=10;
        }else {
            key=-10;
        }
        map.put(key+i,String.valueOf(i));

        }
        for (Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
