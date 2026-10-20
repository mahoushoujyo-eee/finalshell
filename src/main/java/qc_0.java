/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qc
 */
public class qc_0 {
    public static int o;
    public static int S;
    public static int Q;
    public static int i;
    public static int Y;
    private static int[] P;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2551852965088746637L;
        long[] lArray = new long[3];
        int n10 = 0;
        qc_0.w(new int[2]);
        String string = "\u001e\u00d3\u001e\u00a7\u00a0\u00db\u00a3s\u00b3\u00dfW\u0089\u00a0\u00db\u00a3p\u00c8qs\u00a4\u00a0\u00db\u00a3q";
        int n11 = "\u001e\u00d3\u001e\u00a7\u00a0\u00db\u00a3s\u00b3\u00dfW\u0089\u00a0\u00db\u00a3p\u00c8qs\u00a4\u00a0\u00db\u00a3q".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        o = -1;
        S = 1;
        Q = (int)lArray[1];
        i = (int)lArray[0];
        Y = (int)lArray[2];
    }

    public static void w(int[] nArray) {
        P = nArray;
    }

    public static int[] c() {
        return P;
    }
}

