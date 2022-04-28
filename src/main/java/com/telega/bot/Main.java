package com.telega.bot;

import org.telegram.telegrambots.*;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;

public class Main {
    public static void main(String[] args){
        ApiContextInitializer.init();
        //DefaultBotOptions botOptions= ApiContext.getInstance(DefaultBotOptions.class);
       // botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
      //  botOptions.setProxyHost("localhost");
      //  botOptions.setProxyPort(8100);
        MyBot myBot = new MyBot();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(myBot);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
