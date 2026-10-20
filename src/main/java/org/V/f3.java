/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Arrays;
import org.F.c;
import org.P;
import org.v.RG;

public class f3 {
    public final String[] R;
    public final String O;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public f3(String string, String[] stringArray) {
        this.R = stringArray;
        this.O = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public f3(String string) {
        int n10;
        String[] stringArray;
        block20: {
            block21: {
                String[] stringArray2 = RG.C();
                stringArray = stringArray2;
                try {
                    try {
                        n10 = string.charAt(0);
                        if (stringArray == null) break block20;
                        if (n10 == f3.a(8072, 6649308916854954894L)) break block21;
                        throw new P();
                    }
                    catch (P p2) {
                        throw f3.a(p2);
                    }
                }
                catch (P p3) {
                    throw f3.a(p3);
                }
            }
            n10 = 1;
        }
        int n11 = n10;
        ArrayList<String> arrayList = new ArrayList<String>();
        while (string.charAt(n11) != f3.a(26728, 8381722092884618346L)) {
            int n12;
            block24: {
                block25: {
                    int n13;
                    int n14;
                    block23: {
                        block22: {
                            if (stringArray == null) return;
                            n12 = n11;
                            while (string.charAt(n12) == f3.a(1123, 2873471533016645732L)) {
                                try {
                                    ++n12;
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                        break;
                                    }
                                    break block22;
                                }
                                catch (P p5) {
                                    throw f3.a(p5);
                                }
                            }
                            try {
                                try {
                                    n14 = a.indexOf(string.charAt(n12));
                                    n13 = -1;
                                    if (stringArray == null) break block23;
                                    if (n14 == n13) break block22;
                                }
                                catch (P p6) {
                                    throw f3.a(p6);
                                }
                                ++n12;
                                if (stringArray != null) break block24;
                            }
                            catch (P p7) {
                                throw f3.a(p7);
                            }
                        }
                        n14 = string.charAt(n12);
                        n13 = f3.a(20085, 2986755066369854070L);
                    }
                    if (n14 != n13) throw new P();
                    ++n12;
                    while (string.charAt(n12) != f3.a(16728, 9116045476215342425L)) {
                        try {
                            ++n12;
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                                break;
                            }
                            break block25;
                        }
                        catch (P p8) {
                            throw f3.a(p8);
                        }
                    }
                    ++n12;
                }
                try {
                    if (stringArray == null) {
                        throw new P();
                    }
                }
                catch (P p9) {
                    throw f3.a(p9);
                }
            }
            arrayList.add(string.substring(n11, n12));
            n11 = n12;
            if (stringArray != null) continue;
        }
        this.R = arrayList.toArray(new String[arrayList.size()]);
        this.O = string.substring(++n11);
    }

    public boolean equals(@c Object object) {
        boolean bl;
        block20: {
            block19: {
                String[] stringArray;
                block18: {
                    Object object2;
                    block16: {
                        block17: {
                            block14: {
                                block15: {
                                    stringArray = RG.C();
                                    try {
                                        try {
                                            object2 = object;
                                            if (stringArray == null) break block14;
                                            if (object2 != this) break block15;
                                        }
                                        catch (P p2) {
                                            throw f3.a(p2);
                                        }
                                        return true;
                                    }
                                    catch (P p3) {
                                        throw f3.a(p3);
                                    }
                                }
                                object2 = object;
                            }
                            try {
                                try {
                                    if (stringArray == null) break block16;
                                    if (object2 instanceof f3) break block17;
                                }
                                catch (P p5) {
                                    throw f3.a(p5);
                                }
                                return false;
                            }
                            catch (P p6) {
                                throw f3.a(p6);
                            }
                        }
                        object2 = object;
                    }
                    f3 f32 = (f3)object2;
                    try {
                        try {
                            bl = Arrays.equals(this.R, f32.R);
                            if (stringArray == null) break block18;
                            if (!bl) break block19;
                        }
                        catch (P p7) {
                            throw f3.a(p7);
                        }
                        bl = this.O.equals(f32.O);
                    }
                    catch (P p8) {
                        throw f3.a(p8);
                    }
                }
                try {
                    if (stringArray == null) break block20;
                    if (!bl) break block19;
                }
                catch (P p9) {
                    throw f3.a(p9);
                }
                bl = true;
                break block20;
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return Arrays.hashCode(this.R) ^ this.O.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2 = new StringBuilder("(");
            String[] stringArray = RG.C();
            for (String string : this.R) {
                try {
                    stringBuilder = stringBuilder2.append(string);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (P p2) {
                    throw f3.a(p2);
                }
            }
            stringBuilder = stringBuilder2.append((char)f3.a(28600, 7059971121447726008L)).append(this.O);
        }
        return stringBuilder.toString();
    }

    public f3 m(String string) {
        String[] stringArray = new String[1 + this.R.length];
        stringArray[0] = string;
        System.arraycopy(this.R, 0, stringArray, 1, this.R.length);
        return new f3(this.O, stringArray);
    }

    private static P a(P p2) {
        return p2;
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
                v0 = "T2\u000f.w!\u001bL".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 38;
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
                                v9 = 48;
                                break;
                            }
                            case 1: {
                                v9 = 87;
                                break;
                            }
                            case 2: {
                                v9 = 109;
                                break;
                            }
                            case 3: {
                                v9 = 78;
                                break;
                            }
                            case 4: {
                                v9 = 24;
                                break;
                            }
                            case 5: {
                                v9 = 77;
                                break;
                            }
                            default: {
                                v9 = 110;
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
                f3.a = new String(v10).intern();
                var0_1 = 8320541840719012473L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "|\u009a\u000e\u00c3\u00d8\u00c6(C\b\u00b8\u00dc\u0007\u0082\u00ba\u008e:\u00fe\u00a8\u00c2n\u009c\u00cb\u00a7\u001b\ft\u0088\u00b00\u00bc\u0089\u00e8";
                var5_5 = "|\u009a\u000e\u00c3\u00d8\u00c6(C\b\u00b8\u00dc\u0007\u0082\u00ba\u008e:\u00fe\u00a8\u00c2n\u009c\u00cb\u00a7\u001b\ft\u0088\u00b00\u00bc\u0089\u00e8".length();
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
                    var4_4 = "K\u00cb\u000b\u00ec\u00dfsbF!\u00eb\u00f1O\u00a4.\u00f9\u00df";
                    var5_5 = "K\u00cb\u000b\u00ec\u00dfsbF!\u00eb\u00f1O\u00a4.\u00f9\u00df".length();
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
        f3.b = var6_2;
        f3.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x403;
        if (c[n11] == null) {
            f3.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

