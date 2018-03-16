package ladder.view;

import java.util.ArrayList;

import ladder.domain.Line;

public class PrintLadder {

	public void printNames(ArrayList<String> names, ArrayList<Line> ladder) { // 이름을 출력한다.
		for (String name : names) {
			System.out.printf("%5s ", name);
		}
		System.out.println();
		printLadder(ladder);
	}

	public void printOneLadder(Line ladder) { // Ladder Line 하나를 출력한다.
		ArrayList<Boolean> allLadder = ladder.getLine();
		for (int j = 0; j < allLadder.size(); j++) {
			System.out.print("|");
			System.out.print(isTruePrint(allLadder.get(j)));
		}
		System.out.println("|");
	}

	public void printLadder(ArrayList<Line> ladder) { // Ladder Line 전부를 출력한다.
		for (Line ladderLine : ladder) {
			System.out.print("  ");
			printOneLadder(ladderLine);
		}
	}

	public String isTruePrint(boolean ladder) { // true면 "-----" false면 " "모양을 출력한다.
		if (ladder) {
			return "-----";
		}
		return "     ";
	}

	public void printLastLineNames(ArrayList<String> inputResult) { // 이름을 출력한다.
		for (String name : inputResult) {
			System.out.printf("%5s ", name);
		}
		System.out.println();
	}
	//마지막 결과값을 출력하는 메소드
	public void printAllResult(ArrayList<String> finalResult, ArrayList<String> inputResult) {
		String inputName = ImpormationLadder.getLadderResult();
		System.out.println("실행결과");
		if (inputName.equals("all")) {
			for (int i = 0; i < finalResult.size(); i++) {
				System.out.println(finalResult.get(i) + " : " + inputResult.get(i));
			}
		} else {
			printOneResult(finalResult, inputResult, inputName);
			printAllResult(finalResult, inputResult);
		}
	}

	public void printOneResult(ArrayList<String> finalResult, ArrayList<String> inputResult, String inputName) {
		try {
			System.out.println(inputResult.get(finalResult.indexOf(inputName)));
			printAllResult(finalResult, inputResult);
		} catch (Exception e) {
			System.out.println("이름이 다릅니다. 다시 입력해주세요.");
		}
	}
}
