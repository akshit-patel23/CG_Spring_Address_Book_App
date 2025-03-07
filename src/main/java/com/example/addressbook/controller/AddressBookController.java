package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class AddressBookController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @PostMapping("/add")
    public ResponseEntity<AddressBookDTO> add(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookModel addressBookModel=new AddressBookModel(addressBookDTO.getName(),addressBookDTO.getPhone(),addressBookDTO.getEmail());

        return ResponseEntity.ok(new AddressBookDTO(addressBookModel));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBookDTO> update(@PathVariable Long id){
        AddressBookModel addressBookModel=new AddressBookModel();

        return ResponseEntity.ok(new AddressBookDTO(addressBookModel));
    }
    @GetMapping("/all")
    public ResponseEntity<AddressBookDTO> all(){
        AddressBookModel addressBookModel=new AddressBookModel();

        return ResponseEntity.ok(new AddressBookDTO(addressBookModel));
    }
    @GetMapping("/check/{id}")
    public ResponseEntity<AddressBookDTO> check(@PathVariable Long id){
        AddressBookModel addressBookModel=new AddressBookModel();

        return ResponseEntity.ok(new AddressBookDTO(addressBookModel));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AddressBookDTO> delete(@PathVariable Long id){
        AddressBookModel addressBookModel=new AddressBookModel();
        return ResponseEntity.ok(new AddressBookDTO(addressBookModel));
    }
}