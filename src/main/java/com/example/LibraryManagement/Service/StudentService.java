package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Models.Card;
import com.example.LibraryManagement.Models.Student;
import com.example.LibraryManagement.Repository.StudentRepository;
import com.example.LibraryManagement.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public String createStudent(StudentRequestDto studentRequestDto){
        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());
        student.setEmail(studentRequestDto.getEmail());
        student.setName(studentRequestDto.getName());

        Card newCard = cardService.createCard(student);

        student.setCard(newCard);

        studentRepository.save(student);

        return "Student and Card successfully added";
    }
}
