package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository {
    Map<Long, String> db = new HashMap<Long, String>();
    Long id = 1L;

    public String save(String val){
        db.put(id++, val);
        return val;
    }

    public String test(){
        return db.get(1L);
    }

    public String search(Long idx) {
        return db.get(idx);
    }


    /*
     * 1. test() 메소드가 불리면,
     * db에서 "test" 글자를 찾아서 반환하기. // db.test
     *
     * 2. db(map) 에 데이터를 삽입(put)하는 메소드 save
     * 1,"test"
     * 그래서 test 메소드는 key 값을 가지고 "test"를 뽑아서(get) return 자리를 대체해주기.
     * */


}
