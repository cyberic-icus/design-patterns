package strategy;

import strategy.strategy.GoogleOauthStrategy;
import strategy.strategy.YandexOauthStrategy;

public class Main {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        if (args[0].equals("Login via Google")) {
            loginPage.loginOauth(new GoogleOauthStrategy());
        } else if (args[0].equals("Login via Yandex")) {
            loginPage.loginOauth(new YandexOauthStrategy());
        }
    }

}