import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int isContinue;
        do {
//            startGameMagicNumber();
            startGameMagicWord();
            System.out.print("Если хотите сыграть еще раз введите 1");
            isContinue = sc.nextInt();
        } while (isContinue == 1);

        sc.close();

    }
//    1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    static void startGameMagicNumber(){
        Random random = new Random();


        int magicNumber = random.nextInt(10);
        int enteredNum;
        int count = 0;
        do {
            System.out.print("Введите число: ");
            enteredNum = sc.nextInt();
            if (enteredNum > magicNumber) System.out.println("Загаданное число меньше");
            if (enteredNum < magicNumber) System.out.println("Загаданное число больше");
            if (enteredNum == magicNumber) System.out.println("Вы угадали число = " + magicNumber);
            count++;
        } while(enteredNum != magicNumber && count < 3);
    }

    // второе задание
    static void startGameMagicWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String magicWord = words[random.nextInt(words.length)];
        String enteredWord;
        do {
            System.out.print("Введите слово: ");
            enteredWord = sc.nextLine();
            StringBuilder answerShow = new StringBuilder();
            for(int i = 0; i < magicWord.length();i++){
                if (i < enteredWord.length()){
                    if (magicWord.charAt(i) == enteredWord.charAt(i) ){
                        answerShow.append(magicWord.charAt(i));
                    } else {
                        answerShow.append("#");
                    }
                }
            }
            if (enteredWord.equals(magicWord)){
                System.out.println("Вы угадали слово: " + magicWord);
            } else {
                while (answerShow.length() < 15) answerShow.append("#");
                System.out.println("Неправильно! " + answerShow.toString());
            }
        } while(!enteredWord.equals(magicWord));
    }
}
