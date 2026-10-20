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

class D
extends n_0 {
    private final long Y;
    private static final String b;
    private static final long c;

    D(long l2) {
        this.Y = l2;
    }

    @Override
    public Object w(cr_0 cr_02) {
        return this.Y;
    }

    @Override
    public boolean x() {
        return true;
    }

    @Override
    public void R(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeLong(this.Y);
    }

    public String toString() {
        return b + this.Y + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        boolean bl = object instanceof D;
        if (ky_2Array == null) {
            if (!bl) return false;
            long l2 = ((D)object).Y - this.Y;
            bl = l2 == 0L ? (short)0 : (l2 < 0L ? (short)-1 : 1);
        }
        if (ky_2Array != null) return bl;
        if (bl) return false;
        return true;
    }

    public int hashCode() {
        return (int)this.Y ^ (int)(this.Y >> (int)c);
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
                char[] cArray3 = "Y`\u0003eD\u0017hNp\u0001Y~1ysA+Y8".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 43;
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
                            n17 = 49;
                            break;
                        }
                        case 1: {
                            n17 = 4;
                            break;
                        }
                        case 2: {
                            n17 = 102;
                            break;
                        }
                        case 3: {
                            n17 = 29;
                            break;
                        }
                        case 4: {
                            n17 = 59;
                            break;
                        }
                        case 5: {
                            n17 = 125;
                            break;
                        }
                        default: {
                            n17 = 13;
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
        long l2 = 8189478931869889445L;
        c = 0x9D998E13E5A67385L ^ l2;
    }
}

