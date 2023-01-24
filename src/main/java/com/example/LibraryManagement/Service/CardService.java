package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Enums.CardStatus;
import com.example.LibraryManagement.Models.Card;
import com.example.LibraryManagement.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    public Card createCard(Student student){
        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student);

        return newCard;
    }
}
