package miguelcastro.com.familiarizanosconernrutamiento.familiarizarnosconenrutamiento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Controller
@RequestMapping("/coding")
public class CodingController {

    @RequestMapping("")
    public String index(){
        return "¡Hola Coding Dojo!";
    }

    @RequestMapping("/python")
    public String python(){
        return "¡Python/Django fue increíble!";
    }

    @RequestMapping("/java")
    public String java(){
        return "¡Java/Spring es mejor!";
    }
}
