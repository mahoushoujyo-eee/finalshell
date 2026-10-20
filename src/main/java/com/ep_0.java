/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KB;
import com.YP;
import com._y_0;
import com.j_0;
import com.lf_0;
import com.pa_1;
import com.ru_1;
import java.awt.Graphics2D;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.Ep
 */
class ep_0
implements lf_0 {
    int o;
    final Graphics2D W;
    final pa_1 p;
    private static final long a;

    ep_0(pa_1 pa_12, Graphics2D graphics2D) {
        this.p = pa_12;
        this.W = graphics2D;
        this.o = this.p.U();
    }

    @Override
    public void N(int n10, int n11, @NotNull YP yP, @NotNull j_0 j_02, int n12) {
        block18: {
            Object object;
            Object object2;
            Object object3;
            int n13;
            block19: {
                ru_1 ru_12;
                int n14;
                block17: {
                    block15: {
                        block16: {
                            pa_1 pa_12;
                            block14: {
                                block13: {
                                    n13 = n11 - n12;
                                    n14 = _y_0.y();
                                    pa_1.G(this.p, n10, n13, yP, j_02, this.W);
                                    pa_12 = this.p;
                                    if (n14 != 0) break block14;
                                    if (pa_1.o(pa_12) == null) break block13;
                                    pa_12 = this.p;
                                    if (n14 != 0) break block14;
                                    object3 = pa_1.o(pa_12).E(j_02);
                                    if (object3 != null) {
                                        this.p.c8 = true;
                                        object2 = object3.iterator();
                                        while (object2.hasNext()) {
                                            object = (KB)object2.next();
                                            YP yP2 = pa_1.a(this.p, yP);
                                            j_0 j_03 = j_02.D((KB)object);
                                            pa_1.G(this.p, n10 + (Integer)((KB)object).X, n13, yP2, j_03, this.W);
                                            if (n14 == 0) {
                                                if (n14 == 0) continue;
                                            }
                                            break block13;
                                        }
                                        this.p.c8 = false;
                                    }
                                }
                                pa_12 = this.p;
                            }
                            ru_12 = pa_1.Y(pa_12);
                            if (n14 != 0) break block15;
                            if (ru_12 == null) break block16;
                            ru_12 = pa_1.Y(this.p);
                            if (n14 != 0) break block15;
                            object3 = ru_12.x(n10, n13 + this.p.P, j_02.length());
                            if (object3 != null) {
                                object2 = pa_1.l(this.p, yP);
                                object = j_02.Y((Integer)((KB)object3).X - n10, (Integer)((KB)object3).S);
                                pa_1.G(this.p, (Integer)((KB)object3).X, n13, (YP)object2, (j_0)object, this.W);
                            }
                        }
                        ru_12 = pa_1.e(this.p);
                    }
                    if (n14 != 0) break block17;
                    if (ru_12 == null) break block18;
                    ru_12 = pa_1.e(this.p);
                }
                object3 = ru_12.x(n10, n13 + this.p.P, j_02.length());
                if (n14 != 0) break block19;
                if (object3 == null) break block18;
                this.p.k = true;
            }
            object2 = pa_1.S(this.p, yP);
            object = j_02.Y((Integer)((KB)object3).X - n10, (Integer)((KB)object3).S);
            pa_1.G(this.p, (Integer)((KB)object3).X, n13, (YP)object2, (j_0)object, this.W);
            this.p.k = false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void r(int n10, int n11, int n12, YP yP, j_0 j_02, int n13) {
        int n14 = n11 - n13;
        int n15 = _y_0.M();
        pa_1 pa_12 = this.p;
        if (n15 != 0) {
            if (pa_1.e(pa_12) != null) {
                KB kB = pa_1.e(this.p).x(n12, n14 + this.p.P, this.o - n12);
                if (n15 == 0) return;
                if (kB != null) {
                    YP yP2 = pa_1.S(this.p, yP);
                    pa_1.G(this.p, n10, n14, yP2, j_02, this.W);
                    return;
                }
            }
            pa_12 = this.p;
        }
        pa_1.G(pa_12, n10, n14, yP, j_02, this.W);
    }

    @Override
    public void K(int n10, int n11, int n12, int n13) {
        if (n10 < this.o) {
            this.r(n10, n11, n12, YP.r, new j_0((char)a, this.o - n10), n13);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5261361356709521201L;
        a = 0x16E6BA622DA36711L ^ l2;
    }
}

