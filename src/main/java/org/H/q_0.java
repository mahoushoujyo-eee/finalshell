/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.cr_0;
import org.h.n_0;

/*
 * Renamed from org.H.q
 */
class q_0
extends n_0 {
    private final short Z;
    private static final String b;
    private static final long c;

    q_0(short s2) {
        this.Z = s2;
    }

    @Override
    public Object w(cr_0 cr_02) {
        return cr_02.S(this.Z);
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public void R(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte((int)c);
        dataOutputStream.writeShort(this.Z);
    }

    public String toString() {
        return b + this.Z + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        short s2 = object instanceof q_0;
        if (ky_2Array == null) {
            if (s2 == 0) return 0 != 0;
            s2 = ((q_0)object).Z;
        }
        if (ky_2Array != null) return s2 != 0;
        if (s2 != this.Z) return 0 != 0;
        return 1 != 0;
    }

    public int hashCode() {
        return this.Z;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "e\be\\\u0015\u0017Xr\u0018x{3?xA\u0018Ba'9>".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 102;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 64;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 77;
                            break;
                        }
                        case 3: {
                            n17 = 105;
                            break;
                        }
                        case 4: {
                            n17 = 39;
                            break;
                        }
                        case 5: {
                            n17 = 48;
                            break;
                        }
                        default: {
                            n17 = 112;
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
        b = new String(cArray).intern();
        long l2 = 4245736875692699010L;
        c = 0xBA94EC5D8D70AD8AL ^ l2;
    }
}

