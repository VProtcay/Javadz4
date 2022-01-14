package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int start ,int limit ) {
        for (int i = 10; i <= 99;  i++) {
            if (i * i >= start)
                if (i * i <= limit) {
                    return i++;
                }
        }
        return 0;
    }
}
