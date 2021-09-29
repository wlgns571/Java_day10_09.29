package Iot_Java.day10;

public class PrintfDemo2 {
	public static void main(String[] args) {
		System.out.printf("%d %n", 5490);
		System.out.printf("%8d %n", 5490);
		System.out.printf("%4d %n", 5490);
		System.out.printf("%010d %n", 5490);
		System.out.printf("%2.3f %n", 94.385201); // 실수 출력 (자릿수)
		System.out.printf("%+d %n", 1004);
		System.out.printf("%+d %n", -1004);
		System.out.printf("%(d %n", 1004); // 음수일 경우 괄호 표시
		System.out.printf("%(d %n", -1004);
		System.out.printf("%,d %n", 1234567890);
	}
}
