package com.tenni;

import com.tenni.ExceptionValidtor.CommonException;
import com.tenni.ExceptionValidtor.DemoReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class AppController {

    @RequestMapping("/test")
    public String test(){
        log.info("大叔比");
        return "pick";
    }

    @RequestMapping("/test1")
    public String test1(){
        return "我爱你";
    }

    @RequestMapping("/周天一喜欢谁")
    public String test2(){
        return "大点声，我听不见：许晓桑";
    }


    @RequestMapping("/home")
    public Object home(ModelMap modelMap) {
        return (modelMap.get("author"));
    }

    //或者 通过@ModelAttribute获取
    @RequestMapping("/homes")
    public Object home(@ModelAttribute("author") String author) {
        return (author);
    }

    @RequestMapping("/homee")
    public String home() throws Exception {
        throw new CommonException("101", "Sam 错误");

    }

    @GetMapping("/demo/valid")
    public String demoValid(@Valid DemoReq req) {
        return req.getCode() + "," + req.getName();
    }
}
