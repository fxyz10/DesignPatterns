package com.dh.dp.class07_责任链;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("1q2w3e");
        FilterChain chain = new FilterChain();
        chain.add(new OneFilter())
                .add(new TwoFilter())
                .add(new ThreeFilter());
        chain.doFilter(msg);
        System.out.println(msg.toString());
    }
}

class Msg {
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}

interface Filter {
    boolean doFilter(Msg msg);
}

class OneFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace("1", "a"));
        return true;
    }
}

class TwoFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace("2", "b"));
        return true;
    }
}

class ThreeFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace("3", "d"));
        return true;
    }
}

class FilterChain implements Filter {
    List<Filter> l = new ArrayList<>();
    public FilterChain add(Filter f) {
        l.add(f);
        return this;
    }
    public boolean doFilter(Msg msg) {
        for (Filter f : l) {
            if (!f.doFilter(msg))
                return false;
        }
        return true;
    }
}
