/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class CC
implements Comparator {
    final Comparator j;
    final O8 f;
    String i;
    final String u;
    final km_0 I;
    private static final long[] a;
    private static final Long[] b;

    CC(km_0 km_02, String string) {
        this.I = km_02;
        this.u = string;
        this.j = Collator.getInstance(Locale.CHINA);
        this.f = new O8();
        this.i = this.u;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int compare(Object var1_1, Object var2_2) {
        block81: {
            block80: {
                block78: {
                    block79: {
                        block77: {
                            block76: {
                                block74: {
                                    block75: {
                                        var4_3 = "";
                                        var3_4 = km_0.U();
                                        var5_5 = "";
                                        var6_6 = 0L;
                                        var8_7 = 0L;
                                        var10_8 = 0L;
                                        var12_9 = 0L;
                                        var14_10 = 0L;
                                        var16_11 = 0L;
                                        var18_12 = 0;
                                        var19_13 = false;
                                        var20_14 = "";
                                        var21_15 = "";
                                        var22_16 = 0;
                                        var23_17 = 0;
                                        v0 = var1_1.getClass().equals(tf_2.class);
                                        if (var3_4 != null) break block74;
                                        if (v0 == 0) break block75;
                                        var24_18 /* !! */  = (tf_2)var1_1;
                                        try {
                                            v1 = (String)var24_18 /* !! */.M();
                                        }
                                        catch (InvocationTargetException v2) {
                                            throw v2.getTargetException();
                                        }
                                        var4_3 = v1;
                                        var6_6 = CC.a(15601, 4441317280584684305L);
                                        var22_16 = 1;
                                        try {
                                            v3 = (Long)var24_18 /* !! */.w();
                                        }
                                        catch (InvocationTargetException v4) {
                                            throw v4.getTargetException();
                                        }
                                        var10_8 = v3;
                                        try {
                                            v5 = (Integer)var24_18 /* !! */.y();
                                        }
                                        catch (InvocationTargetException v6) {
                                            throw v6.getTargetException();
                                        }
                                        var14_10 = v5;
                                        try {
                                            v7 = (Integer)var24_18 /* !! */.n();
                                        }
                                        catch (InvocationTargetException v8) {
                                            throw v8.getTargetException();
                                        }
                                        var18_12 = v7;
                                        if (var3_4 == null) break block76;
                                    }
                                    v0 = var1_1.getClass().equals(ck_2.class);
                                }
                                if (var3_4 != null) break block77;
                                if (v0 != 0) {
                                    var24_18 /* !! */  = (ck_2)var1_1;
                                    try {
                                        v9 = (String)var24_18 /* !! */.a();
                                    }
                                    catch (InvocationTargetException v10) {
                                        throw v10.getTargetException();
                                    }
                                    var4_3 = v9;
                                    try {
                                        v11 = (Long)var24_18 /* !! */.m();
                                    }
                                    catch (InvocationTargetException v12) {
                                        throw v12.getTargetException();
                                    }
                                    var6_6 = v11;
                                    try {
                                        v13 = var24_18 /* !! */.a();
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                    try {
                                        v15 = (String)lk_0.m(v13);
                                    }
                                    catch (InvocationTargetException v16) {
                                        throw v16.getTargetException();
                                    }
                                    var20_14 = v15;
                                    try {
                                        v17 = (Long)var24_18 /* !! */.Q();
                                    }
                                    catch (InvocationTargetException v18) {
                                        throw v18.getTargetException();
                                    }
                                    var10_8 = v17;
                                    try {
                                        v19 = (Integer)var24_18 /* !! */.v();
                                    }
                                    catch (InvocationTargetException v20) {
                                        throw v20.getTargetException();
                                    }
                                    var14_10 = v19;
                                    try {
                                        v21 = (Integer)var24_18 /* !! */.f();
                                    }
                                    catch (InvocationTargetException v22) {
                                        throw v22.getTargetException();
                                    }
                                    var18_12 = v21;
                                }
                            }
                            v0 = var2_2.getClass().equals(tf_2.class);
                        }
                        if (var3_4 != null) break block78;
                        if (v0 == 0) break block79;
                        var24_18 /* !! */  = (tf_2)var2_2;
                        try {
                            v23 = (String)var24_18 /* !! */.M();
                        }
                        catch (InvocationTargetException v24) {
                            throw v24.getTargetException();
                        }
                        var5_5 = v23;
                        var8_7 = CC.a(3196, 8685686214648652701L);
                        var23_17 = 1;
                        try {
                            v25 = (Long)var24_18 /* !! */.w();
                        }
                        catch (InvocationTargetException v26) {
                            throw v26.getTargetException();
                        }
                        var12_9 = v25;
                        try {
                            v27 = (Integer)var24_18 /* !! */.y();
                        }
                        catch (InvocationTargetException v28) {
                            throw v28.getTargetException();
                        }
                        var16_11 = v27;
                        if (var3_4 == null) break block80;
                    }
                    v0 = var2_2.getClass().equals(ck_2.class);
                }
                if (var3_4 != null) break block81;
                if (v0 != 0) {
                    var24_18 /* !! */  = (ck_2)var2_2;
                    try {
                        v29 = (String)var24_18 /* !! */.a();
                    }
                    catch (InvocationTargetException v30) {
                        throw v30.getTargetException();
                    }
                    var5_5 = v29;
                    try {
                        v31 = (Long)var24_18 /* !! */.m();
                    }
                    catch (InvocationTargetException v32) {
                        throw v32.getTargetException();
                    }
                    var8_7 = v31;
                    try {
                        v33 = var24_18 /* !! */.a();
                    }
                    catch (InvocationTargetException v34) {
                        throw v34.getTargetException();
                    }
                    try {
                        v35 = (String)lk_0.m(v33);
                    }
                    catch (InvocationTargetException v36) {
                        throw v36.getTargetException();
                    }
                    var21_15 = v35;
                    try {
                        v37 = (Long)var24_18 /* !! */.Q();
                    }
                    catch (InvocationTargetException v38) {
                        throw v38.getTargetException();
                    }
                    var12_9 = v37;
                    try {
                        v39 = (Integer)var24_18 /* !! */.v();
                    }
                    catch (InvocationTargetException v40) {
                        throw v40.getTargetException();
                    }
                    var16_11 = v39;
                }
            }
            v0 = var22_16;
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                v0 = var23_17;
                if (var3_4 == null) {
                    if (v0 == 0) {
                        return -1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var22_16;
            }
        }
        if (var3_4 == null) {
            if (v0 == 0) {
                v0 = var23_17;
                if (var3_4 == null) {
                    if (v0 != 0) {
                        return 1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = ((String)this.i).equals((String)kl_2.W);
            }
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                return ((Comparator)this.j).compare(var4_3, var5_5);
            }
            v0 = (int)((String)this.i).equals((String)kl_2.V);
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                try {
                    v41 = (Integer)this.f.t((Object)var6_6, (Object)var8_7);
                }
                catch (InvocationTargetException v42) {
                    throw v42.getTargetException();
                }
                var24_19 = v41;
                return var24_19;
            }
            v0 = (int)((String)this.i).equals((String)kl_2.H);
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                var24_20 = ((Comparator)this.j).compare(var20_14, var21_15);
                return var24_20;
            }
            v0 = (int)((String)this.i).equals((String)kl_2.w);
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                try {
                    v43 = (Integer)this.f.t((Object)var10_8, (Object)var12_9);
                }
                catch (InvocationTargetException v44) {
                    throw v44.getTargetException();
                }
                var24_21 = v43;
                return var24_21;
            }
            v0 = (int)((String)this.i).equals((String)kl_2.e);
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                try {
                    v45 = (Integer)this.f.t((Object)var14_10, (Object)var16_11);
                }
                catch (InvocationTargetException v46) {
                    throw v46.getTargetException();
                }
                var24_22 = v45;
                return var24_22;
            }
            v0 = (int)((String)this.i).equals((String)kl_2.A);
        }
        if (var3_4 == null) {
            if (v0 != 0) {
                var24_23 = Integer.compare(var18_12, var18_12);
                return var24_23;
            }
            v0 = 1;
        }
        return v0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2030168292669858016L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00deq\u00de8\u00ad+\f\u000e\u009bZ\u00a5&_\u0085<\u0082";
        int n11 = "\u00deq\u00de8\u00ad+\f\u000e\u009bZ\u00a5&_\u0085<\u0082".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x6FE0) & Short.MAX_VALUE;
        if (b[n11] == null) {
            CC.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

