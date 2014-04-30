package p0418;
/**
 * 
 * Ë®ÏÉ»¨Êý×Ö
 * */
public class WaterFlower {

	public static void main(String[] args) {
int x = 0;
int y = 0;
int z = 0;
int count = 100;

for ( x = 0; x < count; x++) {
	for ( y = 0; y < count; y++) {
		for ( z= 0; z < count; z++) {
			String s1 = String.valueOf(x);
			String s2= String.valueOf(y);
			String s3= String.valueOf(z);
			
			int temp1 =Integer.valueOf(s1+s2+s3);
			int temp2 =  (x*x*x)+(y*y*y)+(z*z*z);
			if(temp1==temp2){
				
				System.out.println(temp1+"="+temp2);
				
			}
			
		}
		
	}
	
}


	}

}
