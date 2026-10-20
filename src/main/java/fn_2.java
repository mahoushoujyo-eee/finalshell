/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import javax.swing.SwingUtilities;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

/*
 * Renamed from fn
 */
class fn_2
implements Runnable {
    final Component S;
    final RSyntaxTextArea U;
    final mY p;
    private static final long[] a;
    private static final Integer[] b;

    fn_2(mY mY2, Component component, RSyntaxTextArea rSyntaxTextArea) {
        this.p = mY2;
        this.S = component;
        this.U = rSyntaxTextArea;
    }

    @Override
    public void run() {
        ((mY)this.p).setSize(fn_2.a(4257, 3190588006658207218L), fn_2.a(11646, 9016145284451323948L));
        ((mY)this.p).setLocationRelativeTo(SwingUtilities.getWindowAncestor((Component)this.S));
        ((RSyntaxTextArea)this.U).setCaretPosition(0);
        ((mY)this.p).setVisible(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 537708178508238922L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00f1\u00aa| u\u00b5\u00bcLf\u00ca+/\u0097\u00c6\u0081\u00f6";
        int n11 = "\u00f1\u00aa| u\u00b5\u00bcLf\u00ca+/\u0097\u00c6\u0081\u00f6".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7D53;
        if (b[n11] == null) {
            fn_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

