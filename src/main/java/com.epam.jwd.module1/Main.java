package com.epam.jwd.module1;

import java.io.IOException;

/* Проверка, что сумма двух первых цифр введенного четырехзначного числа
 * равна сумме двух его последних цифр.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        FourDigitController fourDigitController = new FourDigitController();
        fourDigitController.initFourDigitNumber();
        fourDigitController.equalsTwoFirstAndTwoLastDigit();
    }
}
