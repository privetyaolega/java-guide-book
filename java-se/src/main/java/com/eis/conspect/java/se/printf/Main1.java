package com.eis.conspect.java.se.printf;

import java.util.Date;

public class Main1 {

        public static void main(String[] args) {

                String str = "Текстовочка...";
                double x = 100.0/7.0;
                double z = 125;
                int n = -12345;
                int k = 456789;
                int m = 0xABC;
                int l = 0123;
                Date now = new Date();

                System.out.printf("1) %s\t%d\t%f\n", str, k, z);
                System.out.printf("2) Десятичные числа:\n%1$g\t%2$e\t%1$07.2f\n", x, z);
                System.out.printf("3) Отрицательное число: %,(d\n",n);
                System.out.printf("4) Положительное число: %+,d\n",k);
                System.out.printf("5) 16-е значение %x соответствует 10-му числу %<d\n",m);
                System.out.printf("6) 10-е значение %d соответствует 16-му числу %<X\n",k);
                System.out.printf("7) 8-е значение %o соответствует 10-му числу %<d\n",l);
                System.out.printf("8) Месяц: %tB\n",now); //tb // ex! показать
                System.out.printf("9) Число: %te\n",now);
                System.out.printf("10) День недели: %tA\n",now); //ta
                System.out.printf("11) Время: %tT\n",now);
                System.out.printf("12) Полные сведения: %tc\n",now);
                System.out.printf("13) Год-мес-число: %tF\n",now);
                System.out.printf("14) Только год ХХХХ: %tY\n",now);
                System.out.printf("15) Время 24ч: %tR\n",now);
        }

}

