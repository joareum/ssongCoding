package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestRepository tr;
    public String test(){

        return "test";
    }


    public String save(String val) {
        return tr.save(val);
    }

    public String search(Long idx) {
        return tr.search(idx);
    }
}
