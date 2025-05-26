package com.jaguzz.cards.mapper;

import com.jaguzz.cards.dto.CardsDto;
import com.jaguzz.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapToCardsDto(Cards cards, CardsDto cardsDto){
        cardsDto.setMobileNumber(cards.getMobileNumber());
        cardsDto.setCardNumber(cards.getCardNumber());
        cardsDto.setTotalLimit(cards.getTotalLimit());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setAmountUsed(cards.getAmountUsed());
        cardsDto.setAvailableAmount(cards.getAvailableAmount());

        return cardsDto;
    }

    public static Cards mapToCards(CardsDto CardsDto, Cards cards){
        cards.setMobileNumber(CardsDto.getMobileNumber());
        cards.setCardNumber(CardsDto.getCardNumber());
        cards.setCardType(CardsDto.getCardType());
        cards.setTotalLimit(CardsDto.getTotalLimit());
        cards.setAmountUsed(CardsDto.getAmountUsed());
        cards.setAvailableAmount(CardsDto.getAvailableAmount());

        return cards;
    }
}
