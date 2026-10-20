/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.kz_2;
import java.io.File;
import java.util.List;

/*
 * Renamed from com.Ex
 */
class ex_0
extends EY {
    final kz_2 K;

    ex_0(kz_2 kz_22) {
        this.K = kz_22;
    }

    @Override
    public boolean A() {
        return this.K.y;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean d(List var1_1) {
        block6: {
            var3_2 = this.K.O();
            var4_3 = var1_1.iterator();
            var2_4 = kz_2.M();
            while (var4_3.hasNext()) {
                block10: {
                    block9: {
                        block7: {
                            block8: {
                                v0 = var5_5 = (File)var4_3.next();
                                if (var2_4 == null) ** GOTO lbl13
                                v1 = v0.isDirectory();
                                if (var2_4 == null) break block6;
                                if (v1) {
                                    v2 = var5_5;
                                } else {
                                    v0 = var5_5;
lbl13:
                                    // 2 sources

                                    v2 = var6_6 = v0.getParentFile();
                                }
                                if (var2_4 == null) break block7;
                                if (var3_2 == null) break block8;
                                v3 = var3_2.accept(var6_6);
                                if (var2_4 == null) break block9;
                                if (!v3) break block10;
                            }
                            this.K.X(var6_6);
                        }
                        v3 = true;
                    }
                    return v3;
                }
                if (var2_4 != null) continue;
            }
            v1 = false;
        }
        return v1;
    }
}

