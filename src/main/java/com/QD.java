/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.FV;
import com.RR;
import com.rd_1;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;

class QD
implements Runnable {
    final JScrollBar z;
    final int t;
    final int C;
    private static final long a;

    QD(JScrollBar jScrollBar, int n10, int n11) {
        this.z = jScrollBar;
        this.t = n10;
        this.C = n11;
    }

    @Override
    public void run() {
        String string = FV.D();
        FN.M(Thread.currentThread());
        String string2 = string;
        int n10 = this.z.getValue();
        while (n10 != this.t) {
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
                                thread = FN.E();
                                if (string2 != null) break block13;
                                if (thread == Thread.currentThread()) break block14;
                                thread = Thread.currentThread();
                            }
                            thread.interrupt();
                        }
                        n14 = n10;
                        n13 = this.t;
                        if (string2 != null) break block15;
                        if (n14 == n13) break block16;
                        n14 = n10;
                        n13 = this.C * Math.max(Math.abs(n10 - this.t) / 4, 1);
                    }
                    n10 = n12 = n14 + n13;
                    SwingUtilities.invokeLater(new RR(this, n12));
                    n11 = this.C;
                    if (string2 == null) {
                        if (n11 < 0) {
                            n11 = n12;
                            if (string2 == null) {
                                if (n11 == this.z.getMinimum()) break;
                            }
                        } else {
                            n11 = this.C;
                        }
                    }
                    if (string2 != null) break block17;
                    if (n11 <= 0) break block16;
                    n11 = n12;
                }
                if (n11 == this.z.getMaximum() && string2 == null) break;
            }
            rd_1.l(a);
            if (string2 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5628729250429719190L;
        a = 0x4E1D436E54B6D28FL ^ l2;
    }
}

