package Task1;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> first = new Vector<>();
        Vector<Integer> second =new Vector<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++)
            first.addElement(sc.nextInt());
        for (int i=0;i<5;i++)
            second.addElement(sc.nextInt());
        int k=0;
        while (k<106) {
            if  (first.get(0) < second.get(0) || (first.get(0)==9 && second.get(0)==0)) {
                second.addElement(second.get(0));
                second.addElement(first.get(0));
                first.remove(0);
                second.remove(0);
            }
            else {
                first.addElement(first.get(0));
                first.addElement(second.get(0));
                second.remove(0);
                first.remove(0);
            }
            
            k++;
            if (first.size()==0 || second.size()==0)
                break;
        }
        if (k==106)
            System.out.println("botva");
        else
        {
            if (first.size()==0)
                System.out.println("second "+k);
            else System.out.println("first "+k);
        }
    }
}
