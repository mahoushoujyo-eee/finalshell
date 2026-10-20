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
import org.v.f0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.H.i
 */
public class i_0
implements y_0 {
    private final short d;
    private final String O;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public i_0(short s2, String string) {
        this.d = s2;
        this.O = string;
    }

    public short u() {
        return this.d;
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void H(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(i_0.a(14614, 5936983898525165716L));
        dataOutputStream.writeShort(this.d);
    }

    public String toString() {
        return a + f0.g(this.O) + ")";
    }

    public int hashCode() {
        return i_0.a(21923, 7357644270459913248L) ^ this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        short s2 = object instanceof i_0;
        if (ky_2Array == null) {
            if (s2 == 0) return 0 != 0;
            s2 = ((i_0)object).d;
        }
        if (ky_2Array != null) return s2 != 0;
        if (s2 != this.d) return 0 != 0;
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
                char[] cArray3 = "\b\u001b`T<T\u0013".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 89;
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
                            n17 = 62;
                            break;
                        }
                        case 1: {
                            n17 = 32;
                            break;
                        }
                        case 2: {
                            n17 = 83;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 6;
                            break;
                        }
                        case 5: {
                            n17 = 121;
                            break;
                        }
                        default: {
                            n17 = 98;
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
        long l2 = 8711694478361099077L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00bc\u0082w\u0003\u00f2\u0002\u007fb\u00fa\u0014P\u0088\u00c2\u00bf\u0093\u00d6";
        int n19 = "\u00bc\u0082w\u0003\u00f2\u0002\u007fb\u00fa\u0014P\u0088\u00c2\u00bf\u0093\u00d6".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5183;
        if (c[n11] == null) {
            i_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

