package ru.DreadBot;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.DreadBot.Core.CoreBot;

public class RunApp {
    public static void main(String[] args) {
        TelegramBotsApi botsApi = null;
        try {
            botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new CoreBot());
        } catch (TelegramApiException e) {
            throw new RuntimeException(e.getCause());
        }



        //SpringApplication.run(RunApp.class, args);
    }
}
