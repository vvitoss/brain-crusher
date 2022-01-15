package ru.netology.sqr;

public class SQRService {

    public int countingNumSquare(int loverRange, int upperRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= loverRange) {
                if (i * i <= upperRange) {
                    count = count + 1;

                }
            }

        }
        System.out.println(count);
        return count;

    }
}
