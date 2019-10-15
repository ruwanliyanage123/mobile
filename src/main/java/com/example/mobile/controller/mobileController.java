package com.example.mobile.controller;

import com.example.mobile.jpa.MobileRepository;
import com.example.mobile.model.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
public class mobileController {

    @Autowired
    MobileRepository mobileRepository;

    @GetMapping(value = "/phones")
    public List<Mobile> getAllMobiles(){
        return mobileRepository.findAll();
    }

    @PostMapping("/phones")
    public void addList(@RequestBody Mobile mobile){
        mobileRepository.save(mobile);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteList(@PathVariable String id){
        int serial = Integer.parseInt(id);
        mobileRepository.deleteById(serial);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable String id, @RequestBody Mobile mobile){
        int serial = Integer.parseInt(id);
        Mobile mobile1 = mobileRepository.getOne(serial);
        mobile1.setModelName(mobile.getModelName());
        mobileRepository.save(mobile1);
    }
}
