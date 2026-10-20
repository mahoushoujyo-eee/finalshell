/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TD;
import com.ky_2;
import com.ot_1;
import java.awt.Insets;
import java.awt.LayoutManager;

/*
 * Renamed from com.kE
 */
public class ke_1
extends ky_2 {
    private int q = ot_1.U;
    private Insets a = ot_1.o;
    private boolean M = ot_1.F;
    private boolean C = true;
    private static String r;

    public ke_1() {
        this(true);
    }

    public ke_1(boolean bl) {
        super(bl, (LayoutManager)ke_1.C());
        this.i(true);
    }

    protected boolean u() {
        return this.C;
    }

    protected void U(boolean bl) {
        this.C = bl;
    }

    public int j() {
        return this.q;
    }

    public ke_1 g(int n10) {
        this.q = n10;
        this.F().j(n10 + ot_1.E);
        return this;
    }

    public Insets U() {
        return this.a;
    }

    public ke_1 S(int n10) {
        return this.o(n10, n10, n10, n10);
    }

    public ke_1 o(int n10, int n11, int n12, int n13) {
        return this.t(new Insets(n10, n11, n12, n13));
    }

    public ke_1 t(Insets insets) {
        this.a = insets;
        return this;
    }

    public boolean z() {
        return this.M;
    }

    public void b(boolean bl) {
        this.M = bl;
    }

    public TD F() {
        return (TD)super.getLayout();
    }

    protected static TD C() {
        return new TD(ot_1.U + ot_1.E);
    }

    public static void O(String string) {
        r = string;
    }

    public static String v() {
        return r;
    }

    static {
        if (ke_1.v() != null) {
            ke_1.O("hhUHwc");
        }
    }
}

