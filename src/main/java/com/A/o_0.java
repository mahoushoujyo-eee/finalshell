/*
 * Decompiled with CFR 0.152.
 */
package com.a;

import com.a.y_0;
import com.c4_0;
import java.awt.event.WindowEvent;

/*
 * Renamed from com.A.o
 */
class o_0
extends c4_0 {
    final y_0 R;
    private static final long a;

    o_0(y_0 y_02, boolean bl) {
        this.R = y_02;
        super(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean z() {
        int[] nArray = y_0.M();
        boolean bl = this.R.isShowing();
        if (nArray != null) {
            if (!bl) return false;
            bl = this.R.a;
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public void f(boolean bl) {
        block5: {
            boolean bl2;
            block6: {
                int[] nArray;
                block4: {
                    nArray = y_0.M();
                    bl2 = this.R.a;
                    if (nArray == null) break block4;
                    if (!bl2) break block5;
                    bl2 = this.R.isShowing();
                }
                if (nArray == null) break block6;
                if (!bl2) break block5;
                bl2 = bl;
            }
            if (!bl2) {
                y_0.X(this.R, new WindowEvent(this.R, (int)a));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 73805248783452370L;
        a = 0x253C7BD1944C081BL ^ l2;
    }
}

