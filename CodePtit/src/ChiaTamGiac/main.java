package ChiaTamGiac;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t!=0){
            t-=1;
            int n= input.nextInt();
            int h= input.nextInt();
            for(int i=1; i<n ; i++){
                System.out.print(String.format("%.6f",h*Math.sqrt((double)i/n))+" ");
            }
             System.out.println();
        }    
    }
}
