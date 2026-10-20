/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CT;
import com.yf_1;

/*
 * Renamed from com.wB
 */
class wb_1
implements Runnable {
    final yf_1 D;

    wb_1(yf_1 yf_12) {
        this.D = yf_12;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block7: {
            long l2;
            block6: {
                long l3 = yf_1.Y(this.D).lastModified();
                String[] stringArray = CT.U();
                l2 = l3;
                if (stringArray != null) break block6;
                try {
                    block8: {
                        if (l2 <= yf_1.C()) break block7;
                        break block8;
                        catch (Exception exception) {
                            throw wb_1.a(exception);
                        }
                    }
                    l2 = l3;
                }
                catch (Exception exception) {
                    throw wb_1.a(exception);
                }
            }
            yf_1.e(l2);
            try {
                yf_1.R(this.D);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

