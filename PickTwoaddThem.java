package Iot_Java.day10;

public class PickTwoaddThem {
	public static void main(String[] args) {
		// 정렬한 값(result)에서 중복된 숫자를 제거한 결과를
		// 새로운 배열(final)에 담아 출력하시오
		// 단, 정렬 순서는 그대로 유지해야함.
		int nums [] = {2, 1, 3, 4, 1};
		// 수 배열 numbers가 주어집니다. numbers에서
		// 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더합니다.
		// 더한 결과를 배열에 담아주세요
		// 결과를 출력하기
		// 입출력 예
		// [2,1,3,4,1] 
		// 2 + 1 = 3, .... 2 + 1 = 3 - 1cycle
		// 1 + 3 = 4, 1 + 4 = 5, 1 + 1 = 2 - 2cycle
		// 3 + 4 = 7, 3 + 1 = 4 - 3cycle
		// 4 + 1 = 5 - 4cycle
		// 총 데이터 개수 : 5
		// 더해지는 데이터 개수 : 10
		int n = nums.length - 1;
		int SIZE = ((n + 1) * n / 2);
		int [] result = new int [SIZE];
		for ( int i = 0, idx = 0; i < nums.length - 1; i++) {
			for ( int j = i + 1; j < nums.length; j++) {
				int total = nums[i] + nums[j];
				result[idx++] = total;
				// System.out.printf("%d + %d = %d\n", nums[i], nums[j], nums[i] + nums[j]);
			}
		}
		for ( int i = 0; i < result.length - 1; i++ )
			for (int j = i + 1; j < result.length; j++) {
				if ( result[i] > result[j]) {
					 int temp = result[i];
					 result[i] = result[j];
					 result[j] = temp;
					 // 배열의 단점은 사이즈를 알아야한다.
				}
			}
		System.out.println();
		int cnt = SIZE;
		for(int i = 0; i < result.length - 1; i++) {
			if( result[i] == result[i+1]) {
				result[i] = -1;
				cnt--;
				// 2 3 3 4 4 5 5 5 6 7  ->  2 -1 3 -1 4 -1 -1 5 6 7 
			}
		}
		System.out.println("RESULT");
		for(int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
		int [] finalResult = new int[cnt];
		for(int i = 0, idx = 0; i < result.length; i++) {
			if(result[i] > -1) {
				finalResult[idx++] = result[i];
			}
		}
		System.out.println("\nFianl RESULT");
		for(int i = 0; i < finalResult.length; i++) {
			System.out.printf("%d ", finalResult[i]);
		}
		// [5,0,2,7]   [2,5,7,9,12]
	}
}
