/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XB;

/*
 * Renamed from com.rE
 */
public class re_1 {
    public byte[] Q;
    public int V;
    private static final long[] a;
    private static final Integer[] b;

    public re_1() {
        this.Q = new byte[re_1.a(12121, 5268468176220594306L)];
    }

    public re_1(int n10) {
        this.Q = new byte[n10];
    }

    public re_1 c(int n10) {
        block4: {
            int n11;
            block5: {
                n11 = this.V;
                int[] nArray = XB.X();
                try {
                    try {
                        if (nArray != null) break block4;
                        if (n11 + 1 <= this.Q.length) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw re_1.a(unsupportedOperationException);
                    }
                    this.O(1);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw re_1.a(unsupportedOperationException);
                }
            }
            this.Q[n11++] = (byte)n10;
            this.V = n11;
        }
        return this;
    }

    re_1 W(int n10, int n11) {
        int n12 = this.V;
        try {
            if (n12 + 2 > this.Q.length) {
                this.O(2);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw re_1.a(unsupportedOperationException);
        }
        byte[] byArray = this.Q;
        byArray[n12++] = (byte)n10;
        byArray[n12++] = (byte)n11;
        this.V = n12;
        return this;
    }

    public re_1 G(int n10) {
        int n11 = this.V;
        try {
            if (n11 + 2 > this.Q.length) {
                this.O(2);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw re_1.a(unsupportedOperationException);
        }
        byte[] byArray = this.Q;
        byArray[n11++] = (byte)(n10 >>> re_1.a(25699, 7937009476032654265L));
        byArray[n11++] = (byte)n10;
        this.V = n11;
        return this;
    }

    public re_1 d(int n10, int n11) {
        int n12 = this.V;
        try {
            if (n12 + 3 > this.Q.length) {
                this.O(3);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw re_1.a(unsupportedOperationException);
        }
        byte[] byArray = this.Q;
        byArray[n12++] = (byte)n10;
        byArray[n12++] = (byte)(n11 >>> re_1.a(25699, 7937009476032654265L));
        byArray[n12++] = (byte)n11;
        this.V = n12;
        return this;
    }

    public re_1 z(int n10) {
        int n11 = this.V;
        try {
            if (n11 + 4 > this.Q.length) {
                this.O(4);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw re_1.a(unsupportedOperationException);
        }
        byte[] byArray = this.Q;
        byArray[n11++] = (byte)(n10 >>> re_1.a(15852, 1672534334041469491L));
        byArray[n11++] = (byte)(n10 >>> re_1.a(31170, 9066381730949035550L));
        byArray[n11++] = (byte)(n10 >>> re_1.a(25699, 7937009476032654265L));
        byArray[n11++] = (byte)n10;
        this.V = n11;
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public re_1 n(String var1_1) {
        block24: {
            var3_2 = var1_1.length();
            var2_3 = XB.X();
            var4_4 = this.V;
            try {
                if (var4_4 + 2 + var3_2 > this.Q.length) {
                    this.O(2 + var3_2);
                }
            }
            catch (UnsupportedOperationException v0) {
                throw re_1.a(v0);
            }
            var5_5 = this.Q;
            var5_5[var4_4++] = (byte)(var3_2 >>> re_1.a(1977, 7730067642735462500L));
            var5_5[var4_4++] = (byte)var3_2;
            for (var6_6 = 0; var6_6 < var3_2; ++var6_6) {
                block27: {
                    block25: {
                        var7_7 = var1_1.charAt(var6_6);
                        try {
                            block26: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var2_3 != null) break block24;
                                                v1 = var7_7;
                                                v2 = 1;
                                                if (var2_3 != null) break block25;
                                            }
                                            catch (UnsupportedOperationException v3) {
                                                throw re_1.a(v3);
                                            }
                                            if (v1 < v2) break block26;
                                        }
                                        catch (UnsupportedOperationException v4) {
                                            throw re_1.a(v4);
                                        }
                                        v1 = var7_7;
                                        v2 = re_1.a(7810, 4324873847841558874L);
                                        if (var2_3 != null) break block25;
                                    }
                                    catch (UnsupportedOperationException v5) {
                                        throw re_1.a(v5);
                                    }
                                    if (v1 > v2) {
                                    }
                                    ** GOTO lbl66
                                }
                                catch (UnsupportedOperationException v6) {
                                    throw re_1.a(v6);
                                }
                            }
                            v1 = var7_7;
                            v2 = re_1.a(24218, 1120974718376530244L);
                        }
                        catch (UnsupportedOperationException v7) {
                            throw re_1.a(v7);
                        }
                    }
                    try {
                        try {
                            if (var2_3 != null) break block27;
                            if (v1 >= v2) {
                            }
                            ** GOTO lbl71
                        }
                        catch (UnsupportedOperationException v8) {
                            throw re_1.a(v8);
                        }
                        v1 = var7_7;
                        v2 = re_1.a(18605, 7376052056962778996L);
                    }
                    catch (UnsupportedOperationException v9) {
                        throw re_1.a(v9);
                    }
                }
                try {
                    block28: {
                        try {
                            if (v1 > v2) break block28;
lbl66:
                            // 2 sources

                            var5_5[var4_4++] = (byte)var7_7;
                            if (var2_3 == null) continue;
                        }
                        catch (UnsupportedOperationException v10) {
                            throw re_1.a(v10);
                        }
                    }
                    throw new UnsupportedOperationException();
                }
                catch (UnsupportedOperationException v11) {
                    throw re_1.a(v11);
                }
            }
            this.V = var4_4;
        }
        return this;
    }

    public re_1 t(byte[] byArray, int n10, int n11) {
        block9: {
            byte[] byArray2;
            block8: {
                int[] nArray;
                block7: {
                    re_1 re_12;
                    block6: {
                        nArray = XB.X();
                        try {
                            try {
                                re_12 = this;
                                if (nArray != null) break block6;
                                if (re_12.V + n11 <= this.Q.length) break block7;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw re_1.a(unsupportedOperationException);
                            }
                            re_12 = this;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw re_1.a(unsupportedOperationException);
                        }
                    }
                    re_12.O(n11);
                }
                try {
                    byArray2 = byArray;
                    if (nArray != null) break block8;
                    if (byArray2 == null) break block9;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw re_1.a(unsupportedOperationException);
                }
                byArray2 = byArray;
            }
            System.arraycopy(byArray2, n10, this.Q, this.V, n11);
        }
        this.V += n11;
        return this;
    }

    private void O(int n10) {
        int n11;
        block4: {
            int n12;
            block5: {
                int n13 = 2 * this.Q.length;
                n12 = this.V + n10;
                int[] nArray = XB.X();
                try {
                    try {
                        n11 = n13;
                        if (nArray != null) break block4;
                        if (n11 <= n12) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw re_1.a(unsupportedOperationException);
                    }
                    n11 = n13;
                    break block4;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw re_1.a(unsupportedOperationException);
                }
            }
            n11 = n12;
        }
        byte[] byArray = new byte[n11];
        System.arraycopy(this.Q, 0, byArray, 0, this.V);
        this.Q = byArray;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6693200976260358911L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "e\u00b9\u00886dE:t\u0082\u00b6*\u00fd\u00de\u00b2\u00f3\u00dar\u0091\u00b2g\u00e2_\u00c2=f\u00cc\u00ac\f\u0095\u009e\tN\u00ba\u0087\u00b1E\u00d6\u00b6\u00ea\u0093\u001a\u001c[\u00c1o\u0005\u0014\u00f1";
                var5_4 = "e\u00b9\u00886dE:t\u0082\u00b6*\u00fd\u00de\u00b2\u00f3\u00dar\u0091\u00b2g\u00e2_\u00c2=f\u00cc\u00ac\f\u0095\u009e\tN\u00ba\u0087\u00b1E\u00d6\u00b6\u00ea\u0093\u001a\u001c[\u00c1o\u0005\u0014\u00f1".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00ed\u00b1\u008a\u00c2\u00efdP\u00d41\u00f6y\u00b5[M}\u00bb";
                    var5_4 = "\u00ed\u00b1\u008a\u00c2\u00efdP\u00d41\u00f6y\u00b5[M}\u00bb".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        re_1.a = var6_1;
        re_1.b = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xFD9;
        if (b[n11] == null) {
            re_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

