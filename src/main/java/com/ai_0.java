/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LG;
import com.cj_1;
import com.kj_2;
import com.ky_2;
import com.ns_1;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;

/*
 * Renamed from com.ai
 */
public class ai_0
implements Icon {
    private cj_1 F;
    private final Map k;
    private int g;
    private int K;
    private int V;
    private Thread j;
    private boolean E;

    public ai_0(Class clazz, String string) throws IOException {
        this(new BufferedInputStream(clazz.getResource(string).openStream()));
    }

    public ai_0(String string) throws FileNotFoundException {
        this(new BufferedInputStream(new FileInputStream(string)));
    }

    public ai_0(BufferedInputStream bufferedInputStream) {
        block5: {
            int n10;
            ns_1 ns_12;
            ky_2[] ky_2Array;
            block6: {
                this.g = 0;
                this.K = 0;
                ky_2Array = kj_2.d();
                this.V = -1;
                this.E = false;
                this.k = new HashMap();
                ns_12 = new ns_1();
                int n11 = this.g = ns_12.P(bufferedInputStream);
                if (ky_2Array == null) break block6;
                if (n11 != 0) break block5;
                this.K = ns_12.f();
                this.V = 0;
                n11 = n10 = 0;
            }
            while (n10 < this.K) {
                this.k.put(n10, new kj_2(ns_12.j(n10), ns_12.F(n10)));
                ++n10;
                if (ky_2Array != null) {
                    if (ky_2Array != null) continue;
                }
                break block5;
            }
            this.b();
        }
    }

    public void b() {
        block3: {
            ai_0 ai_02;
            block2: {
                ky_2[] ky_2Array = kj_2.d();
                ai_02 = this;
                if (ky_2Array == null) break block2;
                if (ai_02.K <= 1) break block3;
                this.V = 0;
                this.j = new Thread(new LG(this));
                this.j.setDaemon(true);
                ai_02 = this;
            }
            ai_02.j.start();
        }
    }

    public void Q() {
        block3: {
            block2: {
                ky_2[] ky_2Array = kj_2.d();
                ai_0 ai_02 = this;
                if (ky_2Array == null) break block2;
                if (!ai_02.j.isAlive()) break block3;
                ai_02 = this;
            }
            ai_02.E = true;
        }
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        ky_2[] ky_2Array = kj_2.d();
        int n12 = this.K;
        if (ky_2Array != null && n12 > 0) {
            n12 = graphics.drawImage(((kj_2)this.k.get((Object)Integer.valueOf((int)this.V))).W, n10, n11, component) ? 1 : 0;
        }
    }

    @Override
    public int getIconWidth() {
        return ((kj_2)this.k.get((Object)Integer.valueOf((int)this.V))).W.getWidth();
    }

    @Override
    public int getIconHeight() {
        return ((kj_2)this.k.get((Object)Integer.valueOf((int)this.V))).W.getHeight();
    }

    public BufferedImage o() {
        return ((kj_2)this.k.get((Object)Integer.valueOf((int)this.V))).W;
    }

    public int t() {
        return this.g;
    }

    public int F() {
        return this.K;
    }

    public int x() {
        return this.V;
    }

    public Map H() {
        return this.k;
    }

    public cj_1 g() {
        return this.F;
    }

    public void v(cj_1 cj_12) {
        this.F = cj_12;
    }

    static boolean r(ai_0 ai_02) {
        return ai_02.E;
    }

    static int E(ai_0 ai_02) {
        return ai_02.V;
    }

    static Map q(ai_0 ai_02) {
        return ai_02.k;
    }

    static int C(ai_0 ai_02) {
        return ai_02.K;
    }

    static int g(ai_0 ai_02, int n10) {
        ai_02.V = n10;
        return ai_02.V;
    }

    static int z(ai_0 ai_02) {
        return ai_02.V++;
    }

    static cj_1 I(ai_0 ai_02) {
        return ai_02.F;
    }
}

