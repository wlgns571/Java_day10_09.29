package Iot_Java.day10;

import java.util.Scanner;

public class Calleander {
	public static void main(String[] args) {
			/*
			 
			 * 
			 * ����ڰ� ��û�� �޷»���
			 * �׷�����(���)
			 * 1�� 1�� 1�� = ��
			 * 1�� 1�� 2�� = ȭ
			 * 4�� 1�� 1�� = �� (4�� 2���� ����)
			 * 1900�� 1�� 1�� = ��
			 * 0. ���ϴ� ���� 1���� �������� ����
			 * 1. ������ �˾Ƴ��� ���ؼ��� �� �ϼ��� 7�� ���� ������ ���� �ʿ�
			 *  1-1 �� �ϼ�(���� �⵵�� ������ ������)
			 *  1-2 ���� �� �ϼ� = (�� �ϼ� + ���� ���� �ޱ����� �� �ϼ� + 1��(���� ���� ù° ��)
			 *  1-3 �� ���� �⵵�� ������ ��� 2���� ���� 28���� �ƴ� 29��
			 *  
			 * ���� ��Ģ �˰���
			 * 1. ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�.
			 * (2020��, 2024��, 2028��, 2032��, 2036��, 2040��, 2044�� ...)
			 * 2. ��� ������ 4, 100���� ������ �������� �ش� ������� �Ѵ�.
			 * (1800��, 1900��, 2100��, 2200��, 2300��...)
			 * 3. ��� ������ 4, 100, 400���� ������ �������� �ش� �������� �д�.
			 * (1600��, 2000��, 2400��...)
			 * */
			// �⇿���� �Է¹޾� �ش� �⵵�� �ش� ���� �޷��� ����Ͻÿ�.
			Scanner sc = new Scanner(System.in);
			System.out.print( "�⵵ : " );
			int year = sc.nextInt();
			boolean isleepYear = false;
			
			// �Է��� �⵵(year)�� �������� Ȯ��
			if(( year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
				isleepYear = true;
			}
			int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(isleepYear) {
				months[1] = 29;
			}
			
			// �� �ϼ� ���ϱ� 1 
			int lastYear = year - 1;
			int totalDay = (lastYear * 365) + (lastYear / 4) - (lastYear / 100) + (lastYear / 400) ;
			totalDay += 1;
			for ( int m = 0; m < months.length; m++ ) {
			// �� �ϼ� ���ϱ� 2
			/*
			 *    m   i 
			 * 1�� 0 > 0
			 * 2�� 1 > 0
			 * */
//			for ( int i = 0; i < m; i++) {
//				totalDay += months[i];
//				} 
			
			// �� �ϼ� ���ϱ� 3 (�� �ϼ� + 1��(���� ���� ù° ��)
			
			// ���� ���ϱ� = ���ϼ� % 7
			int dayOfWeek = totalDay % 7;
			System.out.println("\n===================================================");
			System.out.printf("%d�� %d�� �޷�\n", year, (m+1));
			System.out.println("�Ͽ���\t������\tȭ����\t������\t�����\t�ݿ���\t�����");
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
	
