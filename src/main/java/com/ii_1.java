/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.FV;
import com.im_1;
import com.rd_1;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.iI
 */
class ii_1
implements Runnable {
    final JScrollBar A;
    final int a;
    final int B;
    private static final long b;

    ii_1(JScrollBar jScrollBar, int n10, int n11) {
        this.A = jScrollBar;
        this.a = n10;
        this.B = n11;
    }

    @Override
    public void run() {
        String string = FV.D();
        FN.B(Thread.currentThread());
        String string2 = string;
        int n10 = this.A.getValue();
        while (n10 != this.a) {
            block16: {
                int n11;
                block17: {
                    int n12;
                    int n13;
                    int n14;
                    block15: {
                        block14: {
                            Thread thread;
                            block13: {
                                thread = FN.Z();
                                if (string2 != null) break block13;
                                if (thread == Thread.currentThread()) break block14;
                                thread = Thread.currentThread();
                            }
                            thread.interrupt();
                        }
                        n14 = n10;
                        n13 = this.a;
                        if (string2 != null) break block15;
                        if (n14 == n13) break block16;
                        n14 = n10;
                        n13 = this.B * Math.max(Math.abs(n10 - this.a) / 4, 1);
                    }
                    n10 = n12 = n14 + n13;
                    SwingUtilities.invokeLater(new im_1(this, n12));
                    n11 = this.B;
                    if (string2 == null) {
                        if (n11 < 0) {
                            n11 = n12;
                            if (string2 == null) {
                                if (n11 == this.A.getMinimum()) break;
                            }
                        } else {
                            n11 = this.B;
                        }
                    }
                    if (string2 != null) break block17;
                    if (n11 <= 0) break block16;
                    n11 = n12;
                }
                if (n11 == this.A.getMaximum() && string2 == null) break;
            }
            rd_1.l(b);
            if (string2 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6885509346455184032L;
        b = 0x5F8E3E450517E2B9L ^ l2;
    }
}

