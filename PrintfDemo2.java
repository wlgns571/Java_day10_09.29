package Iot_Java.day10;

public class PrintfDemo2 {
	public static void main(String[] args) {
		System.out.printf("%d %n", 5490);
		System.out.printf("%8d %n", 5490);
		System.out.printf("%4d %n", 5490);
		System.out.printf("%010d %n", 5490);
		System.out.printf("%2.3f %n", 94.385201); // �Ǽ� ��� (�ڸ���)
		System.out.printf("%+d %n", 1004);
		System.out.printf("%+d %n", -1004);
		System.out.printf("%(d %n", 1004); // ������ ��� ��ȣ ǥ��
		System.out.printf("%(d %n", -1004);
		System.out.printf("%,d %n", 1234567890);
	}
}
