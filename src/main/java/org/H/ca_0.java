/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.cr_0;
import org.h.y_0;

/*
 * Renamed from org.H.Ca
 */
public class ca_0
implements y_0 {
    public short o;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public ca_0(short s2) {
        this.o = s2;
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void H(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(ca_0.a(6759, 7220736768803525082L));
        dataOutputStream.writeShort(this.o);
    }

    public String toString() {
        return a + this.o + ")";
    }

    public int hashCode() {
        return ca_0.a(12392, 6009473756921199572L) ^ this.o;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        short s2 = object instanceof ca_0;
        if (ky_2Array == null) {
            if (s2 == 0) return 0 != 0;
            s2 = ((ca_0)object).o;
        }
        if (ky_2Array != null) return s2 != 0;
        if (s2 != this.o) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\u0004\u001fPX<e\b\u0010\u001dPL0uI\u001e\u0017_E0e\\".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 28;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 109;
                            break;
                        }
                        case 1: {
                            n17 = 109;
                            break;
                        }
                        case 2: {
                            n17 = 37;
                            break;
                        }
                        case 3: {
                            n17 = 42;
                            break;
                        }
                        case 4: {
                            n17 = 73;
                            break;
                        }
                        case 5: {
                            n17 = 13;
                            break;
                        }
                        default: {
                            n17 = 125;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 3530073096401707280L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u008d&\u00c7\u0085\u00f6~\u001a\u00cc\u00111XD\u00a7\r0\u00c2";
        int n19 = "\u008d&\u00c7\u0085\u00f6~\u001a\u00cc\u00111XD\u00a7\r0\u00c2".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4BBC;
        if (c[n11] == null) {
            ca_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

