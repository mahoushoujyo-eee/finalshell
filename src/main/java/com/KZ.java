/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KZ {
    private static Pattern n;
    private static Pattern D;
    private double e;
    private int J;
    private int x;
    private String o;
    private static int O;
    private static final long[] a;
    private static final Integer[] b;

    public KZ(double d2, int n10) {
        this.e = d2;
        this.J = 0;
        this.x = n10;
    }

    public KZ(double d2, int n10, int n11) {
        int n12 = KZ.G();
        this.e = d2;
        int n13 = n12;
        try {
            this.J = n10;
            this.x = n11;
            if (ky_2.F() != null) {
                KZ.O(++n13);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw KZ.a(numberFormatException);
        }
    }

    public KZ(String string) {
        this.F(string);
    }

    /*
     * Loose catch block
     */
    public void F(String string) {
        block42: {
            int n10 = KZ.G();
            try {
                String string2;
                String string3;
                block48: {
                    String string4;
                    block47: {
                        Matcher matcher;
                        block54: {
                            int n11;
                            int n12;
                            block45: {
                                int n13;
                                block46: {
                                    block43: {
                                        block44: {
                                            block51: {
                                                int n14;
                                                block41: {
                                                    matcher = n.matcher(string);
                                                    n14 = matcher.matches();
                                                    if (n10 != 0) break block41;
                                                    try {
                                                        block50: {
                                                            if (n14 == 0) break block42;
                                                            break block50;
                                                            catch (NumberFormatException numberFormatException) {
                                                                throw KZ.a(numberFormatException);
                                                            }
                                                        }
                                                        n14 = matcher.groupCount();
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw KZ.a(numberFormatException);
                                                    }
                                                }
                                                n13 = n14;
                                                this.e = Double.parseDouble(matcher.group(1));
                                                n12 = n13;
                                                n11 = 3;
                                                if (n10 != 0) break block43;
                                                if (n12 < n11) break block44;
                                                break block51;
                                                catch (NumberFormatException numberFormatException) {
                                                    throw KZ.a(numberFormatException);
                                                }
                                            }
                                            try {
                                                block52: {
                                                    if (matcher.group(3) == null) break block44;
                                                    break block52;
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw KZ.a(numberFormatException);
                                                    }
                                                }
                                                this.J = Integer.parseInt(matcher.group(3));
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw KZ.a(numberFormatException);
                                            }
                                        }
                                        n12 = n13;
                                        n11 = 5;
                                    }
                                    if (n10 != 0) break block45;
                                    try {
                                        block53: {
                                            if (n12 < n11) break block46;
                                            break block53;
                                            catch (NumberFormatException numberFormatException) {
                                                throw KZ.a(numberFormatException);
                                            }
                                        }
                                        if (matcher.group(5) == null) break block46;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw KZ.a(numberFormatException);
                                    }
                                    try {
                                        this.x = Integer.parseInt(matcher.group(5));
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        this.o = matcher.group(5);
                                    }
                                }
                                n12 = n13;
                                n11 = KZ.a(20438, 3434597630685885513L);
                            }
                            if (n12 < n11) break block42;
                            string4 = matcher.group(KZ.a(28870, 2691090523496090456L));
                            if (n10 != 0) break block47;
                            break block54;
                            catch (NumberFormatException numberFormatException) {
                                throw KZ.a(numberFormatException);
                            }
                        }
                        try {
                            block55: {
                                if (string4 == null) break block42;
                                break block55;
                                catch (NumberFormatException numberFormatException) {
                                    throw KZ.a(numberFormatException);
                                }
                            }
                            string4 = matcher.group(KZ.a(28870, 2691090523496090456L));
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw KZ.a(numberFormatException);
                        }
                    }
                    string3 = string4;
                    string2 = string3;
                    if (n10 != 0) break block48;
                    try {
                        block56: {
                            if (string2 == null) break block42;
                            break block56;
                            catch (NumberFormatException numberFormatException) {
                                throw KZ.a(numberFormatException);
                            }
                        }
                        string2 = string3.trim();
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw KZ.a(numberFormatException);
                    }
                }
                try {
                    if (string2.length() > 0) {
                        this.o = string3;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw KZ.a(numberFormatException);
                }
            }
            catch (NumberFormatException numberFormatException) {
                try {
                    int n15;
                    Matcher matcher;
                    block49: {
                        matcher = D.matcher(string);
                        n15 = matcher.matches();
                        if (n10 != 0) break block49;
                        try {
                            block57: {
                                if (n15 == 0) break block42;
                                break block57;
                                catch (NumberFormatException numberFormatException2) {
                                    throw KZ.a(numberFormatException2);
                                }
                            }
                            n15 = matcher.groupCount();
                        }
                        catch (NumberFormatException numberFormatException3) {
                            throw KZ.a(numberFormatException3);
                        }
                    }
                    int n16 = n15;
                    this.e = Double.parseDouble(matcher.group(1));
                    if (n16 < 3) break block42;
                    try {
                        block58: {
                            if (matcher.group(3) == null) break block42;
                            break block58;
                            catch (NumberFormatException numberFormatException4) {
                                throw KZ.a(numberFormatException4);
                            }
                        }
                        this.J = Integer.parseInt(matcher.group(3));
                    }
                    catch (NumberFormatException numberFormatException5) {
                        throw KZ.a(numberFormatException5);
                    }
                }
                catch (NumberFormatException numberFormatException6) {
                    this.e = 1.4;
                    this.J = 0;
                    this.x = 0;
                }
            }
        }
    }

    public int r(double d2, int n10, int n11) {
        double d3;
        int n12;
        block17: {
            block18: {
                double d4;
                block13: {
                    block14: {
                        double d5;
                        block15: {
                            block16: {
                                double d6 = this.e - d2;
                                n12 = KZ.G();
                                try {
                                    try {
                                        try {
                                            double d7 = d6 - 0.0;
                                            d4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                            if (n12 != 0) break block13;
                                            if (d4 == false) break block14;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw KZ.a(numberFormatException);
                                        }
                                        double d8 = d6 - 0.0;
                                        d5 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                        if (n12 != 0) break block15;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw KZ.a(numberFormatException);
                                    }
                                    if (d5 >= 0) break block16;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw KZ.a(numberFormatException);
                                }
                                d5 = -1;
                                break block15;
                            }
                            d5 = 1.0;
                        }
                        return (int)d5;
                    }
                    d4 = this.J - n10;
                }
                double d9 = d4;
                try {
                    try {
                        d3 = d9;
                        if (n12 != 0) break block17;
                        if (d3 == false) break block18;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw KZ.a(numberFormatException);
                    }
                    return (int)d9;
                }
                catch (NumberFormatException numberFormatException) {
                    throw KZ.a(numberFormatException);
                }
            }
            d3 = this.x - n11;
        }
        try {
            if (n12 != 0) {
                ky_2.K(new String[4]);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw KZ.a(numberFormatException);
        }
        return (int)d3;
    }

    public double Y() {
        return this.e;
    }

    public int K() {
        return this.J;
    }

    public int R() {
        return this.x;
    }

    public String i() {
        return this.o;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    var8 = new String[2];
                    var12_1 = 0;
                    var11_2 = "YAe+u?\u0014\u00156((u?`-y*)\u0000.`.5Z^\u0004LcX4>(\u0007;a\u0018YAe+u?\u0014\u00156((u?`-y*)\u0000.`_7(";
                    var13_3 = "YAe+u?\u0014\u00156((u?`-y*)\u0000.`.5Z^\u0004LcX4>(\u0007;a\u0018YAe+u?\u0014\u00156((u?`-y*)\u0000.`_7(".length();
                    var10_4 = 35;
                    var9_5 = -1;
                    KZ.O(116);
lbl8:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var8[var12_1++] = new String(v0).intern();
                        if ((var9_5 += var10_4) < var13_3) {
                            var10_4 = var11_2.charAt(var9_5);
                            ** continue;
                        }
                        break block15;
                        break;
                    }
                    v1 = ++var9_5;
                    v2 = var11_2.substring(v1, v1 + var10_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 74;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl68
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 59;
                                    break;
                                }
                                case 1: {
                                    v11 = 87;
                                    break;
                                }
                                case 2: {
                                    v11 = 75;
                                    break;
                                }
                                case 3: {
                                    v11 = 74;
                                    break;
                                }
                                case 4: {
                                    v11 = 99;
                                    break;
                                }
                                case 5: {
                                    v11 = 91;
                                    break;
                                }
                                default: {
                                    v11 = 2;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl68:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                var0_7 = 423573338834277636L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00f4\u0018\u00f6N\u0016\u00e5!K\u00d9\u00a2\u00c4\u00fb\u00aa\u00ec\u009eZ";
                var5_11 = "\u00f4\u0018\u00f6N\u0016\u00e5!K\u00d9\u00a2\u00c4\u00fb\u00aa\u00ec\u009eZ".length();
                var2_12 = 0;
                while (true) {
                    break block16;
                    break;
                }
lbl84:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        KZ.a = var6_8;
        KZ.b = new Integer[2];
        KZ.n = Pattern.compile(var8[0]);
        KZ.D = Pattern.compile(var8[1]);
    }

    public static void O(int n10) {
        O = n10;
    }

    public static int M() {
        return O;
    }

    public static int G() {
        int n10 = KZ.M();
        try {
            if (n10 == 0) {
                return 40;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw KZ.a(numberFormatException);
        }
        return 0;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B9F;
        if (b[n11] == null) {
            KZ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

