public class Array {
	public static void main(String[] args) {
		int d[][]= {
				{1,2,3,4},	  //Jagged Array	
				{5,6,7},
				{9,10,11,12}
		};
		
	//		for(i=0;i<d.length;i++)
	//		{
	//			for(j=0;j<d[i].length;j++)
	//			{
	//				System.out.print(" " + d[i][j]);
	//			}
	//			System.out.println();
	//		}
		 		//Enhaned For Loop
		for(int i[] :d)
		{
			for(int j:i)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}	

public class Enhanced_for_loop {
static int i;
public static void main(String[] args) {
int a[]={1,3,4,7};

		//print all elements in array		
//		for(i=0;i<4;i++)
//		{
//			System.out.println(a[i]);
//		}
			//Enhanced For Loop	
		for(int j: a)
		{
			System.out.print(" "+j);
		}
	}
}
