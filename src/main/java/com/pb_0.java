/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F2;
import com.P9;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.u0;
import java.awt.Color;

/*
 * Renamed from com.Pb
 */
public class pb_0
extends AbstractSingleValueConverter {
    private static final u0 F;
    private static final long a;

    @Override
    public boolean canConvert(Class clazz) {
        return clazz.equals(Color.class);
    }

    @Override
    public Object fromString(String string) {
        return pb_0.f(string);
    }

    @Override
    public String toString(Object object) {
        Color color = (Color)object;
        return pb_0.h(color);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color f(String string) {
        String string2;
        Color color;
        block6: {
            boolean bl;
            block5: {
                int[] nArray = F2.T();
                bl = F.d(string);
                if (nArray == null) break block5;
                if (bl) {
                    color = (Color)F.Q(string);
                    return color;
                }
                string2 = string;
                if (nArray == null) break block6;
                bl = string2.contains("#");
            }
            if (bl) {
                color = P9.C(string);
                return color;
            }
            string2 = string;
        }
        color = P9.u(string2);
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String h(Color color) {
        String string;
        int[] nArray;
        block5: {
            Color color2;
            u0 u02;
            block4: {
                nArray = F2.T();
                u02 = F;
                color2 = color;
                if (nArray == null) break block4;
                if (!u02.A(color2)) break block5;
                u02 = F;
                color2 = color;
            }
            string = (String)u02.A(color2);
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder().append(color.getRed()).append(",").append(color.getGreen());
        String string2 = ",";
        if (nArray != null) {
            stringBuilder = stringBuilder.append(string2).append(color.getBlue());
            string2 = color.getAlpha() < (int)a ? "," + color.getAlpha() : "";
        }
        string = stringBuilder.append(string2).toString();
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[14];
                var6_1 = 0;
                var5_2 = "\u00166x}\"!\u0005\u001b(xp.\u0005\u001e6|v+\u0004\u001b(lv\t\u0015-~{1\u0003w\u0018=\u0006\u0000!u\u007f*3\u0004\t-wx\u0005\u000e,pg \b\u001d%kx\u00026d\u0000\u0004\u00171u\u007f\u0004\u001e6xj\u0004\u001a=x}";
                var7_3 = "\u00166x}\"!\u0005\u001b(xp.\u0005\u001e6|v+\u0004\u001b(lv\t\u0015-~{1\u0003w\u0018=\u0006\u0000!u\u007f*3\u0004\t-wx\u0005\u000e,pg \b\u001d%kx\u00026d\u0000\u0004\u00171u\u007f\u0004\u001e6xj\u0004\u001a=x}".length();
                var4_4 = 6;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 100;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "\u0000*v\u0007\u001f.u} ;o";
                    var7_3 = "\u0000*v\u0007\u001f.u} ;o".length();
                    var4_4 = 3;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 111;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 29;
                            break;
                        }
                        case 1: {
                            v15 = 32;
                            break;
                        }
                        case 2: {
                            v15 = 125;
                            break;
                        }
                        case 3: {
                            v15 = 119;
                            break;
                        }
                        case 4: {
                            v15 = 33;
                            break;
                        }
                        case 5: {
                            v15 = 32;
                            break;
                        }
                        default: {
                            v15 = 97;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 1318965192185600357L;
        ** while (true)
        pb_0.a = -4538647141814117990L ^ var0_7;
        pb_0.F = new u0();
        pb_0.F.A(var2[9], null);
        pb_0.F.A(var2[1], Color.BLACK);
        pb_0.F.A(var2[7], Color.WHITE);
        pb_0.F.A(var2[12], Color.RED);
        pb_0.F.A(var2[2], Color.GREEN);
        pb_0.F.A(var2[3], Color.BLUE);
        pb_0.F.A(var2[4], Color.LIGHT_GRAY);
        pb_0.F.A(var2[10], Color.GRAY);
        pb_0.F.A(var2[8], Color.DARK_GRAY);
        pb_0.F.A(var2[6], Color.PINK);
        pb_0.F.A(var2[0], Color.ORANGE);
        pb_0.F.A(var2[5], Color.YELLOW);
        pb_0.F.A(var2[13], Color.MAGENTA);
        pb_0.F.A(var2[11], Color.CYAN);
    }
}

