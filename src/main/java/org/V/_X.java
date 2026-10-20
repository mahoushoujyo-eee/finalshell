/*
 * Decompiled with CFR 0.152.
 */
package org.v;

public final class _X
extends Enum {
    public static final _X CLASS_DECLARATION;
    public static final _X INTERFACE_DECLARATION;
    public static final _X ANNOTATION_TYPE_DECLARATION;
    private static final _X[] s;

    public static _X[] values() {
        return (_X[])s.clone();
    }

    public static _X valueOf(String string) {
        return Enum.valueOf(_X.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _X() {
        void var2_-1;
        void var1_-1;
    }

    private static _X[] c() {
        return new _X[]{CLASS_DECLARATION, INTERFACE_DECLARATION, ANNOTATION_TYPE_DECLARATION};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "in\u0000\u0004R`_oa\r\u0016S~Ocm\u000f\u001bkl\u000f\u0018U~Ocm\u000f\bUfKo}\u0005\u0012BsZxc\u0015\u001eNq\u0015cl\u0015\u0012SyZig\u001e\u0013D|Wkp\u0000\u0003HpU";
            var5_3 = "in\u0000\u0004R`_oa\r\u0016S~Ocm\u000f\u001bkl\u000f\u0018U~Ocm\u000f\bUfKo}\u0005\u0012BsZxc\u0015\u001eNq\u0015cl\u0015\u0012SyZig\u001e\u0013D|Wkp\u0000\u0003HpU".length();
            var2_4 = 17;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 41;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 3;
                            break;
                        }
                        case 1: {
                            v11 = 11;
                            break;
                        }
                        case 2: {
                            v11 = 104;
                            break;
                        }
                        case 3: {
                            v11 = 126;
                            break;
                        }
                        case 4: {
                            v11 = 40;
                            break;
                        }
                        case 5: {
                            v11 = 22;
                            break;
                        }
                        default: {
                            v11 = 50;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        _X.CLASS_DECLARATION = new _X(var0[0], 0);
        _X.INTERFACE_DECLARATION = new _X(var0[2], 1);
        _X.ANNOTATION_TYPE_DECLARATION = new _X(var0[1], 2);
        _X.s = _X.c();
    }
}

