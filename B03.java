import java.util.*;
class B03{
	
	int days;
	int seconds;
	int m_count;

	public static void main(String[] s){
	new B03().input();
	}
        
	void input(){
	Scanner s= new Scanner(System.in);
	System.out.println("날수를 입력하세오.");
	this.days=s.nextInt();
	print();
	}

	void print(){
	
	
	this.seconds = days*24*60*60;
	System.out.println("날수에 해당되는 기간은 모두"+seconds+ "초입니다.");
	this.m_count = seconds/1000000;
	if(seconds>=1000000) 
	System.out.println("100만초가모두" + m_count+ "번이나 포함됩니다.");
	
       }
      }		
