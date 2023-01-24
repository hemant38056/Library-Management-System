package com.example.LibraryManagement.ResponseDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthorResponseDto {
    private int id;
    private int age;
    private String name;
    private String country;
    private String email;
}
