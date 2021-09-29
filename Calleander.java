package Iot_Java.day10;

import java.util.Scanner;

public class Calleander {
	public static void main(String[] args) {
			/*
			 
			 * 
			 * 사용자가 요청한 달력생성
			 * 그레고리력(양력)
			 * 1년 1월 1일 = 월
			 * 1년 1월 2일 = 화
			 * 4년 1월 1일 = 목 (4년 2월은 윤년)
			 * 1900년 1월 1일 = 월
			 * 0. 구하는 월의 1일은 무슨요일 인지
			 * 1. 요일을 알아내기 위해서는 총 일수를 7로 나눈 나머지 값이 필요
			 *  1-1 총 일수(이전 년도의 마지막 날까지)
			 *  1-2 최종 총 일수 = (총 일수 + 현재 이전 달까지의 총 일수 + 1일(현재 달의 첫째 날)
			 *  1-3 단 현재 년도가 윤년인 경우 2월의 값은 28일이 아닌 29일
			 *  
			 * 윤년 규칙 알고리즘
			 * 1. 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
			 * (2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
			 * 2. 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
			 * (1800년, 1900년, 2100년, 2200년, 2300년...)
			 * 3. 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
			 * (1600년, 2000년, 2400년...)
			 * */
			// 년눨일을 입력받아 해당 년도의 해당 월의 달력을 출력하시오.
			Scanner sc = new Scanner(System.in);
			System.out.print( "년도 : " );
			int year = sc.nextInt();
			boolean isleepYear = false;
			
			// 입력한 년도(year)가 윤년인지 확인
			if(( year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
				isleepYear = true;
			}
			int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(isleepYear) {
				months[1] = 29;
			}
			
			// 총 일수 구하기 1 
			int lastYear = year - 1;
			int totalDay = (lastYear * 365) + (lastYear / 4) - (lastYear / 100) + (lastYear / 400) ;
			totalDay += 1;
			for ( int m = 0; m < months.length; m++ ) {
			// 총 일수 구하기 2
			/*
			 *    m   i 
			 * 1월 0 > 0
			 * 2월 1 > 0
			 * */
//			for ( int i = 0; i < m; i++) {
//				totalDay += months[i];
//				} 
			
			// 총 일수 구하기 3 (총 일수 + 1일(현재 달의 첫째 날)
			
			// 요일 구하기 = 총일수 % 7
			int dayOfWeek = totalDay % 7;
			System.out.println("\n===================================================");
			System.out.printf("%d년 %d월 달력\n", year, (m+1));
			System.out.println("일요일\t월요일\t화요일\t수요일\t목요일\t금요일\t토요일");
			System.out.println("===================================================\n");
			for ( int j = 1; j <= dayOfWeek; j++) {
				System.out.print("\t");
			}
			for ( int i = 1; i <= months[m]; i++) {
				System.out.printf("%d\t", i);
				if ((i + dayOfWeek) % 7 == 0) {
					System.out.println();
				}
			}
			totalDay += months[m];
		}
	}
}
	
