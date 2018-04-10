package com.imooc.girl.controller;

import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")//设置全局url
public class HelloController {

    /*读取配置中的变量*/
    /*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;*/

    /*读取类中的配置*/
    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    @GetMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId){
        return "id:" + myId;
        //return girlProperties.getCupSize();
        //return "index";
    }
}
