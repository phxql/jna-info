package de.mkammerer.jnainfo;

import com.sun.jna.PlatformExt;

public class Program {
    public static void main(String[] args) {
        String nativeLibraryResourcePrefix = PlatformExt.getNativeLibraryResourcePrefix();

        System.out.println("nativeLibraryResourcePrefix: " + nativeLibraryResourcePrefix);
    }
}
