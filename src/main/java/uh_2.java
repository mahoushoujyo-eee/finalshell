/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from uh
 */
class uh_2 {
    static final int[] y = new int[DZ.values().length];

    static {
        try {
            uh_2.y[DZ.CRC16.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uh_2.y[DZ.CRC32.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

