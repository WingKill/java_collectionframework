import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String major;
	private String studentID;
	private double gradeAvg;
	
	public Student(String name,String major,String studentID,double gradeAvg) {
		this.name = name;
		this.major = major;
		this.studentID = studentID;
		this.gradeAvg = gradeAvg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public double getGradeAvg() {
		return gradeAvg;
	}

	public void setGradeAvg(double gradeAvg) {
		this.gradeAvg = gradeAvg;
	}	
}

public class TestMain5 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		List<Student> stuList = new ArrayList<>();
		String enter = sc.nextLine();
		StringTokenizer string = new StringTokenizer(enter); 
	}
}

//학생 이름, 학과, 학번, 학점평균 입력하세요.
//// 빈칸
//> 황기태, 모바일, 1, 4.1
//// 빈칸
//> 이재문, 안드로이드, 2, 3.9
//// 빈칸
//> 김남윤, 웹공학, 3, 3.5
//// 빈칸
//> 최찬미, 빅데이터, 4, 4.25
//// 빈칸
//----------------------------------
//// 빈칸
//이름: 황기태
//// 빈칸
//학과: 모바일
//// 빈칸
//학번: 1
//// 빈칸
//학점평균: 4.1
//----------------------------------
//// 빈칸
//이름: 이재문
//// 빈칸
//학과: 안드로이드
//// 빈칸
//학번: 2
//// 빈칸
//학점평균: 3.9
//----------------------------------
//// 빈칸
//이름: 김남윤
//// 빈칸
//학과: 웹공학
//// 빈칸
//학번: 3
//// 빈칸
//학점평균: 3.5
//----------------------------------
//// 빈칸
//이름: 최찬미
//// 빈칸
//학과: 빅데이터
//// 빈칸
//학번: 4
//// 빈칸
//학점평균: 4.25
//----------------------------------
//// 빈칸
//학생 이름 >> 최찬미
//// 빈칸
//최찬미, 빅데이터, 4, 4.25
//// 빈칸
//학생 이름 >> 이재문
//// 빈칸
//이재문, 안드로이드, 2, 3.9
//// 빈칸
//학생 이름 >> 그만

