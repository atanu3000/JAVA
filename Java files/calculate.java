import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

 class cal{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        
        int r = sc.nextInt();
        double pi = 3.142, area;
        
       area = pi*r*r;
       System.out.println(area);
    }