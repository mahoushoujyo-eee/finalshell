/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class g8
extends KeyAdapter {
    final zd_0 S;
    private static final long[] a;
    private static final Integer[] b;

    g8(zd_0 zd_02) {
        this.S = zd_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        block4: {
            block3: {
                int n10;
                char c2;
                block2: {
                    char c3 = keyEvent.getKeyChar();
                    int n11 = z7.m();
                    c2 = c3;
                    n10 = g8.a(8267, 418025865002658834L);
                    if (n11 == 0) break block2;
                    if (c2 < n10) break block3;
                    c2 = c3;
                    n10 = g8.a(31543, 4329221139751040879L);
                }
                if (c2 <= n10) break block4;
            }
            keyEvent.consume();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3680737047138682782L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00adh\u00ca'\u00b2\u00aa\u00b0\u00c8@\u001a\u0088E\u00f8:\u00eb\u00bc";
        int n11 = "\u00adh\u00ca'\u00b2\u00aa\u00b0\u00c8@\u001a\u0088E\u00f8:\u00eb\u00bc".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xC58;
        if (b[n11] == null) {
            g8.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

