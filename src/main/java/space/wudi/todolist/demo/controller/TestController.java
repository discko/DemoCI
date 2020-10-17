package space.wudi.todolist.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

@RestController
@RequestMapping(value="/api")
public class TestController {


    @Bean
    public void show(){
        System.out.println("in show");
        for(Method m: this.getClass().getMethods()){
            if(m.isAnnotationPresent(GetMapping.class)){
                GetMapping a=m.getAnnotation(GetMapping.class);
                System.out.println(String.format("GetMapping[value=%s]", Arrays.toString(a.value())));
            }
        }


    }

    @GetMapping(value="hello/{msg}")
    @ResponseBody
    public String hello(@PathVariable String msg){
        return String.format("hello, %s", msg);
    }
}
