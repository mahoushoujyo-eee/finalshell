/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.cr_0;
import org.h.x_0;

public class K
extends x_0 {
    private final short T;
    private static final String b;
    private static final long c;

    public K(short s2) {
        this.T = s2;
    }

    public short I() {
        return this.T;
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public void R(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte((int)c);
        dataOutputStream.writeShort(this.T);
    }

    public String toString() {
        return b + this.T + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        short s2 = object instanceof K;
        if (ky_2Array == null) {
            if (s2 == 0) return 0 != 0;
            s2 = ((K)object).T;
        }
        if (ky_2Array != null) return s2 != 0;
        if (s2 != this.T) return 0 != 0;
        return 1 != 0;
    }

    public int hashCode() {
        return this.T;
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
                char[] cArray3 = "y\u0015 xU1Bn\u0005#Nu\u0018c^\u000e\u0017[d/eT<\u0001\u0003".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 92;
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
                            n17 = 102;
                            break;
                        }
                        case 1: {
                            n17 = 6;
                            break;
                        }
                        case 2: {
                            n17 = 50;
                            break;
                        }
                        case 3: {
                            n17 = 119;
                            break;
                        }
                        case 4: {
                            n17 = 93;
                            break;
                        }
                        case 5: {
                            n17 = 44;
                            break;
                        }
                        default: {
                            n17 = 80;
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
        long l2 = 5379945406433504266L;
        c = 0x65E410CCCD76AC1AL ^ l2;
    }
}

