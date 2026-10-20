/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.h.cr_0;
import org.h.u_0;

public abstract class CM {
    final int X;
    static final boolean t;
    private static final long d;

    public CM(int n10) {
        block2: {
            block3: {
                block5: {
                    int n11;
                    block4: {
                        ky_2[] ky_2Array = cr_0.q();
                        ky_2[] ky_2Array2 = ky_2Array;
                        if (ky_2Array2 != null) break block2;
                        if (t) break block3;
                        n11 = n10;
                        if (ky_2Array2 != null) break block4;
                        if (n11 < 0) break block5;
                        n11 = n10;
                    }
                    if (n11 <= (int)d) break block3;
                }
                throw new AssertionError();
            }
            this.X = n10;
        }
    }

    public abstract Object r(u_0 var1);

    public abstract void e(DataOutputStream var1) throws IOException;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2196569374868418399L;
        d = 0xC69CC7CA618850A0L ^ l2;
        t = !cr_0.class.desiredAssertionStatus();
    }
}

