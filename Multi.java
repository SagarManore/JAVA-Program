class Multi
{
	public static void main(String arg[])
	{
		// int arr [3] [2];
		int arr[][]= new int [3][2];
	    // arr is 2 dimentional array
		// which contents 3 one dimentional array 
		//each one dimentional array contains 
		// 2 element and each element is of type integer

		arr[0] [0]= 10;
		arr[0] [1]= 20;
		arr[1] [0]= 30;
		arr[1] [1]= 40;
		arr[2] [0]= 50;
		arr[2] [1]= 60;

		System.out.println(arr [0] [0]);       // 10
		System.out.println(arr [2] [1]);      // 60
		System.out.println(arr.length);      // 3
		System.out.println(arr [0].length); // 2

		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.println(arr [i] [j]);
			}	
		}
	}
}











