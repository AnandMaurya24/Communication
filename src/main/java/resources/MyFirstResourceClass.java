package resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MyFirstResourceClass {
    @GetMapping
    public String getMyFirstResource() {
        return "My First Resource";
    }
    @GetMapping("/poll")
    public String getPoll() {
        return "Hello from Short Polling";
    }


}
