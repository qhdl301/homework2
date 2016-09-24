import java.util.*;
class B05{
	
	int birth_year;
	int age;

	public static void main(String[] s){
	new B05().input();
	}
        
	void input(){
	Scanner s= new Scanner(System.in);
	System.out.println("태어난년도를 입력하시오.");
	this.birth_year=s.nextInt();
	print();
	}

	void print(){
	
	this.age = 2012 - this.birth_year + 1;
	if(age<7){
	System.out.println("유아입니다");
	}	
	else if(age<13){
	System.out.println("어린이입니다");
	}
	else if(age<20){
	System.out.println("청소년입니다");
	}
	else if(age<30){
	System.out.println("청년입니다");
	}
	else if(age<60){
	System.out.println("중년입니다");
	}
	else{
	System.out.println("노년입니다");
	}
       }
      }		
