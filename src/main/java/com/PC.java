/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.ps_0;

class PC
extends ps_0 {
    private final byte[] x;

    public PC(byte[] byArray) {
        this.x = byArray;
        this.c();
        this.N();
    }

    @Override
    void c() {
        block8: {
            block6: {
                ++this.p;
                String string = hi_0.C();
                try {
                    PC pC;
                    block7: {
                        try {
                            try {
                                pC = this;
                                if (string != null) break block6;
                                if (pC.p < this.x.length) break block7;
                            }
                            catch (hi_0 hi_02) {
                                throw PC.a(hi_02);
                            }
                            this.D = '\u0000';
                            this.o = true;
                            if (string == null) break block8;
                        }
                        catch (hi_0 hi_03) {
                            throw PC.a(hi_03);
                        }
                    }
                    pC = this;
                }
                catch (hi_0 hi_04) {
                    throw PC.a(hi_04);
                }
            }
            pC.D = (char)this.x[this.p];
        }
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

