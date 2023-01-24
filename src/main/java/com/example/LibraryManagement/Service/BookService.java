package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Convertors.BookConvertor;
import com.example.LibraryManagement.Models.Author;
import com.example.LibraryManagement.Models.Book;
import com.example.LibraryManagement.Repository.AuthorRepository;
import com.example.LibraryManagement.Repository.BookRepository;
import com.example.LibraryManagement.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDto bookRequestDto){
        Book book = BookConvertor.convertDtoToEntity(bookRequestDto);

        int authorId = bookRequestDto.getAuthorId();

        Author author = authorRepository.findById(authorId).get();

        book.setAuthor(author);

        List<Book> currentBooks = author.getBooksWritten();

        currentBooks.add(book);

        author.setBooksWritten(currentBooks);

        authorRepository.save(author);

        return "Book Successfully added";

    }
}
