package com.epam.jwd.module1;


public class Number {

    private int value;
    private int countOfDigit = 0;

    public Number(int value) {
        this.value = value;
        countOfDigit = countOfInputDigit(value);
    }

    public static int countOfInputDigit(int value) {
        int count = 0;

        while (value != 0) {
            count++;
            value /= 10;
        }

        return count;
    }

    public int getDigitByPosition(int position) {
        int digitByPosition = 0;
        int countOfDigit = this.countOfDigit;
        int value = this.value;

        if (countOfDigit < position) {
            throw new RuntimeException("Число меньше запрашиваемой позиции");
        }

        while (countOfDigit != position) {
            countOfDigit--;
            value /= 10;
        }

        digitByPosition = value % 10;

        return digitByPosition;
    }

    public boolean equalsTwoFirstAndTwoLastDigit() {
        int sumTwoLast = 0;
        int sumTwoFirst = 0;

        if (countOfDigit < 4) {
            throw new RuntimeException("Число меньше чем четыре цифры");
        }

        sumTwoFirst = getDigitByPosition(1) + getDigitByPosition(2);
        sumTwoLast = getDigitByPosition(3) + getDigitByPosition(4);

        return sumTwoFirst == sumTwoLast;
    }

    public int getDigit() {
        return value;
    }

    public int getCountOfDigit() {
        return countOfDigit;
    }

    @Override
    public String toString() {
        return "Digit{" +
                "value=" + value +
                ", countOfDigit=" + countOfDigit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Number number = (Number) o;

        if (value != number.value) return false;
        return countOfDigit == number.countOfDigit;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + countOfDigit;
        return result;
    }
}
