package com.example.LibraryManagement.RequestDto;

import com.example.LibraryManagement.Enums.Genre;
import lombok.Data;

@Data
public class BookRequestDto {
    private String name;

    private Genre genre;

    private int authorId;
}
