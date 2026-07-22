package client;

import testpackage.foundation;

public class AccessModifierTest {

    public static void main(String[] args) {
        foundation f = new foundation();

        System.out.println("Accessing foundation from package 'client' (a different, non-subclass package):");
        System.out.println();

        System.out.println("var4 (public) = " + f.var4);

        System.out.println();
        System.out.println("The following are NOT accessible here and would cause compile errors:");
        System.out.println("  f.var1 -> private   : visible only inside foundation");
        System.out.println("  f.var2 -> default    : visible only within package 'testpackage'");
        System.out.println("  f.var3 -> protected  : needs same package or a subclass");
        System.out.println();

        f.showAll();
    }
}
