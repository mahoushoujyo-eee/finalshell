/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gl_2;
import java.awt.Rectangle;

/*
 * Renamed from com.gO
 */
public class go_1
extends gl_2 {
    private static final String c;
    private static final long e;

    public go_1() {
        this.b = -1;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        String[] stringArray = W5.q();
        int[] nArray2 = new int[n10 * n11];
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            block1: while (n14 < n11) {
                int n15 = 0;
                while (n15 < n10) {
                    block14: {
                        int n16;
                        block15: {
                            int n17;
                            block23: {
                                int n18;
                                block13: {
                                    n16 = nArray[n13 * n10 + n15];
                                    if (stringArray == null) break block14;
                                    n14 = this.F.v(n16) ? 1 : 0;
                                    if (stringArray == null) continue block1;
                                    if (n14 == 0) break block15;
                                    int n19 = 0;
                                    int n20 = -1;
                                    block3: while (true) {
                                        int n21 = n20;
                                        block4: while (n21 <= 1) {
                                            block16: {
                                                int n22;
                                                int n23;
                                                block17: {
                                                    int n24 = n13 + n20;
                                                    if (stringArray == null) continue block3;
                                                    n17 = 0;
                                                    n18 = n24;
                                                    if (stringArray == null) break block13;
                                                    if (n17 > n18) break block16;
                                                    n23 = n24;
                                                    n22 = n11;
                                                    if (stringArray == null) break block17;
                                                    if (n23 >= n22) break block16;
                                                    n23 = n24;
                                                    n22 = n10;
                                                }
                                                int n25 = n23 * n22;
                                                for (int i2 = -1; i2 <= 1; ++i2) {
                                                    block20: {
                                                        int n26;
                                                        int n27;
                                                        block22: {
                                                            int n28;
                                                            int n29;
                                                            block21: {
                                                                block18: {
                                                                    block19: {
                                                                        n29 = n15 + i2;
                                                                        n21 = n20;
                                                                        if (stringArray == null) continue block4;
                                                                        if (stringArray == null) break block18;
                                                                        if (n21 != 0) break block19;
                                                                        n27 = i2;
                                                                        if (stringArray == null) break block18;
                                                                        if (n27 == 0) break block20;
                                                                    }
                                                                    n27 = 0;
                                                                }
                                                                n28 = n29;
                                                                if (stringArray == null) break block21;
                                                                if (n27 > n28) break block20;
                                                                n27 = n29;
                                                                if (stringArray == null) break block22;
                                                                n28 = n10;
                                                            }
                                                            if (n27 >= n28) break block20;
                                                            n27 = nArray[n25 + n29];
                                                        }
                                                        if (this.F.v(n26 = n27)) {
                                                            ++n19;
                                                        }
                                                        if (stringArray != null) continue;
                                                    }
                                                    ++n19;
                                                    if (stringArray != null) continue;
                                                }
                                            }
                                            ++n20;
                                            if (stringArray != null) continue block3;
                                        }
                                        break;
                                    }
                                    n17 = n19;
                                    if (stringArray == null) break block23;
                                    n18 = (int)e;
                                }
                                if (n17 != n18) break block15;
                                n17 = this.b;
                            }
                            n16 = n17;
                        }
                        nArray2[n12++] = n16;
                        ++n15;
                    }
                    if (stringArray != null) continue;
                }
                ++n13;
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
                char[] cArray3 = "]4M\u0017ONnP(W\u001aTY$1s\r".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 19;
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
                            n17 = 12;
                            break;
                        }
                        case 1: {
                            n17 = 78;
                            break;
                        }
                        case 2: {
                            n17 = 48;
                            break;
                        }
                        case 3: {
                            n17 = 101;
                            break;
                        }
                        case 4: {
                            n17 = 46;
                            break;
                        }
                        case 5: {
                            n17 = 36;
                            break;
                        }
                        default: {
                            n17 = 82;
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
        long l2 = 4091875465433889778L;
        e = 0x43185AB55E52BBFBL ^ l2;
    }
}

