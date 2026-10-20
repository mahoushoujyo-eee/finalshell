/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pv_2;
import com.sd_0;
import com.y4_0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.dc
 */
final class dc_2 {
    private final List o;
    private final StringBuilder J;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    /*
     * Unable to fully structure code
     */
    public dc_2(@NotNull y4_0 var1_1) throws IOException {
        block21: {
            super();
            this.J = new StringBuilder();
            var2_2 = pv_2.r();
            var3_3 = new StringBuilder();
            var4_4 = '\u0000';
            var5_5 = new ArrayList<E>();
            while (var4_4 == '\u0000') {
                block26: {
                    block24: {
                        block25: {
                            block22: {
                                block23: {
                                    var6_6 = var1_1.C();
                                    this.J.append(var6_6);
                                    var4_4 = this.i();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var2_2 != null) break block21;
                                                    v0 = var6_6;
                                                    if (var2_2 != null) break block22;
                                                }
                                                catch (IOException v1) {
                                                    throw dc_2.a(v1);
                                                }
                                                if (v0 == dc_2.a(4703, 5200354280727613957L)) break block23;
                                            }
                                            catch (IOException v2) {
                                                throw dc_2.a(v2);
                                            }
                                            v0 = var4_4;
                                            if (var2_2 != null) break block22;
                                        }
                                        catch (IOException v3) {
                                            throw dc_2.a(v3);
                                        }
                                        if (v0 != '\u0000') {
                                        }
                                        ** GOTO lbl68
                                    }
                                    catch (IOException v4) {
                                        throw dc_2.a(v4);
                                    }
                                }
                                v0 = var4_4;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var2_2 != null) break block24;
                                            if (v0 == '\u0000') break block25;
                                        }
                                        catch (IOException v5) {
                                            throw dc_2.a(v5);
                                        }
                                        v0 = (char)this.x();
                                        if (var2_2 != null) break block24;
                                    }
                                    catch (IOException v6) {
                                        throw dc_2.a(v6);
                                    }
                                    if (v0 == '\u0000') break block25;
                                }
                                catch (IOException v7) {
                                    throw dc_2.a(v7);
                                }
                                var3_3.deleteCharAt(var3_3.length() - 1);
                            }
                            catch (IOException v8) {
                                throw dc_2.a(v8);
                            }
                        }
                        v0 = (char)var5_5.add(var3_3.toString());
                    }
                    try {
                        var3_3.setLength(0);
                        if (var2_2 == null) break block26;
lbl68:
                        // 2 sources

                        var3_3.append(var6_6);
                    }
                    catch (IOException v9) {
                        throw dc_2.a(v9);
                    }
                }
                if (var2_2 == null) continue;
            }
            this.o = List.copyOf(var5_5);
        }
    }

    private boolean i() {
        int n10;
        block12: {
            block13: {
                int n11;
                block14: {
                    block16: {
                        block15: {
                            int n12 = this.J.length();
                            String string = pv_2.r();
                            try {
                                n10 = n12;
                                if (string != null) break block12;
                                if (n10 <= 0) break block13;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw dc_2.a(numberFormatException);
                            }
                            int n13 = this.J.charAt(n12 - 1);
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                n11 = n13;
                                                if (string != null) break block14;
                                                if (n11 == dc_2.a(25427, 4673262366854537994L)) break block15;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw dc_2.a(numberFormatException);
                                            }
                                            n11 = n13;
                                            if (string != null) break block14;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw dc_2.a(numberFormatException);
                                        }
                                        if (n11 == dc_2.a(4876, 923668366579733335L)) break block15;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw dc_2.a(numberFormatException);
                                    }
                                    n11 = this.x() ? 1 : 0;
                                    if (string != null) break block14;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw dc_2.a(numberFormatException);
                                }
                                if (n11 == 0) break block16;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw dc_2.a(numberFormatException);
                            }
                        }
                        n11 = 1;
                        break block14;
                    }
                    n11 = 0;
                }
                return n11 != 0;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean x() {
        int n10;
        int n11;
        block11: {
            String string;
            int n12;
            block10: {
                n12 = this.J.length();
                string = pv_2.r();
                try {
                    try {
                        n11 = n12;
                        n10 = 1;
                        if (string != null) break block10;
                        if (n11 <= n10) return 0 != 0;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw dc_2.a(numberFormatException);
                    }
                    n11 = this.J.charAt(n12 - 2);
                    n10 = dc_2.a(16805, 7696474351951135229L);
                }
                catch (NumberFormatException numberFormatException) {
                    throw dc_2.a(numberFormatException);
                }
            }
            try {
                try {
                    try {
                        if (string != null) break block11;
                        if (n11 != n10) return 0 != 0;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw dc_2.a(numberFormatException);
                    }
                    n11 = this.J.charAt(n12 - 1);
                    if (string != null) return n11 != 0;
                }
                catch (NumberFormatException numberFormatException) {
                    throw dc_2.a(numberFormatException);
                }
                n10 = dc_2.a(9696, 830349177438545341L);
            }
            catch (NumberFormatException numberFormatException) {
                throw dc_2.a(numberFormatException);
            }
        }
        if (n11 != n10) return 0 != 0;
        return 1 != 0;
    }

    @Nullable
    public String O(int n10) {
        String string;
        try {
            string = n10 < this.o.size() ? (String)this.o.get(n10) : null;
        }
        catch (NumberFormatException numberFormatException) {
            throw dc_2.a(numberFormatException);
        }
        return string;
    }

    @NotNull
    public List B() {
        return this.o;
    }

    public int N(int n10, int n11) {
        int n12;
        block4: {
            block5: {
                String string = pv_2.r();
                try {
                    try {
                        n12 = n10;
                        if (string != null) break block4;
                        if (n12 >= this.o.size()) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw dc_2.a(numberFormatException);
                    }
                    return this.w((String)this.o.get(n10), n11);
                }
                catch (NumberFormatException numberFormatException) {
                    throw dc_2.a(numberFormatException);
                }
            }
            n12 = n11;
        }
        return n12;
    }

    /*
     * Loose catch block
     * Could not resolve type clashes
     */
    private int w(@NotNull String string, int n10) {
        int n11;
        block8: {
            block9: {
                String string2;
                block10: {
                    string2 = pv_2.r();
                    n11 = string.isEmpty();
                    if (string2 != null) break block8;
                    if (n11 != 0) break block9;
                    break block10;
                    catch (NumberFormatException numberFormatException) {
                        throw dc_2.a(numberFormatException);
                    }
                }
                try {
                    block11: {
                        n11 = Character.isDigit(string.charAt(string.length() - 1)) ? 1 : 0;
                        if (string2 != null) break block8;
                        break block11;
                        catch (NumberFormatException numberFormatException) {
                            throw dc_2.a(numberFormatException);
                        }
                    }
                    if (n11 == 0) break block9;
                }
                catch (NumberFormatException numberFormatException) {
                    throw dc_2.a(numberFormatException);
                }
                try {
                    return Integer.parseInt(string);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            n11 = n10;
        }
        return n11;
    }

    @NotNull
    public String T(@NotNull String string) {
        return a + string + this.k();
    }

    public String toString() {
        return sd_0.Z(this.J.toString());
    }

    @NotNull
    private String k() {
        dc_2 dc_22;
        int n10;
        block4: {
            block5: {
                n10 = this.J.length();
                String string = pv_2.r();
                try {
                    try {
                        dc_22 = this;
                        if (string != null) break block4;
                        if (!dc_22.x()) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw dc_2.a(numberFormatException);
                    }
                    return this.J.substring(n10 - 2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw dc_2.a(numberFormatException);
                }
            }
            dc_22 = this;
        }
        return dc_22.J.substring(n10 - 1);
    }

    private static Exception a(Exception exception) {
        return exception;
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
                v0 = "\u0002#".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 65;
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
                                v9 = 88;
                                break;
                            }
                            case 1: {
                                v9 = 63;
                                break;
                            }
                            case 2: {
                                v9 = 38;
                                break;
                            }
                            case 3: {
                                v9 = 88;
                                break;
                            }
                            case 4: {
                                v9 = 5;
                                break;
                            }
                            case 5: {
                                v9 = 114;
                                break;
                            }
                            default: {
                                v9 = 96;
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
                dc_2.a = new String(v10).intern();
                var0_1 = 8895128055267731908L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "\u00e8\u000bI\u009f\u00abH\u00ca\u00c9\u00f9\u00a4%\u00ccG+\u00e8\"I!\u00d5\u00ed-\u0098:\u000f";
                var5_5 = "\u00e8\u000bI\u009f\u00abH\u00ca\u00c9\u00f9\u00a4%\u00ccG+\u00e8\"I!\u00d5\u00ed-\u0098:\u000f".length();
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
                    var4_4 = "\u00c7\"\u00f1\u009c\u0015+\u00bb\u00fa\u00f3\u0005\u0093\u00c7\r\u001b\f%";
                    var5_5 = "\u00c7\"\u00f1\u009c\u0015+\u00bb\u00fa\u00f3\u0005\u0093\u00c7\r\u001b\f%".length();
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
        dc_2.b = var6_2;
        dc_2.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x59;
        if (c[n11] == null) {
            dc_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

