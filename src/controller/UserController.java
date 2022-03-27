package controller;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Controller
public class UserController {

    @RequestMapping("/test")
    public String test() {
        return "";
    }

    public String test2() {
        return "";
    }
}
