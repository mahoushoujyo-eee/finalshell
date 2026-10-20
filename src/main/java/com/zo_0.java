/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

/*
 * Renamed from com.zo
 */
@XStreamAlias(value="ResourceLocation")
public final class zo_0
extends Enum
implements Serializable {
    public static final zo_0 url;
    public static final zo_0 filePath;
    public static final zo_0 nearClass;
    private static final /* synthetic */ zo_0[] K;

    public static zo_0[] values() {
        return (zo_0[])K.clone();
    }

    public static zo_0 valueOf(String string) {
        return Enum.valueOf(zo_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zo_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ zo_0[] N() {
        return new zo_0[]{url, filePath, nearClass};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = ",U3W\u007f|[\"\u0003?N3\t$Y>@lqN9O";
            var5_3 = ",U3W\u007f|[\"\u0003?N3\t$Y>@lqN9O".length();
            var2_4 = 8;
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
            v4 = 81;
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
                            v11 = 27;
                            break;
                        }
                        case 1: {
                            v11 = 109;
                            break;
                        }
                        case 2: {
                            v11 = 14;
                            break;
                        }
                        case 3: {
                            v11 = 99;
                            break;
                        }
                        case 4: {
                            v11 = 126;
                            break;
                        }
                        case 5: {
                            v11 = 76;
                            break;
                        }
                        default: {
                            v11 = 126;
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
        zo_0.url = new zo_0(var0[1], 0);
        zo_0.filePath = new zo_0(var0[0], 1);
        zo_0.nearClass = new zo_0(var0[2], 2);
        zo_0.K = zo_0.N();
    }
}

