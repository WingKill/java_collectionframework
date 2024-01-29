import java.util.ArrayList;
import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {
		/*
		 Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아ArrayList에 저장하고, 
		 ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라.
			6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> A C A B F D
			2.3333333333333335
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> gradeList = new ArrayList<String>();
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for(int i = 0 ; i < 6 ; i++) {
			String enter = sc.next();
			gradeList.add(enter);
		}
		
		double sum = 0;
		
		for(String i : gradeList) {
			switch (i.charAt(0)) {
			case 'A':
				double a = 4;
				sum += a;
				break;
			case 'B':
				double b = 3;
				sum += b;
				break;
			case 'C':
				double c = 2;
				sum += c;
				break;
			case 'D':
				double d = 1;
				sum += d;
				break;
			case 'F':
				double f = 0;
				sum += f;
				break;
			default:
				System.out.println("해당되는 글자가 없습니다.");
				break;
			}
		}
		System.out.println(sum/gradeList.size());
		sc.close();
	}
}



