/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.pa_1;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.KeyStroke;

public class I_
implements KeyListener {
    boolean t;
    int Z;
    final pa_1 W;
    private static final long[] a;
    private static final Integer[] b;

    public I_(pa_1 pa_12) {
        this.W = pa_12;
        this.t = false;
        this.Z = I_.a(29189, 8162893525179881102L);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n10;
        int n11;
        int n12;
        block6: {
            block7: {
                int n13 = keyEvent.getKeyCode();
                n12 = _y_0.y();
                KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(keyEvent);
                n11 = n13;
                if (n12 != 0) break block6;
                if (n11 == I_.a(26846, 5300456774903974999L)) break block7;
                n11 = keyStroke.getModifiers() & I_.a(24728, 3534710944705954832L);
                if (n12 != 0) break block6;
                if (n11 != 0) {
                    this.t = true;
                }
            }
            this.W.ce = System.currentTimeMillis();
            this.W.cQ = true;
            this.W.cw = keyEvent.getKeyCode();
            n11 = this.W.Z(keyEvent) ? 1 : 0;
        }
        int n14 = n10 = n11;
        if (n12 == 0) {
            if (n14 == 0) {
                return;
            }
            n14 = pa_1.Z(this.W, keyEvent) ? 1 : 0;
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        pa_1.Y(this.W, keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(keyEvent);
        int n10 = _y_0.M();
        boolean bl = this.W.u();
        if (n10 != 0) {
            if (!bl) {
                return;
            }
            bl = this.W.i(keyEvent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1562565732610996436L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00e6\u0018\u00adZ\u00c9\u000f4\u0092\u008b\u00ee\u00cc\u00de$\u009b\u00bcD\u00c6\u00dc%_\u00cd\u00d7-\u00bd";
        int n11 = "\u00e6\u0018\u00adZ\u00c9\u000f4\u0092\u008b\u00ee\u00cc\u00de$\u009b\u00bcD\u00c6\u00dc%_\u00cd\u00d7-\u00bd".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2489;
        if (b[n11] == null) {
            I_.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

