package edwin.xml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String home(){
        return "La puta que lo pario, funciona!!!";
    }
}
