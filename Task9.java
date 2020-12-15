import java.util.Scanner;
public class Task9 {
  public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the current day of week(For Monday Enter 1, Tuesday, Enter 2 and so on):");
      int i=obj.nextInt();
      System.out.println("Enter the no. of days from today:");
      int j=obj.nextInt();
       int k=(i+j);
           if(k>7 && k>0)
                 {
             do{
                k=k-7;
               }while(k>7);

                 }
             else if(k<=0)
             {   
                 do{
                     k=k+7;
                }while(k<0);

             }    
      switch(k)
       {
          case 1:System.out.println("Its a Monday");
                 break;
          case 2:System.out.println("Its a Tuesday");
                 break;
          case 3:System.out.println("Its a Wednesday");
                 break;
          case 4:System.out.println("Its a Thursday");
                 break;
          case 5:System.out.println("Its a Friday");
                 break;
          case 6:System.out.println("Its a Saturday");
                 break;
          case 7:System.out.println("Its a Sunday");
                 break;       
      }  
    }
    
}
