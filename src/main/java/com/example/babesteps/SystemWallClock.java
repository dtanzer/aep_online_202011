package com.example.babesteps;

class SystemWallClock implements WallClock {
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public void nextTick() throws InterruptedException {
        Thread.sleep(10);
    }
}
