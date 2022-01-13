package uk.co.niteesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleBookRestController {
    
    @GetMapping("/")
    public String getBook() {
        return "Hello World";
    }
}