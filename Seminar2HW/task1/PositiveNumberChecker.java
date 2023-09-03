package Seminar2HW.task1;

import java.util.Scanner;

public class PositiveNumberChecker{

    public static void checkPositiveNumber(int number) throws InvalidNumberException{
        if(number <= 0){
                throw new InvalidNumberException("Некорректное число!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        try {
            checkPositiveNumber(number);
            System.out.println("Число корректно!");
        }catch(InvalidNumberException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    
    }
    
}