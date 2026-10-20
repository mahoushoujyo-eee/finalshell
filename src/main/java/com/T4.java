/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

public abstract class T4
implements LayoutManager2 {
    private static int c;
    private static final long[] g;
    private static final Integer[] k;

    @Override
    public void addLayoutComponent(Component component, Object object) {
        this.A(component, object);
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
        this.A(component, string);
    }

    @Override
    public void removeLayoutComponent(Component component) {
        this.F(component);
    }

    public void A(Component component, Object object) {
    }

    public void F(Component component) {
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return this.preferredLayoutSize(container);
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        return new Dimension(T4.a(23296, 5614625828517698134L), T4.a(14998, 7986499160904711105L));
    }

    @Override
    public float getLayoutAlignmentX(Container container) {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentY(Container container) {
        return 0.5f;
    }

    @Override
    public void invalidateLayout(Container container) {
    }

    public static void l(int n10) {
        c = n10;
    }

    public static int b() {
        return c;
    }

    public static int O() {
        int n10 = T4.b();
        if (n10 == 0) {
            return 51;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2303545438569127437L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0088\u00a2\u009dF\u00dd\u009a{\u00a4\u00e77b\u00c1v\u00b3\u009a3";
        int n11 = "\u0088\u00a2\u009dF\u00dd\u009a{\u00a4\u00e77b\u00c1v\u00b3\u009a3".length();
        T4.l(103);
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        g = lArray;
        k = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x156;
        if (k[n11] == null) {
            T4.k[n11] = (int)(g[n11] ^ l2);
        }
        return k[n11];
    }
}

