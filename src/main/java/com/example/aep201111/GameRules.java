package com.example.aep201111;

import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class GameRules {

	boolean hasWon(GameData game) {
		String allCharacterMoves = StringUtils.join(game.getMoves().stream().filter(c->c.length()==1).collect(Collectors.toList()));
		return StringUtils.containsOnly(game.getWord().toLowerCase(),allCharacterMoves.toLowerCase())
				||game.getMoves().stream().filter(c->c.length()>1).anyMatch(word->word.equalsIgnoreCase(game.getWord()));
	}

	boolean hasLost(GameData game) {
		return game.getMoves().size()>=11;
	}

}
