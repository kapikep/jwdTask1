package com.epam.jwd.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourDigitController {

    private  Number number;
    private ConsoleView consoleView = new ConsoleView();

    public void initFourDigitNumber() throws IOException {
        int value = 0;
        consoleView.printConsole("Введите четырехзначное число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                value = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                consoleView.printConsole("Введено не число");
            }

            if (Number.countOfInputDigit(value) == 4) {
                number = new Number(value);
                return;
            } else {
                consoleView.printConsole("Необходимо ввести четырехзначное число:");
            }
        }
    }

    public void equalsTwoFirstAndTwoLastDigit(){

        if(number.equalsTwoFirstAndTwoLastDigit()){
            consoleView.printConsole("Сумма двух первых цифр введенного четырехзначного числа РАВНА сумме двух его последних цифр");
        }else{
            consoleView.printConsole("Сумма двух первых цифр введенного четырехзначного числа НЕ РАВНА сумме двух его последних цифр");
        }
    }
}
