/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ax_0;
import com.ky_2;
import com.kz_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

/*
 * Renamed from com.lO
 */
@XStreamAlias(value="PluginVersion")
public class lo_1
implements Serializable {
    public static final lo_1 L = new lo_1(1, 0, 0);
    @XStreamAsAttribute
    private int C;
    @XStreamAsAttribute
    private int q;
    @XStreamAsAttribute
    private Integer H;

    public lo_1() {
        this.C = lo_1.L.C;
        this.q = lo_1.L.q;
        this.H = lo_1.L.H;
    }

    public lo_1(int n10, int n11) {
        this.C = n10;
        this.q = n11;
        this.H = null;
    }

    public lo_1(int n10, int n11, Integer n12) {
        this.C = n10;
        this.q = n11;
        this.H = n12;
    }

    public int r() {
        return this.C;
    }

    public void L(int n10) {
        this.C = n10;
    }

    public int b() {
        return this.q;
    }

    public void E(int n10) {
        this.q = n10;
    }

    public Integer m() {
        return this.H;
    }

    public void R(Integer n10) {
        this.H = n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Z(lo_1 lo_12) {
        lo_1 lo_13;
        int n10;
        ky_2[] ky_2Array;
        block14: {
            int n11;
            int n12;
            block13: {
                block10: {
                    lo_1 lo_14;
                    block12: {
                        block11: {
                            ky_2Array = kz_1.W();
                            n10 = this.C;
                            if (ky_2Array != null) return n10 != 0;
                            if (n10 > lo_12.C) return 1 != 0;
                            n12 = this.C;
                            n11 = lo_12.C;
                            if (ky_2Array == null) {
                                if (n12 == n11) {
                                    n10 = this.q;
                                    if (ky_2Array != null) return n10 != 0;
                                    if (n10 > lo_12.q) return 1 != 0;
                                }
                                n12 = this.C;
                                n11 = lo_12.C;
                            }
                            if (ky_2Array != null) break block10;
                            if (n12 != n11) break block11;
                            n12 = this.q;
                            n11 = lo_12.q;
                            if (ky_2Array != null) break block10;
                            if (n12 != n11) break block11;
                            lo_14 = this;
                            if (ky_2Array != null) break block12;
                            if (lo_14.H == null) break block11;
                            lo_14 = lo_12;
                            if (ky_2Array != null) break block12;
                            if (lo_14.H == null) return 1 != 0;
                        }
                        lo_14 = this;
                    }
                    n12 = lo_14.C;
                    n11 = lo_12.C;
                }
                if (ky_2Array != null) break block13;
                if (n12 != n11) return 0 != 0;
                lo_13 = this;
                if (ky_2Array != null) break block14;
                n12 = lo_13.q;
                n11 = lo_12.q;
            }
            if (n12 != n11) return 0 != 0;
            lo_13 = this;
        }
        Integer n13 = lo_13.H;
        if (ky_2Array == null) {
            if (n13 != null) return 0 != 0;
            n13 = lo_12.H;
        }
        if (ky_2Array == null) {
            if (n13 == null) return 0 != 0;
            n13 = this.H;
        }
        n10 = n13;
        if (ky_2Array != null) return n10 != 0;
        if (n10 <= lo_12.H) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean E(lo_1 lo_12) {
        ky_2[] ky_2Array = kz_1.W();
        boolean bl = this.a(lo_12);
        if (ky_2Array != null) return bl;
        if (bl) return true;
        bl = this.Z(lo_12);
        if (ky_2Array != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean z(lo_1 lo_12) {
        lo_1 lo_13;
        int n10;
        ky_2[] ky_2Array;
        block14: {
            int n11;
            int n12;
            block13: {
                block10: {
                    lo_1 lo_14;
                    block12: {
                        block11: {
                            ky_2Array = kz_1.W();
                            n10 = lo_12.C;
                            if (ky_2Array != null) return n10 != 0;
                            if (n10 > this.C) return 1 != 0;
                            n12 = lo_12.C;
                            n11 = this.C;
                            if (ky_2Array == null) {
                                if (n12 == n11) {
                                    n10 = lo_12.q;
                                    if (ky_2Array != null) return n10 != 0;
                                    if (n10 > this.q) return 1 != 0;
                                }
                                n12 = lo_12.C;
                                n11 = this.C;
                            }
                            if (ky_2Array != null) break block10;
                            if (n12 != n11) break block11;
                            n12 = lo_12.q;
                            n11 = this.q;
                            if (ky_2Array != null) break block10;
                            if (n12 != n11) break block11;
                            lo_14 = lo_12;
                            if (ky_2Array != null) break block12;
                            if (lo_14.H == null) break block11;
                            lo_14 = this;
                            if (ky_2Array != null) break block12;
                            if (lo_14.H == null) return 1 != 0;
                        }
                        lo_14 = lo_12;
                    }
                    n12 = lo_14.C;
                    n11 = this.C;
                }
                if (ky_2Array != null) break block13;
                if (n12 != n11) return 0 != 0;
                lo_13 = lo_12;
                if (ky_2Array != null) break block14;
                n12 = lo_13.q;
                n11 = this.q;
            }
            if (n12 != n11) return 0 != 0;
            lo_13 = lo_12;
        }
        Integer n13 = lo_13.H;
        if (ky_2Array == null) {
            if (n13 == null) return 0 != 0;
            n13 = this.H;
        }
        if (ky_2Array == null) {
            if (n13 == null) return 0 != 0;
            n13 = lo_12.H;
        }
        n10 = n13;
        if (ky_2Array != null) return n10 != 0;
        if (n10 <= this.H) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean x(lo_1 lo_12) {
        ky_2[] ky_2Array = kz_1.W();
        boolean bl = this.a(lo_12);
        if (ky_2Array != null) return bl;
        if (bl) return true;
        bl = this.z(lo_12);
        if (ky_2Array != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(lo_1 lo_12) {
        boolean bl;
        ky_2[] ky_2Array;
        block3: {
            int n10;
            block2: {
                ky_2Array = kz_1.W();
                bl = lo_12.C;
                n10 = this.C;
                if (ky_2Array != null) break block2;
                if (bl != n10) return false;
                bl = lo_12.q;
                if (ky_2Array != null) break block3;
                n10 = this.q;
            }
            if (bl != n10) return false;
            bl = ax_0.Z(lo_12.H, new Object[]{this.H});
        }
        if (ky_2Array != null) return bl;
        if (!bl) return false;
        return true;
    }

    public String toString() {
        ky_2[] ky_2Array = kz_1.W();
        StringBuilder stringBuilder = new StringBuilder().append("v").append(this.C);
        String string = ".";
        if (ky_2Array == null) {
            stringBuilder = stringBuilder.append(string).append(this.q);
            string = this.H != null ? "." + this.H : "";
        }
        return stringBuilder.append(string).toString();
    }
}

