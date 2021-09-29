package Iot_Java.day10;

import java.util.Date;
import java.util.Locale;

public class PrintfDemo {
	public static void main(String[] args) {
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	// String Formatting
	System.out.println("==========String Formatting==========");
	System.out.printf("Printing a String : %s %n", "Hello World");
	System.out.printf("%S %n","Seoul is the ");
	System.out.printf("%10s %n", "linux");
	System.out.printf("");
	System.out.printf("");
	
	// Number Formatting
	System.out.println("==========Number Formatting==========");
	System.out.printf("simple integer2: %d \n", 100);
	System.out.printf("simple integer: %d %n", 10000L);
	System.out.printf(Locale.US,"%d %n", 1000000000); // ������ 1000���� ����
	System.out.printf(Locale.KOREA,"%d %n", 1000000000);
	
	// Float and Double Formatting
	System.out.println("==========Float and Double Formatting==========");
	System.out.printf("%f%n", 5.1473); // �Ǽ�
	System.out.printf("%5.2f%n", 5.1473); // ���ڿ� �Ҽ��� ���� width
	System.out.printf("%5.2e%n", 5.1473); // ����ǥ���
	
	// Date/Time Formatting - new date�� ���� ��¥�� �ð��� �����
	System.out.println("==========Date/Time Formatting==========");
	System.out.printf(Locale.FRANCE, "%n Pringting date and time: %tc", new Date());
	System.out.printf(Locale.KOREA, "%n Pringting date and time: %tc", new Date());
	
	Date date = new Date();
	System.out.printf("%n hours: %tH, minutes: %tM, seconds: %tS", date, date, date);
	
	System.out.printf("%n %1$d %1$-3d %2$-10s %2$10s", 2, "Hello Java"); //ctrl + shift + o(������)
	}
}
