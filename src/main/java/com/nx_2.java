/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B1;
import com.FN;
import com.H4;
import com.HP;
import com.KD;
import com.KM;
import com.P9;
import com.S_;
import com.YM;
import com.ce_1;
import com.ds_0;
import com.k7_0;
import com.ll_2;
import com.ne_1;
import com.ne_2;
import com.nq_2;
import com.nu_1;
import com.p1_0;
import com.py_0;
import com.t.n_0;
import com.wb_0;
import com.xg_0;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.nx
 */
public class nx_2
extends ne_2 {
    public static final ImageIcon Y;
    protected k7_0 K;
    protected boolean X = true;
    protected final int o = nx_2.a(29758, 5744036123628311584L);
    protected final int F = nx_2.a(13465, 8728646085917758597L);
    protected String n = "";
    protected Color E;
    protected final KD d;
    protected Robot j;
    protected wb_0 L;
    protected ds_0 S;
    protected n_0 R;
    private static int l;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public nx_2() {
        this(Color.WHITE);
    }

    public nx_2(Color color) {
        this.s();
        this.setHorizontalAlignment(0);
        this.o();
        this.d = new KD(xg_0.L(color));
        this.d.setFocusable(false);
        this.d.f(0);
        this.d.t(false);
        this.d.K(true);
        this.d.setCursor(Cursor.getDefaultCursor());
        this.d.addActionListener(new H4(this));
        this.z(this.d);
        this.addActionListener(new ll_2(this));
        this.addFocusListener(new ce_1(this));
        this.addMouseListener(new KM(this));
        this.addKeyListener(new py_0(this));
        this.y(k7_0.rgb);
        this.T(color);
    }

    public boolean c() {
        return this.X;
    }

    public void Y(boolean bl) {
        this.X = bl;
        this.o();
    }

    public Color D() {
        return this.E;
    }

    public void y(Color color) {
        this.T(color);
    }

    protected void T(Color color) {
        Color color2 = this.E;
        this.E = color;
        this.x();
        this.n(color2, color);
    }

    public k7_0 h() {
        return this.K;
    }

    public void y(k7_0 k7_02) {
        this.K = k7_02;
        this.u();
    }

    @Override
    public void y(boolean bl) {
        super.y(bl);
        this.s();
    }

    protected void x() {
        this.d.setIcon(xg_0.L(this.E));
        this.p();
    }

    /*
     * Unable to fully structure code
     */
    protected void b() {
        block14: {
            var2_1 = this.getText();
            var1_2 = nx_2.c();
            try {
                v0 = var2_1.equals(this.n);
                if (var1_2 != 0) {
                    if (v0) break block14;
                }
                ** GOTO lbl13
            }
            catch (Throwable v1) {
                throw nx_2.b(v1);
            }
            try {
                block15: {
                    v0 = this.K.equals((Object)k7_0.hex);
lbl13:
                    // 2 sources

                    var3_3 = v0;
                    try {
                        v2 = var3_3 != false ? P9.C(var2_1) : P9.u(var2_1);
                    }
                    catch (Throwable v3) {
                        throw nx_2.b(v3);
                    }
                    var4_5 = v2;
                    v4 = var4_5;
                    if (var1_2 == 0) break block15;
                    try {
                        block16: {
                            if (v4 == null) ** GOTO lbl37
                            break block16;
                            catch (Throwable v5) {
                                throw nx_2.b(v5);
                            }
                        }
                        v4 = P9.M(var4_5);
                    }
                    catch (Throwable v6) {
                        throw nx_2.b(v6);
                    }
                }
                var4_5 = v4;
                try {
                    this.T(var4_5);
                    if (var1_2 != 0) break block14;
lbl37:
                    // 2 sources

                    this.x();
                }
                catch (Throwable v7) {
                    throw nx_2.b(v7);
                }
            }
            catch (Throwable var3_4) {
                this.x();
            }
        }
    }

    protected void u() {
        block5: {
            int n10;
            k7_0 k7_02;
            int n11;
            block4: {
                n11 = nx_2.R();
                k7_02 = this.K;
                if (n11 != 0) break block4;
                if (k7_02 == null) break block5;
                k7_02 = this.K;
            }
            int n12 = n10 = k7_02.equals((Object)k7_0.hex);
            if (n11 == 0) {
                n12 = n12 != 0 ? nx_2.a(1062, 1987554735933547579L) : nx_2.a(11413, 8299474732993105034L);
            }
            this.setColumns(n12);
            this.p();
        }
    }

    protected void p() {
        block3: {
            nx_2 nx_22;
            block2: {
                int n10 = nx_2.c();
                nx_22 = this;
                if (n10 == 0) break block2;
                if (nx_22.E == null) break block3;
                nx_22 = this;
            }
            String string = nx_22.w(this.E);
            this.setText(string);
            this.n = string;
        }
    }

    protected String w(Color color) {
        boolean bl = this.K.equals((Object)k7_0.hex);
        return bl ? P9.u(color) : color.getRed() + "," + color.getGreen() + "," + color.getBlue();
    }

    protected void s() {
        this.setMargin(this.g() ? new Insets(-1, 0, -1, -1) : new Insets(0, 0, 0, 0));
    }

    protected void o() {
        block4: {
            nx_2 nx_22;
            block2: {
                block3: {
                    int n10 = nx_2.c();
                    nx_22 = this;
                    if (n10 == 0) break block2;
                    if (!nx_22.X) break block3;
                    this.N();
                    if (n10 != 0) break block4;
                }
                nx_22 = this;
            }
            nx_22.f();
        }
        this.revalidate();
    }

    protected void N() {
        nx_2 nx_22;
        block6: {
            block7: {
                int n10 = nx_2.c();
                try {
                    nx_22 = this;
                    if (n10 == 0) break block6;
                    if (nx_22.L != null) break block7;
                }
                catch (AWTException aWTException) {
                    throw nx_2.b(aWTException);
                }
                this.L = new wb_0(Y);
                try {
                    this.j = new Robot();
                }
                catch (AWTException aWTException) {
                    ne_1.g(this, aWTException);
                }
                try {
                    nx_22 = this;
                    if (n10 == 0) break block6;
                    if (nx_22.j == null) break block7;
                }
                catch (AWTException aWTException) {
                    throw nx_2.b(aWTException);
                }
                YM yM = new YM(this);
                this.L.addMouseListener(yM);
                this.L.addMouseMotionListener(yM);
                this.L.setCursor(Cursor.getDefaultCursor());
            }
            nx_22 = this;
        }
        nx_22.v(this.L);
    }

    protected void f() {
        this.v((JComponent)null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void j() {
        block13: {
            block11: {
                block12: {
                    block9: {
                        block10: {
                            var1_1 = nx_2.c();
                            v0 = this;
                            if (var1_1 != 0) {
                                if (!v0.requestFocusInWindow()) {
                                    v0 = this;
                                    if (var1_1 != 0) {
                                        if (!v0.isFocusOwner()) {
                                            return;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    this.b();
                                    v0 = this;
                                }
                            }
                            v1 /* !! */  = v0.S;
                            if (var1_1 == 0) break block9;
                            if (v1 /* !! */  == null) break block10;
                            v2 = this.R;
                            if (var1_1 == 0) break block11;
                            if (v2 != null) break block12;
                        }
                        v1 /* !! */  = FN.L(this);
                    }
                    var2_2 = v1 /* !! */ ;
                    this.R = new n_0(true);
                    this.R.x(this.E);
                    this.S = new ds_0((Window)var2_2);
                    this.S.B(5);
                    this.S.r(true);
                    this.S.add(this.R);
                    this.y();
                    var2_2.addComponentListener(new nu_1(this));
                    var2_2.addPropertyChangeListener(nx_2.a(-16103, -6096), new S_(this));
                    this.R.T(new p1_0(this));
                    if (var1_1 != 0) break block13;
                }
                this.y();
                v2 = this.R;
            }
            v2.x(this.E);
        }
        FN.y(this, this.S);
        this.S.I(this, B1.down, nq_2.centered);
        this.R.requestFocusInWindow();
    }

    protected void y() {
        int n10;
        int n11;
        block18: {
            int n12;
            int n13;
            int n14;
            block16: {
                Point point;
                block17: {
                    int n15;
                    Rectangle rectangle;
                    block13: {
                        int n16;
                        int n17;
                        block14: {
                            int n18;
                            block15: {
                                int n19;
                                block9: {
                                    block10: {
                                        int n20;
                                        int n21;
                                        block11: {
                                            block12: {
                                                point = this.getLocationOnScreen();
                                                n14 = nx_2.c();
                                                rectangle = this.S.getGraphicsConfiguration().getBounds();
                                                int n22 = this.g();
                                                if (n14 != 0) {
                                                    n22 = n22 != 0 ? this.L() : 0;
                                                }
                                                n18 = n22;
                                                int n23 = this.getComponentOrientation().isLeftToRight();
                                                n19 = this.getWidth();
                                                n15 = this.getHeight();
                                                n17 = n23;
                                                if (n14 == 0) break block9;
                                                if (n17 == 0) break block10;
                                                int n20 = point.x + n18 + this.S.getWidth();
                                                n20 = rectangle.x + rectangle.width;
                                                if (n14 == 0) break block11;
                                                if (n21 > n20) break block12;
                                                n11 = point.x + n18;
                                                if (n14 != 0) break block13;
                                            }
                                            int n20 = point.x + n19 - n18;
                                            n20 = this.S.getWidth();
                                        }
                                        n11 = n21 - n20;
                                        if (n14 != 0) break block13;
                                    }
                                    n17 = point.x + n19 - n18 - this.S.getWidth();
                                }
                                n16 = rectangle.x;
                                if (n14 == 0) break block14;
                                if (n17 < n16) break block15;
                                n11 = point.x + n19 - n18 - this.S.getWidth();
                                if (n14 != 0) break block13;
                            }
                            int n16 = point.x;
                            n16 = n18;
                        }
                        n11 = n17 + n16;
                    }
                    int n12 = point.y + n15 + this.S.getHeight();
                    n12 = rectangle.y + rectangle.height;
                    if (n14 == 0) break block16;
                    if (n13 > n12) break block17;
                    int n24 = point.y + n15;
                    n24 = this.g();
                    if (n14 != 0) {
                        n24 = n24 != 0 ? 0 : 1;
                    }
                    n10 = n23 + n24;
                    if (n14 != 0) break block18;
                }
                int n12 = point.y - this.S.getHeight();
                n12 = this.g() ? 1 : 0;
            }
            if (n14 != 0) {
                n12 = n12 != 0 ? 0 : 1;
            }
            n10 = n13 - n12;
        }
        this.S.setLocation(n11, n10);
    }

    public void s(HP hP2) {
        this.listenerList.add(HP.class, hP2);
    }

    public void J(HP hP2) {
        this.listenerList.remove(HP.class, hP2);
    }

    public void n(Color color, Color color2) {
        HP[] hPArray = (HP[])this.listenerList.getListeners(HP.class);
        int n10 = hPArray.length;
        int n11 = nx_2.c();
        for (int i2 = 0; i2 < n10; ++i2) {
            HP hP2 = hPArray[i2];
            hP2.p(color, color2);
            if (n11 != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00b8\u00a0an-\u0014pT\u000b\u00e5\u00c1\u00cb!&Za\u00f1{K#\u0014?9\u00d8\u00ceD\u009c\u00c2;L\u00d6\u001a\u00e5O;1\f\u00f5\u00be\u00db\u00a8";
                    var12_3 = "\u00b8\u00a0an-\u0014pT\u000b\u00e5\u00c1\u00cb!&Za\u00f1{K#\u0014?9\u00d8\u00ceD\u009c\u00c2;L\u00d6\u001a\u00e5O;1\f\u00f5\u00be\u00db\u00a8".length();
                    var9_4 = 20;
                    nx_2.b(0);
                    var8_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 58;
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
                                    v11 = 57;
                                    break;
                                }
                                case 1: {
                                    v11 = 123;
                                    break;
                                }
                                case 2: {
                                    v11 = 7;
                                    break;
                                }
                                case 3: {
                                    v11 = 9;
                                    break;
                                }
                                case 4: {
                                    v11 = 109;
                                    break;
                                }
                                case 5: {
                                    v11 = 9;
                                    break;
                                }
                                default: {
                                    v11 = 125;
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
                nx_2.a = var13;
                nx_2.b = new String[2];
                var0_7 = 3276053663627001325L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "R\u00c0\u00b3S7\u00f8\u00f1n\u0006\u00ca\u00a0\b\u00f0z)\u00c4";
                var5_11 = "R\u00c0\u00b3S7\u00f8\u00f1n\u0006\u00ca\u00a0\b\u00f0z)\u00c4".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00e6\f(*SlY\u00d0\u00aa\u0097\u00ec`L\u00a1\u00e9c";
                    var5_11 = "\u00e6\f(*SlY\u00d0\u00aa\u0097\u00ec`L\u00a1\u00e9c".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl115:
                // 1 sources

                ** continue;
            }
        }
        nx_2.c = var6_8;
        nx_2.e = new Integer[4];
        nx_2.Y = new ImageIcon(nx_2.class.getResource(nx_2.a(-16104, 80)));
    }

    public static void b(int n10) {
        l = n10;
    }

    public static int R() {
        return l;
    }

    public static int c() {
        int n10 = nx_2.R();
        if (n10 == 0) {
            return 123;
        }
        return 0;
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC118) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 57;
                    break;
                }
                case 1: {
                    n14 = 177;
                    break;
                }
                case 2: {
                    n14 = 56;
                    break;
                }
                case 3: {
                    n14 = 113;
                    break;
                }
                case 4: {
                    n14 = 229;
                    break;
                }
                case 5: {
                    n14 = 167;
                    break;
                }
                case 6: {
                    n14 = 215;
                    break;
                }
                case 7: {
                    n14 = 104;
                    break;
                }
                case 8: {
                    n14 = 103;
                    break;
                }
                case 9: {
                    n14 = 121;
                    break;
                }
                case 10: {
                    n14 = 7;
                    break;
                }
                case 11: {
                    n14 = 128;
                    break;
                }
                case 12: {
                    n14 = 10;
                    break;
                }
                case 13: {
                    n14 = 161;
                    break;
                }
                case 14: {
                    n14 = 65;
                    break;
                }
                case 15: {
                    n14 = 173;
                    break;
                }
                case 16: {
                    n14 = 4;
                    break;
                }
                case 17: {
                    n14 = 196;
                    break;
                }
                case 18: {
                    n14 = 210;
                    break;
                }
                case 19: {
                    n14 = 178;
                    break;
                }
                case 20: {
                    n14 = 33;
                    break;
                }
                case 21: {
                    n14 = 226;
                    break;
                }
                case 22: {
                    n14 = 117;
                    break;
                }
                case 23: {
                    n14 = 64;
                    break;
                }
                case 24: {
                    n14 = 159;
                    break;
                }
                case 25: {
                    n14 = 68;
                    break;
                }
                case 26: {
                    n14 = 129;
                    break;
                }
                case 27: {
                    n14 = 115;
                    break;
                }
                case 28: {
                    n14 = 75;
                    break;
                }
                case 29: {
                    n14 = 146;
                    break;
                }
                case 30: {
                    n14 = 42;
                    break;
                }
                case 31: {
                    n14 = 221;
                    break;
                }
                case 32: {
                    n14 = 134;
                    break;
                }
                case 33: {
                    n14 = 34;
                    break;
                }
                case 34: {
                    n14 = 188;
                    break;
                }
                case 35: {
                    n14 = 165;
                    break;
                }
                case 36: {
                    n14 = 199;
                    break;
                }
                case 37: {
                    n14 = 164;
                    break;
                }
                case 38: {
                    n14 = 107;
                    break;
                }
                case 39: {
                    n14 = 216;
                    break;
                }
                case 40: {
                    n14 = 174;
                    break;
                }
                case 41: {
                    n14 = 184;
                    break;
                }
                case 42: {
                    n14 = 48;
                    break;
                }
                case 43: {
                    n14 = 110;
                    break;
                }
                case 44: {
                    n14 = 18;
                    break;
                }
                case 45: {
                    n14 = 43;
                    break;
                }
                case 46: {
                    n14 = 20;
                    break;
                }
                case 47: {
                    n14 = 101;
                    break;
                }
                case 48: {
                    n14 = 200;
                    break;
                }
                case 49: {
                    n14 = 217;
                    break;
                }
                case 50: {
                    n14 = 70;
                    break;
                }
                case 51: {
                    n14 = 150;
                    break;
                }
                case 52: {
                    n14 = 131;
                    break;
                }
                case 53: {
                    n14 = 202;
                    break;
                }
                case 54: {
                    n14 = 231;
                    break;
                }
                case 55: {
                    n14 = 242;
                    break;
                }
                case 56: {
                    n14 = 94;
                    break;
                }
                case 57: {
                    n14 = 250;
                    break;
                }
                case 58: {
                    n14 = 71;
                    break;
                }
                case 59: {
                    n14 = 51;
                    break;
                }
                case 60: {
                    n14 = 209;
                    break;
                }
                case 61: {
                    n14 = 50;
                    break;
                }
                case 62: {
                    n14 = 179;
                    break;
                }
                case 63: {
                    n14 = 76;
                    break;
                }
                case 64: {
                    n14 = 11;
                    break;
                }
                case 65: {
                    n14 = 233;
                    break;
                }
                case 66: {
                    n14 = 54;
                    break;
                }
                case 67: {
                    n14 = 83;
                    break;
                }
                case 68: {
                    n14 = 29;
                    break;
                }
                case 69: {
                    n14 = 133;
                    break;
                }
                case 70: {
                    n14 = 154;
                    break;
                }
                case 71: {
                    n14 = 246;
                    break;
                }
                case 72: {
                    n14 = 219;
                    break;
                }
                case 73: {
                    n14 = 37;
                    break;
                }
                case 74: {
                    n14 = 239;
                    break;
                }
                case 75: {
                    n14 = 249;
                    break;
                }
                case 76: {
                    n14 = 99;
                    break;
                }
                case 77: {
                    n14 = 148;
                    break;
                }
                case 78: {
                    n14 = 39;
                    break;
                }
                case 79: {
                    n14 = 236;
                    break;
                }
                case 80: {
                    n14 = 194;
                    break;
                }
                case 81: {
                    n14 = 213;
                    break;
                }
                case 82: {
                    n14 = 255;
                    break;
                }
                case 83: {
                    n14 = 80;
                    break;
                }
                case 84: {
                    n14 = 183;
                    break;
                }
                case 85: {
                    n14 = 105;
                    break;
                }
                case 86: {
                    n14 = 69;
                    break;
                }
                case 87: {
                    n14 = 224;
                    break;
                }
                case 88: {
                    n14 = 40;
                    break;
                }
                case 89: {
                    n14 = 225;
                    break;
                }
                case 90: {
                    n14 = 140;
                    break;
                }
                case 91: {
                    n14 = 74;
                    break;
                }
                case 92: {
                    n14 = 92;
                    break;
                }
                case 93: {
                    n14 = 17;
                    break;
                }
                case 94: {
                    n14 = 93;
                    break;
                }
                case 95: {
                    n14 = 222;
                    break;
                }
                case 96: {
                    n14 = 86;
                    break;
                }
                case 97: {
                    n14 = 81;
                    break;
                }
                case 98: {
                    n14 = 22;
                    break;
                }
                case 99: {
                    n14 = 91;
                    break;
                }
                case 100: {
                    n14 = 15;
                    break;
                }
                case 101: {
                    n14 = 163;
                    break;
                }
                case 102: {
                    n14 = 124;
                    break;
                }
                case 103: {
                    n14 = 120;
                    break;
                }
                case 104: {
                    n14 = 238;
                    break;
                }
                case 105: {
                    n14 = 61;
                    break;
                }
                case 106: {
                    n14 = 52;
                    break;
                }
                case 107: {
                    n14 = 144;
                    break;
                }
                case 108: {
                    n14 = 227;
                    break;
                }
                case 109: {
                    n14 = 147;
                    break;
                }
                case 110: {
                    n14 = 108;
                    break;
                }
                case 111: {
                    n14 = 23;
                    break;
                }
                case 112: {
                    n14 = 170;
                    break;
                }
                case 113: {
                    n14 = 247;
                    break;
                }
                case 114: {
                    n14 = 204;
                    break;
                }
                case 115: {
                    n14 = 95;
                    break;
                }
                case 116: {
                    n14 = 244;
                    break;
                }
                case 117: {
                    n14 = 63;
                    break;
                }
                case 118: {
                    n14 = 90;
                    break;
                }
                case 119: {
                    n14 = 46;
                    break;
                }
                case 120: {
                    n14 = 237;
                    break;
                }
                case 121: {
                    n14 = 85;
                    break;
                }
                case 122: {
                    n14 = 27;
                    break;
                }
                case 123: {
                    n14 = 205;
                    break;
                }
                case 124: {
                    n14 = 26;
                    break;
                }
                case 125: {
                    n14 = 77;
                    break;
                }
                case 126: {
                    n14 = 109;
                    break;
                }
                case 127: {
                    n14 = 88;
                    break;
                }
                case 128: {
                    n14 = 135;
                    break;
                }
                case 129: {
                    n14 = 97;
                    break;
                }
                case 130: {
                    n14 = 72;
                    break;
                }
                case 131: {
                    n14 = 2;
                    break;
                }
                case 132: {
                    n14 = 89;
                    break;
                }
                case 133: {
                    n14 = 21;
                    break;
                }
                case 134: {
                    n14 = 98;
                    break;
                }
                case 135: {
                    n14 = 206;
                    break;
                }
                case 136: {
                    n14 = 3;
                    break;
                }
                case 137: {
                    n14 = 123;
                    break;
                }
                case 138: {
                    n14 = 182;
                    break;
                }
                case 139: {
                    n14 = 96;
                    break;
                }
                case 140: {
                    n14 = 176;
                    break;
                }
                case 141: {
                    n14 = 153;
                    break;
                }
                case 142: {
                    n14 = 106;
                    break;
                }
                case 143: {
                    n14 = 251;
                    break;
                }
                case 144: {
                    n14 = 9;
                    break;
                }
                case 145: {
                    n14 = 112;
                    break;
                }
                case 146: {
                    n14 = 175;
                    break;
                }
                case 147: {
                    n14 = 116;
                    break;
                }
                case 148: {
                    n14 = 82;
                    break;
                }
                case 149: {
                    n14 = 201;
                    break;
                }
                case 150: {
                    n14 = 12;
                    break;
                }
                case 151: {
                    n14 = 24;
                    break;
                }
                case 152: {
                    n14 = 141;
                    break;
                }
                case 153: {
                    n14 = 38;
                    break;
                }
                case 154: {
                    n14 = 66;
                    break;
                }
                case 155: {
                    n14 = 143;
                    break;
                }
                case 156: {
                    n14 = 252;
                    break;
                }
                case 157: {
                    n14 = 166;
                    break;
                }
                case 158: {
                    n14 = 35;
                    break;
                }
                case 159: {
                    n14 = 248;
                    break;
                }
                case 160: {
                    n14 = 190;
                    break;
                }
                case 161: {
                    n14 = 218;
                    break;
                }
                case 162: {
                    n14 = 79;
                    break;
                }
                case 163: {
                    n14 = 195;
                    break;
                }
                case 164: {
                    n14 = 207;
                    break;
                }
                case 165: {
                    n14 = 152;
                    break;
                }
                case 166: {
                    n14 = 151;
                    break;
                }
                case 167: {
                    n14 = 211;
                    break;
                }
                case 168: {
                    n14 = 19;
                    break;
                }
                case 169: {
                    n14 = 193;
                    break;
                }
                case 170: {
                    n14 = 78;
                    break;
                }
                case 171: {
                    n14 = 130;
                    break;
                }
                case 172: {
                    n14 = 30;
                    break;
                }
                case 173: {
                    n14 = 36;
                    break;
                }
                case 174: {
                    n14 = 185;
                    break;
                }
                case 175: {
                    n14 = 47;
                    break;
                }
                case 176: {
                    n14 = 14;
                    break;
                }
                case 177: {
                    n14 = 28;
                    break;
                }
                case 178: {
                    n14 = 181;
                    break;
                }
                case 179: {
                    n14 = 198;
                    break;
                }
                case 180: {
                    n14 = 232;
                    break;
                }
                case 181: {
                    n14 = 111;
                    break;
                }
                case 182: {
                    n14 = 0;
                    break;
                }
                case 183: {
                    n14 = 1;
                    break;
                }
                case 184: {
                    n14 = 157;
                    break;
                }
                case 185: {
                    n14 = 243;
                    break;
                }
                case 186: {
                    n14 = 84;
                    break;
                }
                case 187: {
                    n14 = 126;
                    break;
                }
                case 188: {
                    n14 = 169;
                    break;
                }
                case 189: {
                    n14 = 192;
                    break;
                }
                case 190: {
                    n14 = 59;
                    break;
                }
                case 191: {
                    n14 = 44;
                    break;
                }
                case 192: {
                    n14 = 158;
                    break;
                }
                case 193: {
                    n14 = 186;
                    break;
                }
                case 194: {
                    n14 = 137;
                    break;
                }
                case 195: {
                    n14 = 8;
                    break;
                }
                case 196: {
                    n14 = 208;
                    break;
                }
                case 197: {
                    n14 = 162;
                    break;
                }
                case 198: {
                    n14 = 5;
                    break;
                }
                case 199: {
                    n14 = 32;
                    break;
                }
                case 200: {
                    n14 = 55;
                    break;
                }
                case 201: {
                    n14 = 53;
                    break;
                }
                case 202: {
                    n14 = 142;
                    break;
                }
                case 203: {
                    n14 = 168;
                    break;
                }
                case 204: {
                    n14 = 136;
                    break;
                }
                case 205: {
                    n14 = 58;
                    break;
                }
                case 206: {
                    n14 = 160;
                    break;
                }
                case 207: {
                    n14 = 254;
                    break;
                }
                case 208: {
                    n14 = 138;
                    break;
                }
                case 209: {
                    n14 = 49;
                    break;
                }
                case 210: {
                    n14 = 171;
                    break;
                }
                case 211: {
                    n14 = 132;
                    break;
                }
                case 212: {
                    n14 = 145;
                    break;
                }
                case 213: {
                    n14 = 230;
                    break;
                }
                case 214: {
                    n14 = 223;
                    break;
                }
                case 215: {
                    n14 = 60;
                    break;
                }
                case 216: {
                    n14 = 189;
                    break;
                }
                case 217: {
                    n14 = 114;
                    break;
                }
                case 218: {
                    n14 = 13;
                    break;
                }
                case 219: {
                    n14 = 139;
                    break;
                }
                case 220: {
                    n14 = 191;
                    break;
                }
                case 221: {
                    n14 = 197;
                    break;
                }
                case 222: {
                    n14 = 228;
                    break;
                }
                case 223: {
                    n14 = 253;
                    break;
                }
                case 224: {
                    n14 = 149;
                    break;
                }
                case 225: {
                    n14 = 45;
                    break;
                }
                case 226: {
                    n14 = 118;
                    break;
                }
                case 227: {
                    n14 = 31;
                    break;
                }
                case 228: {
                    n14 = 16;
                    break;
                }
                case 229: {
                    n14 = 102;
                    break;
                }
                case 230: {
                    n14 = 187;
                    break;
                }
                case 231: {
                    n14 = 62;
                    break;
                }
                case 232: {
                    n14 = 241;
                    break;
                }
                case 233: {
                    n14 = 73;
                    break;
                }
                case 234: {
                    n14 = 234;
                    break;
                }
                case 235: {
                    n14 = 119;
                    break;
                }
                case 236: {
                    n14 = 220;
                    break;
                }
                case 237: {
                    n14 = 214;
                    break;
                }
                case 238: {
                    n14 = 245;
                    break;
                }
                case 239: {
                    n14 = 235;
                    break;
                }
                case 240: {
                    n14 = 41;
                    break;
                }
                case 241: {
                    n14 = 203;
                    break;
                }
                case 242: {
                    n14 = 100;
                    break;
                }
                case 243: {
                    n14 = 122;
                    break;
                }
                case 244: {
                    n14 = 212;
                    break;
                }
                case 245: {
                    n14 = 155;
                    break;
                }
                case 246: {
                    n14 = 156;
                    break;
                }
                case 247: {
                    n14 = 25;
                    break;
                }
                case 248: {
                    n14 = 67;
                    break;
                }
                case 249: {
                    n14 = 172;
                    break;
                }
                case 250: {
                    n14 = 87;
                    break;
                }
                case 251: {
                    n14 = 240;
                    break;
                }
                case 252: {
                    n14 = 125;
                    break;
                }
                case 253: {
                    n14 = 127;
                    break;
                }
                case 254: {
                    n14 = 6;
                    break;
                }
                default: {
                    n14 = 180;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            nx_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x601F;
        if (e[n11] == null) {
            nx_2.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

