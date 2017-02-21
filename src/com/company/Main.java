package com.company;

import java.util.Scanner;

        import com.sun.org.apache.xpath.internal.SourceTree;

        import javax.xml.bind.SchemaOutputResolver;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>0) x=x-2; if (x<0)
            x=x+1; if(x==0) x=10;
        System.out.print(x);

    }

}
