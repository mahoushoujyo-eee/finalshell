/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from uJ
 */
public class uj_1 {
    private static final long a;

    public static int G(int[] nArray) {
        int n10;
        block3: {
            int n11 = (int)a;
            int[] nArray2 = nArray;
            int n12 = nArray2.length;
            int n13 = D5.e();
            for (int i2 = 0; i2 < n12; ++i2) {
                int n14;
                n10 = n14 = nArray2[i2];
                if (n13 == 0) {
                    int n15;
                    if (n13 == 0) {
                        n15 = n10 < n11 ? n14 : n11;
                    }
                    n11 = n15;
                    if (n13 == 0) continue;
                }
                break block3;
            }
            n10 = n11;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3844962900489249930L;
        a = 0xEED221DC8DC85B75L ^ l2;
    }
}

