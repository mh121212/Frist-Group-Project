/**
 * Copyright (C), 2020, 因特驰
 * FileName: DemoController
 * Author:   mh
 * Date:     2020/8/23 19:39
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.Demo;
import com.ytc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("queryDemo")
    public String queryDemo(String name){
        String str = demoService.queryDemo(name);
        return str;
    }

    @PostMapping("addDemo")
    public String addDemo(Demo demo){
        demoService.addDemo(demo);
        return "success";
    }

    @DeleteMapping("deleteDemo")
    public String deleteDemo(String demoid){
        demoService.deleteDemo(demoid);
        return "success";
    }

    @GetMapping("queryDemoById")
    public Demo queryDemoById(String demoid){
        Demo user = demoService.queryDemoById(demoid);
        return user;
    }

    @PutMapping("updateDemo")
    public String updateDemo(Demo demo){
        demoService.updateDemo(demo);
        return "success";
    }

    @GetMapping("queryDemoList")
    public List<Demo> queryDemoList(){
        List<Demo> list = demoService.queryDemoList();
        return list;
    }
}
