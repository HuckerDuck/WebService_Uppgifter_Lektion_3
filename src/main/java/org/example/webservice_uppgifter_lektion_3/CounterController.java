package org.example.webservice_uppgifter_lektion_3;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    @GetMapping("/counter")
    public Counter getCounter(){
        return new Counter(2,5);
    }
}
