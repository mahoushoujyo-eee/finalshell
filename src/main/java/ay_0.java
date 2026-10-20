/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from ay
 */
class ay_0 {
    private static final char[] g;
    private static final long[] a;
    private static final Integer[] b;

    private ay_0() {
    }

    public static String t(byte[] byArray) {
        int n10;
        int n11;
        char[] cArray;
        block9: {
            int n12 = byArray.length;
            ky_2[] ky_2Array = fi_2.P();
            cArray = new char[(n12 + 2) / 3 * 4];
            int n13 = 0;
            int n14 = 0;
            while (n14 < n12) {
                byte by = byArray[n14++];
                int n15 = n14;
                if (ky_2Array != null) {
                    n11 = n12;
                    if (ky_2Array == null) break block9;
                    n15 = n15 < n11 ? byArray[n14++] : 0;
                }
                int n16 = n15;
                int n17 = n14;
                if (ky_2Array != null) {
                    n17 = n17 < n12 ? byArray[n14++] : 0;
                }
                int n18 = n17;
                int n19 = ay_0.a(27827, 6077948616564211403L);
                cArray[n13++] = g[by >> 2 & n19];
                cArray[n13++] = g[(by << 4 | (n16 & ay_0.a(17469, 9021483185561425472L)) >> 4) & n19];
                cArray[n13++] = g[(n16 << 2 | (n18 & ay_0.a(19347, 1157997775080249834L)) >> ay_0.a(24830, 6974669450115773056L)) & n19];
                cArray[n13++] = g[n18 & n19];
                if (ky_2Array != null) continue;
            }
            n10 = n12;
            n11 = 3;
        }
        switch (n10 % n11) {
            case 1: {
                cArray[--n13] = ay_0.a(12247, 735669356167445931L);
            }
            case 2: {
                cArray[--n13] = ay_0.a(1381, 8391079609962075930L);
            }
        }
        String string = new String(cArray);
        if (ky_2.F() != null) {
            fi_2.N(new ky_2[1]);
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u001be;AD-S\u0012n2NM&Z\u0015w)WR?A\fp \\[\nv9C\u001dcf\u0003}0L\u0014ho\u0004d+U\u000bqt\u001dc\"^\u000250Y'n\u0012N29R?u".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 46;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var9_1;
                    while (true) {
                        switch (var9_1 % 7) {
                            case 0: {
                                v9 = 116;
                                break;
                            }
                            case 1: {
                                v9 = 9;
                                break;
                            }
                            case 2: {
                                v9 = 86;
                                break;
                            }
                            case 3: {
                                v9 = 43;
                                break;
                            }
                            case 4: {
                                v9 = 47;
                                break;
                            }
                            case 5: {
                                v9 = 69;
                                break;
                            }
                            default: {
                                v9 = 58;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var9_1;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var9_1);
                ** while (true)
                var8 = new String(v10).intern();
                var0_2 = 8666609930285006028L;
                var6_3 = new long[6];
                var3_4 = 0;
                var4_5 = "@\u00d7t\u00c2\u00eb\u0002\u0081Z\u00c7\u00c4\u0097\u0091\u0093\u000e\u00eas\u0019\u00cd\u00f5S\ni\u00ceJN|\u00fa\u00a2\u00d4R\u00ab\u00eb";
                var5_6 = "@\u00d7t\u00c2\u00eb\u0002\u0081Z\u00c7\u00c4\u0097\u0091\u0093\u000e\u00eas\u0019\u00cd\u00f5S\ni\u00ceJN|\u00fa\u00a2\u00d4R\u00ab\u00eb".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v11 = var6_3;
                    v12 = var3_4++;
                    v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00a65\u0093C \u00e0B83\u00ac\u008a\u00cd\u000f\u00dbe\u00d9";
                    var5_6 = "\u00a65\u0093C \u00e0B83\u00ac\u008a\u00cd\u000f\u00dbe\u00d9".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v11 = var6_3;
                        v12 = var3_4++;
                        v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_2;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        ay_0.a = var6_3;
        ay_0.b = new Integer[6];
        ay_0.g = var8.toCharArray();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x127C;
        if (b[n11] == null) {
            ay_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

