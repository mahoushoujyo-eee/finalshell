/*
 * Decompiled with CFR 0.152.
 */
public final class gV
extends Enum {
    public static final gV ESCAPE;
    public static final gV DATA;
    public static final gV HEADER;
    public static final gV CANCEL;
    public static final gV FINISH;
    private static final /* synthetic */ gV[] c;
    private static String i;

    public static gV[] values() {
        return (gV[])c.clone();
    }

    public static gV valueOf(String string) {
        return Enum.valueOf(gV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gV() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ gV[] q() {
        return new gV[]{ESCAPE, DATA, HEADER, CANCEL, FINISH};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "\u0000'^\u0000&[\u0006\u0003=S\b%V\u0006\r1\\\u00053L";
                var5_3 = "\u0000'^\u0000&[\u0006\u0003=S\b%V\u0006\r1\\\u00053L".length();
                gV.V(null);
                var2_4 = 6;
                var1_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 2;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "kX>o^?\u0004lX$m";
                    var5_3 = "kX>o^?\u0004lX$m".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 111;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 71;
                            break;
                        }
                        case 1: {
                            v15 = 118;
                            break;
                        }
                        case 2: {
                            v15 = 31;
                            break;
                        }
                        case 3: {
                            v15 = 67;
                            break;
                        }
                        case 4: {
                            v15 = 116;
                            break;
                        }
                        case 5: {
                            v15 = 28;
                            break;
                        }
                        default: {
                            v15 = 10;
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
lbl86:
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
lbl96:
                // 1 sources

                ** continue;
            }
        }
        gV.ESCAPE = new gV(var0[0], 0);
        gV.DATA = new gV(var0[4], 1);
        gV.HEADER = new gV(var0[2], 2);
        gV.CANCEL = new gV(var0[3], 3);
        gV.FINISH = new gV(var0[1], 4);
        gV.c = gV.q();
    }

    public static void V(String string) {
        i = string;
    }

    public static String b() {
        return i;
    }
}

