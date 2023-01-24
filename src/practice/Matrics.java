package practice;

public class Matrics {
	public static void main(String[] args) {
		
	
	int a[][]= {{1,2,3,4,5},
			    {6,7,8,9,10},
			    {11,12,13,14,15}};
	int row=a.length;
	int col=a[0].length;
	int highest=0;
	for(int i=0;i<col;i++) {
		int sum=0;
		
			for(int j=0;j<row;j++) {
				
					sum=sum+a[j][i];
				}
				System.out.println("sum of"+ (i+1) + " colmun" + sum);
					
				
           if(highest<sum) 
           {
	         highest =sum;
	}
          
				
			
				
			}
	System.out.println("the highest value is" + highest);
		}
}
		
	
	


