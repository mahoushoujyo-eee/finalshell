/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from tg
 */
public class tg_2 {
    BitSet z = new BitSet();
    byte[] L;
    final byte[] q = new byte[tg_2.a(3802, 6281936704835585668L)];
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    public tg_2() {
        super();
        var2_1 = 0;
        var1_2 = D6.k();
        if (var1_2 == null) ** GOTO lbl11
        block0: while (true) {
            this.q[var2_1] = (byte)var2_1;
            do {
                ++var2_1;
lbl11:
                // 2 sources

                if (var2_1 < tg_2.a(3802, 6281936704835585668L)) continue block0;
            } while (var1_2 != null);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public BitSet L(byte[] var1_1) {
        var3_2 = var1_1.length * tg_2.a(3802, 6281936704835585668L);
        var4_3 = 0;
        var2_4 = D6.k();
        if (var2_4 == null) ** GOTO lbl11
        block0: while (true) {
            if ((var1_1[var1_1.length - var4_3 / tg_2.a(3802, 6281936704835585668L) - 1] & 1 << var4_3 % tg_2.a(3802, 6281936704835585668L)) <= 0) ** GOTO lbl10
            v0 = this.z;
            do {
                v0.set(var4_3);
lbl10:
                // 2 sources

                ++var4_3;
lbl11:
                // 2 sources

                if (var4_3 < var3_2) continue block0;
                v0 = this.z;
            } while (var2_4 != null);
            break;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public byte[] W(BitSet var1_1) {
        this.L = new byte[(var1_1.length() - 1) / tg_2.a(30324, 5771980612310793771L) + 1];
        var2_2 = D6.k();
        var3_3 = 0;
        if (var2_2 == null) ** GOTO lbl12
        block0: while (true) {
            if (!var1_1.get(var3_3)) ** GOTO lbl11
            v0 = this.L;
            do {
                v1 = this.L.length - var3_3 / tg_2.a(3802, 6281936704835585668L) - 1;
                v0[v1] = (byte)(v0[v1] | 1 << var3_3 % tg_2.a(3802, 6281936704835585668L));
lbl11:
                // 2 sources

                ++var3_3;
lbl12:
                // 2 sources

                if (var3_3 <= var1_1.length()) continue block0;
                v0 = this.L;
            } while (var2_2 != null);
            break;
        }
        return v0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8611907180123588934L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00c1&\u00f4\u00f0\u00b4\u00d1\u008f\u00ca\u00f3\u00fc\u00cd\u009e\u00ca\u00de\u00f7e";
        int n11 = "\u00c1&\u00f4\u00f0\u00b4\u00d1\u008f\u00ca\u00f3\u00fc\u00cd\u009e\u00ca\u00de\u00f7e".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x85E;
        if (b[n11] == null) {
            tg_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

