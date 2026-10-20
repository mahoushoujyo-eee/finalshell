/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.T.x;
import org.Y;
import org.b_0;
import org.v.RG;

/*
 * Renamed from org.v.r
 */
public class r_0
implements Y {
    private final x[] r;
    private final Y e;

    public r_0(x[] xArray, Y y2) {
        this.r = xArray;
        this.e = y2;
    }

    @Override
    public void U(@c String string, String string2, @c I i2) throws b_0 {
        block8: {
            Y y2;
            block7: {
                String[] stringArray = RG.C();
                try {
                    block6: {
                        try {
                            try {
                                if (string == null) break block6;
                                y2 = this;
                                if (stringArray == null) break block7;
                            }
                            catch (b_0 b_02) {
                                throw r_0.a(b_02);
                            }
                            if (!x.h(((r_0)y2).r, string)) break block8;
                        }
                        catch (b_0 b_03) {
                            throw r_0.a(b_03);
                        }
                    }
                    y2 = this.e;
                }
                catch (b_0 b_04) {
                    throw r_0.a(b_04);
                }
            }
            y2.U(string, string2, i2);
        }
    }

    private static b_0 a(b_0 b_02) {
        return b_02;
    }
}

