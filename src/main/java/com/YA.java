/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.k3_0;
import com.xg_0;
import java.awt.Insets;
import javax.swing.ImageIcon;

public final class YA {
    public static boolean K;
    public static ImageIcon C;
    public static ImageIcon h;
    public static Insets W;
    public static boolean o;
    public static boolean x;
    public static int i;
    public static int w;
    public static Insets V;

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
                char[] cArray3 = "!N1\u000f\u0010Gz:_1\u0016M\u0018u/".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 126;
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
                            n17 = 54;
                            break;
                        }
                        case 1: {
                            n17 = 83;
                            break;
                        }
                        case 2: {
                            n17 = 32;
                            break;
                        }
                        case 3: {
                            n17 = 31;
                            break;
                        }
                        case 4: {
                            n17 = 29;
                            break;
                        }
                        case 5: {
                            n17 = 22;
                            break;
                        }
                        default: {
                            n17 = 101;
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
        long l2 = 3712003134524243216L;
        long l3 = 0xB88526F20E743D14L ^ l2;
        K = GO.k;
        C = new ImageIcon(k3_0.class.getResource(string));
        h = xg_0.r(C);
        W = new Insets(5, 5, 5, 5);
        o = true;
        x = true;
        i = (int)l3;
        w = 1;
        V = new Insets(0, 0, 0, 0);
    }
}

