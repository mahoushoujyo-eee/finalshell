/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EZ;
import com.kd_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.awt.Dimension;
import java.awt.Insets;
import java.io.Serializable;
import java.util.List;

@XStreamAlias(value="NinePatchInfo")
public class RT
implements Serializable {
    @XStreamAsAttribute
    private Dimension f;
    @XStreamAsAttribute
    private Insets n;
    @XStreamImplicit(itemFieldName="hor")
    private List M;
    @XStreamImplicit(itemFieldName="ver")
    private List W;

    public Dimension g() {
        return this.f;
    }

    public void x(Dimension dimension) {
        this.f = dimension;
    }

    public Insets W() {
        return this.n;
    }

    public void Y(Insets insets) {
        this.n = insets;
    }

    public List k() {
        return this.M;
    }

    public void S(List list) {
        this.M = list;
    }

    public List o() {
        return this.W;
    }

    public void V(List list) {
        this.W = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int[] nArray = kd_1.u();
        Object object2 = object;
        if (nArray == null) {
            if (object2 == null) return false;
            object2 = object;
        }
        boolean bl = object2 instanceof RT;
        if (nArray != null) return bl;
        if (!bl) return false;
        RT rT = (RT)object;
        boolean bl2 = this.W().equals(rT.W());
        if (nArray == null) {
            if (!bl2) return false;
            bl2 = RT.g(this.k(), rT.k());
        }
        if (nArray == null) {
            if (!bl2) return false;
            bl2 = RT.g(this.o(), rT.o());
        }
        if (nArray != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean g(List var0, List var1_1) {
        block16: {
            block19: {
                block20: {
                    block18: {
                        block17: {
                            var2_2 = kd_1.u();
                            v0 = var0;
                            if (var2_2 == null) {
                                if (v0 == null) {
                                    v0 = var1_1;
                                    if (var2_2 == null) {
                                        if (v0 == null) {
                                            return true;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v0 = var0;
                                }
                            }
                            if (var2_2 != null) break block17;
                            if (v0 == null) break block18;
                            v0 = var1_1;
                        }
                        if (var2_2 != null) break block19;
                        if (v0 != null) break block20;
                    }
                    return false;
                }
                v0 = var0;
            }
            v1 = v0.size();
            if (var2_2 == null) {
                if (v1 != var1_1.size()) {
                    return false;
                }
                v1 = var3_3 = 0;
            }
            while (var3_3 < var0.size()) {
                block22: {
                    block21: {
                        v2 = ((EZ)var0.get(var3_3)).equals(var1_1.get(var3_3));
                        if (var2_2 != null) break block16;
                        if (var2_2 != null) break block21;
                        if (v2) break block22;
                        v3 = false;
                    }
                    return v3;
                }
                ++var3_3;
                if (var2_2 == null) continue;
            }
            v2 = true;
        }
        return v2;
    }
}

