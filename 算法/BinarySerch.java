import java.util.Scanner;

public class BinarySerch {
    /*
     * 二分法查找
     */
  static int[] bin = { 4, 6, 11, 18, 22, 25, 29, 35, 38, 40, 44, 49 };
    
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println(Binary(bin, Integer.parseInt(sc.next())));
    }

    public static int Binary(int[] binary,int Target)
    {
        int a=0;
        int b=binary.length-1;
        while(a<=b)
        {
         int c=(a+b)/2; 
        if(binary[c]>Target)
        {
        b=c-1;
        }
        else if(binary[c]<Target){
         a=c+1;
  
        }
        else{
            return c;
        }
      
    }
    return -1;
    }
}
