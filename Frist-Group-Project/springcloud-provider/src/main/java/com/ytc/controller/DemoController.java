/**
 * Copyright (C), 2020, 因特驰
 * FileName: DemoController
 * Author:   mh
 * Date:     2020/8/23 19:11
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.Demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("queryDemo")
    public String queryDemo(@RequestParam("name")String name){
        return "姓名："+name;
    }

    @PostMapping("addDemo")
    public void addDemo(@RequestBody Demo demo){
        System.out.println(demo);
    }

    @DeleteMapping("deleteDemo")
    public void deleteDemo(@RequestParam("demoid") String demoid){
        System.out.println(demoid);
    }

    @GetMapping("queryDemoById")
    public Demo queryDemoById(@RequestParam("demoid") String demoid){
        System.out.println(demoid);
        Demo demo = new Demo();
        demo.setDemoid(100);
        demo.setDemoname("李四");
        return demo;
    }

    @PutMapping("updateDemo")
    public void updateDemo(@RequestBody Demo demo){
        System.out.println(demo);
    }

    @GetMapping("queryDemoList")
    public List<Demo> queryDemoList(){
        List<Demo> list = new ArrayList<>();
        Demo demo = new Demo();
        demo.setDemoid(100);
        demo.setDemoname("李四1");
        Demo demo1 = new Demo();
        demo1.setDemoid(10);
        demo1.setDemoname("李四2");
        list.add(demo);
        list.add(demo1);
        return list;
    }
}
