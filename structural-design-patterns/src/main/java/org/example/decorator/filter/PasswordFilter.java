package org.example.decorator.filter;

public class PasswordFilter implements Filter {
    private final Filter nextFilter;

    public PasswordFilter(Filter filter) {
        this.nextFilter = filter;
    }


    @Override
    public void doFilter(Request request) {
        UserDAO userDAO = new UserDAO();
        if (userDAO.isPasswordCorrect(request.getUser())) {
            nextFilter.doFilter(request);
        } else {
            throw new RuntimeException();
        }
    }
}
