package loop;

import java.io.*;
public class sample2 {
public static void main(String args[]) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int i, j, dan, na, ns;

    System.out.print("段数：");
    dan = Integer.parseInt(br.readLine());

ns=dan-1;
na=1;

    for (i=1; i<=dan; i++) { 
    for (j=1; j<=ns; j++) {
    System.out.print(" "); }

    for (j=1; j<=na; j++) {
    System.out.print("*"); }

    System.out.println();
    ns=ns-1;
    na=na+2;
    }

}
}