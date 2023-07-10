package org.example.Seminar4.Homework;

import java.util.List;

public class Calculator<N> {
    public double sum(List<? extends Number> numbers){
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double mult(List<? extends Number> numbers) {
        double mult = 1.0;
        for (Number number : numbers) {
            mult *= number.doubleValue();
        }
        return mult;
    }

    public double div(List<? extends Number> numbers) {
        double div = 1.0;
        for (Number number : numbers) {
            div /= number.doubleValue();
        }
        return div;
    }

    public String binaryPres(List<N> numbers) {
        StringBuilder answer = new StringBuilder();
        for (N number : numbers) {
            answer.append(toBin(number));
            answer.append(" ");
        }
        return answer.toString();
    }

    private String toBin(N d) {
        int limit = 10;
        double tmp = Double.parseDouble("" + d);
        int partAll = (int) tmp;
        if (tmp - partAll == 0) return allToBin(partAll);
        else return allToBin(partAll) + '.' + partToBin(tmp - partAll, limit);
    }

    private String partToBin(double n, int limit) {
        StringBuilder binary = new StringBuilder();
        while (n > 0 && binary.length() < limit) {
            double r = n * 2;
            if (r >= 1) {
                binary.append(1);
                n = r - 1;
            } else {
                binary.append(0);
                n = r;
            }
        }
        return binary.toString();
    }

    private String allToBin(long l) {
        return Long.toBinaryString(l);
    }
}
