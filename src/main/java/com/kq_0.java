/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Kq
 */
final class kq_0
extends Enum {
    public static final kq_0 shade;
    public static final kq_0 background;
    public static final kq_0 backgroundPainter;
    public static final kq_0 border;
    private static final kq_0[] R;

    public static kq_0[] values() {
        return (kq_0[])R.clone();
    }

    public static kq_0 valueOf(String string) {
        return Enum.valueOf(kq_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kq_0() {
        void var2_-1;
        void var1_-1;
    }

    private static kq_0[] s() {
        return new kq_0[]{shade, background, backgroundPainter, border};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "b'W\u000e3K\u0019u(P\u0005s.U\u00011";
                var5_3 = "b'W\u000e3K\u0019u(P\u0005s.U\u00011".length();
                var2_4 = 10;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 122;
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
                    var3_2 = "_\u001aj3\u000ev$H\u0015m\b\bm%I\u001e{\u0006_\u0014{<\fv";
                    var5_3 = "_\u001aj3\u000ev$H\u0015m\b\bm%I\u001e{\u0006_\u0014{<\fv".length();
                    var2_4 = 17;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 71;
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
                            v15 = 122;
                            break;
                        }
                        case 1: {
                            v15 = 60;
                            break;
                        }
                        case 2: {
                            v15 = 78;
                            break;
                        }
                        case 3: {
                            v15 = 31;
                            break;
                        }
                        case 4: {
                            v15 = 46;
                            break;
                        }
                        case 5: {
                            v15 = 67;
                            break;
                        }
                        default: {
                            v15 = 12;
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
        kq_0.shade = new kq_0(var0[1], 0);
        kq_0.background = new kq_0(var0[0], 1);
        kq_0.backgroundPainter = new kq_0(var0[2], 2);
        kq_0.border = new kq_0(var0[3], 3);
        kq_0.R = kq_0.s();
    }
}

