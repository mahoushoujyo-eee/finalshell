/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.IG;
import com.S7;
import com.en_0;
import com.fc_0;
import com.ks_0;
import com.ky_2;
import com.wr_2;
import java.nio.charset.Charset;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.xj
 */
public class xj_2 {
    private Charset e = S7.v;
    private en_0 i = en_0.p();
    private IG n = IG.G();
    private fc_0 z;
    private EP[] O = new EP[]{EP.BrowserSecure};
    private wr_2[] t = new wr_2[0];
    private ks_0[] F = new ks_0[0];
    private Map s;
    private String f;
    private boolean D;
    private static boolean k;

    public xj_2() {
        boolean bl = xj_2.m();
        this.D = true;
        if (!bl) {
            ky_2.K(new String[2]);
        }
    }

    public en_0 J() {
        return this.i;
    }

    public void e(en_0 en_02) {
        this.i = en_02;
    }

    public IG A() {
        return this.n;
    }

    public void X(IG iG) {
        this.n = iG;
    }

    public EP[] g() {
        return this.O;
    }

    public void o(EP[] ePArray) {
        this.O = ePArray;
    }

    public wr_2[] y() {
        return this.t;
    }

    public void a(wr_2[] wr_2Array) {
        this.t = wr_2Array;
    }

    public ks_0[] J() {
        return this.F;
    }

    public void v(ks_0[] ks_0Array) {
        this.F = ks_0Array;
    }

    public Map B() {
        return this.s;
    }

    public void f(Map map) {
        block4: {
            boolean bl = xj_2.g();
            Map map2 = map;
            if (!bl) {
                if (map2 == null) {
                    return;
                }
                map2 = map;
            }
            for (Map.Entry entry : map2.entrySet()) {
                this.i.I((Class)entry.getKey(), (wr_2)entry.getValue());
                if (!bl) {
                    if (!bl) continue;
                }
                break block4;
            }
            this.s = map;
        }
    }

    public String r() {
        return this.f;
    }

    public void p(String string) {
        this.f = string;
    }

    public Charset b() {
        return this.e;
    }

    public void r(Charset charset) {
        this.e = charset;
    }

    public boolean i() {
        return this.D;
    }

    public void b(boolean bl) {
        this.D = bl;
    }

    public fc_0 u() {
        return this.z;
    }

    public void Q(fc_0 fc_02) {
        this.z = fc_02;
    }

    public static void p(boolean bl) {
        k = bl;
    }

    public static boolean m() {
        return k;
    }

    public static boolean g() {
        boolean bl = xj_2.m();
        return !bl;
    }

    static {
        if (!xj_2.m()) {
            xj_2.p(true);
        }
    }
}

