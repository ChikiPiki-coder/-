package com.telega.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private static final String TOKEN = "2040160942:AAFxkaWh8nvunM8hOaVGMoVxmA8Y_eLSxTY";
    private static final String USERNAME = "MyFirstBot";

    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage() != null && update.getMessage().hasText()) {
            long chatId=update.getMessage().getChatId();
            System.out.println(update.getMessage().getChatId()+ " - "+update.getMessage().getText());
            try{
                execute(new SendMessage(chatId,"СЮДА НАДО БУДЕТ ВСТАВИТЬ ОТВЕТ ГЕНЕРАТОРА ВАЛЮТЫ"));
            }catch (TelegramApiException t){
                t.printStackTrace();
            }
        }
    }
}
