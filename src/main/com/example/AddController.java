package com.example;

import com.example.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    @RequestMapping("/add")
    // below helps in printing the syso statement in a new page
/*    public  String add(){
//        System.out.println("inside add method");
        return "display.jsp";

    }*/

    //adding two numbers
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));
        AddService service=new AddService();
        int k=service.add(i,j);

        ModelAndView mv= new ModelAndView();
        mv.setViewName("display");// extension not needed to make generic , specify in another location
        mv.addObject("result",k);
        return mv;

    }
}