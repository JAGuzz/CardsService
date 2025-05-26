package com.jaguzz.cards.service;

import com.jaguzz.cards.dto.CardsDto;

public interface ICardsService {

    void createCard(String mobileNumber);

    CardsDto fetchCard(String mobileNumber);

    CardsDto updateCard(CardsDto cardsDto);

    boolean deleteCard(String mobileNumber);

}
