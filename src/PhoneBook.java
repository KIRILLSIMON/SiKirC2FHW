import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

private final Map<String, String> map =new HashMap<>();
public void add(String name, String phone){
        map.put(name, phone);
}

public void print(){
    for (Map.Entry<String, String>entry: map.entrySet()) {
            System.out.println("Контакт: "+entry.getKey()+", номер телефона:  "+entry.getValue());
            }
        }
    }
