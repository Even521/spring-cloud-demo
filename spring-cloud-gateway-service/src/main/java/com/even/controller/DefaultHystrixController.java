package com.even.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author even
 * @date 2019/5/5 17:17
 * @describe
 */
@RestController
@Log4j2
public class DefaultHystrixController {
   public static Map map=new ConcurrentHashMap(8);
    /**
     * 失败状态码
     */
   private final static int FAIL=-1;
    @RequestMapping("/defaultfallback")
    public Map<String,String> defaultfallback(){
        log.error("降级处理");
        map.clear();
        map.put("code",FAIL);
        map.put("msg","服务异常");
        map.put("data","null");
        return map;
    }

}
