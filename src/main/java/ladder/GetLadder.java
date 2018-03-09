package ladder;

import java.util.Scanner;

public class GetLadder {
	public int getManNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("참여할 사람은 몇 명인가요?");
		int manNum = input.nextInt();

		return manNum;
	}

	public int getLadderNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("최대 사다리 높이는 몇 개인가?");
		int ladderNum = input.nextInt();

		return ladderNum;
	}
}
