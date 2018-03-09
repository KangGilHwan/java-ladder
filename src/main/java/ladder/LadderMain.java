package ladder;

public class LadderMain {
	public static void main(String args[]) {
		GetLadder number = new GetLadder();
		LadderRide ride = new LadderRide();
		PrintLadder draw = new PrintLadder();

		int manNum = number.getManNum();
		int ladderNum = number.getLadderNum();

		boolean[][] ladder = ride.makeAllLadder(ladderNum, manNum);
		draw.printLadder(ladder);
	}
}
