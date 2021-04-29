package com.twodragonlake.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * Description.
 *
 * @author : CeaserWang
 * @version : 1.0
 * @since : 2019/7/28 11:25
 */

@Controller
public class JspController {

    @GetMapping("/jsp")
    public String jsp(Map<String,Object> model){
        model.put("date",new Date());
        model.put("message", "hello world");
        return "result";
    }

    @GetMapping("/jspError")
    public String jspError(Map<String,Object> model){
        throw new RuntimeException("jsp error");
    }

}
