/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.j_0;
import java.util.Iterator;

/*
 * Renamed from com.ww
 */
class ww_2
implements Iterator {
    private int p;
    final j_0 E;
    private static final String a;

    ww_2(j_0 j_02) {
        this.E = j_02;
        this.p = j_0.C(this.E);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasNext() {
        int n10;
        int n11;
        block6: {
            boolean bl = j_0.P();
            try {
                try {
                    try {
                        n11 = this.p;
                        n10 = j_0.j(this.E).length;
                        if (bl) break block6;
                        if (n11 >= n10) return 0 != 0;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ww_2.a(illegalStateException);
                    }
                    n11 = this.p;
                    if (bl) return n11 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ww_2.a(illegalStateException);
                }
                n10 = j_0.C(this.E) + j_0.a(this.E);
            }
            catch (IllegalStateException illegalStateException) {
                throw ww_2.a(illegalStateException);
            }
        }
        if (n11 >= n10) return 0 != 0;
        return 1 != 0;
    }

    public Character k() {
        return Character.valueOf(j_0.j(this.E)[this.p]);
    }

    @Override
    public void remove() {
        throw new IllegalStateException(a);
    }

    public Object next() {
        return this.k();
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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
                char[] cArray3 = "\u000eAq?SG/(MpnBG;?Or8E\u0012;+Em".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 47;
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
                            n17 = 98;
                            break;
                        }
                        case 1: {
                            n17 = 15;
                            break;
                        }
                        case 2: {
                            n17 = 48;
                            break;
                        }
                        case 3: {
                            n17 = 55;
                            break;
                        }
                        case 4: {
                            n17 = 8;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 114;
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

