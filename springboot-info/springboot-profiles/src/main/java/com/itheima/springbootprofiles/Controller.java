package com.itheima.springbootprofiles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2023-02-22 18:09
 */
@RestController
public class Controller {
    @RequestMapping("hai")
    private String haha(){
        System.out.println("测试了一个下午终于好了，哎不容易啊");
        return  "哈哈成功啦终于";
    }
}
