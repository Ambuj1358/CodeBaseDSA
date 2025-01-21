package alpha;

public class AmazonKthFactor {
	
	//function for kth factor of n
	static int function(int n,int k)
	{
	    int i;
	    for(i=1;i<=(int)Math.sqrt(n);i++)
	    {
	    	if(n%i==0)
	    	{
	    		k--;
	    		if(k==0)
	    			return i;
	    	}	
	    }
	    for(int j=(int)Math.sqrt(n-1);j>=1;j--)
	    {
	    	if(n%j==0)
	    	{
	    		k--;
	    		if(k==0)
	    			return n/j;
	    	}
	    }
	    	return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(function(16,3));
	}

}
