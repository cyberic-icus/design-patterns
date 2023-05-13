package org.example.decorator.filter;

import org.example.decorator.Request;

public interface Filter {
    void doFilter(Request request);
}
