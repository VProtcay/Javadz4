package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int start, int limit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start && i * i <= limit) {
                count++;
            }
        }
        return count;
    }
}
