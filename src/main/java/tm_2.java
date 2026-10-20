/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from tm
 */
class tm_2
implements AWTEventListener {
    final fx_2 j;
    private static final long[] a;
    private static final Integer[] b;

    tm_2(fx_2 fx_22) {
        this.j = fx_22;
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block5: {
            int n10;
            int n11;
            block7: {
                MouseEvent mouseEvent;
                block8: {
                    AWTEvent aWTEvent2;
                    String[] stringArray;
                    block6: {
                        boolean bl;
                        block4: {
                            stringArray = F8.y();
                            bl = aWTEvent.getSource() instanceof Component;
                            if (stringArray != null) break block4;
                            if (!bl) break block5;
                            aWTEvent2 = aWTEvent;
                            if (stringArray != null) break block6;
                            bl = aWTEvent2 instanceof MouseEvent;
                        }
                        if (!bl) break block5;
                        aWTEvent2 = aWTEvent;
                    }
                    mouseEvent = (MouseEvent)aWTEvent2;
                    n11 = mouseEvent.getID();
                    n10 = tm_2.a(14185, 8798113625267821162L);
                    if (stringArray != null) break block7;
                    if (n11 != n10) break block8;
                    Component component = (Component)aWTEvent.getSource();
                    this.j.Q = SwingUtilities.windowForComponent(component);
                    if (stringArray == null) break block5;
                }
                n11 = mouseEvent.getID();
                n10 = tm_2.a(31359, 7378345624567486333L);
            }
            if (n11 == n10) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8139645710591987934L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u001b\u0096\u0001\u00ac79\u0006VRu/\u0018\u00a6\u00c2\u00cbL";
        int n11 = "\u001b\u0096\u0001\u00ac79\u0006VRu/\u0018\u00a6\u00c2\u00cbL".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6D02;
        if (b[n11] == null) {
            tm_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

