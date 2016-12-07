package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by skyll on 16.11.2016.
 */
public class MapOut_Iterator {
    public static void main(String[] args)
    {
        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение

            System.out.println(key + ":" + value);
        }

//        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
//            System.out.println(stringStringEntry.getKey());
//            System.out.println(stringStringEntry.getValue());
//        }

    }
}
