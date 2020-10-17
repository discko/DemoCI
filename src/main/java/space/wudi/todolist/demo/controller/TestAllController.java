package space.wudi.todolist.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestAllController {
    @GetMapping("{msg}")
    @ResponseBody
    public String returnPath(@PathVariable String msg){
        return msg;
    }
}
