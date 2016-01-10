package com.sun.jna;

public final class PlatformExt {
    private PlatformExt() {
    }

    public static String getNativeLibraryResourcePrefix() {
        return Platform.getNativeLibraryResourcePrefix();
    }
}
