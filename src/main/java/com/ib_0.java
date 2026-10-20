/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.j_0;
import com.uO;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from com.Ib
 */
class ib_0
implements Runnable {
    private final long V;
    private volatile boolean O;
    final uO e;

    public ib_0(uO uO2) {
        this.e = uO2;
        this.O = true;
        this.V = System.nanoTime() + uO.G(uO2);
    }

    public void I() {
        this.O = false;
    }

    @Override
    public void run() {
        block7: {
            block5: {
                block6: {
                    boolean bl = j_0.g();
                    ib_0 ib_02 = this;
                    if (bl) {
                        if (!ib_02.O) {
                            return;
                        }
                        ib_02 = this;
                    }
                    long l2 = ib_02.V - System.nanoTime();
                    if (!bl) break block5;
                    if (l2 <= 0L) break block6;
                    uO.J().schedule(this, l2, TimeUnit.NANOSECONDS);
                    if (bl) break block7;
                }
                this.O = false;
            }
            uO.u(this.e).run();
        }
    }
}

