/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.po_0;

public class P5
implements po_0 {
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public int D(float f10) {
        int n10;
        int n11;
        block7: {
            int n12;
            block6: {
                String[] stringArray;
                block4: {
                    block5: {
                        n12 = (int)(f10 * 255.0f);
                        stringArray = W5.q();
                        n11 = n12;
                        if (stringArray == null) break block4;
                        if (n11 >= 0) break block5;
                        n12 = 0;
                        if (stringArray != null) break block6;
                    }
                    n11 = n12;
                }
                n10 = P5.a(16385, 5231335307953356202L);
                if (stringArray == null) break block7;
                if (n11 > n10) {
                    n12 = P5.a(6478, 2976588453243741412L);
                }
            }
            n11 = P5.a(31828, 689703936335774204L) | n12 << P5.a(13447, 5241373141968144682L) | n12 << P5.a(25409, 3059320054013239016L);
            n10 = n12;
        }
        return n11 | n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7734116603297885057L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "H\u00d0\u00e2&\u0086\u00b5ua\u00be\u00f2\u00b1uE~\u00ea}\fGo\u001c<\u0081\u00d6\u00d4";
                var5_4 = "H\u00d0\u00e2&\u0086\u00b5ua\u00be\u00f2\u00b1uE~\u00ea}\fGo\u001c<\u0081\u00d6\u00d4".length();
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
                    var4_3 = "6\u00bf\u0090\u00fd\u00a1\u001a\u000f\u009a\u0000bU\u009b\u0091M\u00a2\u00bb";
                    var5_4 = "6\u00bf\u0090\u00fd\u00a1\u001a\u000f\u009a\u0000bU\u009b\u0091M\u00a2\u00bb".length();
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
        P5.a = var6_1;
        P5.b = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7DA9;
        if (b[n11] == null) {
            P5.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

