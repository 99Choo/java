// P0239.java
package Home_Work; // 이 패키지가 실제로 존재하는지 확인 또는 삭제

import java.util.Scanner;

class Player { 
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getWordFromUser(Scanner scanner) {
        System.out.print(name + ">>");
        return scanner.next();
    }
}

public class P0239 {
    private Player[] players;
    private String startWord = "아버지";
    private Scanner scanner;

    public P0239() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int numPlayers = scanner.nextInt();
        players = new Player[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = scanner.next();
            players[i] = new Player(name);
        }

        System.out.println("시작하는 단어는 " + startWord + "입니다.");
        String currentWord = startWord;

        while (true) {
            for (Player player : players) {
                String newWord = player.getWordFromUser(scanner);
                if (!checkSuccess(currentWord, newWord)) {
                    System.out.println(player.getName() + "이 졌습니다.");
                    return;
                }
                currentWord = newWord;
            }
        }
    }

    private boolean checkSuccess(String currentWord, String newWord) {
        int lastIndex = currentWord.length() - 1;
        char lastChar = currentWord.charAt(lastIndex);
        char firstChar = newWord.charAt(0);
        return lastChar == firstChar;
    }

    public static void main(String[] args) {
        P0239 game = new P0239();
        game.run();
    }
}
