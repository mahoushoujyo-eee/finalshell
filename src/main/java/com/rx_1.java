/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.rt_2;
import com.uE;
import java.awt.Component;
import javax.swing.JTable;

/*
 * Renamed from com.rX
 */
public class rx_1
extends rt_2 {
    private static final long[] b;
    private static final Integer[] c;

    public rx_1() {
        super(rx_1.n());
        this.N(1);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n10, int n11) {
        Component component = super.getTableCellEditorComponent(jTable, object, bl, n10, n11);
        component.setBackground(jTable.getSelectionBackground());
        return component;
    }

    private static uE n() {
        uE uE2 = new uE();
        uE2.setHorizontalAlignment(0);
        uE2.w(false);
        uE2.setOpaque(true);
        uE2.setFocusable(false);
        uE2.e(0);
        uE2.G(rx_1.a(7253, 7623217649089190938L));
        uE2.u(rx_1.a(11779, 8707579546186919501L));
        return uE2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2039888367663307873L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "V\u00f6\u0086\u0083Sv\u00c0w2V\u00cb\u0015\u00c7\u00e8r ";
        int n11 = "V\u00f6\u0086\u0083Sv\u00c0w2V\u00cb\u0015\u00c7\u00e8r ".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F;
        if (c[n11] == null) {
            rx_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

