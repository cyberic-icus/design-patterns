package org.example.decorator.filter;

import org.example.decorator.Request;

public class TokenDecoderFilter implements Filter {
    private final Filter nextFilter;

    public TokenDecoderFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    @Override
    public void doFilter(Request request) {
        if (request.getToken() != null) {
            request.setToken(decode(request.getToken()));
            nextFilter.doFilter(request);
        } else {
            throw new RuntimeException();
        }
    }

    private String decode(String st) {
        var chars = st.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] >> 2);
        }
        return String.copyValueOf(chars);
    }
}
