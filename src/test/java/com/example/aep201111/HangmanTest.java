package com.example.aep201111;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.fail;

class HangmanTest {

	@Test
	void testGameRules_Won() {
		GameRules rule = new GameRules();
		GameData data = new GameData("Hello");
		data.addMove("h");
		data.addMove("e");
		data.addMove("l");
		data.addMove("o");

		Assert.isTrue(rule.hasWon(data),"game should be won");
	}

	@Test
	void testGameRules_HasNotWon() {
		GameRules rule = new GameRules();
		GameData data = new GameData("Hello");
		data.addMove("e");
		data.addMove("l");
		data.addMove("o");

		Assert.isTrue(!rule.hasWon(data),"more moves needed");
	}

	@Test
	void testGameRules_TriedToCheat() {
		GameRules rule = new GameRules();
		GameData data = new GameData("Hello");
		data.addMove("abcdefghijklmnopqrstuvwxyz");

		Assert.isTrue(!rule.hasWon(data),"cheating is not allowed");
	}


	@Test
	void testGameRules_TooManyTries() {
		GameRules rule = new GameRules();
		GameData data = new GameData("Hello");
		data.addMove("a");
		data.addMove("b");
		data.addMove("c");
		data.addMove("d");
		data.addMove("e");
		data.addMove("f");
		data.addMove("g");
		data.addMove("h");
		data.addMove("i");
		data.addMove("j");
		data.addMove("k");
		data.addMove("Hello");

		Assert.isTrue(rule.hasWon(data),"even with too many tries, you are able to win..");
	}


	@Test
	void testGameRules_CorrectWordGuess() {
		GameRules rule = new GameRules();
		GameData data = new GameData("Hello");
		data.addMove("a");
		data.addMove("e");
		data.addMove("i");
		data.addMove("o");
		data.addMove("H");
		data.addMove("Hello");

		Assert.isTrue(rule.hasWon(data),"correct word guess should work");

	}

	@Test
	void testGameRules_TooManyMoves() {
		GameRules rule = new GameRules();
		GameData data = new GameData("Hello");
		data.addMove("a");
		data.addMove("b");
		data.addMove("c");
		data.addMove("d");
		data.addMove("e");
		data.addMove("f");
		data.addMove("g");
		data.addMove("h");
		data.addMove("i");
		data.addMove("j");
		data.addMove("k");

		Assert.isTrue(rule.hasLost(data),"too many moves needed");

	}

}
