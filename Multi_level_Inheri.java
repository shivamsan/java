package com.code;

class A{
    int a;
    void set_a(int i)
    {
        a=i;
    }
    void show_a()
    {
        System.out.println("The value of a =" +a);
    }
}

class B extends A{
    int b;
    void set_b(int i)
    {
        b=i;
    }
    void show_b()
    {
        System.out.println("The value of b =" +b);
    }
}

class C extends B{
    int c;
    void set_c(int i)
    {
        c=i;
    }
    void show_c()
    {
        System.out.println("The value of c =" +c);
    }

    void multi()
    {
    
            int ans;
            ans =a*b*c;
            System.out.println("The value of ans =" + ans);
        
    }
}
public class Multi_level_Inheri {
    public static void main(String[] args) {
        C objC = new C();
        objC.set_a(10);
        objC.set_b(20);
        objC.set_c(30);
        objC.show_a();
        objC.show_b();
        objC.show_c();
        objC.multi();
    }
    
}
