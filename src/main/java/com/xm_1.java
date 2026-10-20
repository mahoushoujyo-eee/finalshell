/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.yn_2;
import java.lang.reflect.Type;

/*
 * Renamed from com.xM
 */
public class xm_1 {
    public Object T;
    public final xm_1 G;
    public final Object Y;
    public final int p;
    public Type F;
    private transient String H;

    /*
     * Unable to fully structure code
     */
    public xm_1(xm_1 var1_1, Object var2_2, Object var3_3) {
        v0 = yn_2.Y();
        super();
        var4_4 = v0;
        this.G = var1_1;
        this.T = var2_2;
        this.Y = var3_3;
        v1 = var1_1;
        if (!var4_4) ** GOTO lbl13
        if (v1 == null) {
            v2 = 0;
        } else {
            v1 = var1_1;
lbl13:
            // 2 sources

            v2 = v1.p + 1;
        }
        this.p = v2;
    }

    public String toString() {
        String string;
        block2: {
            block3: {
                block6: {
                    xm_1 xm_12;
                    block7: {
                        Object object;
                        boolean bl;
                        block4: {
                            block5: {
                                bl = yn_2.o();
                                string = this.H;
                                if (bl) break block2;
                                if (string != null) break block3;
                                object = this.G;
                                if (bl) break block4;
                                if (object != null) break block5;
                                this.H = "$";
                                if (!bl) break block3;
                            }
                            xm_12 = this;
                            if (bl) break block6;
                            object = xm_12.Y;
                        }
                        if (!(object instanceof Integer)) break block7;
                        this.H = this.G.toString() + "[" + this.Y + "]";
                        if (!bl) break block3;
                    }
                    xm_12 = this;
                }
                xm_12.H = this.G.toString() + "." + this.Y;
            }
            string = this.H;
        }
        return string;
    }
}

