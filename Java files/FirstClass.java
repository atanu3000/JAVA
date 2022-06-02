import javax.sound.sampled.SourceDataLine;

class firstClass {
    public static void main(String[] args){
        //variables
     int a = 10;
     int b = 5;
     //int sum = a + b;
     //System.out.println(sum);
     //float div = a / b;
     //System.out.println(div);
     int ans1 = a * b / a - b;
     int ans2 = (a*b) / (a-b);
     System.out.println("ans = " + ans1);
     System.out.println("ans = " + ans2);
    }
}