/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.na_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.Cb
 */
class cb_0
extends KeyAdapter {
    final na_2 L;
    private static final long[] a;
    private static final Integer[] b;

    cb_0(na_2 na_22) {
        this.L = na_22;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        boolean bl = na_2.v();
        int n10 = na_2.k(this.L).size();
        if (!bl) {
            if (n10 == 0) {
                this.L.Y();
            }
            n10 = na_2.k(this.L).add(keyEvent.getKeyCode()) ? 1 : 0;
        }
        this.L(keyEvent);
        this.L.h();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        na_2.k(this.L).remove((Object)keyEvent.getKeyCode());
        this.L.h();
    }

    private void L(KeyEvent keyEvent) {
        block5: {
            int n10;
            int n11;
            block6: {
                boolean bl;
                block4: {
                    boolean bl2 = na_2.e();
                    na_2.q(this.L, FN.m(keyEvent));
                    na_2.f(this.L, FN.O(keyEvent));
                    bl = bl2;
                    na_2.z(this.L, FN.y(keyEvent));
                    n11 = keyEvent.getKeyCode();
                    n10 = cb_0.a(3915, 1600315036027361801L);
                    if (!bl) break block4;
                    if (n11 == n10) break block5;
                    n11 = keyEvent.getKeyCode();
                    n10 = cb_0.a(6994, 8129119872493948433L);
                }
                if (!bl) break block6;
                if (n11 == n10) break block5;
                n11 = keyEvent.getKeyCode();
                n10 = cb_0.a(27951, 1475770252908591215L);
            }
            if (n11 != n10) {
                na_2.S(this.L, keyEvent.getKeyCode());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6967867559485116169L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00dd\u00e6H\u00c9&4\u0095\u0011\u00eb{\u00e4\u00c2\u0085\u0086\u0001\n9\u00185\u00b9\u001b\u00a0wv";
        int n11 = "\u00dd\u00e6H\u00c9&4\u0095\u0011\u00eb{\u00e4\u00c2\u0085\u0086\u0001\n9\u00185\u00b9\u001b\u00a0wv".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1542;
        if (b[n11] == null) {
            cb_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

