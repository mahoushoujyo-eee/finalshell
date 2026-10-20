/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gl_2;
import java.awt.Rectangle;

/*
 * Renamed from com.gK
 */
public class gk_1
extends gl_2 {
    private int u = (int)e;
    private static final String c;
    private static final long e;

    public gk_1() {
        this.b = -1;
    }

    public void N(int n10) {
        this.u = n10;
    }

    public int v() {
        return this.u;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int[] nArray2 = new int[n10 * n11];
        String[] stringArray = W5.q();
        int n12 = 0;
        block0: while (true) {
            int n13 = n12;
            block1: while (n13 < this.W) {
                int n14 = 0;
                int n15 = n12;
                if (stringArray != null) {
                    if (n15 > 0) {
                        int[] nArray3 = nArray;
                        nArray = nArray2;
                        nArray2 = nArray3;
                    }
                    n15 = 0;
                }
                int n16 = n15;
                block2: while (true) {
                    int n17 = n16;
                    block3: while (n17 < n11) {
                        n13 = 0;
                        if (stringArray == null) continue block1;
                        int n18 = n13;
                        while (n18 < n10) {
                            block18: {
                                int n19;
                                block19: {
                                    gk_1 gk_12;
                                    block28: {
                                        block29: {
                                            int n20;
                                            int n21;
                                            block17: {
                                                n19 = nArray[n16 * n10 + n18];
                                                if (stringArray == null) break block18;
                                                n17 = this.F.v(n19) ? 1 : 0;
                                                if (stringArray == null) continue block3;
                                                if (n17 == 0) break block19;
                                                int n22 = 0;
                                                int n23 = -1;
                                                block5: while (true) {
                                                    int n24 = n23;
                                                    block6: while (n24 <= 1) {
                                                        block20: {
                                                            int n25;
                                                            int n26;
                                                            block21: {
                                                                int n27 = n16 + n23;
                                                                if (stringArray == null) continue block5;
                                                                n21 = 0;
                                                                n20 = n27;
                                                                if (stringArray == null) break block17;
                                                                if (n21 > n20) break block20;
                                                                n26 = n27;
                                                                n25 = n11;
                                                                if (stringArray == null) break block21;
                                                                if (n26 >= n25) break block20;
                                                                n26 = n27;
                                                                n25 = n10;
                                                            }
                                                            int n28 = n26 * n25;
                                                            int n29 = -1;
                                                            while (n29 <= 1) {
                                                                block27: {
                                                                    block24: {
                                                                        int n30;
                                                                        block26: {
                                                                            int n31;
                                                                            int n32;
                                                                            int n33;
                                                                            block25: {
                                                                                block22: {
                                                                                    block23: {
                                                                                        n33 = n18 + n29;
                                                                                        n24 = n23;
                                                                                        if (stringArray == null) continue block6;
                                                                                        if (stringArray == null) break block22;
                                                                                        if (n24 != 0) break block23;
                                                                                        n32 = n29;
                                                                                        if (stringArray == null) break block22;
                                                                                        if (n32 == 0) break block24;
                                                                                    }
                                                                                    n32 = 0;
                                                                                }
                                                                                n31 = n33;
                                                                                if (stringArray == null) break block25;
                                                                                if (n32 > n31) break block24;
                                                                                n32 = n33;
                                                                                if (stringArray == null) break block26;
                                                                                n31 = n10;
                                                                            }
                                                                            if (n32 >= n31) break block24;
                                                                            n32 = n30 = nArray[n28 + n33];
                                                                        }
                                                                        if (stringArray == null) break block27;
                                                                        if (!this.F.v(n30)) {
                                                                            ++n22;
                                                                        }
                                                                    }
                                                                    ++n29;
                                                                }
                                                                if (stringArray != null) continue;
                                                            }
                                                        }
                                                        ++n23;
                                                        if (stringArray != null) continue block5;
                                                    }
                                                    break;
                                                }
                                                n21 = n22;
                                                n20 = this.u;
                                            }
                                            if (n21 < n20) break block19;
                                            gk_12 = this;
                                            if (stringArray == null) break block28;
                                            if (gk_12.a == null) break block29;
                                            n19 = this.a.D((float)n12 / (float)this.W);
                                            if (stringArray != null) break block19;
                                        }
                                        gk_12 = this;
                                    }
                                    n19 = gk_12.b;
                                }
                                nArray2[n14++] = n19;
                                ++n18;
                            }
                            if (stringArray != null) continue;
                        }
                        ++n16;
                        if (stringArray != null) continue block2;
                    }
                    break;
                }
                ++n12;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return nArray2;
    }

    public String toString() {
        return c;
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
                char[] cArray3 = "\u0001j\u0011f\nIZ\u0006q\u0010c\u001d\u001e[m".toCharArray();
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
                            n17 = 104;
                            break;
                        }
                        case 1: {
                            n17 = 40;
                            break;
                        }
                        case 2: {
                            n17 = 84;
                            break;
                        }
                        case 3: {
                            n17 = 44;
                            break;
                        }
                        case 4: {
                            n17 = 83;
                            break;
                        }
                        case 5: {
                            n17 = 27;
                            break;
                        }
                        default: {
                            n17 = 94;
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
        c = new String(cArray).intern();
        long l2 = 2338073821720663398L;
        e = 0xE8CE4259D24CD564L ^ l2;
    }
}

