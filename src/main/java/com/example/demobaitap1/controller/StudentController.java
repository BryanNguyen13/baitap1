package com.example.demobaitap1.controller;

import com.example.demobaitap1.entity.StudentEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping
    public ResponseEntity<?> getStudent(@RequestParam String name, @RequestParam int age ) {
        List<StudentEntity> list = new ArrayList<>();
        StudentEntity student = new StudentEntity();
        student.setName(name);
        student.setAge(age);
        list.add(student);
        return ResponseEntity.ok(list);
    }


    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> updateStudent(@PathVariable String name, @PathVariable int age) {
        List<StudentEntity> list = new ArrayList<>();
        StudentEntity student = new StudentEntity();
        student.setName(name);
        student.setAge(age);
        list.add(student);
        return ResponseEntity.ok(list);
    }

    @PutMapping
    public ResponseEntity<?> addStudent(@RequestBody List<StudentEntity> list) {
        return ResponseEntity.ok(list);
    }

//    @PostMapping
//    public ResponseEntity<?> addStudent1(@RequestBody List<StudentEntity> list) {
//        return ResponseEntity.ok(list);
//    }
}
