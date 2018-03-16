package ladder.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class LadderResult {
	private ArrayList<String> names;

	public LadderResult(ArrayList<String> names) {
		this.names = names;
	}

	public ArrayList<String> startResult(ArrayList<Line> lines) { // 모든 Line의 결과를 구하고 마지막 줄의 결과를 반환.
		ArrayList<ResultLine> resultLines = new ArrayList<>();
		resultLines.add(new ResultLine(lines.get(0), names)); // 첫번째 줄은 전에 비교 할 수있는 배열이 없고 Names를 넣어줌.
		for (int i = 1; i < lines.size(); i++) {
			ResultLine allLine = new ResultLine(lines.get(i), resultLines.get(i - 1).getResultLine());
			resultLines.add(allLine);
		}
		return resultLines.get(lines.size() - 1).getResultLine();
	}
}
