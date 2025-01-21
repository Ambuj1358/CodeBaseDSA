package sigma;

public class TrappedRainwater {
	
	
	public static int trappedWater(int height[]) {
		
		
		int trappedWater=0;
		int n=height.length;
		
		int leftMax[]=new int[n];
		int rightMax[]=new int[n];
		
		leftMax[0]=height[0];
		rightMax[n-1]=height[n-1];
		
		//creating left max array->Axulliary array(helper array)
		for(int i=1;  i<n;  i++) {
			leftMax[i]=Math.max(height[i], leftMax[i-1]);
			
		}
		
		//creating right max array->Auxillary array(helper)
		
		for(int i=n-2;  i>=0;  i--) {
			rightMax[i]=Math.max(height[i], rightMax[i+1]);
		}
		
		
		//finding water level and then trapped water
		
		for(int i=0;  i<n;  i++) {
			int wl=Math.min(leftMax[i], rightMax[i]);
			trappedWater=trappedWater+ (wl-height[i]);
		}
		
		return trappedWater;
	}
	public static void main(String[] args) {
		
		int height[]= {4,2,0,6,3,2,5};
		System.out.println(trappedWater(height));
	}

}
