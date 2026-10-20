/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EC;
import com.ky_2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.NotNull;

public final class EW
extends EC {
    private final MouseEvent t;
    private static String f;
    private static final long[] a;
    private static final Integer[] b;

    public EW(@NotNull MouseEvent mouseEvent) {
        super(EW.c(mouseEvent), EW.q(mouseEvent));
        this.t = mouseEvent;
    }

    public String toString() {
        return this.t.toString();
    }

    static int c(@NotNull MouseEvent mouseEvent) {
        String string = EW.V();
        int n10 = SwingUtilities.isLeftMouseButton(mouseEvent);
        if (string == null) {
            if (n10 != 0) {
                return 0;
            }
            n10 = SwingUtilities.isMiddleMouseButton(mouseEvent);
        }
        if (string == null) {
            if (n10 != 0) {
                return 1;
            }
            n10 = SwingUtilities.isRightMouseButton(mouseEvent);
        }
        if (string == null) {
            if (n10 != 0) {
                return -1;
            }
            n10 = mouseEvent instanceof MouseWheelEvent;
        }
        if (string == null) {
            if (n10 != 0) {
                int n11 = ((MouseWheelEvent)mouseEvent).getWheelRotation();
                if (string == null) {
                    if (n11 > 0) {
                        return 5;
                    }
                    n11 = 4;
                }
                return n11;
            }
            n10 = -1;
        }
        return n10;
    }

    static int q(@NotNull MouseEvent mouseEvent) {
        int n10 = 0;
        String string = EW.V();
        int n11 = mouseEvent.isControlDown();
        if (string == null) {
            if (n11 != 0) {
                n10 |= EW.a(30035, 2301423629121430645L);
            }
            n11 = mouseEvent.isShiftDown();
        }
        if (string == null) {
            if (n11 != 0) {
                n10 |= 4;
            }
            n11 = mouseEvent.isMetaDown();
        }
        if (string == null) {
            if (n11 != 0) {
                n10 |= EW.a(1293, 5866757125853172778L);
            }
            n11 = n10;
        }
        if (string != null) {
            ky_2.K(new String[4]);
        }
        return n11;
    }

    public static void F(String string) {
        f = string;
    }

    public static String V() {
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3621016000392069631L;
        long[] lArray = new long[2];
        EW.F(null);
        int n10 = 0;
        String string = "S\u00a7u\u0000\u00ee\u0019%\u009a\u00fd\u00ef\u00d5$\u00c8\u0098U\u00dd";
        int n11 = "S\u00a7u\u0000\u00ee\u0019%\u009a\u00fd\u00ef\u00d5$\u00c8\u0098U\u00dd".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5126;
        if (b[n11] == null) {
            EW.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

