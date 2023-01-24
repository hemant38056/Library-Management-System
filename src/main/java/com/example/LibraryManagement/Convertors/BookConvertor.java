package com.example.LibraryManagement.Convertors;

import com.example.LibraryManagement.Models.Book;
import com.example.LibraryManagement.RequestDto.BookRequestDto;

public class BookConvertor {
    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){
        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()).build();
        return book;
    }
}
