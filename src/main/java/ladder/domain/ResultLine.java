package ladder.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class ResultLine {

	private ArrayList<Boolean> points;
	private ArrayList<String> oneLineResult;

	public ResultLine(Line line, ArrayList<String> beforeNames) {
		this.points = line.getLine();
		this.oneLineResult = resultLine(beforeNames);
	}

	public ArrayList<String> resultLine(ArrayList<String> beforeNames) { //사다리 한줄을 타고 난 후 위치를 저장
		String[] resultNames = new String[beforeNames.size()];
		for (int i = 0; i < beforeNames.size(); i++) {
			resultNames[getLocation(beforeNames, i)] = beforeNames.get(i);
		}
		return new ArrayList<>(Arrays.asList(resultNames));
	}

	public int getLocation(ArrayList<String> beforeNames, int i) {  //전줄의 이름을 참고해 현재 줄의 어느 위치로 갈지 반환
		if (i != 0 && points.get(i - 1)) {
			return i - 1;
		} else if (i != (beforeNames.size() - 1) && points.get(i)) {
			return i + 1;
		} else {
			return i;
		}
	}

	public ArrayList<String> getResultLine() {
		return oneLineResult;
	}

}
