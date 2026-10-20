/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.el_1;
import javax.swing.ImageIcon;

public class W6 {
    public static ImageIcon H;
    public static int A;
    public static int v;
    public static boolean c;
    public static el_1 b;

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
                char[] cArray3 = "y+awKL8`$gmq\u0000$~f~w_".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 15;
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
                            n17 = 31;
                            break;
                        }
                        case 1: {
                            n17 = 71;
                            break;
                        }
                        case 2: {
                            n17 = 1;
                            break;
                        }
                        case 3: {
                            n17 = 22;
                            break;
                        }
                        case 4: {
                            n17 = 55;
                            break;
                        }
                        case 5: {
                            n17 = 108;
                            break;
                        }
                        default: {
                            n17 = 68;
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
        String string = new String(cArray).intern();
        long l2 = 2078424046471458882L;
        long l3 = 0xC578C43F868FB044L ^ l2;
        H = new ImageIcon(W6.class.getResource(string));
        A = 1;
        v = (int)l3;
        c = false;
        b = el_1.belowStart;
    }
}

