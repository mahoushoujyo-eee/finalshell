/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.util.Arrays;
import java.util.List;

/*
 * Renamed from com.nd
 */
public interface nd_2 {
    public static final List q;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyx\u0000V<$\u001b4t\u001b[:,\\3t\u001bW)\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyp\u0017F0,\u0001>z\u0001";
                var5_3 = "\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyx\u0000V<$\u001b4t\u001b[:,\\3t\u001bW)\"'\u0010;t\t\u001c3+\u001e2v\u0007]:1\u0017%;\u001bS7.\u0017yv\u0000^ /\u001cyp\u0017F0,\u0001>z\u0001".length();
                var2_4 = 49;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 61;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b`\u0015D+$9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b}\u001dS+";
                    var5_3 = "9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b`\u0015D+$9<\u000b o\u0012\u0007(0\u0005)m\u001cF!*\f> \u0000H,5\fbm\u001bE;4\u0007b}\u001dS+".length();
                    var2_4 = 36;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 38;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 104;
                            break;
                        }
                        case 1: {
                            v15 = 127;
                            break;
                        }
                        case 2: {
                            v15 = 79;
                            break;
                        }
                        case 3: {
                            v15 = 106;
                            break;
                        }
                        case 4: {
                            v15 = 40;
                            break;
                        }
                        case 5: {
                            v15 = 82;
                            break;
                        }
                        default: {
                            v15 = 15;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        nd_2.q = Arrays.asList(new String[]{var0[2], var0[1], var0[3], var0[0]});
    }
}

