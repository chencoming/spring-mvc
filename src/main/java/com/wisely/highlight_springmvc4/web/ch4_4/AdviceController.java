package com.wisely.highlight_springmvc4.web.ch4_4;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenjinming on 2017/2/27.
 */
@Controller
public class AdviceController {

    @RequestMapping("advice")
    public String getSth(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new IllegalArgumentException("sorry, illegal arguments " + msg);
    }
}
