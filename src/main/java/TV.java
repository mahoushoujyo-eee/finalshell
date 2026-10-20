/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

class TV
implements WindowStateListener {
    final U l;
    private static final long[] a;
    private static final Integer[] b;

    TV(U u10) {
        this.l = u10;
    }

    @Override
    public void windowStateChanged(WindowEvent windowEvent) {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    int n10 = ((U)this.l).getExtendedState();
                    stringArray = F8.y();
                    if (stringArray != null) break block2;
                    if (n10 != TV.a(12628, 6223775070963769478L) && n10 != TV.a(30406, 2574914611774318357L)) break block3;
                    this.l.X = System.currentTimeMillis();
                    this.l.T = true;
                }
                if (stringArray == null) break block4;
            }
            this.l.T = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7260490875415661886L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00e4\u0011\u00ce\u0097\u00ad\u00d8\u00ea,x\u009cw\u007f~\u00a7\u00ad\u00be";
        int n11 = "\u00e4\u0011\u00ce\u0097\u00ad\u00d8\u00ea,x\u009cw\u007f~\u00a7\u00ad\u00be".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x11D3;
        if (b[n11] == null) {
            TV.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

