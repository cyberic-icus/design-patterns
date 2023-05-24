package chainofresponsobility.filter;

import chainofresponsobility.Request;
import chainofresponsobility.UserDAO;

public class PasswordFilter extends Filter {

    @Override
    public boolean doFilter(Request request) {
        UserDAO userDAO = new UserDAO();
        if (userDAO.isPasswordCorrect(request.getUser())) {
            checkNextFilter(request);
        }
        return false;
    }
}
