package com.tyq.firstblood;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * IndexController
 *
 * @auther ice.deng
 * @create 2020-06-08 7:51 下午
 */
@Slf4j
@RestController("test")
@RequestMapping("/test/index/")
public class IndexController {

    @GetMapping("/aa")
    @ResponseBody
    public String index() {

        return "ok";
    }
}
