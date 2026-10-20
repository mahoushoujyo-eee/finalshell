/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class F8
extends JPanel {
    kj_0 R;
    kj_0 p;
    aM H;
    t3_0 K;
    _y_0 q;
    protected String c;
    private static String[] f;
    private static final long[] cb;
    private static final Integer[] db;

    public F8() {
        this.setPreferredSize(new Dimension(F8.a(10735, 7292822211235108152L), F8.a(18069, 523133079799642691L)));
    }

    public void q() {
        try {
            this.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void C(KV kV) {
    }

    public void S() {
    }

    public kj_0 i() {
        return (kj_0)this.R;
    }

    private void b(kj_0 kj_02) {
        this.R = kj_02;
    }

    public kj_0 Y() {
        return (kj_0)this.p;
    }

    public void K(kj_0 kj_02) {
        Object object;
        this.p = kj_02;
        try {
            object = kj_02.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.b(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public aM h() {
        return (aM)this.H;
    }

    public void C(aM aM2) {
        this.H = aM2;
    }

    public t3_0 X() {
        return (t3_0)this.K;
    }

    public void U(t3_0 t3_02) {
        this.K = t3_02;
    }

    public void o() {
    }

    public _y_0 t() {
        return (_y_0)this.q;
    }

    public void E(_y_0 _y_02) {
        this.q = _y_02;
    }

    public String T() {
        return (String)this.c;
    }

    public void h(String string) {
        this.c = string;
    }

    public void h() {
        this.R = null;
        this.p = null;
        this.H = null;
        this.K = null;
        this.q = null;
        this.c = null;
    }

    public void K() {
        try {
            yt_1.F.W((Object)new bj_0(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void D(String[] stringArray) {
        f = stringArray;
    }

    public static String[] y() {
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1922241311274734944L;
        long[] lArray = new long[2];
        F8.D(null);
        int n10 = 0;
        String string = "V\u009c5 l\u00aa\b3\u00b3i\u00c8\u00bc\u00bd\u00a3\u00e7H";
        int n11 = "V\u009c5 l\u00aa\b3\u00b3i\u00c8\u00bc\u00bd\u00a3\u00e7H".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        cb = lArray;
        db = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CD6;
        if (db[n11] == null) {
            F8.db[n11] = (int)(cb[n11] ^ l2);
        }
        return db[n11];
    }
}

