import java.util.Scanner;

public class BSmain {


    public static void main(String[] args) {

        BattleSeaV_1 BS = new BattleSeaV_1();
        BS.randomN();
        boolean isAlive = true;
        while (isAlive == true) {
            if (BS.checkYouself(BS.shot())=="Kill")
                isAlive=false;


        }
    }
}


class BattleSeaV_1 {
    int[] locationCells = {0, 0, 0};
    int numOfHits = 0;


    public String checkYouself(String userShot1) {
        int guess = Integer.parseInt(userShot1);
        String result = "Miss";
        for (int Cell : locationCells) {
            if (guess == Cell) {
                numOfHits = numOfHits++;
                result = "Hit";
                // break;
            }

        }
        if (numOfHits == locationCells.length) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }

    public void randomN() {
        int randomNum = (int) (Math.random() * 5);
        for (int x = 0; x < 3; x++) {
            locationCells[x] = randomNum;
            randomNum++;
        }


    }

    public String shot() {
        Scanner console = new Scanner(System.in);
        String userShot = console.nextLine();
        return userShot;

    }

}