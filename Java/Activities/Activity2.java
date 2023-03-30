package activities;

public class Activity2 {
    public static void main(String[] args){
        int searchnum = 10;
        int total = 0;
        int[] num1 = {10, 77, 10, 54, -11, 10};
        for(int i = 0 ; i<num1.length;i++){
            if(searchnum == num1[i]){
                total += searchnum;
            }
            if(total>=30){
                break;
            }
        }
        System.out.println("Total is " + total);
    }

}
