package lesson9;

public class lesson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Simple Loop");
		for(int i=10; i>1; i--){
            System.out.println("The value of i is: "+i);
       }
		
		System.out.println("\nInfinite Loop (Not Displayed)");
		/* Not ran - infinite loop 
		for(int i=1; i>=1; i++){
            System.out.println("The value of i is: "+i);
       } */
		
		
		System.out.println("\nLoop thru Array");
		int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
        }
        
        System.out.println("\nEnhanced For Loop");
        int arr2[]={2,11,45,9};
        for (int num : arr2) {
           System.out.println(num);
        }
        
        System.out.println("\nEnhanced For Loop with Strings");
        String arr3[]={"hi","hello","bye"};
        for (String str : arr3) {
                 System.out.println(str);
        }
	}

}
