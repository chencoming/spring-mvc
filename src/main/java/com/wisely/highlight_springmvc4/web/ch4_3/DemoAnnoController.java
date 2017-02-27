package com.wisely.highlight_springmvc4.web.ch4_3;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chenjinming on 2017/2/27.
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access";
    }

    // highlight_springmvc4/anno/pathvar/chencoming
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access, str : " + str;
    }

    // highlight_springmvc4/anno/requestParam?id=2
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access, id: " + id;
    }

    // highlight_springmvc4/anno/obj?id=2&name=chencoming
    @RequestMapping(value="/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj demoObj, HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access, obj id: " + demoObj.getId() + " obj name:" + demoObj.getName();
    }

    // highlight_springmvc4/anno/name1
    // highlight_springmvc4/anno/name2
    @RequestMapping(value={ "/name1", "/name2" }, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access";
    }

}
