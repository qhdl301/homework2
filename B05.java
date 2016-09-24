import java.util.*;
class B01{
	
	int birth_year;
	int age;

	public static void main(String[] s){
	new B01().input();
	}
        
	void input(){
	Scanner s= new Scanner(System.in);
	System.out.println("태어난년도를 적으시오.");
	this.birth_year=s.nextInt();
	this.age = 2014 - birth_year;
	print();

	}

	void print(){
	
	if(this.age <=20){
	System.out.println("미성년자입니다.");
	}
	else
	{
	System.out.println("성인입니다.");
	}
	
       }
      }		
