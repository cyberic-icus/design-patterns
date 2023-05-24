package chainofresponsobility.filter;

import chainofresponsobility.Request;

public class PermissionFilter extends Filter {
    public static final String ROLE = "ALLOWED_TO_VIEW";

    @Override
    public boolean doFilter(Request request) {
        if (request.getUser()
                .getRoles()
                .stream()
                .noneMatch((role) -> role.equals(ROLE))) {
            return false;
        }
        return checkNextFilter(request);
    }
}