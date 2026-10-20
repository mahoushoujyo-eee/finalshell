/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k5_0;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from com.kM
 */
public class km_1
extends k5_0 {
    private static final long[] c;
    private static final Integer[] e;

    public km_1() {
        this.setOpaque(false);
        this.C(0);
        this.setBorder(null);
        this.C(0);
        this.b(new Insets(0, 0, 0, 0));
        this.I(km_1.a(25293, 3601297615179512085L), km_1.a(17824, 1518886113878826617L));
        this.setMinimumSize(new Dimension(km_1.a(20471, 8447542080611931181L), km_1.a(12602, 863207024840190689L)));
        this.setMaximumSize(new Dimension(km_1.a(17824, 1518886113878826617L), km_1.a(17824, 1518886113878826617L)));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4296500936015325344L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "-\u00f7\u000e\u00e7\u00ecWpy\u00d7\u001c\u0004Y\u00dfnW\u0015";
                var5_4 = "-\u00f7\u000e\u00e7\u00ecWpy\u00d7\u001c\u0004Y\u00dfnW\u0015".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u0082R\u00fd\u00c6Wk\u0002%\u0082\u0083\u00f3\u00b6\u0088Z|\u00e9";
                    var5_4 = "\u0082R\u00fd\u00c6Wk\u0002%\u0082\u0083\u00f3\u00b6\u0088Z|\u00e9".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        km_1.c = var6_1;
        km_1.e = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1BD9;
        if (e[n11] == null) {
            km_1.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

