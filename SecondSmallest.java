
public class SecondSmallest {

    public static void main(String[] args) 
{
 
	/*int[] elements = {-5, -4, 0, 2, 10, 3, -3};
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    
    for (int i = 0; i < elements.length; i++) {
        if(elements[i]==smallest){
          secondSmallest=smallest;
        } else if (elements[i] < smallest) {
            secondSmallest = smallest;
            smallest = elements[i];
        } else if (elements[i] < secondSmallest) {
            secondSmallest = elements[i];
        }

    }*/
	
	
	 int[] elements  = {-4 , 2 , 10 , -2, -3 }; 
	    int smallest = Integer.MAX_VALUE; 
	    int secondSmallest = Integer.MAX_VALUE; 

	    for (int i = 0; i < elements.length; i++)
	    {
	        if (smallest>elements[i])
	            smallest=elements[i];

	    }

	    for (int i = 0; i < elements.length; i++)
	    {
	        if (secondSmallest>elements[i] && elements[i]>smallest)
	            secondSmallest=elements[i];

	    }

	    System.out.println("The smallest element is: " + smallest + "\n"+  "The second smallest element is: " + secondSmallest);
	}
}

