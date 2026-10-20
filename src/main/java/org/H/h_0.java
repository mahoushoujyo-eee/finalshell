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
 * Renamed from org.H.h
 */
class h_0
extends n_0 {
    private final float o;
    private static final String b;

    h_0(float f10) {
        this.o = f10;
    }

    @Override
    public Object w(cr_0 cr_02) {
        return Float.valueOf(this.o);
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public void R(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(4);
        dataOutputStream.writeFloat(this.o);
    }

    public String toString() {
        return b + this.o + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        boolean bl = object instanceof h_0;
        if (ky_2Array == null) {
            if (!bl) return false;
            float f10 = ((h_0)object).o - this.o;
            bl = f10 == 0.0f ? (byte)0 : (f10 > 0.0f ? (byte)1 : -1);
        }
        if (ky_2Array != null) return bl;
        if (bl) return false;
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.o);
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
                char[] cArray3 = "Yl\u0019\u001a\u000fa\fN|\u0011%4A6EJ9/4\b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 49;
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
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 18;
                            break;
                        }
                        case 2: {
                            n17 = 102;
                            break;
                        }
                        case 3: {
                            n17 = 120;
                            break;
                        }
                        case 4: {
                            n17 = 106;
                            break;
                        }
                        case 5: {
                            n17 = 17;
                            break;
                        }
                        default: {
                            n17 = 115;
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

