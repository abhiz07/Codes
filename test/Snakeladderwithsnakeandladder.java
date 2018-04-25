public class Snakeladderwithsnakeandladder {

	public static void main(String[] args) {
	  int snl[]={0,0,6,0,0,8,0,9,0,3,0};
	  int dices[]={2,6,3,2,4,1,1,1,2,5,4};
	  System.out.println(IsvalidPath(0, 10, snl, dices,0));

	}
	public static boolean IsvalidPath(int curr,int end, int snl[],int dices[],int dvidx)
	{
		
		if(dvidx== dices.length)
			return false;
		if(end==dvidx)
			return true;
		if(snl[curr]!=0)
		{
			return IsvalidPath(snl[curr],end,snl,dices,dvidx);
			
		}
		else if(curr+dices[dvidx]<=end)
		{
			return IsvalidPath(curr+dices[dvidx], end, snl, dices, dvidx+1);
		}
		else
		{
			return IsvalidPath(curr, end, snl, dices, dvidx+1);
		}
		
   }

}
