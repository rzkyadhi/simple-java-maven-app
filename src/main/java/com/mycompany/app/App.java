package com.mycompany.app;
import java.util.Random;

public class App {

    private int randomNumber1;
    private int randomNumber2;

    public App() {
        
    }

    public int getRandomNumber1() {
        return randomNumber1;
    }

    public int getRandomNumber2() {
        return randomNumber2;
    }

    public void setRandomNumber1(int randomNumber1) {
        this.randomNumber1 = randomNumber1;
    }

    public void setRandomNumber2(int randomNumber2) {
        this.randomNumber2 = randomNumber2;
    }

    public int addRandomNumbers() {
        return randomNumber1 + randomNumber2;
    }

    public static void main(String[] args) {
        App app = new App();
        Random random = new Random();

        app.setRandomNumber1 = random.nextInt(10) + 1;
        app.setRandomNumber2 = random.nextInt(10) + 1;

        int sum = app.addRandomNumbers();
        System.out.println("Sum of random numbers: " + sum);
    }
}
