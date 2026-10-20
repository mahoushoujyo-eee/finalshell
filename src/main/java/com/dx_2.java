/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WZ;
import com.j_0;
import com.ko_0;
import com.pe_1;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.dx
 */
public class dx_2 {
    private final String R;
    private final int P;
    private int I;
    private int k;
    private final ArrayList U = new ArrayList();
    private int n;
    private int h = 0;
    private final WZ b = new WZ();
    private final boolean z;
    private static String u;
    private static final long[] a;
    private static final Integer[] c;

    public dx_2(String string, boolean bl) {
        this.z = bl;
        this.R = bl ? string.toLowerCase() : string;
        this.P = this.R.hashCode();
    }

    public void A(int n10, int n11, j_0 j_02, int n12) {
        block17: {
            block20: {
                dx_2 dx_22;
                block21: {
                    int n13;
                    String string;
                    block19: {
                        block18: {
                            int n14;
                            int n15;
                            int n16;
                            block16: {
                                block13: {
                                    block14: {
                                        dx_2 dx_23;
                                        block15: {
                                            int n17;
                                            block9: {
                                                block10: {
                                                    dx_2 dx_24;
                                                    block11: {
                                                        block12: {
                                                            dx_2 dx_25;
                                                            block8: {
                                                                block6: {
                                                                    int n18;
                                                                    block7: {
                                                                        string = dx_2.g();
                                                                        n18 = this.U.size();
                                                                        if (string != null) break block6;
                                                                        if (n18 == 0) break block7;
                                                                        dx_25 = this;
                                                                        if (string != null) break block8;
                                                                        if (((ko_0)dx_25.U.get((int)(this.U.size() - 1))).G == j_02) break block6;
                                                                    }
                                                                    n18 = this.U.add(new ko_0(n10, n11, j_02, null)) ? 1 : 0;
                                                                }
                                                                dx_25 = this;
                                                            }
                                                            n17 = dx_25.k;
                                                            if (string != null) break block9;
                                                            if (n17 != this.R.length()) break block10;
                                                            this.I -= this.E(((ko_0)this.U.get((int)0)).G.charAt(this.n));
                                                            dx_24 = this;
                                                            if (string != null) break block11;
                                                            if (dx_24.n + 1 != ((ko_0)this.U.get((int)0)).G.length()) break block12;
                                                            this.n = 0;
                                                            this.U.remove(0);
                                                            if (string == null) break block13;
                                                        }
                                                        dx_24 = this;
                                                    }
                                                    ++dx_24.n;
                                                    if (string == null) break block13;
                                                }
                                                ++this.k;
                                                dx_23 = this;
                                                if (string != null) break block14;
                                                n17 = dx_23.h;
                                            }
                                            if (n17 != 0) break block15;
                                            this.h = 1;
                                            if (string == null) break block13;
                                        }
                                        dx_23 = this;
                                    }
                                    dx_23.h *= dx_2.a(4038, 4021667367342458382L);
                                }
                                this.I = dx_2.a(30845, 6464615397422674356L) * this.I + this.V(j_02.charAt(n12));
                                int n15 = this.k;
                                n15 = this.R.length();
                                if (string != null) break block16;
                                if (n16 != n15) break block17;
                                int n15 = this.I;
                                n15 = this.P;
                            }
                            if (n16 != n15) break block17;
                            pe_1 pe_12 = new pe_1(this.U, this.n, n12, -1, null);
                            String string2 = pe_12.O();
                            n13 = n14 = this.R.equals(this.z ? string2.toLowerCase() : string2);
                            if (string != null) break block18;
                            if (n13 == 0) break block17;
                            n13 = this.i(pe_12);
                        }
                        if (string != null) break block19;
                        if (n13 == 0) break block17;
                        this.b.I(this.U, this.n, n12);
                        this.I = 0;
                        this.k = 0;
                        this.h = 0;
                        dx_22 = this;
                        if (string != null) break block20;
                        dx_22.U.clear();
                        n13 = n12 + 1;
                    }
                    if (n13 >= j_02.length()) break block21;
                    this.n = n12 + 1;
                    this.U.add(new ko_0(n10, n11, j_02, null));
                    if (string == null) break block17;
                }
                dx_22 = this;
            }
            dx_22.n = 0;
        }
    }

    public boolean i(@NotNull pe_1 pe_12) {
        return true;
    }

    private int V(char c2) {
        String string = dx_2.g();
        char c3 = this.z;
        if (string == null) {
            c3 = c3 != '\u0000' ? Character.toLowerCase(c2) : c2;
        }
        return c3;
    }

    private int E(char c2) {
        return this.h * this.V(c2);
    }

    public WZ i() {
        return this.b;
    }

    public static void f(String string) {
        u = string;
    }

    public static String g() {
        return u;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5818019995361388001L;
        long[] lArray = new long[2];
        dx_2.f(null);
        int n10 = 0;
        String string = "p\u00e2\u0010x\u00bbD\u0094J?\u00ec\u00ad~\u00fc\u0098\u00e3\u00f0";
        int n11 = "p\u00e2\u0010x\u00bbD\u0094J?\u00ec\u00ad~\u00fc\u0098\u00e3\u00f0".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x49C9;
        if (c[n11] == null) {
            dx_2.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

