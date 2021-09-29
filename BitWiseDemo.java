package Iot_Java.day10;

public class BitWiseDemo {
	public static void main(String[] args) {
		// 비트 연산자는 입력값 비트에 대해 작동합니다.
		// 정수유형(long, int, short, char 및 byte)에 적용할 수 있습니다.
		// 다양한 비트 연산자를 살펴보기 전에 먼저 작동 방식을 이해해야 합니다.
		// 1. 피연산자는 이진 표현으로 변환됩니다.
		// 2. 연산자는 이진수의 각 비트에 적용되고 결과가 계산됩니다.
		// 3. 마지막으로 결과는 다시 10진수 표현으로 변환됩니다.
		int v1 = 6;
		int v2 = 5;
		int result = v1 | v2; // (6 | 5)
		System.out.println(result);
		// Binary number of v1 = 0110
		// Binary number of v2 = 0101
		//                       0111
		System.out.println(v1 & v2);
		System.out.println(~v1); // 0110 > 1001 
		System.out.println(~v2); // 0101 > 1010
		System.out.println(~v1 & ~v2); // -7 & -6
		System.out.println(~~v1 | ~~v2); // 7
		System.out.println(v1^v2); // xor 1001 ^ 101 > 0011 / 비트값이 다르면 |(or) 그외에는 0
		
		//비트 연산자는 비트 논리 및 비트 시프트 연산자로 더 분류됩니다.
		// 1. Bitwrite Operator table
		// A  B  A|B   A&B   A^B   ~A
		// 0  0   0     0     0     1
		// 1  0   1     0     1     0
		// 0  1   1     0     1     1
		// 1  1   1     1     0     0
		
		// 2. Signed Left shift [<<]
		// 이진 시프트 연산자는 피연산자의 오른쪽에 지정된 횟수만큼
		// 비트를 왼쪽으로 시프트(이동)합니다.
		// 왼쪽 이동 후 오른쪽의 빈공간이 0으로 채워집니다.
		// 중요한 점은 숫자를 1비트 왼쪽으로 이동하는 것은 숫자를 곱하는 것과 같다는 의미입니다.
		int s1 = 12;
		// 00001100 -> 12
		// 00011000 -> 24
		int ls = s1 << 2;
		System.out.println(s1 << 1); // 12 * 2
		System.out.println(s1 << 2); // 12 * 4 - 1비트 올라갈때마다 2씩 곱해준다는 의미
		System.out.println(ls);
		
		// 3.Signed Right shift [>>]
		s1 = 12;
		// 오른쪽 이동 후 왼쪽의 빈공간은 부호값으로 채워집니다.
		// 입력 숫자가 음수이면 빈 공간이 1(부호값)으로 채워집니다.
		// 입력 숫자가 양수이면 빈 공간이 0(부호값)으로 채워집니다.
		// 00001100 -> 12
		// 00000110 -> 6
		System.out.println(s1 >> 1); // 12 / 2
		System.out.println(s1 >> 2); // 12 / 4
		
		// 4.unsigned Right shift [>>>]
		// 이 연산자는 부호있는 오른쪽 시프트 연산자와 매우 유사합니다.
		// 유일한 차이점은 숫자가 양수인지 음수인지에 관계없이
		// 왼쪽의 빈공간이 0으로 채워집니다.
	}
}
