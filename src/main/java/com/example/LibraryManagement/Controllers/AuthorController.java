package com.example.LibraryManagement.Controllers;

import com.example.LibraryManagement.RequestDto.AuthorRequestDto;
import com.example.LibraryManagement.ResponseDto.AuthorResponseDto;
import com.example.LibraryManagement.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){
        return authorService.createAuthor(authorRequestDto);
    }

    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable("name") String name){
        return authorService.findAuthorByName(name);
    }

}
