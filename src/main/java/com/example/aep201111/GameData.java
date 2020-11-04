package com.example.aep201111;

import java.util.ArrayList;
import java.util.Collection;

public class GameData {

	private String word;

	private Collection<String> moves = new ArrayList<>();

	public GameData(String word) {
		this.word=word;
	}

	public void addMove(String move){
		this.moves.add(move);
	}

	public String getWord() {
		return word;
	}

	public void setWord(final String word) {
		this.word = word;
	}

	public Collection<String> getMoves() {
		return moves;
	}

	public void setMoves(final Collection<String> moves) {
		this.moves = moves;
	}
}