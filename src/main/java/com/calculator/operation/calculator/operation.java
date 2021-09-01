package com.calculator.operation.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class operation {

    @GetMapping("/add/{x}/{y}")
    public res add(@PathVariable int x, @PathVariable int y){
        return new res(x, y, x+y);
    }

    @GetMapping("/sub/{x}/{y}")
    public res sub(@PathVariable int x, @PathVariable int y){
        return new res(x, y, x-y);
    }

    @GetMapping("/div/{x}/{y}")
    public res div(@PathVariable int x, @PathVariable int y){
        return new res(x, y, x/y);
    }

    @GetMapping("/mul/{x}/{y}")
    public res mul(@PathVariable int x, @PathVariable int y){
        return new res(x, y, x*y);
    }
    
}
