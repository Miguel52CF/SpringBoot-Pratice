package com.miguel.contador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    
    @RequestMapping("/reinicia")
    public String reinicia(HttpSession session){
        session.setAttribute("contador", 0);
        return "index.jsp";
    }

    @RequestMapping("/index")
    public String contar(HttpSession session){
        int contador = (int)session.getAttribute("contador");
        session.setAttribute("contador", contador);
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session){
        int contador = (int)session.getAttribute("contador");
        contador++;
        session.setAttribute("contador", contador);
        return "counter.jsp";
    }   

    @RequestMapping("/counterdoble")
    public String doubleCounter(HttpSession session){
        int contador = (int)session.getAttribute("contador");
        contador+=2;
        session.setAttribute("contador", contador);
        return "counterDoble.jsp";
    }   
    
}
