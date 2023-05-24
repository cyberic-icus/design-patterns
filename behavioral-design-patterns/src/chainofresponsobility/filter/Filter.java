package chainofresponsobility.filter;


import chainofresponsobility.Request;

public abstract class Filter {
    private Filter nextFilter;

    public static Filter filterChain(Filter first, Filter... chain) {
        Filter head = first;
        for (Filter nextInChain : chain) {
            head.nextFilter = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean doFilter(Request request);


    protected boolean checkNextFilter(Request request) {
        if (nextFilter == null) {
            return true;
        }
        return nextFilter.doFilter(request);
    }
}
