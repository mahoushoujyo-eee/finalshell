/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EZ;
import com.FN;
import com.GA;
import com.GO;
import com.PY;
import com.RT;
import com.RV;
import com.SZ;
import com.YW;
import com.aL;
import com.fk_0;
import com.hc_0;
import com.ix_1;
import com.kd_1;
import com.ky_2;
import com.pf_1;
import com.sa_0;
import com.xg_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BM
extends JComponent
implements sa_0 {
    public static final Color b;
    public static final Color C;
    public static final Color M;
    public static final Color K;
    public static final Color j;
    public static final Color N;
    public static final Color T;
    private final List h = new ArrayList(1);
    private final List u = new ArrayList(1);
    private final List D = new ArrayList();
    private int e = -1;
    private BufferedImage E;
    private pf_1 p;
    private boolean m = true;
    private boolean a = true;
    private boolean G = true;
    private boolean R = true;
    private boolean U = true;
    private boolean i;
    private int I;
    private final SZ x;
    private boolean g;
    private boolean V;
    private static final long[] c;
    private static final Integer[] d;

    public BM() {
        int[] nArray = kd_1.u();
        this.i = false;
        this.I = BM.a(11494, 1686835258013324302L);
        this.g = false;
        this.V = false;
        this.E = null;
        this.p = null;
        FN.Y(this);
        this.setFocusable(true);
        this.setLayout(new ix_1(new double[][]{{20.0, -2.0, -1.0}, {20.0, -2.0, -1.0}}));
        this.setFont(new JLabel().getFont().deriveFont(10.0f));
        this.x = new SZ(this, false);
        YW yW = new YW(this, null);
        try {
            this.addMouseListener(yW);
            this.addMouseMotionListener(yW);
            this.addMouseWheelListener(yW);
            if (ky_2.F() != null) {
                kd_1.p(new int[4]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BM.a(illegalArgumentException);
        }
    }

    public SZ U() {
        return this.x;
    }

    public boolean R() {
        return this.V;
    }

    public boolean l() {
        return this.g;
    }

    public void M(boolean bl) {
        this.g = bl;
    }

    public int F() {
        return this.I;
    }

    public void b(int n10) {
        this.I = Math.max(1, Math.min(n10, BM.a(10203, 9020220613021441851L)));
        this.revalidate();
        this.repaint();
        this.w();
    }

    public boolean A() {
        return this.G;
    }

    public void T(boolean bl) {
        this.G = bl;
        this.repaint();
    }

    public boolean j() {
        return this.R;
    }

    public void h(boolean bl) {
        this.R = bl;
        this.repaint();
    }

    public boolean u() {
        return this.U;
    }

    public void E(boolean bl) {
        this.U = bl;
        this.repaint();
    }

    public boolean y() {
        return this.i;
    }

    public void C(boolean bl) {
        this.i = bl;
        this.repaint();
    }

    public boolean P() {
        return this.m;
    }

    public void U(boolean bl) {
        this.m = bl;
        this.repaint();
    }

    public boolean b() {
        return this.a;
    }

    public void k(boolean bl) {
        this.a = bl;
        this.repaint();
    }

    public BufferedImage O() {
        BufferedImage bufferedImage;
        block6: {
            block5: {
                pf_1 pf_12;
                block4: {
                    int[] nArray = kd_1.u();
                    try {
                        try {
                            pf_12 = this.p;
                            if (nArray != null) break block4;
                            if (pf_12 == null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        pf_12 = this.p;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                bufferedImage = pf_12.G();
                break block6;
            }
            bufferedImage = null;
        }
        return bufferedImage;
    }

    public BufferedImage X() {
        block5: {
            BM bM;
            block4: {
                int[] nArray = kd_1.u();
                try {
                    try {
                        bM = this;
                        if (nArray != null) break block4;
                        if (bM.p == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                    this.r();
                    bM = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            return bM.E;
        }
        return null;
    }

    public void F(BufferedImage bufferedImage) {
        BM bM;
        block4: {
            block5: {
                int[] nArray = kd_1.u();
                try {
                    try {
                        bM = this;
                        if (nArray != null) break block4;
                        if (!bM.R()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            this.t(bufferedImage);
            this.M();
            this.revalidate();
            this.repaint();
            this.E();
            this.a();
            this.g = false;
            bM = this;
        }
        bM.C();
    }

    public void g(pf_1 pf_12) {
        BM bM;
        block4: {
            block5: {
                int[] nArray = kd_1.u();
                try {
                    try {
                        bM = this;
                        if (nArray != null) break block4;
                        if (!bM.R()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            this.p = pf_12;
            this.M();
            this.revalidate();
            this.repaint();
            this.E();
            this.a();
            this.g = false;
            bM = this;
        }
        bM.C();
    }

    public void O(RT rT) {
        BM bM;
        block14: {
            block15: {
                block12: {
                    boolean bl;
                    block13: {
                        int[] nArray = kd_1.u();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.p == null || rT == null) break block12;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BM.a(illegalArgumentException);
                                        }
                                        bl = this.R();
                                        if (nArray != null) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BM.a(illegalArgumentException);
                                    }
                                    if (bl) break block12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BM.a(illegalArgumentException);
                                }
                                bM = this;
                                if (nArray != null) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                            bl = bM.w().equals(rT);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                    }
                    if (!bl) break block15;
                }
                return;
            }
            this.p.e(rT.o());
            this.j();
            this.p.f(rT.k());
            this.X();
            this.p.H(rT.W());
            this.I();
            this.M();
            this.revalidate();
            this.repaint();
            bM = this;
        }
        bM.a();
    }

    public RT w() {
        try {
            if (this.p == null) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BM.a(illegalArgumentException);
        }
        RT rT = new RT();
        rT.x(this.p.s());
        rT.S(this.p.U());
        rT.V(this.p.g());
        rT.Y(this.p.U());
        return rT;
    }

    public pf_1 T() {
        return this.p;
    }

    public void R() {
        block9: {
            BM bM;
            block10: {
                int n10;
                block8: {
                    int[] nArray = kd_1.u();
                    try {
                        try {
                            try {
                                n10 = this.R();
                                if (nArray != null) break block8;
                                if (n10 != 0) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                            bM = this;
                            if (nArray != null) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        n10 = bM.e;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                try {
                    if (n10 <= 0) break block9;
                    --this.e;
                    bM = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            bM.l((RT)this.D.get(this.e));
        }
    }

    public void Q() {
        block9: {
            BM bM;
            block10: {
                int n10;
                block8: {
                    int[] nArray = kd_1.u();
                    try {
                        try {
                            try {
                                n10 = this.R();
                                if (nArray != null) break block8;
                                if (n10 != 0) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                            bM = this;
                            if (nArray != null) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        n10 = bM.e;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                try {
                    if (n10 >= this.D.size() - 1) break block9;
                    ++this.e;
                    bM = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            bM.l((RT)this.D.get(this.e));
        }
    }

    private void l(RT rT) {
        int n10;
        block8: {
            block9: {
                int[] nArray;
                block6: {
                    block7: {
                        nArray = kd_1.u();
                        try {
                            try {
                                if (nArray != null) break block6;
                                if (rT.g().equals(this.p.s())) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                            return;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                    }
                    this.p.H(FN.K(rT.W()));
                    this.p.f(aL.y(rT.k()));
                    this.p.e(aL.y(rT.o()));
                    this.M();
                    this.revalidate();
                    this.repaint();
                    this.C();
                }
                try {
                    BM bM = this;
                    n10 = this.e;
                    if (nArray != null) break block8;
                    if (n10 <= 0) break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        bM.g = n10;
    }

    private void a() {
        block9: {
            int[] nArray;
            block8: {
                nArray = kd_1.u();
                try {
                    BM bM;
                    try {
                        bM = this;
                        if (nArray != null) break block8;
                        if (bM.p == null) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                    bM = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            for (int i2 = (v2198960).D.size() - 1; i2 > this.e; --i2) {
                try {
                    this.D.remove(i2);
                    if (nArray == null) {
                        if (nArray == null) continue;
                        break;
                    }
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            RT rT = new RT();
            rT.x(this.p.s());
            rT.Y(FN.K(this.p.U()));
            rT.S(aL.y(this.p.U()));
            rT.V(aL.y(this.p.g()));
            this.D.add(rT);
            this.e = this.D.size() - 1;
            this.g = true;
        }
    }

    private void E() {
        this.D.clear();
        this.e = -1;
    }

    private void M() {
    }

    private int h() {
        return Math.max(3, this.I / 2);
    }

    private void X() {
        boolean[] blArray = this.b();
        this.p.f(fk_0.h(blArray));
    }

    private boolean[] b() {
        boolean[] blArray = new boolean[this.O().getWidth()];
        Iterator iterator = this.p.U().iterator();
        int[] nArray = kd_1.u();
        block4: while (true) {
            boolean bl = iterator.hasNext();
            block5: while (bl) {
                EZ eZ = (EZ)iterator.next();
                for (int i2 = eZ.x(); i2 <= eZ.f(); ++i2) {
                    int n10;
                    block7: {
                        bl = eZ.C();
                        if (nArray != null) continue block5;
                        try {
                            if (nArray != null) break block7;
                            if (bl) continue;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        n10 = i2;
                    }
                    try {
                        if (n10 >= blArray.length) continue;
                        blArray[i2] = true;
                        continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                if (nArray == null) continue block4;
            }
            break;
        }
        return blArray;
    }

    private void j() {
        boolean[] blArray = this.c();
        this.p.e(fk_0.h(blArray));
    }

    private boolean[] c() {
        boolean[] blArray = new boolean[this.O().getHeight()];
        int[] nArray = kd_1.u();
        Iterator iterator = this.p.g().iterator();
        block4: while (true) {
            boolean bl = iterator.hasNext();
            block5: while (bl) {
                EZ eZ = (EZ)iterator.next();
                for (int i2 = eZ.x(); i2 <= eZ.f(); ++i2) {
                    int n10;
                    block7: {
                        bl = eZ.C();
                        if (nArray != null) continue block5;
                        try {
                            if (nArray != null) break block7;
                            if (bl) continue;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        n10 = i2;
                    }
                    try {
                        if (n10 >= blArray.length) continue;
                        blArray[i2] = true;
                        continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                if (nArray == null) continue block4;
            }
            break;
        }
        return blArray;
    }

    private void I() {
        block23: {
            int n10;
            Insets insets;
            block22: {
                Insets insets2;
                int n11;
                int n12;
                block20: {
                    int[] nArray;
                    block21: {
                        int n13;
                        int n14;
                        block18: {
                            block19: {
                                int n15;
                                block16: {
                                    block17: {
                                        insets = this.p.U();
                                        nArray = kd_1.u();
                                        n15 = this.O().getHeight() - 1;
                                        try {
                                            try {
                                                n14 = insets.top;
                                                n13 = n15;
                                                if (nArray != null) break block16;
                                                if (n14 <= n13) break block17;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw BM.a(illegalArgumentException);
                                            }
                                            insets.top = n15;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BM.a(illegalArgumentException);
                                        }
                                    }
                                    n14 = insets.bottom + insets.top;
                                    n13 = n15;
                                }
                                try {
                                    try {
                                        if (nArray != null) break block18;
                                        if (n14 <= n13) break block19;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BM.a(illegalArgumentException);
                                    }
                                    insets.bottom = n15 - insets.top;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BM.a(illegalArgumentException);
                                }
                            }
                            n14 = this.O().getWidth();
                            n13 = 1;
                        }
                        n10 = n14 - n13;
                        try {
                            try {
                                n12 = insets.left;
                                n11 = n10;
                                if (nArray != null) break block20;
                                if (n12 <= n11) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                            insets.left = n10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                    }
                    try {
                        insets2 = insets;
                        if (nArray != null) break block22;
                        n12 = insets2.right + insets.left;
                        n11 = n10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                if (n12 <= n11) break block23;
                insets2 = insets;
            }
            insets2.right = n10 - insets.left;
        }
    }

    private void t(BufferedImage bufferedImage) {
        try {
            this.p = new pf_1(bufferedImage);
            this.E = bufferedImage;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            BufferedImage bufferedImage2 = xg_0.g(bufferedImage.getWidth() + 2, bufferedImage.getHeight() + 2, 3);
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.drawImage((Image)bufferedImage, 1, 1, null);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.drawLine(1, 0, bufferedImage2.getWidth() - 2, 0);
            graphics2D.drawLine(0, 1, 0, bufferedImage2.getHeight() - 2);
            graphics2D.dispose();
            this.p = new pf_1(bufferedImage2);
            this.E = bufferedImage2;
        }
    }

    private void r() {
        int n10;
        Insets insets;
        int n11;
        int[] nArray;
        BufferedImage bufferedImage;
        block16: {
            boolean[] blArray;
            block15: {
                int[] nArray2 = kd_1.u();
                bufferedImage = this.O();
                this.E = xg_0.g(bufferedImage.getWidth() + 2, bufferedImage.getHeight() + 2, 3);
                Graphics2D graphics2D = this.E.createGraphics();
                graphics2D.drawImage((Image)bufferedImage, 1, 1, null);
                nArray = nArray2;
                graphics2D.dispose();
                n11 = Color.BLACK.getRGB();
                boolean[] blArray2 = this.b();
                for (int i2 = 0; i2 < bufferedImage.getWidth(); ++i2) {
                    try {
                        try {
                            blArray = blArray2;
                            if (nArray != null) break block15;
                            if (!blArray[i2]) continue;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        this.E.setRGB(i2 + 1, 0, n11);
                        continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                blArray = this.c();
            }
            boolean[] blArray3 = blArray;
            for (int i3 = 0; i3 < bufferedImage.getHeight(); ++i3) {
                try {
                    if (!blArray3[i3]) continue;
                    this.E.setRGB(0, i3 + 1, n11);
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            insets = this.p.U();
            for (n10 = insets.left; n10 < bufferedImage.getWidth() - insets.right; ++n10) {
                try {
                    this.E.setRGB(n10 + 1, this.E.getHeight() - 1, n11);
                    if (nArray == null) {
                        if (nArray == null) continue;
                        break;
                    }
                    break block16;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            n10 = insets.top;
        }
        try {
            while (n10 < bufferedImage.getHeight() - insets.bottom) {
                this.E.setRGB(this.E.getWidth() - 1, n10 + 1, n11);
                ++n10;
                if (nArray == null) continue;
                break;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BM.a(illegalArgumentException);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block59: {
            block60: {
                block57: {
                    block58: {
                        block55: {
                            block56: {
                                block53: {
                                    block49: {
                                        block50: {
                                            block47: {
                                                block48: {
                                                    v0 = kd_1.u();
                                                    super.paintComponent(var1_1);
                                                    var2_2 = v0;
                                                    if (this.p == null) break block59;
                                                    var3_3 = (Graphics2D)var1_1;
                                                    var4_4 = var3_3.getFontMetrics();
                                                    var5_5 = this.O();
                                                    var6_6 = this.getWidth();
                                                    var7_7 = this.getHeight();
                                                    var8_8 = var5_5.getWidth() * this.I;
                                                    var9_9 = var5_5.getHeight() * this.I;
                                                    var10_10 = this.p.U();
                                                    try {
                                                        v1 = var6_6;
                                                        v2 = this.a;
                                                        if (var2_2 != null) break block47;
                                                        if (v2 == 0) break block48;
                                                    }
                                                    catch (IllegalArgumentException v3) {
                                                        throw BM.a(v3);
                                                    }
                                                    v2 = BM.a(23435, 3919341184167535476L);
                                                    break block47;
                                                }
                                                v2 = 0;
                                            }
                                            var11_11 = (v1 + v2) / 2 - var8_8 / 2;
                                            try {
                                                v4 = var7_7;
                                                v5 = this.a;
                                                if (var2_2 != null) break block49;
                                                if (v5 == 0) break block50;
                                            }
                                            catch (IllegalArgumentException v6) {
                                                throw BM.a(v6);
                                            }
                                            v5 = BM.a(23435, 3919341184167535476L);
                                            break block49;
                                        }
                                        v5 = 0;
                                    }
                                    var12_12 = (v4 + v5) / 2 - var9_9 / 2;
                                    var13_13 = var3_3.getStroke();
                                    GA.o(var3_3, var11_11, var12_12, var8_8, var9_9);
                                    var3_3.setPaint(Color.DARK_GRAY);
                                    var3_3.drawRect(var11_11, var12_12, var8_8, var9_9);
                                    var1_1.drawImage(var5_5, var11_11, var12_12, var8_8, var9_9, null);
                                    var3_3.setStroke(GO.Fk);
                                    var14_14 = this.p.U().iterator();
                                    while (var14_14.hasNext()) {
                                        block52: {
                                            block51: {
                                                var15_16 = (EZ)var14_14.next();
                                                try {
                                                    try {
                                                        try {
                                                            v7 = var15_16.C();
                                                            if (var2_2 == null) {
                                                                if (var2_2 != null) break block51;
                                                            }
                                                            ** GOTO lbl87
                                                        }
                                                        catch (IllegalArgumentException v8) {
                                                            throw BM.a(v8);
                                                        }
                                                        if (v7) break block52;
                                                    }
                                                    catch (IllegalArgumentException v9) {
                                                        throw BM.a(v9);
                                                    }
                                                    v10 = this.G;
                                                }
                                                catch (IllegalArgumentException v11) {
                                                    throw BM.a(v11);
                                                }
                                            }
                                            try {
                                                if (v10) {
                                                    var3_3.setPaint(BM.C);
                                                    var3_3.fillRect(var11_11 + var15_16.x() * this.I, var12_12, (var15_16.f() - var15_16.x() + 1) * this.I, var9_9);
                                                }
                                            }
                                            catch (IllegalArgumentException v12) {
                                                throw BM.a(v12);
                                            }
                                            var3_3.setPaint(BM.b);
                                            var3_3.drawLine(var11_11 + var15_16.x() * this.I, 0, var11_11 + var15_16.x() * this.I, var12_12 + var9_9 - 1);
                                            var3_3.drawLine(var11_11 + (var15_16.f() + 1) * this.I, 0, var11_11 + (var15_16.f() + 1) * this.I, var12_12 + var9_9 - 1);
                                            var3_3.setPaint(Color.BLACK);
                                            var3_3.fillRect(var11_11 + var15_16.x() * this.I + 1, var12_12 - this.I, (var15_16.f() - var15_16.x() + 1) * this.I - 1, this.I);
                                        }
                                        if (var2_2 == null) continue;
                                    }
                                    var14_14 = this.p.g().iterator();
                                    do {
                                        block54: {
                                            v7 = var14_14.hasNext();
lbl87:
                                            // 2 sources

                                            if (!v7) break;
                                            var15_16 = (EZ)var14_14.next();
                                            try {
                                                try {
                                                    try {
                                                        v13 = (int)var15_16.C();
                                                        if (var2_2 != null) break block53;
                                                        if (var2_2 != null) break block54;
                                                    }
                                                    catch (IllegalArgumentException v14) {
                                                        throw BM.a(v14);
                                                    }
                                                    if (v13 != 0) continue;
                                                }
                                                catch (IllegalArgumentException v15) {
                                                    throw BM.a(v15);
                                                }
                                                v16 = this.G;
                                            }
                                            catch (IllegalArgumentException v17) {
                                                throw BM.a(v17);
                                            }
                                        }
                                        try {
                                            if (v16) {
                                                var3_3.setPaint(BM.C);
                                                var3_3.fillRect(var11_11, var12_12 + var15_16.x() * this.I, var8_8, (var15_16.f() - var15_16.x() + 1) * this.I);
                                            }
                                        }
                                        catch (IllegalArgumentException v18) {
                                            throw BM.a(v18);
                                        }
                                        var3_3.setPaint(BM.b);
                                        var3_3.drawLine(0, var12_12 + var15_16.x() * this.I, var11_11 + var8_8 - 1, var12_12 + var15_16.x() * this.I);
                                        var3_3.drawLine(0, var12_12 + (var15_16.f() + 1) * this.I, var11_11 + var8_8 - 1, var12_12 + (var15_16.f() + 1) * this.I);
                                        var3_3.setPaint(Color.BLACK);
                                        var3_3.fillRect(var11_11 - this.I, var12_12 + var15_16.x() * this.I + 1, this.I, (var15_16.f() - var15_16.x() + 1) * this.I - 1);
                                    } while (var2_2 == null);
                                    v13 = this.Z(var11_11, var10_10);
                                }
                                var14_15 = v13;
                                var15_17 = this.x(var11_11, var8_8, var10_10);
                                var16_18 = this.I(var12_12, var10_10);
                                var17_19 = this.M(var12_12, var9_9, var10_10);
                                try {
                                    try {
                                        v19 = this.R;
                                        if (var2_2 != null) break block55;
                                        if (!v19) break block56;
                                    }
                                    catch (IllegalArgumentException v20) {
                                        throw BM.a(v20);
                                    }
                                    var3_3.setPaint(BM.K);
                                    var3_3.fillRect(var14_15 + 1, var16_18 + 1, var8_8 - (var10_10.left + var10_10.right) * this.I - 1, var9_9 - (var10_10.top + var10_10.bottom) * this.I - 1);
                                }
                                catch (IllegalArgumentException v21) {
                                    throw BM.a(v21);
                                }
                            }
                            var3_3.setPaint(BM.M);
                            var3_3.drawLine(var14_15, var12_12, var14_15, var7_7);
                            var3_3.drawLine(var15_17, var12_12, var15_17, var7_7);
                            var3_3.drawLine(var11_11, var16_18, var6_6, var16_18);
                            var3_3.drawLine(var11_11, var17_19, var6_6, var17_19);
                            var3_3.setPaint(Color.BLACK);
                            var3_3.fillRect(var11_11 + var8_8 + 1, var16_18 + 1, this.I, var17_19 - var16_18 - 1);
                            var3_3.fillRect(var14_15 + 1, var12_12 + var9_9 + 1, var15_17 - var14_15 - 1, this.I);
                            var3_3.setStroke(var13_13);
                            v19 = this.m;
                        }
                        try {
                            if (var2_2 != null) break block57;
                            if (!v19) break block58;
                        }
                        catch (IllegalArgumentException v22) {
                            throw BM.a(v22);
                        }
                        var3_3.setPaint(Color.BLACK);
                        var18_20 = this.j();
                        for (var19_21 = 0; var19_21 < var18_20.size() - 1; ++var19_21) {
                            var20_23 = (Integer)var18_20.get(var19_21);
                            var21_25 = (Integer)var18_20.get(var19_21 + 1);
                            var22_26 = var11_11 + var20_23 * this.I;
                            var23_27 = var11_11 + var21_25 * this.I;
                            var24_28 = var12_12 - this.I - BM.a(22076, 8149415100917051097L);
                            var25_30 = var12_12 - this.I - BM.a(6494, 5525480869336555952L);
                            var3_3.drawLine(var22_26, var24_28, var23_27, var24_28);
                            var3_3.drawLine(var22_26, var24_28, var22_26, var25_30);
                            var3_3.drawLine(var23_27, var24_28, var23_27, var25_30);
                            var26_31 = "" + (var21_25 - var20_23);
                            try {
                                var3_3.drawString(var26_31, (var22_26 + var23_27) / 2 + GA.C(var4_4, var26_31), var12_12 - this.I - BM.a(21813, 4553651928792264132L));
                                if (var2_2 == null) {
                                    if (var2_2 == null) continue;
                                    break;
                                }
                                break block58;
                            }
                            catch (IllegalArgumentException v23) {
                                throw BM.a(v23);
                            }
                        }
                        var19_22 = this.H();
                        for (var20_24 = 0; var20_24 < var19_22.size() - 1; ++var20_24) {
                            var21_25 = (Integer)var19_22.get(var20_24);
                            var22_26 = (Integer)var19_22.get(var20_24 + 1);
                            var23_27 = var12_12 + var21_25 * this.I;
                            var24_29 = var12_12 + var22_26 * this.I;
                            var25_30 = var11_11 - this.I - BM.a(22076, 8149415100917051097L);
                            var26_32 = var11_11 - this.I - BM.a(16783, 3498272914205604200L);
                            var3_3.drawLine(var25_30, var23_27, var25_30, var24_29);
                            var3_3.drawLine(var25_30, var23_27, var26_32, var23_27);
                            var3_3.drawLine(var25_30, var24_29, var26_32, var24_29);
                            var27_33 = "" + (var22_26 - var21_25);
                            try {
                                var3_3.drawString(var27_33, var25_30 - var4_4.stringWidth(var27_33) - 5, (var23_27 + var24_29) / 2 + GA.d(var4_4));
                                if (var2_2 == null) {
                                    if (var2_2 == null) continue;
                                    break;
                                }
                                break block59;
                            }
                            catch (IllegalArgumentException v24) {
                                throw BM.a(v24);
                            }
                        }
                    }
                    try {
                        v25 = this;
                        if (var2_2 != null) break block60;
                        v19 = v25.a;
                    }
                    catch (IllegalArgumentException v26) {
                        throw BM.a(v26);
                    }
                }
                if (!v19) break block59;
                v25 = this;
            }
            v25.A(var3_3, new Point(var11_11 - 1, var12_12 - 1), var11_11, var12_12);
        }
    }

    private void A(Graphics2D graphics2D, Point point, int n10, int n11) {
        Object object;
        Rectangle rectangle;
        block65: {
            int n12;
            Object object2;
            int[] nArray;
            int n13;
            int n14;
            block64: {
                int n15;
                int n16;
                block63: {
                    block62: {
                        block53: {
                            int n17;
                            int n18;
                            int n19;
                            block55: {
                                block54: {
                                    boolean bl;
                                    block60: {
                                        block61: {
                                            int n20;
                                            int n21;
                                            block58: {
                                                block59: {
                                                    int n22;
                                                    int n23;
                                                    block56: {
                                                        block57: {
                                                            BM bM;
                                                            block51: {
                                                                block52: {
                                                                    rectangle = this.getVisibleRect();
                                                                    n16 = this.d();
                                                                    n14 = this.j();
                                                                    n13 = this.I;
                                                                    int[] nArray2 = kd_1.u();
                                                                    graphics2D.setPaint(new GradientPaint(rectangle.x, rectangle.y, N, rectangle.x, rectangle.y + BM.a(31764, 7349090917823628530L), T));
                                                                    nArray = nArray2;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, BM.a(23435, 3919341184167535476L));
                                                                                graphics2D.setPaint(new GradientPaint(rectangle.x, rectangle.y, N, rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y, T));
                                                                                graphics2D.fillRect(rectangle.x, rectangle.y, BM.a(23435, 3919341184167535476L), rectangle.height);
                                                                                bM = this;
                                                                                if (nArray != null) break block51;
                                                                                if (bM.U) break block52;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                throw BM.a(illegalArgumentException);
                                                                            }
                                                                            n19 = this.i;
                                                                            if (nArray != null) break block53;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            throw BM.a(illegalArgumentException);
                                                                        }
                                                                        if (n19 == 0) break block54;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw BM.a(illegalArgumentException);
                                                                    }
                                                                }
                                                                bM = this;
                                                            }
                                                            object2 = FN.f(bM);
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    n18 = ((Point)object2).x;
                                                                                                    n17 = rectangle.x + BM.a(23435, 3919341184167535476L);
                                                                                                    if (nArray != null) break block55;
                                                                                                    if (n18 <= n17) break block54;
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    throw BM.a(illegalArgumentException);
                                                                                                }
                                                                                                n18 = ((Point)object2).x;
                                                                                                n17 = rectangle.x + rectangle.width;
                                                                                                if (nArray != null) break block55;
                                                                                            }
                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                throw BM.a(illegalArgumentException);
                                                                                            }
                                                                                            if (n18 >= n17) break block54;
                                                                                        }
                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                            throw BM.a(illegalArgumentException);
                                                                                        }
                                                                                        n18 = ((Point)object2).y;
                                                                                        n17 = rectangle.y + BM.a(23435, 3919341184167535476L);
                                                                                        if (nArray != null) break block55;
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        throw BM.a(illegalArgumentException);
                                                                                    }
                                                                                    if (n18 <= n17) break block54;
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    throw BM.a(illegalArgumentException);
                                                                                }
                                                                                n18 = ((Point)object2).y;
                                                                                n17 = rectangle.y + rectangle.height;
                                                                                if (nArray != null) break block55;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                throw BM.a(illegalArgumentException);
                                                                            }
                                                                            if (n18 >= n17) break block54;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            throw BM.a(illegalArgumentException);
                                                                        }
                                                                        n23 = (((Point)object2).x - n10) / this.I;
                                                                        n22 = ((Point)object2).x;
                                                                        if (nArray != null) break block56;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw BM.a(illegalArgumentException);
                                                                    }
                                                                    if (n22 < n10) break block57;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw BM.a(illegalArgumentException);
                                                                }
                                                                n22 = 0;
                                                                break block56;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw BM.a(illegalArgumentException);
                                                            }
                                                        }
                                                        n22 = 1;
                                                    }
                                                    n15 = n23 - n22;
                                                    try {
                                                        try {
                                                            n21 = (((Point)object2).y - n11) / this.I;
                                                            n20 = ((Point)object2).y;
                                                            if (nArray != null) break block58;
                                                            if (n20 < n11) break block59;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw BM.a(illegalArgumentException);
                                                        }
                                                        n20 = 0;
                                                        break block58;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BM.a(illegalArgumentException);
                                                    }
                                                }
                                                n20 = 1;
                                            }
                                            n12 = n21 - n20;
                                            object = RV.p(graphics2D, Float.valueOf(0.5f));
                                            try {
                                                try {
                                                    bl = this.U;
                                                    if (nArray != null) break block60;
                                                    if (!bl) break block61;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BM.a(illegalArgumentException);
                                                }
                                                graphics2D.setPaint(Color.RED);
                                                graphics2D.fillRect(n10 + n15 * this.I, rectangle.y, this.I, BM.a(23435, 3919341184167535476L));
                                                graphics2D.fillRect(rectangle.x, n11 + n12 * this.I, BM.a(23435, 3919341184167535476L), this.I);
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw BM.a(illegalArgumentException);
                                            }
                                        }
                                        bl = this.i;
                                    }
                                    if (bl) {
                                        Shape shape = RV.I(graphics2D, new Rectangle(rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y + BM.a(23435, 3919341184167535476L), rectangle.width - BM.a(23435, 3919341184167535476L), rectangle.height - BM.a(23435, 3919341184167535476L)), this.i);
                                        graphics2D.setPaint(Color.RED);
                                        graphics2D.fillRect(n10 + n15 * this.I, rectangle.y, this.I, rectangle.height);
                                        graphics2D.fillRect(rectangle.x, n11 + n12 * this.I, rectangle.width, this.I);
                                        RV.w(graphics2D, shape);
                                    }
                                    RV.c(graphics2D, (Composite)object);
                                }
                                graphics2D.setPaint(Color.BLACK);
                                n18 = rectangle.x;
                                n17 = (point.x - rectangle.x) % n16;
                            }
                            n19 = n18 + n17;
                        }
                        for (n12 = n15 = (v2207554); n12 <= rectangle.x + rectangle.width; n12 += n16) {
                            graphics2D.drawLine(n12, rectangle.y + BM.a(23435, 3919341184167535476L) - BM.a(4765, 7423047014936652387L), n12, rectangle.y + BM.a(23435, 3919341184167535476L));
                            try {
                                if (nArray == null) {
                                    if (nArray == null) continue;
                                    break;
                                }
                                break block62;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                        }
                        n15 = rectangle.x + (point.x - rectangle.x) % n14;
                    }
                    for (n12 = n15; n12 <= rectangle.x + rectangle.width; n12 += n14) {
                        graphics2D.drawLine(n12, rectangle.y + BM.a(23435, 3919341184167535476L) - BM.a(15911, 1081976759275587272L), n12, rectangle.y + BM.a(23435, 3919341184167535476L));
                        object2 = "" + (n12 - point.x) / n13;
                        graphics2D.drawString((String)object2, n12 + 2, rectangle.y + BM.a(23435, 3919341184167535476L) - BM.a(26546, 7026889799891279681L));
                        try {
                            if (nArray == null) {
                                if (nArray == null) continue;
                                break;
                            }
                            break block63;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                    }
                    graphics2D.setPaint(Color.BLACK);
                    graphics2D.drawLine(rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y + BM.a(23435, 3919341184167535476L), rectangle.x + rectangle.width, rectangle.y + BM.a(23435, 3919341184167535476L));
                    n15 = rectangle.y + (point.y - rectangle.y) % n16;
                }
                for (n12 = n15; n12 <= rectangle.y + rectangle.height; n12 += n16) {
                    graphics2D.drawLine(rectangle.x + BM.a(23435, 3919341184167535476L) - BM.a(9526, 8753084625105821123L), n12, rectangle.x + BM.a(23435, 3919341184167535476L), n12);
                    try {
                        if (nArray == null) {
                            if (nArray == null) continue;
                            break;
                        }
                        break block64;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                n15 = rectangle.y + (point.y - rectangle.y) % n14;
            }
            for (n12 = n15; n12 <= rectangle.y + rectangle.height; n12 += n14) {
                graphics2D.drawLine(rectangle.x + BM.a(23435, 3919341184167535476L) - BM.a(21813, 4553651928792264132L), n12, rectangle.x + BM.a(23435, 3919341184167535476L), n12);
                object2 = "" + (n12 - point.y) / n13;
                graphics2D.rotate(Math.toRadians(-90.0));
                graphics2D.drawString((String)object2, 1 - n12 - this.getFontMetrics(this.getFont()).stringWidth((String)object2) - 2, rectangle.x + BM.a(23435, 3919341184167535476L) - BM.a(22076, 8149415100917051097L));
                graphics2D.rotate(Math.toRadians(90.0));
                try {
                    if (nArray == null) {
                        if (nArray == null) continue;
                        break;
                    }
                    break block65;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            graphics2D.setPaint(Color.BLACK);
            graphics2D.drawLine(rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y + BM.a(23435, 3919341184167535476L), rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y + rectangle.height);
            graphics2D.setPaint(Color.WHITE);
            graphics2D.fillRect(rectangle.x, rectangle.y, BM.a(23435, 3919341184167535476L), BM.a(23435, 3919341184167535476L));
        }
        String string = this.I + "x";
        object = GA.A(graphics2D.getFontMetrics(), string);
        graphics2D.setPaint(Color.DARK_GRAY);
        graphics2D.drawString(string, rectangle.x + BM.a(22076, 8149415100917051097L) + ((Point)object).x, rectangle.y + BM.a(22076, 8149415100917051097L) + ((Point)object).y);
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawLine(rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y, rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y + BM.a(23435, 3919341184167535476L));
        graphics2D.drawLine(rectangle.x, rectangle.y + BM.a(23435, 3919341184167535476L), rectangle.x + BM.a(23435, 3919341184167535476L), rectangle.y + BM.a(23435, 3919341184167535476L));
    }

    /*
     * Exception decompiling
     */
    private int j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private int d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private List j() {
        ArrayList<Integer> arrayList;
        block23: {
            boolean bl;
            Insets insets;
            ArrayList<Integer> arrayList2;
            block21: {
                int[] nArray;
                block22: {
                    arrayList2 = new ArrayList<Integer>();
                    nArray = kd_1.u();
                    for (EZ eZ : this.p.U()) {
                        block20: {
                            boolean bl2;
                            block18: {
                                block19: {
                                    try {
                                        try {
                                            bl2 = arrayList2.contains(eZ.x());
                                            if (nArray != null) break block18;
                                            if (bl2) break block19;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BM.a(illegalArgumentException);
                                        }
                                        arrayList2.add(eZ.x());
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BM.a(illegalArgumentException);
                                    }
                                }
                                bl2 = arrayList2.contains(eZ.f() + 1);
                            }
                            try {
                                try {
                                    if (nArray != null || bl2) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BM.a(illegalArgumentException);
                                }
                                bl2 = arrayList2.add(eZ.f() + 1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                        }
                        if (nArray == null) continue;
                    }
                    insets = this.p.U();
                    try {
                        try {
                            bl = arrayList2.contains(insets.left);
                            if (nArray != null) break block21;
                            if (bl) break block22;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        arrayList2.add(insets.left);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                try {
                    arrayList = arrayList2;
                    if (nArray != null) break block23;
                    bl = arrayList.contains(this.O().getWidth() - insets.right);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            try {
                if (!bl) {
                    arrayList2.add(this.O().getWidth() - insets.right);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BM.a(illegalArgumentException);
            }
            Collections.sort(arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private List H() {
        ArrayList<Integer> arrayList;
        block23: {
            boolean bl;
            Object object;
            ArrayList<Integer> arrayList2;
            block21: {
                int[] nArray;
                block22: {
                    arrayList2 = new ArrayList<Integer>();
                    object = this.p.g().iterator();
                    nArray = kd_1.u();
                    while (object.hasNext()) {
                        block20: {
                            boolean bl2;
                            EZ eZ;
                            block18: {
                                block19: {
                                    eZ = (EZ)object.next();
                                    try {
                                        try {
                                            bl2 = arrayList2.contains(eZ.x());
                                            if (nArray != null) break block18;
                                            if (bl2) break block19;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BM.a(illegalArgumentException);
                                        }
                                        arrayList2.add(eZ.x());
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BM.a(illegalArgumentException);
                                    }
                                }
                                bl2 = arrayList2.contains(eZ.f() + 1);
                            }
                            try {
                                try {
                                    if (nArray != null || bl2) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BM.a(illegalArgumentException);
                                }
                                bl2 = arrayList2.add(eZ.f() + 1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                        }
                        if (nArray == null) continue;
                    }
                    object = this.p.U();
                    try {
                        try {
                            bl = arrayList2.contains(((Insets)object).top);
                            if (nArray != null) break block21;
                            if (bl) break block22;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        arrayList2.add(((Insets)object).top);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                }
                try {
                    arrayList = arrayList2;
                    if (nArray != null) break block23;
                    bl = arrayList.contains(this.O().getHeight() - ((Insets)object).bottom);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            try {
                if (!bl) {
                    arrayList2.add(this.O().getHeight() - ((Insets)object).bottom);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BM.a(illegalArgumentException);
            }
            Collections.sort(arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private int Z(int n10, Insets insets) {
        return n10 + insets.left * this.I;
    }

    private int x(int n10, int n11, Insets insets) {
        return n10 + n11 - insets.right * this.I;
    }

    private int I(int n10, Insets insets) {
        return n10 + insets.top * this.I;
    }

    private int M(int n10, int n11, Insets insets) {
        return n10 + n11 - insets.bottom * this.I;
    }

    public List A() {
        return this.h;
    }

    public void Q(ChangeListener changeListener) {
        this.h.add(changeListener);
    }

    public void i(ChangeListener changeListener) {
        this.h.add(changeListener);
    }

    private void C() {
        ChangeEvent changeEvent = new ChangeEvent(this);
        int[] nArray = kd_1.u();
        for (ChangeListener changeListener : aL.J((Collection)this.h)) {
            changeListener.stateChanged(changeEvent);
            if (nArray == null) continue;
        }
    }

    public List d() {
        return this.u;
    }

    public void u(hc_0 hc_02) {
        this.u.add(hc_02);
    }

    public void h(hc_0 hc_02) {
        this.u.add(hc_02);
    }

    private void w() {
        Iterator iterator = aL.J((Collection)this.u).iterator();
        int[] nArray = kd_1.u();
        while (iterator.hasNext()) {
            hc_0 hc_02 = (hc_0)iterator.next();
            hc_02.X();
            if (nArray == null) continue;
        }
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public BM C(int n10) {
        return (BM)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public BM X(int n10) {
        return (BM)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public BM N(int n10) {
        return (BM)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public BM h(int n10) {
        return (BM)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public BM Q(int n10) {
        return (BM)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public BM q(int n10) {
        return (BM)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, this.y());
    }

    public BM U(int n10, int n11) {
        return (BM)PY.O(this, n10, n11);
    }

    public Dimension y() {
        int n10;
        int n11;
        block12: {
            block13: {
                int n12;
                int n13;
                int[] nArray;
                block10: {
                    block11: {
                        int n14;
                        nArray = kd_1.u();
                        try {
                            n14 = this.E != null ? 1 : 0;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                        n13 = n14;
                        try {
                            try {
                                n12 = n13;
                                if (nArray != null) break block10;
                                if (n12 == 0) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BM.a(illegalArgumentException);
                            }
                            n12 = (this.E.getWidth() + 2) * this.I;
                            break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BM.a(illegalArgumentException);
                        }
                    }
                    n12 = BM.a(21574, 3785569963478412468L);
                }
                n11 = n12;
                try {
                    try {
                        n10 = n13;
                        if (nArray != null) break block12;
                        if (n10 == 0) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BM.a(illegalArgumentException);
                    }
                    n10 = (this.E.getHeight() + 2) * this.I;
                    break block12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BM.a(illegalArgumentException);
                }
            }
            n10 = BM.a(6976, 2105711136051176361L);
        }
        int n15 = n10;
        return new Dimension(BM.a(23435, 3919341184167535476L) + n11 + BM.a(6267, 8931649703959437452L), BM.a(23435, 3919341184167535476L) + n15 + BM.a(6267, 8931649703959437452L));
    }

    @Override
    public Component W(int n10, int n11) {
        return this.U(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.q(n10);
    }

    @Override
    public Component p(int n10) {
        return this.Q(n10);
    }

    @Override
    public Component D(int n10) {
        return this.h(n10);
    }

    @Override
    public Component V(int n10) {
        return this.N(n10);
    }

    @Override
    public Component x(int n10) {
        return this.X(n10);
    }

    @Override
    public Component O(int n10) {
        return this.C(n10);
    }

    static int B(BM bM) {
        return bM.I;
    }

    static pf_1 v(BM bM) {
        return bM.p;
    }

    static boolean C(BM bM) {
        return bM.a;
    }

    static int q(BM bM, int n10, Insets insets) {
        return bM.Z(n10, insets);
    }

    static int Y(BM bM, int n10, int n11, Insets insets) {
        return bM.x(n10, n11, insets);
    }

    static int P(BM bM, int n10, Insets insets) {
        return bM.I(n10, insets);
    }

    static int w(BM bM, int n10, int n11, Insets insets) {
        return bM.M(n10, n11, insets);
    }

    static boolean D(BM bM) {
        return bM.U;
    }

    static boolean x(BM bM) {
        return bM.i;
    }

    static boolean w(BM bM) {
        return bM.V;
    }

    static boolean Z(BM bM, boolean bl) {
        bM.V = bl;
        return bM.V;
    }

    static SZ t(BM bM) {
        return bM.x;
    }

    static BufferedImage E(BM bM) {
        return bM.E;
    }

    static void A(BM bM) {
        bM.C();
    }

    static void U(BM bM) {
        bM.a();
    }

    static int g(BM bM) {
        return bM.h();
    }

    static boolean K(BM bM) {
        return bM.G;
    }

    static void W(BM bM) {
        bM.X();
    }

    static void F(BM bM) {
        bM.j();
    }

    static boolean z(BM bM) {
        return bM.R;
    }

    static boolean[] Y(BM bM) {
        return bM.b();
    }

    static void g(BM bM) {
        bM.M();
    }

    static boolean[] P(BM bM) {
        return bM.c();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3393708222217126505L;
                var6_1 = new long[31];
                var3_2 = 0;
                var4_3 = "\u00b1\u00a0\u00ee^\u001fj\u00b4\u00aa\u00fcDo\u00c3Q\u00d3\u00ee-mo8\u00c9\u00e7y P\u0092\u0085\u0099k\u001c\u00ee\u0016bo\u00dd\u00d2B\u0087J\u0084\u00ae\u0017\u0089\u00d9\u0091\u008e\u0096\u00a3\u00de\u0012\u00afbG!\u00c2)\u00cd\u0099\u0011\u0002\u0000fVE\u00bf\u000e\u00b1\u0082\u00f7\u00a0\u00b1\u00bf\u00fa\u00c2B\u001c\u0087\u007f\u00af$\u0098\u000b\u0085\u00ed\u00c3\u00e0\u00c5\u00eam\u00ac\u00cfT\u0088\u00fa_\u009dr\u00ach\u001f\u00eb\u008a\u000b{\u0006\u00eb\u00b2\u00f7\u0098j~F\u008fV*\u00f2\u00f0\u0099\u00cel\u00ba\u00fei\u00e8)%\u0002\u00bd\u00dc2\u00ddA\u00c1.YY5\u00f6\u0006g?\u009d\u000e,u\u00c7=1\u0086X1\u00a1\u000b\u0015\u00fbS\u00cf\u00a80\u0011\u00a0\u007f\n\u00d3K[Na\te\u00dd\u00d2B\u009c\u00c1\u00a8\f~tD\u00f2\f\u00d3x,\u0002\u0005\u00fcX\u0099\f\u0080\u00a6\u00a2\u00f8.\u00be>\u00c6\u00dd\"\u00a9\u00c4f7\u00f1\u0017\u00efM\u0093\u00e0\u00a7\u0092N\u00fco\u00a2\u0081\u0095Z\u00aaT\u00c6\u00ab=v\u00a2\u0011\u00ed\u00b6*\u00a2\u00b5";
                var5_4 = "\u00b1\u00a0\u00ee^\u001fj\u00b4\u00aa\u00fcDo\u00c3Q\u00d3\u00ee-mo8\u00c9\u00e7y P\u0092\u0085\u0099k\u001c\u00ee\u0016bo\u00dd\u00d2B\u0087J\u0084\u00ae\u0017\u0089\u00d9\u0091\u008e\u0096\u00a3\u00de\u0012\u00afbG!\u00c2)\u00cd\u0099\u0011\u0002\u0000fVE\u00bf\u000e\u00b1\u0082\u00f7\u00a0\u00b1\u00bf\u00fa\u00c2B\u001c\u0087\u007f\u00af$\u0098\u000b\u0085\u00ed\u00c3\u00e0\u00c5\u00eam\u00ac\u00cfT\u0088\u00fa_\u009dr\u00ach\u001f\u00eb\u008a\u000b{\u0006\u00eb\u00b2\u00f7\u0098j~F\u008fV*\u00f2\u00f0\u0099\u00cel\u00ba\u00fei\u00e8)%\u0002\u00bd\u00dc2\u00ddA\u00c1.YY5\u00f6\u0006g?\u009d\u000e,u\u00c7=1\u0086X1\u00a1\u000b\u0015\u00fbS\u00cf\u00a80\u0011\u00a0\u007f\n\u00d3K[Na\te\u00dd\u00d2B\u009c\u00c1\u00a8\f~tD\u00f2\f\u00d3x,\u0002\u0005\u00fcX\u0099\f\u0080\u00a6\u00a2\u00f8.\u00be>\u00c6\u00dd\"\u00a9\u00c4f7\u00f1\u0017\u00efM\u0093\u00e0\u00a7\u0092N\u00fco\u00a2\u0081\u0095Z\u00aaT\u00c6\u00ab=v\u00a2\u0011\u00ed\u00b6*\u00a2\u00b5".length();
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
                    var4_3 = "M+n\u00ad\u00c8\u0094\u0015=\u00a9z:&\u00f8\u00ce\u009f\u00ac";
                    var5_4 = "M+n\u00ad\u00c8\u0094\u0015=\u00a9z:&\u00f8\u00ce\u009f\u00ac".length();
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
        BM.c = var6_1;
        BM.d = new Integer[31];
        BM.b = new Color(BM.a(3604, 1285508351382894335L), BM.a(32684, 8481945231347238720L), 0);
        BM.C = new Color(BM.a(25591, 5005383585441143564L), BM.a(21560, 21883582364576978L), 0, BM.a(1300, 8526628996167941623L));
        BM.M = new Color(BM.a(6267, 8931649703959437452L), BM.a(6267, 8931649703959437452L), BM.a(6267, 8931649703959437452L), BM.a(5678, 6220988206857137876L));
        BM.K = new Color(BM.a(1803, 3227234663379615727L), BM.a(4883, 3838736327202909182L), BM.a(4443, 6604677307277093291L), BM.a(7799, 5909121351708059285L));
        BM.j = new Color(BM.a(6948, 6775764954468492253L), BM.a(16903, 3601239173844990714L), BM.a(16903, 3601239173844990714L));
        BM.N = Color.WHITE;
        BM.T = new Color(BM.a(20480, 311120984718895329L), BM.a(11224, 1388510942268166944L), BM.a(12108, 5393318221883840442L));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x38EB;
        if (d[n11] == null) {
            BM.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

