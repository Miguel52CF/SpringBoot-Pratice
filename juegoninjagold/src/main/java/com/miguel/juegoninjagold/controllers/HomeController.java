package com.miguel.juegoninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    ArrayList<String> lista = new ArrayList<>();

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @PostMapping("/farm")
    public String farm(HttpSession session, Model model){
        Random numAleatorio = new Random();
        String date = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        int nuevoValor = (int)session.getAttribute("gold");
        int valor = numAleatorio.nextInt(20-10+1) + 10;
        nuevoValor += valor;
        lista.add("You entered a farm and earned "+valor+" gold. ("+date+")");
        session.setAttribute("lista", lista);
        session.setAttribute("gold", nuevoValor);
        return"redirect:/gold";
    }

    @PostMapping("/cave")
    public String cave(HttpSession session, Model model){
        Random numAleatorio = new Random();
        String date = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        int nuevoValor = (int)session.getAttribute("gold");
        int valor = numAleatorio.nextInt(10-5+1) + 5;
        nuevoValor += valor;
        lista.add("You entered a cave and earned "+valor+" gold. ("+date+")");
        session.setAttribute("lista", lista);
        session.setAttribute("gold", nuevoValor);
        return"redirect:/gold";
    }

    @PostMapping("/house")
    public String house(HttpSession session, Model model){
        Random numAleatorio = new Random();
        String date = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        int nuevoValor = (int)session.getAttribute("gold");
        int valor = numAleatorio.nextInt(5-2+1) + 2;
        nuevoValor += valor;
        lista.add("You entered a house and earned "+valor+" gold. ("+date+")");
        session.setAttribute("lista", lista);
        session.setAttribute("gold", nuevoValor);
        return"redirect:/gold";
    }

    @PostMapping("/casino")
    public String casino(HttpSession session, Model model){
        Random numAleatorio = new Random();
        String date = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        int nuevoValor = (int)session.getAttribute("gold");
        int valor = numAleatorio.nextInt(50-0);
        int negativo = numAleatorio.nextInt(2-0)+1;
        if(negativo == 2){
            lista.add("You entered a casino and lost "+valor+" gold... Ouch. ("+date+")");
            nuevoValor -= valor;
        }else{
            lista.add("You entered a casino and earned "+valor+" gold. ("+date+")");
            nuevoValor += valor;
        }
        session.setAttribute("lista", lista);
        session.setAttribute("gold", nuevoValor);
        return"redirect:/gold";
    }

    @PostMapping("/spa")
    public String spa(HttpSession session, Model model){
        Random numAleatorio = new Random();
        String date = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        int nuevoValor = (int)session.getAttribute("gold");
        int valor = numAleatorio.nextInt(20-5+1) + 5;
        nuevoValor -= valor;
         lista.add("You entered a spa and lost "+valor+" gold... Ouch. ("+date+")");
        session.setAttribute("lista", lista);
        session.setAttribute("gold", nuevoValor);
        return"redirect:/gold";
    }

     @RequestMapping("/gold")
    public String gold(HttpSession session, Model model){
        ArrayList<String> lista = (ArrayList<String>) session.getAttribute("lista");
        int nuevoValor = (int)session.getAttribute("gold");
        if( nuevoValor < 0){
            return "bancaRota.jsp";
        }else{
            model.addAttribute("lista", lista);
            return "gold.jsp";
        }
    }

    @RequestMapping("/reinicia")
    public String reinicia(HttpSession session){
        lista.clear();
        session.setAttribute("lista",lista);
        return "index.jsp";
    }

    @RequestMapping("/nuevo")
    public String nuevo(HttpSession session){
        session.setAttribute("gold",0);
        return "gold.jsp";
    }
}
