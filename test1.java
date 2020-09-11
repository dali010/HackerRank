public class Sock{
//int n;
//int ar[];

public Sock( /*int n , int ar[]*/)
{
	//this.n=n;
	//this.ar=ar;
}

	 int[] anotherArray(int[] ind ,int[] arr)
	{
		int[] anotherArray = new int[arr.length - 2]; 
   
        for (int i = 0, k = 0; i < arr.length; i++) 
        { 
            if (i == ind[0]) || (i == ind[1])
            { 
                continue; 
            } 

            anotherArray[k++] = arr[i]; 
        } 
  
        
        return anotherArray;
	}
	int nbSock(int[] indd)
	{
		int nb , nbb;
		nb = indd.length;
		nbb = nb / 2 ;
		return nbb ; 
	}

	Function sockMerchent(int n , int[] ar )
	{
		int j=0 , nbsocks=0 , nbSo = 0 ; 
		int[] ind = new int[n];
		int l=0; 

		for (int i=1 ; i<n ; i++) 
    	{

    		if (ar[j] == ar[i]) 
    		{
    			ind[l] = j;
    			ind[l+1]=i;
    			l+=2;
    		}
    	}
    	nsSo += nbSock(ind);
    	ar = anotherArray(ind,ar);


	}
	



}
