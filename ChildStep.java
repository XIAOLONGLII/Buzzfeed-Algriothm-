import java.util.Scanner;

public class ChildStep {
	
	
	/*public int stairs(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return (stairs(n-2)+stairs(n-1)+2);
		}
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		
	}*/
	
	  public static void main(String args[])
	  {
	    System.out.println(printNoWays(6));
	  }

	  public static int printNoWays(int sum)
	  {
	    if (sum == 0)
	      return 1;
	    if (sum < 0)
	      return 0;
	    return printNoWays(sum - 1) + printNoWays(sum - 2);
	  }

	  public static void printArray(Object obj)
	  {
	    Class cls = obj.getClass();
	    Object obj1[] = (Object[]) cls.cast(obj);
	    if (cls.getComponentType().isArray())
	    {
	      for (Object obj2: obj1)
	      {
	        printArray(obj2);
	      }
	    }
	    else
	    {
	      System.out.print("\n");
	      for (int i = 0; i < obj1.length; i++)
	      {
	        System.out.print(obj1[i]);
	      }
	    }
	  }
	
	

}
