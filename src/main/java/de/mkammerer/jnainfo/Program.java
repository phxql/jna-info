package de.mkammerer.jnainfo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.PlatformExt;

public class Program {
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary) Native.loadLibrary(Platform.isWindows() ? "msvcrt" : "c", CLibrary.class);

        void printf(String format, Object... args);
    }

    public static void main(String[] args) {
        String nativeLibraryResourcePrefix = PlatformExt.getNativeLibraryResourcePrefix();
        System.out.println("nativeLibraryResourcePrefix: " + nativeLibraryResourcePrefix);

        System.out.print("Testing JNA... ");
        CLibrary.INSTANCE.printf("success\n");
    }
}
