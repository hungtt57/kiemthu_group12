import java.util.Scanner;
public class thuasonguyento {
	public static int nhap()
    {
        Scanner sc = new Scanner(System.in);
       
        int n=0;
        
            System.out.println("");
           
            n=sc.nextInt();
            
     
        return n;
    }
    public static boolean prime(int n)
    {
        double m=Math.sqrt(n);
        if (n<2) return false;
        for (int i=2;i<= m;i++)       
            if(n%i==0) return false;
        return true;       
    }
    public static void phantich(int n)
    {
        //Dau tien cho i =2; kiem tra i co la snt, neu dung thi xem i co phai la thua so cua n ko, neu    dung in ra va lay n/i phan tich tiep. neu i ko la thua so tang i len 1, con neu i ko la snt thi cung tang i len 1
        int snt=0;
        int i=2;
        while(n>1)
        {               
            if(prime(i))
            {
                if(n%i==0)
                {
                System.out.print(i+".");
                n/=i;
                }
                else
                    i++;
            }
            else
                i++;
        }
    }
   
    public static void main(String[] args) {
        System.out.println("Nhap n");
        int n= nhap();
        System.out.println("Thua so nguyen to cua n la:");
        phantich(n);
       
    }

}
