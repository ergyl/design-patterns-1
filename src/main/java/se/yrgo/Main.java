package se.yrgo;

import se.yrgo.singleton.EnumRootUser;
import se.yrgo.singleton.LazyRootUser;
import se.yrgo.singleton.StaticRootUser;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lazy: " + LazyRootUser.getInstance().toString());
        System.out.println("Static: " + StaticRootUser.getInstance().toString());
        System.out.println("Enum: " + EnumRootUser.INSTANCE.toString());
    }
}
