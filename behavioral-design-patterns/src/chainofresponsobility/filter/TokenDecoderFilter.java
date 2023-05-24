package chainofresponsobility.filter;

import chainofresponsobility.Request;

public class TokenDecoderFilter extends Filter {

    @Override
    public boolean doFilter(Request request) {
        if (request.getToken() != null) {
            request.setToken(decode(request.getToken()));
            checkNextFilter(request);
        }
        return false;
    }

    private String decode(String st) {
        var chars = st.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] >> 2);
        }
        return String.copyValueOf(chars);
    }
}
