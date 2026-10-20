/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ds_0;
import com.lb_1;

public final class B1
extends Enum {
    public static final B1 up;
    public static final B1 down;
    public static final B1 left;
    public static final B1 right;
    private static final B1[] c;

    public static B1[] values() {
        return (B1[])c.clone();
    }

    public static B1 valueOf(String string) {
        return Enum.valueOf(B1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private B1() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    public B1[] r() {
        var1_1 = ds_0.U();
        v0 = lb_1.z[this.ordinal()];
        if (var1_1 != null) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = 4;
lbl7:
                // 2 sources

                v1 = new B1[v0];
                v1[0] = B1.up;
                v1[1] = B1.down;
                v1[2] = B1.right;
                v1[3] = B1.left;
                return v1;
            }
            case 2: {
                return new B1[]{B1.down, B1.up, B1.right, B1.left};
            }
            case 3: {
                return new B1[]{B1.left, B1.right, B1.down, B1.up};
            }
            case 4: {
                return new B1[]{B1.right, B1.left, B1.down, B1.up};
            }
        }
        return null;
    }

    public int m(boolean n10) {
        int[] nArray = ds_0.U();
        int n11 = lb_1.z[this.ordinal()];
        if (nArray == null) {
            switch (n11) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 1;
                }
                case 3: {
                    int n12 = n10;
                    if (nArray == null) {
                        n12 = n12 != 0 ? 4 : 2;
                    }
                    return n12;
                }
                case 4: {
                    int n13 = n10;
                    if (nArray == null) {
                        n13 = n13 != 0 ? 2 : 4;
                    }
                    return n13;
                }
            }
            n11 = -1;
        }
        return n11;
    }

    private static B1[] h() {
        return new B1[]{up, down, left, right};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u007f\u0001\fF\u0002f\u0014";
                var5_3 = "\u007f\u0001\fF\u0002f\u0014".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 27;
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
                    var3_2 = "t\u0018\u0018Ow\u0004b\u001e\bI";
                    var5_3 = "t\u0018\u0018Ow\u0004b\u001e\bI".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 14;
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
                            v15 = 8;
                            break;
                        }
                        case 1: {
                            v15 = 127;
                            break;
                        }
                        case 2: {
                            v15 = 113;
                            break;
                        }
                        case 3: {
                            v15 = 41;
                            break;
                        }
                        case 4: {
                            v15 = 13;
                            break;
                        }
                        case 5: {
                            v15 = 120;
                            break;
                        }
                        default: {
                            v15 = 14;
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
        B1.up = new B1(var0[1], 0);
        B1.down = new B1(var0[3], 1);
        B1.left = new B1(var0[0], 2);
        B1.right = new B1(var0[2], 3);
        B1.c = B1.h();
    }
}

