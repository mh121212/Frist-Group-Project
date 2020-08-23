/**
 * Copyright (C), 2020, 因特驰
 * FileName: DemoService
 * Author:   mh
 * Date:     2020/8/23 19:38
 * Description:
 * History:
 * mh          <time>          <version>          <desc>
 * 作者姓名     修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.model.Demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "springcloud-provider")
public interface DemoService {

    @GetMapping("queryDemo")
    String queryDemo(@RequestParam("name") String name);

    @PostMapping("addDemo")
    void addDemo(@RequestBody Demo demo);

    @DeleteMapping("deleteDemo")
    void deleteDemo(@RequestParam("demoid") String demoid);

    @GetMapping("queryDemoById")
    Demo queryDemoById(@RequestParam("demoid") String demoid);

    @PutMapping("updateDemo")
    void updateDemo(@RequestBody Demo demo);

    @GetMapping("queryDemoList")
    List<Demo> queryDemoList();
}
