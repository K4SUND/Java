package Unknown;

import java.util.*;

public class StrTest {

    public static void main(String[] args) {

        int connections = 3;
        String str0 = "TDWL,LKCSE,NSDQ";
        String str1 = "TDWL,ABC,BD";
        String str2 = "ABC,DS,ER";


        Set<String> exchanges = new LinkedHashSet<>();

        for(String elem : str0.split(","))
        {
            String exchange = elem.trim();
            exchanges.add(exchange);

        }
        for(String elem : str1.split(","))
        {
            String exchange = elem.trim();
            exchanges.add(exchange);

        }
        for(String elem : str2.split(","))
        {
            String exchange = elem.trim();
            exchanges.add(exchange);

        }


        List<String> list = new ArrayList<>(exchanges);
        String[] exchangesList  = list.toArray(new String[0]);

        System.out.println(Arrays.toString(exchangesList));

    }
}
