/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NE;
import com.co_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.uv
 */
public class uv_0 {
    private String X = null;
    private boolean M = false;
    private boolean d = true;
    private Object u = null;
    private static final String a;

    public uv_0() {
    }

    public uv_0(Object object) {
        this.u = object;
    }

    public uv_0(Object object, boolean bl) {
        this.M = bl;
        this.u = object;
    }

    public String o() {
        String string = co_0.U();
        String string2 = this.X;
        if (string != null) {
            if (string2 == null) {
                this.X = NE.E(a);
            }
            string2 = this.X;
        }
        return string2;
    }

    public void O(String string) {
        this.X = string;
    }

    public Object g() {
        return this.u;
    }

    public void P(Object object) {
        this.u = object;
    }

    public boolean Z() {
        return this.M;
    }

    public void i(boolean bl) {
        this.M = bl;
    }

    public void B() {
        String string = co_0.U();
        boolean bl = this.Z();
        if (string != null) {
            bl = !bl;
        }
        this.i(bl);
    }

    public boolean B() {
        return this.d;
    }

    public void e(boolean bl) {
        this.d = bl;
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
                char[] cArray3 = "/Cr\u0016".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 64;
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
                            n17 = 44;
                            break;
                        }
                        case 1: {
                            n17 = 65;
                            break;
                        }
                        case 2: {
                            n17 = 113;
                            break;
                        }
                        case 3: {
                            n17 = 18;
                            break;
                        }
                        case 4: {
                            n17 = 93;
                            break;
                        }
                        case 5: {
                            n17 = 46;
                            break;
                        }
                        default: {
                            n17 = 78;
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

