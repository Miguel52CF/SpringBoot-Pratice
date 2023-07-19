package com.miguel.mostrarfecha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    
    @RequestMapping("/index")
    public String retorna(){
        return "index.jsp";
    }

    @RequestMapping("/time")
    public String time(Model model, HttpSession session){
        session.setAttribute("name", "miguel");
        String date = DateTimeFormatter.ofPattern("hh:mm:ss a").format(LocalDateTime.now());
        model.addAttribute("date", date);
        return "time.jsp";
    }
    
    @RequestMapping("/date")
    public String date(Model model){
         String date = DateTimeFormatter.ofPattern("MMM dd yyyy").format(LocalDateTime.now());
        model.addAttribute("date", date);
        return "date.jsp";
    }



}
