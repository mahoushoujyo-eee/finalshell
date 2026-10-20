/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.P9;
import com.PV;
import com.aL;
import com.ho_0;
import com.km_2;
import com.nx_2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ed
 */
@XStreamAlias(value="GradientData")
public class ed_0
implements Serializable,
Cloneable,
km_2 {
    private static final transient ho_0 u = new ho_0();
    @XStreamImplicit(itemFieldName="Color")
    private List a;

    public ed_0() {
        this.a = new ArrayList();
    }

    public ed_0(List list) {
        this.h(list);
    }

    public boolean Z(float f10) {
        boolean bl;
        block3: {
            Iterator iterator = this.a.iterator();
            int n10 = nx_2.c();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        PV pV2 = (PV)iterator.next();
                        float f11 = pV2.I() - f10;
                        bl = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (n10 == 0) break block3;
                        if (n10 == 0) break block4;
                        if (bl) break block5;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (n10 != 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public void H(PV pV2) {
        this.a.add(pV2);
        this.u();
    }

    public void W(float f10, Color color) {
        this.a.add(new PV(f10, color));
        this.u();
    }

    public void W(PV pV2) {
        this.a.remove(pV2);
        this.u();
    }

    public List X() {
        this.u();
        return this.a;
    }

    public void h(List list) {
        this.a = list;
        this.u();
    }

    public float[] l() {
        float[] fArray;
        block2: {
            int n10 = nx_2.c();
            this.u();
            float[] fArray2 = new float[this.a.size()];
            int n11 = n10;
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                fArray = fArray2;
                if (n11 != 0) {
                    fArray[i2] = ((PV)this.a.get(i2)).I();
                    if (n11 != 0) continue;
                }
                break block2;
            }
            fArray = fArray2;
        }
        return fArray;
    }

    public Color[] H() {
        Color[] colorArray;
        block2: {
            int n10 = nx_2.R();
            this.u();
            Color[] colorArray2 = new Color[this.a.size()];
            int n11 = n10;
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                colorArray = colorArray2;
                if (n11 == 0) {
                    colorArray[i2] = ((PV)this.a.get(i2)).N();
                    if (n11 == 0) continue;
                }
                break block2;
            }
            colorArray = colorArray2;
        }
        return colorArray;
    }

    public int C() {
        return this.a.size();
    }

    public PV B(int n10) {
        return (PV)this.a.get(n10);
    }

    public float h(int n10) {
        return this.B(n10).I();
    }

    public Color d(int n10) {
        return this.B(n10).N();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public PV L() {
        int n10 = nx_2.c();
        ed_0 ed_02 = this;
        if (n10 != 0) {
            if (ed_02.C() <= 0) return null;
            ed_02 = this.a.get(0);
        }
        PV pV2 = (PV)((Object)ed_02);
        return pV2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public PV C() {
        int n10 = nx_2.R();
        ed_0 ed_02 = this;
        if (n10 == 0) {
            if (ed_02.C() <= 0) return null;
            ed_02 = this.a.get(this.C() - 1);
        }
        PV pV2 = (PV)((Object)ed_02);
        return pV2;
    }

    public Color Z(float f10) {
        float f11;
        int n10;
        block9: {
            int n11 = nx_2.R();
            int n12 = this.C();
            if (n11 == 0) {
                if (n12 == 0) {
                    return null;
                }
                float f12 = f10 - this.L().I();
                n12 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            }
            if (n11 == 0) {
                if (n12 <= 0) {
                    return FN.q(this.B(0).N());
                }
                float f13 = f10 - this.C().I();
                n12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
            }
            if (n11 == 0) {
                if (n12 >= 0) {
                    return FN.q(this.C().N());
                }
                n12 = -1;
            }
            n10 = n12;
            for (int i2 = 0; i2 < this.C(); ++i2) {
                f11 = this.h(i2);
                if (n11 == 0) {
                    float f14 = f11 - f10;
                    float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (n11 == 0) {
                        if (f15 <= 0) continue;
                        f15 = i2;
                    }
                    n10 = (int)f15;
                    if (n11 == 0) break;
                    if (n11 == 0) continue;
                }
                break block9;
            }
            f11 = this.h(n10 - 1);
        }
        float f16 = f11;
        float f17 = f10 - f16;
        float f18 = this.h(n10) - f16;
        float f19 = f17 / f18;
        Color color = this.d(n10 - 1);
        Color color2 = this.d(n10);
        return P9.N(color, color2, f19);
    }

    public void u() {
        Collections.sort(this.a, u);
    }

    public boolean equals(Object object) {
        boolean bl;
        block9: {
            int n10;
            Object object2;
            int n11;
            block12: {
                block13: {
                    block11: {
                        block10: {
                            n11 = nx_2.R();
                            object2 = object;
                            if (n11 != 0) break block10;
                            if (object2 == null) break block11;
                            object2 = object;
                        }
                        if (n11 != 0) break block12;
                        if (object2 instanceof ed_0) break block13;
                    }
                    return false;
                }
                object2 = object;
            }
            ed_0 ed_02 = (ed_0)object2;
            int n12 = this.C();
            if (n11 == 0) {
                if (n12 != ed_02.C()) {
                    return false;
                }
                n12 = n10 = 0;
            }
            while (n10 < this.C()) {
                block15: {
                    boolean bl2;
                    block14: {
                        bl = this.B(n10).equals(ed_02.B(n10));
                        if (n11 != 0) break block9;
                        if (n11 != 0) break block14;
                        if (bl) break block15;
                        bl2 = false;
                    }
                    return bl2;
                }
                ++n10;
                if (n11 == 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    public ed_0 Y() {
        return new ed_0(aL.y(this.a));
    }

    public static ed_0 r() {
        ed_0 ed_02 = new ed_0();
        ed_02.W(0.0f, Color.RED);
        ed_02.W(0.25f, Color.YELLOW);
        ed_02.W(0.5f, Color.GREEN);
        ed_02.W(0.75f, Color.CYAN);
        ed_02.W(1.0f, Color.BLUE);
        return ed_02;
    }

    public Object clone() throws CloneNotSupportedException {
        return this.Y();
    }
}

