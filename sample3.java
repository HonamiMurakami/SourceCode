package evenodd;

import java.io.*;

class sample3 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val, sumodd=0, sumeven=0;

System.out.println("入力された整数は偶数・奇数ごとに足されます");
System.out.print("整数(0以下で終了):");
val = Integer.parseInt(br.readLine());


while (val>0) {
if (val%2==0) { sumeven=sumeven+val;}
else { sumodd=sumodd+val;}

System.out.print("0以下で終了:");
val = Integer.parseInt(br.readLine());

}

System.out.println("入力された奇数の和は"+sumodd+"で、偶数の和は"+sumeven+"です");


    }
}