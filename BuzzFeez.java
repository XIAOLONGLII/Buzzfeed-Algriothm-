
public class BuzzFeez {
	
	public static void main(String[] args){
		BuzzFeez a= new BuzzFeez();
		a.print100();
		
	}
	
	public void print100(){
		for(int i=1;i<101;i++){
			if(i%3!=0&&i%5!=0)
				System.out.print(i);
				if(i%3==0)
					System.out.print(" Goldman ");
				if(i%5==0)
					System.out.print(" Sachs ");
			
				
				
			
		}
	}

}
