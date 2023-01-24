package com.example.LibraryManagement.ResponseDto;

import com.example.LibraryManagement.Enums.Genre;
import lombok.Builder;

@Builder
public class BookResponseDto {
    String name;
    Genre genre;
}
