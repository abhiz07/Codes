
public class Subsetswithtarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] ={10,20,30,40,50,60,70};
		printTargetSS(arr1,0,70,"");

	}
    public static void printTargetSS(int arr[],int vidx,int tar, String ans)
    {
    	if(vidx==arr.length)
    	{
    		if(tar==0)
    		{
    			System.out.println(ans);
    		}
    		return;
    	}

		// Added printing step
     	printTargetSS(arr, vidx+1, tar-arr[vidx], ans+arr[vidx]);
    	printTargetSS(arr, vidx+1, tar, ans);
    }
}
