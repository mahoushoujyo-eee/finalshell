/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CN;
import com.EP;
import com.hi_0;
import com.nl_1;
import com.ok_0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.Dp
 */
public class dp_0
implements CN {
    public static String K;
    private String q;
    private final List E = new ArrayList();
    private static final long[] a;
    private static final Integer[] b;

    public dp_0() {
    }

    public dp_0(String string) {
        this.q = string;
    }

    public String w() {
        return this.q;
    }

    public void u(String string) {
        this.q = string;
    }

    public List C() {
        return this.E;
    }

    public void w(Object object) {
        this.E.add(object);
    }

    public String U() {
        return this.toString();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void G(nl_1 var1_1, Object var2_2, Type var3_3, int var4_4) throws IOException {
        block17: {
            block15: {
                block16: {
                    block14: {
                        var6_5 = var1_1.w;
                        var5_6 = hi_0.C();
                        try {
                            try {
                                v0 = var4_4 & EP.BrowserSecure.mask;
                                if (var5_6 != null) break block14;
                                if (v0 == 0) {
                                }
                                ** GOTO lbl24
                            }
                            catch (IOException v1) {
                                throw dp_0.a(v1);
                            }
                            v0 = (int)var6_5.y(EP.BrowserSecure.mask);
                        }
                        catch (IOException v2) {
                            throw dp_0.a(v2);
                        }
                    }
                    try {
                        try {
                            if (var5_6 != null) break block15;
                            if (v0 == 0) break block16;
                        }
                        catch (IOException v3) {
                            throw dp_0.a(v3);
                        }
lbl24:
                        // 2 sources

                        var6_5.write(dp_0.K);
                    }
                    catch (IOException v4) {
                        throw dp_0.a(v4);
                    }
                }
                var6_5.write(this.q);
                var6_5.write(dp_0.a(2516, 4150125024023071732L));
                v0 = var7_7 = 0;
            }
            while (var7_7 < this.E.size()) {
                block18: {
                    try {
                        try {
                            if (var5_6 != null) break block17;
                            if (var7_7 == 0) break block18;
                        }
                        catch (IOException v5) {
                            throw dp_0.a(v5);
                        }
                        var6_5.write(dp_0.a(17417, 2924465150041097771L));
                    }
                    catch (IOException v6) {
                        throw dp_0.a(v6);
                    }
                }
                var1_1.B(this.E.get(var7_7));
                ++var7_7;
                if (var5_6 == null) continue;
            }
            var6_5.write(dp_0.a(31139, 7648251198181227394L));
        }
    }

    public String toString() {
        return ok_0.x(this);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "|}w$".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 35;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 112;
                            break;
                        }
                        case 1: {
                            n17 = 116;
                            break;
                        }
                        case 2: {
                            n17 = 126;
                            break;
                        }
                        case 3: {
                            n17 = 40;
                            break;
                        }
                        case 4: {
                            n17 = 66;
                            break;
                        }
                        case 5: {
                            n17 = 53;
                            break;
                        }
                        default: {
                            n17 = 119;
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
        long l2 = 4154287846610835539L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string2 = "\u008e\u00a6R\u00cc\u00a9\u00ac\u00d3\u008f\u0093\u008d'Jsz#\u00f8\u0002j\u00ec\u00c7\u0005\u00c3\u009eT";
        int n19 = "\u008e\u00a6R\u00cc\u00a9\u00ac\u00d3\u008f\u0093\u008d'Jsz#\u00f8\u0002j\u00ec\u00c7\u0005\u00c3\u009eT".length();
        int n20 = 0;
        do {
            byte[] byArray = string2.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        a = lArray;
        b = new Integer[3];
        K = string;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4220;
        if (b[n11] == null) {
            dp_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

