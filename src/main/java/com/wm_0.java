/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.us_0;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

/*
 * Renamed from com.Wm
 */
public class wm_0
implements ImageObserver {
    protected us_0 R;
    protected cb_1 y;
    private static final long[] a;
    private static final Integer[] b;

    public wm_0(us_0 us_02, cb_1 cb_12) {
        this.R = us_02;
        this.y = cb_12;
    }

    @Override
    public boolean imageUpdate(Image image, int n10, int n11, int n12, int n13, int n14) {
        int n15;
        String[] stringArray;
        block5: {
            block6: {
                Rectangle rectangle;
                stringArray = cb_1.C();
                n15 = this.y.d();
                if (stringArray == null) break block5;
                if (n15 == 0) break block6;
                n15 = n10 & wm_0.a(30803, 1327652151480148290L);
                if (stringArray == null) break block5;
                if (n15 != 0 && (rectangle = this.R.getPathBounds(this.y.i())) != null) {
                    this.R.repaint(rectangle);
                }
            }
            n15 = n10 & wm_0.a(15666, 8141263130548577314L);
        }
        if (stringArray != null) {
            n15 = n15 == 0 ? 1 : 0;
        }
        return n15 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4413664565819561537L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\"\u00ba/?A&\u00b73\u0004=G\u0087l2r\u00c3";
        int n11 = "\"\u00ba/?A&\u00b73\u0004=G\u0087l2r\u00c3".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1911;
        if (b[n11] == null) {
            wm_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

