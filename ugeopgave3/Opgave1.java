import java.util.Scanner;

public class Opgave1 {

    // OPG 1: Bank-Konto

    double balance = 0;
    String accountName;

    void deposit100 () {
        balance += 100;
    }

    void withdraw50 () {
        balance -= 50;
    }

    void printBalance () {
        System.out.println(accountName + " har " + balance + " kr");
    }

    void deposit200 () {
        balance += 200;
    }

    void main(String[] args) {
        accountName = "Henrik";

        deposit100();
        deposit100();
        withdraw50();
        printBalance();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange gange vil du indsætte 200kr?");
        int times = scanner.nextInt();

        for(int i = 0; i < times; i++) {
            deposit200();
        }

        printBalance();
    }




 }


