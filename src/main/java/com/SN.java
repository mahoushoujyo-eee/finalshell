/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.GO;
import com.WC;
import com.XV;
import com.xk_0;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public final class SN {
    private static final Map B;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    public static Window N(Window window, boolean bl) {
        xk_0.Z(window, bl);
        return window;
    }

    public static boolean B(Window window) {
        return xk_0.X(window);
    }

    public static Window s(Window window, float f10) {
        xk_0.f(window, f10);
        return window;
    }

    public static float A(Window window) {
        return xk_0.m(window);
    }

    public static Window v(Window window) {
        window.setLocationRelativeTo(null);
        return window;
    }

    public static Window u(Window window, Component component) {
        window.setLocationRelativeTo(component);
        return window;
    }

    public static Window H(Window window, int n10, int n11) {
        window.setSize(n10, n11);
        return SN.v(window);
    }

    public static Window Q(Window window, Component component, int n10, int n11) {
        window.setSize(n10, n11);
        return SN.u(window, component);
    }

    public static Window W(Window window, int n10) {
        window.setSize(n10, window.getPreferredSize().height);
        return window;
    }

    public static Window G(Window window, int n10) {
        window.setSize(window.getPreferredSize().width, n10);
        return window;
    }

    public static Window D(Window window) {
        return SN.g(window, GO.k);
    }

    public static Window g(Window window, boolean n10) {
        block12: {
            Window window2;
            Rectangle rectangle;
            block9: {
                block10: {
                    int n11;
                    Rectangle rectangle2;
                    String string;
                    block11: {
                        boolean bl;
                        block6: {
                            block7: {
                                Object v2;
                                block8: {
                                    string = FV.D();
                                    Window window3 = window;
                                    if (string == null) {
                                        if (window3 == null) {
                                            return window;
                                        }
                                        window3 = window;
                                    }
                                    rectangle2 = window3.getBounds();
                                    Dimension dimension = window.getPreferredSize();
                                    rectangle = new Rectangle(rectangle2.x + rectangle2.width / 2 - dimension.width / 2, rectangle2.y + rectangle2.height / 2 - dimension.height / 2, dimension.width, dimension.height);
                                    bl = B.containsKey(window);
                                    if (string != null) break block6;
                                    if (!bl) break block7;
                                    v2 = B.get(window);
                                    if (string != null) break block8;
                                    if (v2 == null) break block7;
                                    v2 = B.get(window);
                                }
                                bl = ((WC)v2).i();
                                if (string != null) break block6;
                                if (bl) {
                                    ((WC)B.get(window)).Y();
                                }
                            }
                            window2 = window;
                            if (string != null) break block9;
                            bl = window2.isShowing();
                        }
                        if (!bl) break block10;
                        n11 = n10;
                        if (string != null) break block11;
                        if (n11 == 0) break block10;
                        n11 = SN.a(25747, 4417444005174228341L);
                    }
                    int n12 = n11;
                    int n13 = SN.a(16686, 6076574958914998473L);
                    int n14 = rectangle.width - rectangle2.width;
                    int n15 = rectangle.height - rectangle2.height;
                    WC wC = new WC(c, (ActionListener)new XV(rectangle2, n14, n15, window));
                    B.put(window, wC);
                    wC.u();
                    if (string == null) break block12;
                }
                window2 = window;
            }
            window2.setBounds(rectangle);
        }
        return window;
    }

    static Map E() {
        return B;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1730924163562001570L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0000\u00aa\u00b9\u00b0\u0019\u00d6a\u00b3\u00d2\u00c7}\u00c9\u00fbiDa";
        int n11 = "\u0000\u00aa\u00b9\u00b0\u0019\u00d6a\u00b3\u00d2\u00c7}\u00c9\u00fbiDa".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        long l3 = 8637915413195273466L;
        c = 0x77E00A4D7B6034F0L ^ l3;
        B = new HashMap();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x51E6;
        if (b[n11] == null) {
            SN.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

