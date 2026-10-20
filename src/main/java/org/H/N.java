/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.cr_0;
import org.h.n_0;

class N
extends n_0 {
    private final int F;
    private static final String b;

    N(int n10) {
        this.F = n10;
    }

    @Override
    public Object w(cr_0 cr_02) {
        return this.F;
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public void R(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeInt(this.F);
    }

    public String toString() {
        return b + this.F + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        int n10 = object instanceof N;
        if (ky_2Array == null) {
            if (n10 == 0) return 0 != 0;
            n10 = ((N)object).F;
        }
        if (ky_2Array != null) return n10 != 0;
        if (n10 != this.F) return 0 != 0;
        return 1 != 0;
    }

    public int hashCode() {
        return this.F;
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
                char[] cArray3 = "\u001d[!:%|S\nK&\u0007\u0005Xz;f0\u0000\u001f[rv".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 14;
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
                            n17 = 80;
                            break;
                        }
                        case 1: {
                            n17 = 26;
                            break;
                        }
                        case 2: {
                            n17 = 97;
                            break;
                        }
                        case 3: {
                            n17 = 103;
                            break;
                        }
                        case 4: {
                            n17 = 127;
                            break;
                        }
                        case 5: {
                            n17 = 51;
                            break;
                        }
                        default: {
                            n17 = 19;
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
    }
}

