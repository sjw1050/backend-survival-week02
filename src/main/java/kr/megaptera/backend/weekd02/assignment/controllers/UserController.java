package kr.megaptera.backend.weekd02.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String list(
            @PathVariable String id,
            @RequestAttribute String userId
    ){
        return "나의 정보 : " +  id + "\n";
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String registUser(
            @RequestAttribute String userId,
            @RequestBody String userDTO
    ){
        return "회원가입" + userDTO + "\n" ;
    }

    @PatchMapping("{id}")
    public String updateUser(
            @PathVariable String id,
            @RequestAttribute String userId,
            @RequestBody String userDTO
    ){
        return "회원수정" + userDTO + "\n";
    }
}
