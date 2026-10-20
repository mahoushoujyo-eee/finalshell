/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * Renamed from com._w
 */
@XStreamAlias(value="ReadState")
public final class _w_0
extends Enum {
    public static final _w_0 none;
    public static final _w_0 created;
    public static final _w_0 ok;
    public static final _w_0 restored;
    public static final _w_0 failed;
    private static final /* synthetic */ _w_0[] Q;

    public static _w_0[] values() {
        return (_w_0[])Q.clone();
    }

    public static _w_0 valueOf(String string) {
        return Enum.valueOf(_w_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _w_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ _w_0[] i() {
        return new _w_0[]{none, created, ok, restored, failed};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "oZ{H\bsPfYr\b\u0003e\u0006gT|Ax\u001e";
                var5_3 = "oZ{H\bsPfYr\b\u0003e\u0006gT|Ax\u001e".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 59;
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
                    var3_2 = ">\u001b,\u00105C^\u00022\u0002";
                    var5_3 = ">\u001b,\u00105C^\u00022\u0002".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 103;
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
                            v15 = 58;
                            break;
                        }
                        case 1: {
                            v15 = 14;
                            break;
                        }
                        case 2: {
                            v15 = 46;
                            break;
                        }
                        case 3: {
                            v15 = 22;
                            break;
                        }
                        case 4: {
                            v15 = 38;
                            break;
                        }
                        case 5: {
                            v15 = 65;
                            break;
                        }
                        default: {
                            v15 = 93;
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
        _w_0.none = new _w_0(var0[0], 0);
        _w_0.created = new _w_0(var0[3], 1);
        _w_0.ok = new _w_0(var0[4], 2);
        _w_0.restored = new _w_0(var0[1], 3);
        _w_0.failed = new _w_0(var0[2], 4);
        _w_0.Q = _w_0.i();
    }
}

