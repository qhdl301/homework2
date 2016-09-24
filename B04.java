import java.util.*;
class B04{
	
	int kor;
	int eng;
	int math;
	
	public static void main(String[] s){
	new B04().input();
	}
        
	void input(){
	Scanner s= new Scanner(System.in);
	System.out.println("국어점수를 입력하세요");
	this.kor=s.nextInt();
	System.out.println("영어점수를 입력하세요");
	this.eng=s.nextInt();
	System.out.println("수학점수를 입력하세요");
	this.math=s.nextInt();
	print();

	}

	void print(){
	
	int total= this.kor+this.eng+this.math;
	System.out.println("입력하신 점수의 총점은"+total+"이고");
	double avg= total/3.0;
	System.out.println("평균은"+avg+ "입니다");
        if(this.kor>=90)
	System.out.println("국어 점수가 우수합니다");
        if(this.eng>=90)
	System.out.println("영어 점수가 우수합니다");
        if(this.math>=90)
	System.out.println("수학 점수가 우수합니다");
       }
      }		
