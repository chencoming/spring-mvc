package com.wisely.highlight_springmvc4.web.ch4_3;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenjinming on 2017/2/27.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    // highlight_springmvc4/rest/get-json?id=0&name=chencoming
    @RequestMapping(value="/get-json", produces = "application/json;charset=UTF-8")
    public DemoObj getJson (DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "zjm");
    }

    // highlight_springmvc4/rest/get-xml?id=0&name=chencoming
    @RequestMapping(value="/get-xml", produces = "application/xml;charset=UTF-8")
    public DemoObj getXml (DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "zjm");
    }


}
