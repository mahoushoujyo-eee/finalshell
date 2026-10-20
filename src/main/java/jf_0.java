/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

/*
 * Renamed from Jf
 */
public final class jf_0
implements Serializable {
    private static final long serialVersionUID;
    private final int N;
    private final int B;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    public jf_0(int n10, int n11) {
        this.N = n10;
        this.B = n11;
    }

    public int c() {
        return this.N;
    }

    public long C() {
        return jf_0.b(3063, 692935253010402899L) & (long)this.N;
    }

    public int R() {
        return this.B;
    }

    public long y() {
        return jf_0.b(25509, 7557129819398219264L) & (long)this.B;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] stringArray = li_0.I();
        if (object == this) {
            return true;
        }
        Object object2 = this.getClass();
        if (stringArray == null) {
            if (!((Class)object2).isInstance(object)) {
                return false;
            }
            object2 = object;
        }
        jf_0 jf_02 = (jf_0)object2;
        int n10 = this.N;
        if (stringArray != null) return n10 != 0;
        if (n10 != jf_02.N) return 0 != 0;
        n10 = this.B;
        if (stringArray != null) return n10 != 0;
        if (n10 != jf_02.B) return 0 != 0;
        return true;
    }

    public int hashCode() {
        int n10 = jf_0.a(20492, 5162799049580820300L);
        n10 = jf_0.a(13871, 870413273746624876L) * n10 + this.N;
        n10 = jf_0.a(28584, 3462549945706121450L) * n10 + this.B;
        return n10;
    }

    static int s(jf_0 jf_02) {
        return jf_02.N;
    }

    static int v(jf_0 jf_02) {
        return jf_02.B;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6130841477873745254L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "m\u00f5\u00f0Y\u00e49\u00b5\u0093\u0013\u00b1\u00aa+\u00ab\u0096\u00ec\u0015\u00d5<\u00bce\u00aa\u0018\n;";
        int n11 = "m\u00f5\u00f0Y\u00e49\u00b5\u0093\u0013\u00b1\u00aa+\u00ab\u0096\u00ec\u0015\u00d5<\u00bce\u00aa\u0018\n;".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
        long l3 = 959595619127353271L;
        long[] lArray2 = new long[3];
        int n14 = 0;
        String string2 = "e\u00b1z\u00a9_Z\u0086H\u0004\u00cc\u00e7\u00d1\u00a1\u00e3n\u001b\u0010\u00eb\n\u00fd\u0007\u00ca\u00cfE";
        int n15 = "e\u00b1z\u00a9_Z\u0086H\u0004\u00cc\u00e7\u00d1\u00a1\u00e3n\u001b\u0010\u00eb\n\u00fd\u0007\u00ca\u00cfE".length();
        int n16 = 0;
        do {
            byte[] byArray = string2.substring(n16, n16 += 8).getBytes("ISO-8859-1");
            int n17 = n14++;
            lArray2[n17] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l3;
        } while (n16 < n15);
        c = lArray2;
        d = new Long[3];
        serialVersionUID = jf_0.b(2187, 959991092719406380L);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6742;
        if (b[n11] == null) {
            jf_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x45A5) & Short.MAX_VALUE;
        if (d[n11] == null) {
            jf_0.d[n11] = c[n11] ^ l2;
        }
        return d[n11];
    }
}

