/*
 * Decompiled with CFR 0.152.
 */
class DB {
    static final int[] t;
    static final int[] X;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 5073275504973760296L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u001a\u009e\u00ca*A\u00a6\u00c7.\u00bd\u0014L\u00e5A\u00a6\u00c7 \u00da\u00b4\t\u0007A\u00a6\u00c7/";
        int n11 = "\u001a\u009e\u00ca*A\u00a6\u00c7.\u00bd\u0014L\u00e5A\u00a6\u00c7 \u00da\u00b4\t\u0007A\u00a6\u00c7/".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        X = new int[mR.values().length];
        try {
            DB.X[mR.NOTHING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.X[mR.FILENAME.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.X[mR.DATA.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        t = new int[x9.values().length];
        try {
            DB.t[x9.ZRQINIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZFILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZEOF.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZDATA.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZFIN.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZCRCW.ordinal()] = (int)lArray[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZCRCQ.ordinal()] = (int)lArray[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            DB.t[x9.ZCRCE.ordinal()] = (int)lArray[1];
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

