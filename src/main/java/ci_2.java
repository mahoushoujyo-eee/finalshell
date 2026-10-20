/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ci
 */
public final class ci_2
extends Enum {
    public static final ci_2 fill;
    public static final ci_2 align;
    public static final ci_2 custom;
    private static final /* synthetic */ ci_2[] D;

    public static ci_2[] values() {
        return (ci_2[])((ci_2[])ci_2.D).clone();
    }

    public static ci_2 valueOf(String string) {
        return Enum.valueOf(ci_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ci_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ci_2[] z() {
        return new ci_2[]{(ci_2)((Object)ci_2.fill), (ci_2)((Object)ci_2.align), (ci_2)((Object)ci_2.custom)};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0003V\nxT:\u0004\u0006J\u0015`\u0005\u0001O\u0010kU";
            var5_3 = "\u0003V\nxT:\u0004\u0006J\u0015`\u0005\u0001O\u0010kU".length();
            var2_4 = 6;
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
                break block15;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 99;
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
                            v11 = 64;
                            break;
                        }
                        case 2: {
                            v11 = 26;
                            break;
                        }
                        case 3: {
                            v11 = 111;
                            break;
                        }
                        case 4: {
                            v11 = 88;
                            break;
                        }
                        case 5: {
                            v11 = 52;
                            break;
                        }
                        default: {
                            v11 = 115;
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
        ci_2.fill = new ci_2(var0[1], 0);
        ci_2.align = new ci_2(var0[2], 1);
        ci_2.custom = new ci_2(var0[0], 2);
        try {
            v12 = (ci_2[])ci_2.z();
        }
        catch (InvocationTargetException v13) {
            throw v13.getTargetException();
        }
        ci_2.D = v12;
    }
}

