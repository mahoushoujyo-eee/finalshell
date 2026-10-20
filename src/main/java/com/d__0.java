/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XE;
import com.YP;
import com._y_0;
import com.c;
import com.j_0;
import com.o9_0;
import com.oz_2;
import com.pa_1;
import com.rp_1;
import com.sd_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.d_
 */
public class d__0 {
    private boolean g;
    protected XE T;
    private rp_1 X;
    private boolean I;
    private boolean p;
    private long v;
    private boolean j;
    final pa_1 i;
    private static final long[] a;
    private static final Integer[] b;

    public d__0(pa_1 pa_12) {
        this.i = pa_12;
        this.T = new XE();
        this.X = rp_1.BLINK_BLOCK;
        this.I = true;
        this.p = true;
    }

    public void z(int n10) {
        this.T.q = n10;
        this.E();
    }

    public void J(int n10) {
        this.T.r = n10;
        this.E();
    }

    public int Q() {
        int n10 = _y_0.M();
        d__0 d__02 = this;
        if (n10 != 0) {
            if (pa_1.H(d__02.i) != null) {
                return pa_1.H(this.i).x() - 1;
            }
            d__02 = this;
        }
        return d__02.T.q;
    }

    public int O() {
        return this.T.r - 1 - this.i.P;
    }

    public void d(boolean bl) {
        this.I = bl;
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean U() {
        int n10 = _y_0.y();
        byte n11 = this.p;
        if (n10 == 0) {
            if (n11 == 0) return 0 != 0;
            n11 = pa_1.k(this.i);
        }
        if (n10 != 0) return n11 != 0;
        if (n11 <= 0) return 0 != 0;
        return 1 != 0;
    }

    public void E() {
        this.j = true;
        this.v = System.currentTimeMillis();
        this.i.repaint();
    }

    private boolean d(long l2) {
        int n10 = _y_0.M();
        long l3 = l2 - this.v - (long)pa_1.k(this.i);
        long l4 = l3 == 0L ? (byte)0 : (l3 < 0L ? (byte)-1 : 1);
        if (n10 != 0) {
            l4 = l4 > 0 ? (long)1 : (long)0;
        }
        return (boolean)l4;
    }

    public void F() {
        block6: {
            long l2;
            int n10;
            block5: {
                n10 = _y_0.y();
                if (!this.i.isFocusOwner()) {
                    return;
                }
                l2 = System.currentTimeMillis();
                d__0 d__02 = this;
                if (n10 != 0) break block5;
                if (!d__02.d(l2)) break block6;
                d__02 = this;
            }
            boolean bl = this.g;
            if (n10 == 0) {
                bl = !bl;
            }
            d__02.g = bl;
            this.v = l2;
            this.j = false;
            this.i.repaint();
        }
    }

    private oz_2 M() {
        block5: {
            block3: {
                boolean bl;
                block4: {
                    int n10;
                    block2: {
                        n10 = _y_0.M();
                        bl = this.U();
                        if (n10 == 0) break block2;
                        if (!bl) break block3;
                        bl = this.j;
                    }
                    if (n10 == 0) break block4;
                    if (bl) break block3;
                    bl = this.g;
                }
                if (!bl) break block5;
            }
            return oz_2.SHOWING;
        }
        return oz_2.HIDDEN;
    }

    private oz_2 Y() {
        d__0 d__02;
        block6: {
            boolean bl;
            block5: {
                int n10 = _y_0.y();
                bl = this.I;
                if (n10 != 0) break block5;
                if (!bl) {
                    return oz_2.HIDDEN;
                }
                d__02 = this;
                if (n10 != 0) break block6;
                bl = d__02.i.isFocusOwner();
            }
            if (!bl) {
                return oz_2.NO_FOCUS;
            }
            d__02 = this;
        }
        return d__02.M();
    }

    void Z(String string, Graphics2D graphics2D, YP yP) {
        Color color;
        int n10;
        int n11;
        int n12;
        oz_2 oz_22;
        block17: {
            block16: {
                int n13;
                block15: {
                    oz_22 = this.Y();
                    n12 = _y_0.M();
                    if (oz_22 == oz_2.HIDDEN) {
                        return;
                    }
                    n11 = this.Q();
                    n13 = n10 = this.O();
                    if (n12 == 0) break block15;
                    if (n13 < 0) break block16;
                    n13 = n10;
                }
                if (n13 < this.i.N.c()) break block17;
            }
            return;
        }
        j_0 j_02 = new j_0(string);
        int n14 = n11 * this.i.c4.width + this.i.p();
        int n15 = n10 * this.i.c4.height;
        int n16 = sd_0.s(j_02.r(), j_02.o(), j_02.length(), pa_1.S(this.i).L());
        int n17 = Math.min(this.i.c4.height, this.i.getHeight() - n15);
        int n18 = Math.min(n16 * this.i.c4.width, this.i.getWidth() - n14);
        int n19 = 2;
        try {
            color = (Color)this.i.cM.m();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Color color2 = pa_1.C(color, d__0.a(13962, 9202906599151132374L));
        switch (o9_0.Q[this.X.ordinal()]) {
            case 1: 
            case 2: {
                if (oz_22 == oz_2.SHOWING) {
                    Color color3;
                    YP yP2 = pa_1.Y(this.i, yP);
                    Color color4 = pa_1.t(this.i, pa_1.Z(this.i).R(yP2.Z()));
                    try {
                        color3 = (Color)this.i.cM.m();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    color4 = pa_1.C(color3, d__0.a(5919, 134014653475028802L));
                    graphics2D.setColor(color4);
                    graphics2D.setColor(color2);
                    graphics2D.fillRect(n14, n15, n18, n17);
                    pa_1.M(this.i, n11, n10, j_02, yP, graphics2D, false, false);
                    if (n12 != 0) break;
                }
                graphics2D.setColor(color2);
                graphics2D.drawRect(n14, n15, n18, n17);
                if (n12 != 0) break;
            }
            case 3: 
            case 4: {
                graphics2D.setColor(color2);
                graphics2D.fillRect(n14, n15 + n17, n18, n19);
                if (n12 != 0) break;
            }
            case 5: 
            case 6: {
                graphics2D.setColor(color2);
                graphics2D.fillRect(n14, n15, n19, n17);
            }
        }
    }

    void p(rp_1 rp_12) {
        this.X = rp_12;
    }

    static boolean p(d__0 d__02, boolean bl) {
        d__02.p = bl;
        return d__02.p;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1615052263949713823L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "^\u00e0b\u00dd!z\u00be\"\u00aa<\u0004\u0018\u00d1\u00e9\u009f\u00b6";
        int n11 = "^\u00e0b\u00dd!z\u00be\"\u00aa<\u0004\u0018\u00d1\u00e9\u009f\u00b6".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x685D;
        if (b[n11] == null) {
            d__0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

