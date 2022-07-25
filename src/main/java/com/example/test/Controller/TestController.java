package com.example.test.Controller;

import com.alibaba.fastjson2.JSON;
import com.example.test.Util.BillType;
import com.example.test.Util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping()
public class TestController {
    @GetMapping("/test")
    public static Result test(HttpServletRequest request){
        //String str = JSON.toJSONString(request);
        System.out.println(request.getLocalAddr());
        List<BillType> list = new ArrayList<>();
        List<BillType> list2 = new ArrayList<>();
        for (int i = 0; i< 5; i++){
            BillType billType = new BillType("1123","Caffrey");
            list.add(billType);
        }
        for (int i = 0; i< 5; i++){
            BillType billType = new BillType("123456","Caffrey");
            list2.add(billType);
        }
        List<List<BillType>> list3 = new ArrayList<>();
        list3.add(list);
        list3.add(list2);
        return new Result(200,"请求成功！","2022-7-21",list3);
    }
}
