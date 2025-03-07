package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AddressBookController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @PostMapping("/add")
    public String add(){
        return "added";
    }

    @PutMapping("update")
    public String update(){
        return  "Updated";
    }

    @GetMapping("getall")
    public String getall(){
        return "Got all";
    }

    @DeleteMapping("delete")
    public String delete(){
        return "Deleted";
    }

    @GetMapping("check")
    public String check(){
        return "Checked";
    }
}
