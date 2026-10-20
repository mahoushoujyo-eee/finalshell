/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.ow_2;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from com.ap
 */
public class ap_0 {
    int u;
    ow_2 A;
    int r = -1;
    HashMap U = new HashMap();
    ArrayList o;
    public int K;
    public int J;
    public int n;
    public int Q;
    public int t;
    public int H;
    private static String[] m;
    private static final long a;

    public ap_0(int n10) {
        String[] stringArray = ap_0.F();
        this.o = new ArrayList();
        this.K = -1;
        this.u = n10;
        if (ky_2.F() != null) {
            ap_0.q(new String[1]);
        }
    }

    public void t(char c2, int n10, boolean bl) {
        ap_0 ap_02;
        block15: {
            int n11;
            block11: {
                String[] stringArray;
                block12: {
                    ow_2 ow_22;
                    block13: {
                        block14: {
                            int n12;
                            block9: {
                                block10: {
                                    int n13 = 1;
                                    stringArray = ap_0.F();
                                    int n14 = bl;
                                    if (stringArray == null) {
                                        if (n14 != 0) {
                                            n13 = 2;
                                        }
                                        n14 = 0;
                                    }
                                    n12 = n14;
                                    ow_22 = this.A;
                                    if (stringArray != null) break block9;
                                    if (ow_22 == null) break block10;
                                    n11 = n10 - this.r;
                                    if (stringArray != null) break block11;
                                    if (n11 <= n13) break block12;
                                }
                                ow_22 = this.A;
                            }
                            if (stringArray != null) break block13;
                            if (ow_22 == null || n10 - this.r > n12 + 1) break block14;
                            this.A.a(n10);
                            if (stringArray == null) break block12;
                            ky_2.K(new String[2]);
                        }
                        ow_22 = new ow_2(n10);
                    }
                    ow_2 ow_23 = ow_22;
                    ow_23.z(this);
                    this.o.add(ow_23);
                    this.U.put(n10, ow_23);
                    this.A = ow_23;
                }
                this.r = n10;
                ap_02 = this;
                if (stringArray != null) break block15;
                n11 = ap_02.K;
            }
            if (n11 < 0) {
                this.K = n10;
            }
            this.J = n10;
            ap_02 = this;
        }
        ap_02.A.f(c2, bl);
    }

    public int x(int n10) {
        int n11;
        block4: {
            int n12 = -1;
            String[] stringArray = ap_0.F();
            if (n10 > 5) {
                // empty if block
            }
            int n13 = 0;
            while (n13 < this.o.size()) {
                ow_2 ow_22 = (ow_2)this.o.get(n13);
                if (stringArray == null) {
                    n11 = ow_22.T();
                    if (stringArray != null) break block4;
                    if (n11 < n10 && n10 - ow_22.T() < (int)a && stringArray == null) break;
                    ++n13;
                }
                if (stringArray == null) continue;
            }
            n11 = n12;
        }
        return n11;
    }

    public int I() {
        return this.u;
    }

    public void Q(int n10) {
        this.u = n10;
    }

    public ArrayList O() {
        return this.o;
    }

    public void U(ArrayList arrayList) {
        this.o = arrayList;
    }

    public int i() {
        return this.K;
    }

    public void X(int n10) {
        this.K = n10;
    }

    public int V() {
        return this.J;
    }

    public void g(int n10) {
        this.J = n10;
    }

    public static void q(String[] stringArray) {
        m = stringArray;
    }

    public static String[] F() {
        return m;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (ap_0.F() != null) {
            ap_0.q(new String[2]);
        }
        long l2 = 344147190590422132L;
        a = 0x5A1B398DE5973C7EL ^ l2;
    }
}

