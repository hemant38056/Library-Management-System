package com.example.LibraryManagement.Convertors;

import com.example.LibraryManagement.Models.Author;
import com.example.LibraryManagement.RequestDto.AuthorRequestDto;
import com.example.LibraryManagement.ResponseDto.AuthorResponseDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorConvertor {

    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().name(authorRequestDto
                .getName()).age(authorRequestDto.getAge()).country(authorRequestDto
                .getCountry()).email(authorRequestDto.getEmail()).build();

        return author;
    }

    public static List<AuthorResponseDto> convertEntityToDto(List<Author>  authors){
        List<AuthorResponseDto> listOfAuthors = new ArrayList<>();
        for(Author author : authors){
            AuthorResponseDto authorResponseDto = AuthorResponseDto.builder().id(author.getId()).name(author.getName())
                    .age(author.getAge()).country(author.getCountry()).email(author.getEmail()).build();

            listOfAuthors.add(authorResponseDto);
        }

        return listOfAuthors;
    }
}
