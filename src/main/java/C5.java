/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Window;
import javax.swing.JDialog;

public class C5
extends JDialog {
    long F;
    ka_0 p;
    private static final long[] a;
    private static final Integer[] b;

    public C5(Window window) {
        super(window);
        ky_2[] ky_2Array = ka_0.N();
        this.p = new ka_0(this);
        this.setUndecorated(true);
        this.setContentPane((ka_0)this.p);
        this.addWindowFocusListener(new ly_0(this));
        ky_2[] ky_2Array2 = ky_2Array;
        this.setSize(C5.a(12049, 4413152635144420310L), C5.a(30713, 5238199958991463231L));
        if (ky_2.F() != null) {
            ka_0.U(new ky_2[4]);
        }
    }

    public long H() {
        return this.F;
    }

    public void z(long l2) {
        this.F = l2;
    }

    public ka_0 A() {
        return (ka_0)this.p;
    }

    public void T(ka_0 ka_02) {
        this.p = ka_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4838215078567540871L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00ceS)\u00b5\u00ea\u00d2\u001a\u00f8+A]gu\u00a8B\u000f";
        int n11 = "\u00ceS)\u00b5\u00ea\u00d2\u001a\u00f8+A]gu\u00a8B\u000f".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x14C6;
        if (b[n11] == null) {
            C5.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

