package Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {

//    stream流的三部曲
    public static void main(String[] args) {
        Set<String> permission = new HashSet<>();
        permission.add("sys:user:view");
        permission.add("sys:user:add");
        permission.add("sys:user:edit");
        permission.add("sys:user:delete");


        permission.add("sys:user:view");
        permission.add("sys:user:add");
        permission.add("sys:user:edit");
        permission.add("sys:user:delete");

        Stream<String> stream = permission.stream();

        stream.map((authority) ->new GrantedAuthorityImpl(authority));
//        List<GrantedAuthority> list = stream.collect(Collectors.toList());
    }
}
