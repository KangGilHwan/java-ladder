package ladder;

import java.util.Random;

public class LadderRide {

	public boolean makeRandom() { // true or false 값을 만들어 반환한다.
		Random ran = new Random();
		boolean line = ran.nextBoolean();
		return line;
	}
	
	public void makeOneLine(boolean[][] ladder, int oneline) {
		for (int j = 0; j < ladder[oneline].length; j++) {
			ladder[oneline][j] = makeRandom();
		}
	}

	public boolean[][] makeAllLadder(int ladderNum, int manNum) { // 사다리를 만든다.
		boolean[][] ladder = new boolean[ladderNum][manNum - 1];
		for (int i = 0; i < ladder.length; i++) {
			makeOneLine(ladder, i);
		}
		return ladder;
	}
}
