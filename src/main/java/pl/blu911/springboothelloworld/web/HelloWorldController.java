package pl.blu911.springboothelloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello (@RequestParam (value = "name") String name) {
        return "<h1>Hello " + name + "!</h1>";
    }

    /*To access app on the web:
     *start application
     *connect it on     http://localhost:8080/hello?name=World
     *You can write your own word in name param to see different message!
     */

}
