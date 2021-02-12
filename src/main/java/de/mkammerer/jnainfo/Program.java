package de.mkammerer.jnainfo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Program {
    public interface CLibrary extends Library {
        void printf(String format, Object... args);
    }

    public static void main(String[] args) {
        System.out.println("JNA version: " + Native.VERSION);
        System.out.println("Prefix: " + Platform.RESOURCE_PREFIX);
        System.out.println("Arch: " + Platform.ARCH);
        System.out.println();


        System.out.print("Testing JNA... ");
        CLibrary instance = Native.load(Platform.C_LIBRARY_NAME, CLibrary.class);
        instance.printf("success\n");
    }
}
