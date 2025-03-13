package week04;

public class ngaytrongthang{
    public static int SoNgay(int thang, int nam){
       switch(thang){
           case 4:
           case 6:
           case 9:
           case 11:
               return 30;
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               return 31;
           case 2:
               if (nam%400 ==0 || (nam % 4 ==0 && nam%100 != 0)){
                   return 29;
               } else {
                   return 28;
               }
           default:return 0;
       }
    }
    
    public static void main(String args[]){
       int thang = Integer.parseInt(args[0]);
       int nam = Integer.parseInt(args[1]);
       int SoNgay = SoNgay(thang,nam);
       if (SoNgay == 0){
           System.out.println("Incorrect!");
       } else {
           System.out.println ( SoNgay ); 
       }
        
    }
   
}