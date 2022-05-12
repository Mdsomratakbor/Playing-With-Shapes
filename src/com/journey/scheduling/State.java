package com.journey.scheduling;

import java.util.Iterator;

public  class State {
    final Node cur;
    final Node prev;
    final Iterator<Node> children;
    final int distance;

    State(Node cur, Node prev, int distance) {
        this.cur = cur;
        this.prev = prev;
        this.children = cur.neighbors.iterator();
        this.distance = distance;
    }
}