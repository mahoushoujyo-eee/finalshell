/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJ
 */
public class bj_1 {
    private static final String a;

    public int w() {
        return 1;
    }

    public int L() {
        return 1;
    }

    public int A(char c2, char c3) {
        char c4;
        block4: {
            block5: {
                int n10 = D5.K();
                try {
                    try {
                        c4 = c2;
                        if (n10 == 0) break block4;
                        if (c4 != c3) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw bj_1.a(illegalArgumentException);
                    }
                    c4 = '\u0000';
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw bj_1.a(illegalArgumentException);
                }
            }
            c4 = '\u0001';
        }
        return c4;
    }

    public int r(String string, String string2) {
        int n10;
        block39: {
            int n11;
            int n12;
            int n13;
            char[] cArray;
            char[] cArray2;
            int n14;
            int[][] nArray;
            block38: {
                block36: {
                    int n15;
                    block34: {
                        block35: {
                            block32: {
                                block33: {
                                    String string3;
                                    block30: {
                                        block31: {
                                            block28: {
                                                block29: {
                                                    nArray = null;
                                                    n14 = D5.e();
                                                    try {
                                                        string3 = string;
                                                        if (n14 != 0) break block28;
                                                        if (string3 != null) break block29;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw bj_1.a(illegalArgumentException);
                                                    }
                                                    string = "";
                                                }
                                                string3 = string2;
                                            }
                                            try {
                                                if (n14 != 0) break block30;
                                                if (string3 != null) break block31;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw bj_1.a(illegalArgumentException);
                                            }
                                            string2 = "";
                                        }
                                        string3 = string;
                                    }
                                    cArray2 = string3.toCharArray();
                                    cArray = string2.toCharArray();
                                    n13 = cArray2.length;
                                    n12 = cArray.length;
                                    try {
                                        try {
                                            n15 = cArray2.length;
                                            if (n14 != 0) break block32;
                                            if (n15 != 0) break block33;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw bj_1.a(illegalArgumentException);
                                        }
                                        return cArray.length;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw bj_1.a(illegalArgumentException);
                                    }
                                }
                                n15 = cArray.length;
                            }
                            try {
                                try {
                                    if (n14 != 0) break block34;
                                    if (n15 != 0) break block35;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw bj_1.a(illegalArgumentException);
                                }
                                return cArray2.length;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw bj_1.a(illegalArgumentException);
                            }
                        }
                        n15 = cArray2.length + 1;
                    }
                    nArray = new int[n15][cArray.length + 1];
                    for (n11 = 1; n11 <= n13; ++n11) {
                        try {
                            nArray[n11][0] = nArray[n11 - 1][0] + this.w();
                            if (n14 == 0) {
                                if (n14 == 0) continue;
                                break;
                            }
                            break block36;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw bj_1.a(illegalArgumentException);
                        }
                    }
                    n11 = 1;
                }
                try {
                    do {
                        try {
                            if (n11 > n12) break;
                            nArray[0][n11] = nArray[0][n11 - 1] + this.L();
                            ++n11;
                            if (n14 == 0) {
                                continue;
                            }
                            break block38;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw bj_1.a(illegalArgumentException);
                        }
                    } while (n14 == 0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw bj_1.a(illegalArgumentException);
                }
                n11 = 1;
            }
            block24: do {
                try {
                    if (n11 > n13) break;
                    n10 = 1;
                    if (n14 != 0) break block39;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw bj_1.a(illegalArgumentException);
                }
                for (int i2 = v1845504; i2 <= n12; ++i2) {
                    try {
                        nArray[n11][i2] = uj_1.G(new int[]{nArray[n11 - 1][i2] + this.w(), nArray[n11][i2 - 1] + this.L(), nArray[n11 - 1][i2 - 1] + this.A(cArray2[n11 - 1], cArray[i2 - 1])});
                        if (n14 != 0) continue block24;
                        if (n14 == 0) continue;
                        break;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw bj_1.a(illegalArgumentException);
                    }
                }
                ++n11;
            } while (n14 == 0);
            n10 = nArray[n13][n12];
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    public static int x(String var0, String var1_1) {
        block35: {
            block34: {
                block32: {
                    block33: {
                        block30: {
                            block31: {
                                block28: {
                                    block29: {
                                        block27: {
                                            var2_2 = D5.K();
                                            try {
                                                v0 = var0;
                                                if (var2_2 == 0) break block27;
                                                if (v0 != null) {
                                                }
                                                ** GOTO lbl19
                                            }
                                            catch (IllegalArgumentException v1) {
                                                throw bj_1.a(v1);
                                            }
                                            v0 = var1_1;
                                        }
                                        try {
                                            try {
                                                if (var2_2 == 0) break block28;
                                                if (v0 != null) break block29;
                                            }
                                            catch (IllegalArgumentException v2) {
                                                throw bj_1.a(v2);
                                            }
lbl19:
                                            // 2 sources

                                            throw new IllegalArgumentException(bj_1.a);
                                        }
                                        catch (IllegalArgumentException v3) {
                                            throw bj_1.a(v3);
                                        }
                                    }
                                    v0 = var0;
                                }
                                var4_3 = v0.length();
                                var5_4 = var1_1.length();
                                try {
                                    try {
                                        v4 = var4_3;
                                        if (var2_2 == 0) break block30;
                                        if (v4 != 0) break block31;
                                    }
                                    catch (IllegalArgumentException v5) {
                                        throw bj_1.a(v5);
                                    }
                                    return var5_4;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw bj_1.a(v6);
                                }
                            }
                            v4 = var5_4;
                        }
                        try {
                            try {
                                if (var2_2 == 0) break block32;
                                if (v4 != 0) break block33;
                            }
                            catch (IllegalArgumentException v7) {
                                throw bj_1.a(v7);
                            }
                            return var4_3;
                        }
                        catch (IllegalArgumentException v8) {
                            throw bj_1.a(v8);
                        }
                    }
                    v4 = var4_3 + 1;
                }
                var3_5 = new int[v4][var5_4 + 1];
                for (var6_6 = 0; var6_6 <= var4_3; ++var6_6) {
                    var3_5[var6_6][0] = var6_6;
                    if (var2_2 != 0) continue;
                }
                for (var7_7 = 0; var7_7 <= var5_4; ++var7_7) {
                    try {
                        var3_5[0][var7_7] = var7_7;
                        if (var2_2 != 0) {
                            if (var2_2 != 0) continue;
                            break;
                        }
                        break block34;
                    }
                    catch (IllegalArgumentException v9) {
                        throw bj_1.a(v9);
                    }
                }
                var6_6 = 1;
            }
            block22: while (true) {
                v10 = var6_6;
                v11 = var4_3;
                block23: while (v10 <= v11) {
                    var8_8 = var0.charAt(var6_6 - 1);
                    v12 = 1;
                    if (var2_2 == 0) break block35;
                    for (var7_7 = v1845669; var7_7 <= var5_4; ++var7_7) {
                        block37: {
                            block36: {
                                var9_9 = var1_1.charAt(var7_7 - 1);
                                try {
                                    v13 = var8_8;
                                    if (var2_2 == 0) break block36;
                                    v11 = var9_9;
                                    if (var2_2 == 0) continue block23;
                                }
                                catch (IllegalArgumentException v14) {
                                    throw bj_1.a(v14);
                                }
                                if (v13 != v11) ** GOTO lbl90
                                var10_10 = '\u0000';
                                try {
                                    if (var2_2 != 0) break block37;
lbl90:
                                    // 2 sources

                                    v13 = '\u0001';
                                }
                                catch (IllegalArgumentException v15) {
                                    throw bj_1.a(v15);
                                }
                            }
                            var10_10 = v13;
                        }
                        var3_5[var6_6][var7_7] = uj_1.G(new int[]{var3_5[var6_6 - 1][var7_7] + 1, var3_5[var6_6][var7_7 - 1] + 1, var3_5[var6_6 - 1][var7_7 - 1] + var10_10});
                        if (var2_2 != 0) continue;
                    }
                    ++var6_6;
                    if (var2_2 != 0) continue block22;
                }
                break;
            }
            v12 = var3_5[var4_3][var5_4];
        }
        return v12;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "4[I\u0012C5)GBN\bYr4\b[\u001b\u0019Hr4\u0012CW".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 54;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 81;
                            break;
                        }
                        case 1: {
                            n17 = 25;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 77;
                            break;
                        }
                        case 4: {
                            n17 = 27;
                            break;
                        }
                        case 5: {
                            n17 = 100;
                            break;
                        }
                        default: {
                            n17 = 108;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

