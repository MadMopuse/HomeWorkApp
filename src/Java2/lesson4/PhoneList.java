package Java2.lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneList {

    private HashMap<String, ArrayList<String>> phoneList= new HashMap<>();

    public ArrayList<String> get(String surname){
        return phoneList.get(surname);
    }

    public void add(String surname, String phone){
        if (phoneList.containsKey(surname)){
            ArrayList<String> n = phoneList.get(surname);
            n.add(phone);
            phoneList.put(surname, n);
        }
        else {
            ArrayList<String> m = new ArrayList<>();
            m.add(phone);
            phoneList.put(surname, m);
        }
    }
}
