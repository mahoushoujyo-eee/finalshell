/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.c;
import com.dm_2;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

class w
implements AWTEventListener {
    private static final long[] a;
    private static final Integer[] b;

    w() {
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block7: {
            int n10;
            int n11;
            block13: {
                String string;
                block14: {
                    boolean bl;
                    block12: {
                        block11: {
                            String string2;
                            Object object;
                            block10: {
                                int n12;
                                int n13;
                                block9: {
                                    block8: {
                                        MouseEvent mouseEvent;
                                        block6: {
                                            boolean bl2 = dm_2.F();
                                            aWTEvent.getSource();
                                            mouseEvent = (MouseEvent)aWTEvent;
                                            bl = bl2;
                                            n13 = aWTEvent.getSource() instanceof JButton;
                                            if (!bl) break block6;
                                            if (n13 == 0) break block7;
                                            n13 = mouseEvent.getClickCount();
                                        }
                                        n12 = 1;
                                        if (!bl) break block8;
                                        if (n13 != n12) break block7;
                                        int n12 = mouseEvent.getButton();
                                        n12 = 1;
                                    }
                                    if (!bl) break block9;
                                    if (n13 != n12) break block7;
                                    object = aWTEvent;
                                    if (!bl) break block10;
                                    int n12 = ((AWTEvent)object).getID();
                                    n12 = w.a(13682, 2697043498985754675L);
                                }
                                if (n13 != n12) break block7;
                                object = aWTEvent.getSource();
                            }
                            JButton jButton = (JButton)object;
                            string = jButton.getText();
                            try {
                                string2 = (String)lk_0.a(string);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            string = string2;
                            n11 = string.startsWith(" ");
                            if (!bl) break block11;
                            if (n11 == 0) break block7;
                            n11 = string.endsWith(" ");
                        }
                        if (!bl) break block12;
                        if (n11 == 0) break block7;
                        n11 = string.length();
                    }
                    n10 = w.a(15473, 2236612198155524401L);
                    if (!bl) break block13;
                    if (n11 != n10) break block14;
                    DI.ia = System.currentTimeMillis();
                    if (bl) break block7;
                }
                int n10 = string.length();
                n10 = 4;
            }
            if (n11 == n10) {
                DI.J = System.currentTimeMillis();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7908920917448075006L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\f(\u000f\u00b4b{\u00bf\u00c8\u00d1[\u00f0\u00ed\u0005\u00f4\u00b79";
        int n11 = "\f(\u000f\u00b4b{\u00bf\u00c8\u00d1[\u00f0\u00ed\u0005\u00f4\u00b79".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2540;
        if (b[n11] == null) {
            w.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

