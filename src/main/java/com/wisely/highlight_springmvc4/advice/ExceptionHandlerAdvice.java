package com.wisely.highlight_springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chenjinming on 2017/2/27.
 */
@ControllerAdvice // announce a advice for all beans with @Controller
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        return new ModelAndView("error").addObject("errorMessage", exception.getMessage());
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg", "extra msg"); // all methods with @RequestMapping could get this key-value
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id"); // set "id" of request to NULL
    }
}
