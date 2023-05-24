package strategy;

import strategy.strategy.OauthStrategy;

public class LoginPage {

    public String loginOauth(OauthStrategy strategy) {
        return strategy.login();
    }
}