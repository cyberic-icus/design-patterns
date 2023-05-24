package org.example.decorator.filter;

public class PermissionFilter implements Filter {
    public static final String ROLE = "ALLOWED_TO_VIEW";

    @Override
    public void doFilter(Request request) {
        if (!request.getUser()
                .getRoles()
                .stream()
                .anyMatch((role) -> role.equals(ROLE))) {
            throw new RuntimeException();
        }
    }
}