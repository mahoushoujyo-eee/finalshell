/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fK
 */
class fk_1 {
    static final int[] s = new int[ks_0.values().length];

    static {
        try {
            fk_1.s[ks_0.Little.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            fk_1.s[ks_0.Big.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

