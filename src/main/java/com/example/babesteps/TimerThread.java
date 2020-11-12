package com.example.babesteps;

final class TimerThread extends Thread {

	private long lastRemainingTime;
	private boolean timerRunning;
	private long currentCycleStartTime;

	private BabystepsTimer.UI ui;

	public TimerThread(BabystepsTimer.UI ui) {
		this.ui = ui;
	}

	public void stopTimer() {
		timerRunning = false;
	}

	public void resetTimer() {
		currentCycleStartTime = BabystepsTimer.wallclock.currentTimeMillis();
	}

	@Override
	public void run() {
		timerRunning = true;
		currentCycleStartTime = BabystepsTimer.wallclock.currentTimeMillis();

		while (timerRunning) {
			long elapsedTime = BabystepsTimer.wallclock.currentTimeMillis() - currentCycleStartTime;

			if (elapsedTime >= BabystepsTimer.SECONDS_IN_CYCLE * 1000 + 980) {
				currentCycleStartTime = BabystepsTimer.wallclock.currentTimeMillis();
				elapsedTime = BabystepsTimer.wallclock.currentTimeMillis() - currentCycleStartTime;
			}
			if (elapsedTime >= 5000 && elapsedTime < 6000) {
				ui.resetBackground();
			}

			long remainingTimeInSeconds = BabystepsTimer.SECONDS_IN_CYCLE - (elapsedTime / 1000);

			if (remainingTimeInSeconds != lastRemainingTime) {
				if (remainingTimeInSeconds == 10) {
					ui.tenSecondsRemaining();
				} else if (remainingTimeInSeconds == 0) {
					ui.timeIsUp();
				}

				ui.updateUi(elapsedTime);
				lastRemainingTime = remainingTimeInSeconds;
			}
			try {
				BabystepsTimer.wallclock.nextTick();
			} catch (InterruptedException e) {
				//We don't really care about this one...
			}
		}
	}

}
