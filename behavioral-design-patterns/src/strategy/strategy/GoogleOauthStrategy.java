package strategy.strategy;

public class GoogleOauthStrategy implements OauthStrategy {

    @Override
    public String login() {
        System.out.println("Redirecting to google");
        return "adasndasdm,asd";
    }


}