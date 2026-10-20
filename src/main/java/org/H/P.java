/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.H.C_;
import org.H.Y;
import org.h.cr_0;
import org.h.v_0;
import org.h.w_0;

public class P
implements w_0 {
    private final short s;
    private final short y;
    private final short U;
    private final List E;
    final cr_0 A;
    private static final String a;

    public P(cr_0 cr_02, short s2, short s3, short s4, List list) {
        this.A = cr_02;
        this.s = s2;
        this.y = s3;
        this.U = s4;
        this.E = list;
    }

    public cr_0 x() {
        return this.A;
    }

    public short D() {
        return this.s;
    }

    @Override
    public v_0[] R(boolean bl) {
        C_ c_ = cr_0.Z(this.A, bl, this.E);
        ky_2[] ky_2Array = cr_0.q();
        C_ c_2 = c_;
        if (ky_2Array == null) {
            if (c_2 == null) {
                return new v_0[0];
            }
            c_2 = c_;
        }
        return C_.j(c_2).toArray(new v_0[C_.j(c_).size()]);
    }

    public String s() {
        return this.A.S(this.y);
    }

    public String q() {
        return this.A.S(this.U);
    }

    public Y[] i() {
        return this.E.toArray(new Y[this.E.size()]);
    }

    public void m(Y y2) {
        this.E.add(y2);
    }

    @Override
    public void t(boolean bl, String string, Map map) {
        cr_0.q(this.A, bl, string, map, this.E);
    }

    public void i(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.s);
        dataOutputStream.writeShort(this.y);
        dataOutputStream.writeShort(this.U);
        cr_0.m(dataOutputStream, this.E);
    }

    public String toString() {
        try {
            return this.A + "." + this.A.S(this.y) + a;
        }
        catch (Exception exception) {
            return super.toString();
        }
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
                char[] cArray3 = "$YGO\u0019".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 106;
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
                            n17 = 29;
                            break;
                        }
                        case 2: {
                            n17 = 3;
                            break;
                        }
                        case 3: {
                            n17 = 11;
                            break;
                        }
                        case 4: {
                            n17 = 90;
                            break;
                        }
                        case 5: {
                            n17 = 38;
                            break;
                        }
                        default: {
                            n17 = 73;
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
    }
}

