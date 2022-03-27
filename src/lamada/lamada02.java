package lamada;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class lamada02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小红");
        list.add("小绿");
        list.add("小白白");
        list.add("小嘿嘿");

//        for (String name:list){
//
//        }

//        list.forEach((name)->System.out.println(name));

        Stream<String> stream = list.stream();
        Stream<String> stream1 = stream.filter((name) -> name.length() >2).limit(1);
        stream1.forEach((name)-> System.out.println(name)) ;

    }
}
