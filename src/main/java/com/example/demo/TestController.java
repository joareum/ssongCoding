package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//기본 url : localhost -> 주소값.
@RestController // Rest Api 의 요청을 받아 화면 던지기
public class TestController {
    //localhost/test
    @Autowired
    TestService ts; // TestService ts = new TestService();
    @RequestMapping (value = "/test", method = RequestMethod.GET) // localhost는 기본값이라 안적어도 됌. localhost/test라고 요청이 오면 바로 밑 메소드 실행.
    // "test 글자를 반환하는 메소드 짜기"
    public String test() {
        /*
        * TestService 한테 메소드 하나 만들기
        * 그 메소드가 하는 일이 return "test";
        * 그리고 지금 이 메소드 안에서 서비스의 그 메소드를 호출해주세요.*/

        return ts.test();

    }

    @RequestMapping("/apple")
    public String apple(){
        return "Apple";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("value") String val){
        //localhost:8080/save?value=_____
        return ts.save(val);

    }

    @RequestMapping("/search")
    public String search(@RequestParam("id") Long idx) {
        return ts.search(idx);
    }

}
