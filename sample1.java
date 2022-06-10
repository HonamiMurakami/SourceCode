package test;

import java.io.*;
public class sample1 {
public static void main(String args[]) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int anata, com;

    System.out.println("グー:1");
    System.out.println("チョキ:2");
    System.out.println("パー:3");
    System.out.print("あなたの手:");    
    anata = Integer.parseInt(br.readLine());

    com=(int)(Math.random()*3)+1;
    System.out.print("コンピューターの手は");
        if (com==1) {
        System.out.println("グーです");
        } else if (com==2) {
        System.out.println("チョキです");
        } else  { System.out.println("パーです");}

    if( (anata==1 && com==2) ||
        (anata==2 && com==3) ||
        (anata==3 && com==1) )
{
    System.out.println("あなたの勝ちです");
}

else if((anata==1 && com==3) ||
        (anata==2 && com==1) ||
        (anata==3 && com==2) )
{
    System.out.println("あなたの負けです");
}

else{
    System.out.println("引き分けです");
}

}
}
