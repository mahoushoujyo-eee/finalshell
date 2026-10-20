/*
 * Decompiled with CFR 0.152.
 */
class C0 {
    static final int[] k = new int[gV.values().length];

    static {
        try {
            C0.k[gV.HEADER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C0.k[gV.DATA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            C0.k[gV.CANCEL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

