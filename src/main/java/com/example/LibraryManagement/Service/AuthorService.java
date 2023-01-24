package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Convertors.AuthorConvertor;
import com.example.LibraryManagement.Models.Author;
import com.example.LibraryManagement.Repository.AuthorRepository;
import com.example.LibraryManagement.RequestDto.AuthorRequestDto;
import com.example.LibraryManagement.ResponseDto.AuthorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public String createAuthor(AuthorRequestDto authorRequestDto){
        try {
            Author author = AuthorConvertor.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        }
        catch (Exception e){
            log.info("error occurred in author creation");
            return "unable to create author";
        }
        return "Author created successfully!";
    }

    public List<AuthorResponseDto> findAuthorByName(String name){
        List<Author> authors = authorRepository.findByName(name);
        List<AuthorResponseDto> authorResponseDtoList = AuthorConvertor.convertEntityToDto(authors);

        return authorResponseDtoList;
    }
}
