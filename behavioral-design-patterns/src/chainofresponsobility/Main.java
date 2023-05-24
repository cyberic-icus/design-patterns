package chainofresponsobility;

import chainofresponsobility.filter.Filter;
import chainofresponsobility.filter.PasswordFilter;
import chainofresponsobility.filter.PermissionFilter;
import chainofresponsobility.filter.TokenDecoderFilter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("test");

        List<String> roles = new ArrayList<>();
        roles.add("ASDASD");
        user.setRoles(roles);

        Request request = new Request();
        request.setToken("!@321312FEFSAASLK231kp12ho3oj12421j");
        request.setRequestBody("{'test':123");
        request.setUrl("http://127.0.0.1/asd");
        request.setTime(new Date());
        request.setUser(user);

        Filter filterChain = Filter.filterChain(
                new TokenDecoderFilter(),
                new PasswordFilter(),
                new PermissionFilter()
        );

        if (filterChain.doFilter(request)) {
            System.out.println("Signed in succesfully!");
        } else {
            System.out.println("Unauthorized access!");
        }
    }
}
