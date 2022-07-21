package com.example.test.Controller;

import com.example.test.Util.BillType;
import com.example.test.Util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/1")
public class TestController {
    @GetMapping("/test")
    public static Result test(){
        List<BillType> list = new ArrayList<>();
        List<BillType> list2 = new ArrayList<>();
        for (int i = 0; i< 5; i++){
            BillType billType = new BillType("123456","Caffrey");
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
