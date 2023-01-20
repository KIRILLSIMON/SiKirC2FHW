import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static final Map<String, Integer> MAP=new HashMap<>();
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            MAP.put(String.valueOf(i),i);
        }
       MAP.put("str1",2);
       System.out.println(MAP);
        tryPut("str2",1);
        System.out.println(MAP);
        try{
        tryPut("str1",2);

       }catch (IllegalArgumentException ignored) {
            System.out.println(ignored.getMessage());
        }

        tryPut("str1",5);
        System.out.println(MAP);
    }

    private static void tryPut(String key, Integer value){
        if (MAP.containsKey(key)&&MAP.get(key).equals(value)){
            throw new IllegalArgumentException("Такой ключ и значение уже есть в карте!");
        }
        MAP.put(key,value);
    }
}
