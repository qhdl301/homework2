import java.util.*;
class A06{

		
		double avg;
		int math;
		int kor;
                int eng;
		public static void main(String[] args){
		new A06().input();
		}

		void input(){
		Scanner s= new Scanner(System.in);
		System.out.println("이름:");
		String name=s.next();
		System.out.println("국어점수 입력:");
		this.kor=s.nextInt();
		System.out.println("수학점수 입력:");
		this.math=s.nextInt();
		System.out.println("영어점수 입력:");
		this.eng=s.nextInt();
	        print();

		}

		void print(){
		this.avg=(kor+math+eng)/3;
		System.out.println("평균은:"+avg);
		if(avg<60){
		System.out.println("F");
		}
		else if(avg<65){
		System.out.println("D");
                }
		else if(avg<70){
		System.out.println("D+");
		}
		else if(avg<75){
		System.out.println("C");
		}
		else if(avg<80){
		System.out.println("C+");
		}
		else if(avg<85){
		System.out.println("B");
		}
		else if(avg<90){
		System.out.println("B+");
		}
		else if(avg<95){
		System.out.println("A");
		}
		else if(avg<=100){
		System.out.println("A+");
		}

		
}

}
