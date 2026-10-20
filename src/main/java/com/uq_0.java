/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OZ;
import com.bi_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.uq
 */
class uq_0
implements ActionListener {
    final OZ N;
    private static final long[] a;
    private static final Long[] b;

    uq_0(OZ oZ) {
        this.N = oZ;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        OZ oZ;
        block7: {
            block6: {
                boolean bl;
                String[] stringArray;
                block4: {
                    block5: {
                        stringArray = bi_0.Y();
                        bl = this.N.j.equals((Object)bi_0.stopwatch);
                        if (stringArray != null) break block4;
                        if (!bl) break block5;
                        this.N.k += uq_0.a(16406, 8879035748290835358L);
                        if (stringArray == null) break block6;
                    }
                    oZ = this.N;
                    if (stringArray != null) break block7;
                    bl = oZ.j.equals((Object)bi_0.timer);
                }
                if (!bl) break block6;
                this.N.k -= uq_0.a(18246, 2710468243110671567L);
                oZ = this.N;
                if (stringArray != null) break block7;
                if (oZ.k <= uq_0.a(24148, 3164689764988071391L)) {
                    this.N.k = 0L;
                    this.N.B();
                    this.N.M.Y();
                }
            }
            oZ = this.N;
        }
        oZ.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2999752775283029725L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\f<\u00c7\u00c0\u00dd*\u0002vR\u0099\u00e8\u00b94b\u0005'\u0002J\u007f\u00d3\u008a\u00d1\u0018\u00ea";
        int n11 = "\f<\u00c7\u00c0\u00dd*\u0002vR\u0099\u00e8\u00b94b\u0005'\u0002J\u007f\u00d3\u008a\u00d1\u0018\u00ea".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[3];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x7389) & Short.MAX_VALUE;
        if (b[n11] == null) {
            uq_0.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

