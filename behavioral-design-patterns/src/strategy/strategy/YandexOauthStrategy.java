package strategy.strategy;

public class YandexOauthStrategy implements OauthStrategy {

    @Override
    public String login() {
        System.out.println("Redirecting to yandex");
        return "adasndasdm,asd";
    }

}