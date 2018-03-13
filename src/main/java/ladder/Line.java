package ladder;

import java.util.ArrayList;

public class Line {

	private ArrayList<Boolean> line = new ArrayList<Boolean>();

	public void creatLine(int oneline) { // 사다리 한줄을 만든다.
		RandomLine rl = new RandomLine();
		for (int i = 0; i < oneline; i++) {
			checkLine(i, rl);
		}
	}

	public void checkLine(int i, RandomLine rl) { // 전 인덱스의"-----" 유무를 확인하고 만들지 말지 결정한다.
		if (i == 0) {
			line.add(rl.makeRandom());
			return;
		}
		if (i >= 1 && (line.get(i - 1) == false)) {
			line.add(rl.makeRandom());
			return;
		}
		line.add(false);
	}

	public ArrayList<Boolean> getLine() {
		return this.line;
	}
}
