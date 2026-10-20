/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.KD;
import com.WC;
import com.a9;
import com.hy_0;
import com.hz_0;
import com.ky_2;
import com.nv_0;
import com.ok_1;
import com.qm_0;
import com.r_0;
import com.xl_2;
import com.xz_2;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * Renamed from com.Ch
 */
public class ch_0 {
    private static ky_2[] y;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public static void P(JComponent jComponent) {
        BufferedImage bufferedImage = FN.J(jComponent);
        ky_2[] ky_2Array = ch_0.O();
        Rectangle rectangle = FN.O(jComponent);
        qm_0 qm_02 = ok_1.P(jComponent);
        qm_02.V(bufferedImage, rectangle.getLocation(), ch_0.a(4282, 5790514379053303831L));
        jComponent.setVisible(false);
        WC.s(a, GO.q, new hy_0(rectangle, qm_02, bufferedImage));
        ky_2[] ky_2Array2 = ky_2Array;
        if (ky_2.F() != null) {
            ch_0.S(new ky_2[3]);
        }
    }

    public static void main(String[] stringArray) {
        ky_2[] ky_2Array = ch_0.O();
        a9.x();
        KD kD = new KD("1");
        kD.addActionListener(new r_0(kD));
        KD kD2 = new KD("2");
        kD2.addActionListener(new nv_0(kD2));
        ky_2[] ky_2Array2 = ky_2Array;
        KD kD3 = new KD("3");
        kD3.addActionListener(new hz_0(kD3));
        new xz_2((Component)new xl_2(kD, kD2, kD3), ch_0.a(19969, 5710059448493954733L));
        if (ky_2Array2 == null) {
            ky_2.K(new String[4]);
        }
    }

    public static void S(ky_2[] ky_2Array) {
        y = ky_2Array;
    }

    public static ky_2[] O() {
        return y;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                if (ch_0.O() == null) {
                    ch_0.S(new ky_2[1]);
                }
                char[] cArray3 = "@(gs>@.H/ow:Q/+(`r8{(q".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 6;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 3;
                            break;
                        }
                        case 1: {
                            n17 = 72;
                            break;
                        }
                        case 2: {
                            n17 = 7;
                            break;
                        }
                        case 3: {
                            n17 = 16;
                            break;
                        }
                        case 4: {
                            n17 = 91;
                            break;
                        }
                        case 5: {
                            n17 = 50;
                            break;
                        }
                        default: {
                            n17 = 91;
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
        long l2 = 2458824564853328118L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u0012\u00b7\u00af\u0017\u00a0\u00ce\u001ei\u00f0\u00a3\u0083|\u00e7U\u00c0\u0085";
        int n19 = "\u0012\u00b7\u00af\u0017\u00a0\u00ce\u001ei\u00f0\u00a3\u0083|\u00e7U\u00c0\u0085".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x18AC;
        if (c[n11] == null) {
            ch_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

