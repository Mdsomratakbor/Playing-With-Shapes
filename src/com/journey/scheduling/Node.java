package com.journey.scheduling;

import java.util.HashSet;
import java.util.Set;

public  class Node {
    final int index;
    final Set<Node> neighbors = new HashSet<>();

    Node(int index) {
        this.index = index;
    }
}