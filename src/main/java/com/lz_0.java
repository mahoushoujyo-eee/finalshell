/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aL;
import com.og_2;
import com.p5_0;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Lz
 */
public abstract class lz_0
implements og_2 {
    protected Boolean d = false;
    protected Dimension H = new Dimension(0, 0);
    protected Insets U = new Insets(0, 0, 0, 0);
    protected List c = new ArrayList(1);
    private static int[] V;

    @Override
    public void A(JComponent jComponent) {
    }

    @Override
    public void X(JComponent jComponent) {
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.d;
    }

    public void g(Boolean bl) {
        this.d = bl;
        this.l();
    }

    @Override
    public Dimension d(JComponent jComponent) {
        return this.H;
    }

    public void M(Dimension dimension) {
        this.H = dimension;
        this.x();
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.U;
    }

    public void Q(Insets insets) {
        this.U = insets;
        this.x();
    }

    public void X(int n10, int n11, int n12, int n13) {
        this.Q(new Insets(n10, n11, n12, n13));
    }

    public void z(int n10) {
        this.X(n10, n10, n10, n10);
    }

    @Override
    public void A(p5_0 p5_02) {
        this.c.add(p5_02);
    }

    @Override
    public void E(p5_0 p5_02) {
        this.c.remove(p5_02);
    }

    public void l() {
        Iterator iterator = aL.J((Collection)this.c).iterator();
        int[] nArray = lz_0.M();
        while (iterator.hasNext()) {
            p5_0 p5_02 = (p5_0)iterator.next();
            p5_02.r();
            if (nArray == null) continue;
        }
    }

    public void M(Rectangle rectangle) {
        this.u(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public void u(int n10, int n11, int n12, int n13) {
        Iterator iterator = aL.J((Collection)this.c).iterator();
        int[] nArray = lz_0.M();
        while (iterator.hasNext()) {
            p5_0 p5_02 = (p5_0)iterator.next();
            p5_02.M(n10, n11, n12, n13);
            if (nArray == null) continue;
        }
    }

    public void x() {
        Iterator iterator = aL.J((Collection)this.c).iterator();
        int[] nArray = lz_0.M();
        while (iterator.hasNext()) {
            p5_0 p5_02 = (p5_0)iterator.next();
            p5_02.J();
            if (nArray == null) continue;
        }
    }

    public void g() {
        Iterator iterator = aL.J((Collection)this.c).iterator();
        int[] nArray = lz_0.M();
        while (iterator.hasNext()) {
            p5_0 p5_02 = (p5_0)iterator.next();
            p5_02.p();
            if (nArray == null) continue;
        }
    }

    public void Z() {
        Iterator iterator = aL.J((Collection)this.c).iterator();
        int[] nArray = lz_0.M();
        while (iterator.hasNext()) {
            p5_0 p5_02 = (p5_0)iterator.next();
            p5_02.p();
            p5_02.J();
            p5_02.r();
            if (nArray == null) continue;
        }
    }

    protected Point J(int n10, int n11) {
        return new Point(n10, n11);
    }

    public static void d(int[] nArray) {
        V = nArray;
    }

    public static int[] M() {
        return V;
    }

    static {
        if (lz_0.M() != null) {
            lz_0.d(new int[1]);
        }
    }
}

