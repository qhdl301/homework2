import java.util.*;
class B02{
	
	double input_degree;
	String kind;
	double output_degree;

	public static void main(String[] s){
	new B02().input();
	}
        
	void input(){
	Scanner s= new Scanner(System.in);
	System.out.println("온도를 입력하세요.");
	this.input_degree=s.nextDouble();
	System.out.println("어떤 온도를 선택하시겠습니까.");
	this.kind= s.next();
	print();

	}

	void print(){
	
	double A;
	double B;

	if(this.kind.equals("F")){
	A= (input_degree-32)/1.8;
	System.out.println("변화된온도는."+A);
	}
	else
	{
	B=(input_degree*1.8)+32;
	System.out.println("변화된온도는."+B);
	}
	
       }
      }		
