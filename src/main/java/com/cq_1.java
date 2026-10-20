/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GQ;
import com.cb_1;

/*
 * Renamed from com.cQ
 */
public class cq_1
extends cb_1 {
    protected String v;
    protected GQ h;
    protected long k;
    private static final String d;

    public cq_1(String string, GQ gQ2) {
        this.v = string;
        this.h = gQ2;
        this.k = 0L;
    }

    public String w() {
        return this.v;
    }

    public void v(String string) {
        this.v = string;
    }

    public GQ K() {
        return this.h;
    }

    public void t(GQ gQ2) {
        this.h = gQ2;
    }

    public long J() {
        return this.k;
    }

    public void v(long l2) {
        this.k = l2;
    }

    @Override
    public String toString() {
        return this.v + d + (Object)((Object)this.h) + ")";
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
                char[] cArray3 = "b2".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 45;
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
                            n17 = 111;
                            break;
                        }
                        case 1: {
                            n17 = 55;
                            break;
                        }
                        case 2: {
                            n17 = 14;
                            break;
                        }
                        case 3: {
                            n17 = 125;
                            break;
                        }
                        case 4: {
                            n17 = 76;
                            break;
                        }
                        case 5: {
                            n17 = 11;
                            break;
                        }
                        default: {
                            n17 = 27;
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
        d = new String(cArray).intern();
    }
}

