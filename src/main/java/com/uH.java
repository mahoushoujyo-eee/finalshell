/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ON;
import com.c4_0;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.FocusEvent;

class uH
implements AWTEventListener {
    private static final long[] a;
    private static final Integer[] b;

    uH() {
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block3: {
            FocusEvent focusEvent;
            FocusEvent focusEvent2;
            block7: {
                int n10;
                int n11;
                block4: {
                    int[] nArray;
                    block6: {
                        block5: {
                            int n12;
                            block2: {
                                nArray = c4_0.g();
                                n12 = aWTEvent instanceof FocusEvent;
                                if (nArray != null) break block2;
                                if (n12 == 0) break block3;
                                n12 = ON.B.size();
                            }
                            if (n12 <= 0) break block3;
                            focusEvent2 = (FocusEvent)aWTEvent;
                            n11 = focusEvent2.getID();
                            n10 = uH.a(16094, 8113623337527375130L);
                            if (nArray != null) break block4;
                            if (n11 != n10) break block5;
                            focusEvent = focusEvent2;
                            if (nArray != null) break block6;
                            if (focusEvent.getOppositeComponent() != null) break block5;
                            ON.u(focusEvent2.getComponent(), null);
                            if (nArray == null) break block3;
                        }
                        focusEvent = focusEvent2;
                    }
                    if (nArray != null) break block7;
                    n11 = focusEvent.getID();
                    n10 = uH.a(10468, 9054562868667048737L);
                }
                if (n11 != n10) break block3;
                focusEvent = focusEvent2;
            }
            ON.u(focusEvent.getOppositeComponent(), focusEvent2.getComponent());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2231055992467143847L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "bj\u00bd\u00e3\u00cb\u00a1\u00caP\u00d2\u00bcw\u00ffvU\u00dcj";
        int n11 = "bj\u00bd\u00e3\u00cb\u00a1\u00caP\u00d2\u00bcw\u00ffvU\u00dcj".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4BC4;
        if (b[n11] == null) {
            uH.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

