/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.iw_2;
import java.awt.Rectangle;

/*
 * Renamed from com.y6
 */
public class y6_0
extends gt_1 {
    private static final String a;
    private static final long b;

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        int[] nArray2 = new int[n10 * n11];
        int n13 = 0;
        String[] stringArray = W5.q();
        block0: while (true) {
            int n14 = n13;
            block1: while (n14 < n11) {
                int n15 = 0;
                block2: while (true) {
                    int n16 = n15;
                    int n17 = n10;
                    block3: while (n16 < n17) {
                        int n18 = (int)b;
                        n14 = -1;
                        if (stringArray == null) continue block1;
                        int n19 = n14;
                        block4: while (true) {
                            int n20 = n19;
                            int n21 = 1;
                            block5: while (n20 <= n21) {
                                block9: {
                                    int n22;
                                    int n23;
                                    block10: {
                                        int n24 = n13 + n19;
                                        if (stringArray == null) continue block4;
                                        n16 = 0;
                                        n17 = n24;
                                        if (stringArray == null) continue block3;
                                        if (n16 > n17) break block9;
                                        n23 = n24;
                                        n22 = n11;
                                        if (stringArray == null) break block10;
                                        if (n23 >= n22) break block9;
                                        n23 = n24;
                                        n22 = n10;
                                    }
                                    int n25 = n23 * n22;
                                    int n26 = -1;
                                    while (n26 <= 1) {
                                        block11: {
                                            block12: {
                                                int n27;
                                                int n28;
                                                block13: {
                                                    int n29 = n15 + n26;
                                                    if (stringArray == null) break block11;
                                                    n20 = 0;
                                                    n21 = n29;
                                                    if (stringArray == null) continue block5;
                                                    if (n20 > n21) break block12;
                                                    n28 = n29;
                                                    n27 = n10;
                                                    if (stringArray == null) break block13;
                                                    if (n28 >= n27) break block12;
                                                    n28 = n18;
                                                    n27 = nArray[n25 + n29];
                                                }
                                                n18 = iw_2.P(n28, n27, 3);
                                            }
                                            ++n26;
                                        }
                                        if (stringArray != null) continue;
                                    }
                                }
                                ++n19;
                                if (stringArray != null) continue block4;
                            }
                            break;
                        }
                        nArray2[n12++] = n18;
                        ++n15;
                        if (stringArray != null) continue block2;
                    }
                    break;
                }
                ++n13;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return nArray2;
    }

    public String toString() {
        return a;
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
                char[] cArray3 = "Z\u001ezo^4$`\u001bbh\u001c".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 120;
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
                            n17 = 96;
                            break;
                        }
                        case 1: {
                            n17 = 10;
                            break;
                        }
                        case 2: {
                            n17 = 119;
                            break;
                        }
                        case 3: {
                            n17 = 101;
                            break;
                        }
                        case 4: {
                            n17 = 9;
                            break;
                        }
                        case 5: {
                            n17 = 1;
                            break;
                        }
                        default: {
                            n17 = 61;
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
        long l2 = 5237242211458118435L;
        b = 0xC84C1CDCEFA47323L ^ l2;
    }
}

