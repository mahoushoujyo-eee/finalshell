/*
 * Decompiled with CFR 0.152.
 */
package org.i;

import com.ky_2;
import java.util.Iterator;
import java.util.List;
import org.i.D;
import org.i.M;
import org.i.Z;
import org.i.k;
import org.i.l;
import org.i.q;
import org.i.z_0;

public class I
implements q,
z_0 {
    public final String W;
    public final String D;
    public final List Y;
    public final List L;
    private final k Q;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public I(String string, String string2, List list, List list2, k k2) {
        this.W = string;
        this.D = string2;
        this.Y = list;
        this.L = list2;
        this.Q = k2;
    }

    @Override
    public Object P(D d2) throws Throwable {
        return d2.m(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        block8: {
            String string = this.W.replace((char)I.a(20819, 7809542723905355770L), (char)I.a(11988, 9118117175711006847L));
            StringBuilder stringBuilder2 = new StringBuilder().append(this.Q.B(string)).append(this.D);
            String string2 = M.w();
            List list = this.Y;
            if (string2 != null) {
                block7: {
                    if (!list.isEmpty()) {
                        Iterator iterator = this.Y.iterator();
                        stringBuilder2.append((char)I.a(22134, 2480402778419722460L)).append(((l)iterator.next()).toString());
                        while (iterator.hasNext()) {
                            stringBuilder2.append(a).append(((l)iterator.next()).toString());
                            if (string2 != null) {
                                if (string2 != null) continue;
                            }
                            break block7;
                        }
                        stringBuilder2.append((char)I.a(26062, 445237641614969702L));
                    }
                }
                list = this.L;
            }
            for (Z z10 : list) {
                stringBuilder = stringBuilder2.append((char)I.a(4627, 6814222937820019903L)).append(z10.toString());
                if (string2 != null) {
                    if (string2 != null) continue;
                }
                break block8;
            }
            stringBuilder = stringBuilder2;
        }
        String string = stringBuilder.toString();
        if (ky_2.F() != null) {
            M.W("d2AjUb");
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u001b~".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 18;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 37;
                                break;
                            }
                            case 1: {
                                v9 = 76;
                                break;
                            }
                            case 2: {
                                v9 = 64;
                                break;
                            }
                            case 3: {
                                v9 = 123;
                                break;
                            }
                            case 4: {
                                v9 = 22;
                                break;
                            }
                            case 5: {
                                v9 = 64;
                                break;
                            }
                            default: {
                                v9 = 125;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                I.a = new String(v10).intern();
                var0_1 = 3772344670906437222L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "n\u000e\u0005\u00b9b\u00a0\u0085>\u00ebkL<\u00c3*1\u00b3\u00ca\u00c2\u00b64\u00a4.6\u0086";
                var5_5 = "n\u000e\u0005\u00b9b\u00a0\u0085>\u00ebkL<\u00c3*1\u00b3\u00ca\u00c2\u00b64\u00a4.6\u0086".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00e4\u008e\u001d\u00b9!\u0013\u00ce7}wz\u000eR\u00a3\u00f2\u00f7";
                    var5_5 = "\u00e4\u008e\u001d\u00b9!\u0013\u00ce7}wz\u000eR\u00a3\u00f2\u00f7".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        I.b = var6_2;
        I.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2EA8;
        if (c[n11] == null) {
            I.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

