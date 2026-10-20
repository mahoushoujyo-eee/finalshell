/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

/*
 * Renamed from t6
 */
class t6_0
implements MouseListener {
    final String O;
    final JTextArea z;
    final Color c;
    final xw_0 Q;
    private static final long[] a;
    private static final Integer[] b;

    t6_0(xw_0 xw_02, String string, JTextArea jTextArea, Color color) {
        this.Q = xw_02;
        this.O = string;
        this.z = jTextArea;
        this.c = color;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 1) {
            try {
                this.Q.O(this.O, true, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        ((JTextArea)this.z).setForeground((Color)this.c);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        ((JTextArea)this.z).setForeground(new Color(t6_0.a(4857, 6734463482494783977L), t6_0.a(17112, 1464686875404157386L), t6_0.a(22260, 7380108076858004965L)));
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 661930374963496008L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00a4\u00e6\u0093D\u000bL\u0095\u00bfw\u0093\u00be\u0086\u0084\u00a1Qe\u00b3\u000b\u009f\u00ca\u00b2\u0019\u00c5\u00d2";
        int n11 = "\u00a4\u00e6\u0093D\u000bL\u0095\u00bfw\u0093\u00be\u0086\u0084\u00a1Qe\u00b3\u000b\u009f\u00ca\u00b2\u0019\u00c5\u00d2".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x310;
        if (b[n11] == null) {
            t6_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

