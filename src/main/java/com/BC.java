/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.LX;
import com.xg_0;
import javax.swing.ImageIcon;

public final class BC {
    public static boolean c;
    public static LX Z;
    public static int l;
    public static ImageIcon q;
    public static ImageIcon d;
    public static boolean W;
    public static boolean p;
    public static int x;

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
                char[] cArray3 = "F\u0015(ro\u0011~]\u0004(k2NqH".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 93;
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
                            n17 = 114;
                            break;
                        }
                        case 1: {
                            n17 = 43;
                            break;
                        }
                        case 2: {
                            n17 = 26;
                            break;
                        }
                        case 3: {
                            n17 = 65;
                            break;
                        }
                        case 4: {
                            n17 = 65;
                            break;
                        }
                        case 5: {
                            n17 = 99;
                            break;
                        }
                        default: {
                            n17 = 66;
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
        c = GO.k;
        Z = LX.united;
        l = 1;
        q = new ImageIcon(BC.class.getResource(string));
        d = xg_0.U(q);
        W = true;
        p = true;
        x = 0;
    }
}

