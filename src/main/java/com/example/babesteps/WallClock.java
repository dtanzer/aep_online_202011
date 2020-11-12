package com.example.babesteps;

public interface WallClock {
    long currentTimeMillis();

    void nextTick() throws InterruptedException;
}
