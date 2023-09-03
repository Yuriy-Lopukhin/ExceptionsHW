package Seminar2HW.task2;

import java.util.Scanner;

public class DivisionProgram {
    public static double divide (int num1, int num2) throws DivisionByZeroException{
        if(num2 == 0){
                throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return (double) num1/num2;
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            try {
                double result = divide(num1, num2);
                System.out.println("Результат деления: " + result);
            }catch(DivisionByZeroException e){
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    
    }
}
