/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k5_0;
import com.o8_0;
import com.oh_2;
import com.xt_0;
import java.awt.Color;
import java.awt.Component;

/*
 * Renamed from com.kW
 */
public class kw_1
extends k5_0 {
    private o8_0 x = null;
    private int k;
    private int R;
    private Color o;
    private xt_0 c;
    private static final long[] e;
    private static final Integer[] f;

    public kw_1() {
        this.k = kw_1.a(772, 3118536602164193555L);
        this.R = 1;
        this.o = Color.GRAY;
        this.N();
    }

    public kw_1(Component component) {
        super(component);
        this.k = kw_1.a(806, 8931361481806670128L);
        this.R = 1;
        this.o = Color.GRAY;
        this.N();
    }

    protected void N() {
        this.c = new xt_0(this);
        this.c.setVisible(false);
        this.A(this.c);
    }

    @Override
    public void H(Component component) {
        super.H(component);
        this.D(component != null ? new oh_2(component) : null);
    }

    public void D(o8_0 o8_02) {
        this.x = o8_02;
    }

    public o8_0 c() {
        return this.x;
    }

    public boolean k() {
        return this.c.V();
    }

    public void U(boolean bl) {
        this.c.a(bl);
    }

    public boolean d() {
        return this.c.r();
    }

    public void k(boolean bl) {
        this.c.o(bl);
    }

    public int J() {
        return this.k;
    }

    public void P(int n10) {
        this.k = n10;
    }

    public int o() {
        return this.R;
    }

    public void w(int n10) {
        this.R = n10;
    }

    public Color Q() {
        return this.o;
    }

    public void U(Color color) {
        this.o = color;
    }

    static int e(kw_1 kw_12) {
        return kw_12.R;
    }

    static Color w(kw_1 kw_12) {
        return kw_12.o;
    }

    static o8_0 P(kw_1 kw_12) {
        return kw_12.x;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3912541653690464685L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "N\u00dao\u0006\u000e\u0092\u00d0\u0092\u00cbC9\u008e\u00da/P\u00b1";
        int n11 = "N\u00dao\u0006\u000e\u0092\u00d0\u0092\u00cbC9\u008e\u00da/P\u00b1".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        e = lArray;
        f = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A16;
        if (f[n11] == null) {
            kw_1.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

