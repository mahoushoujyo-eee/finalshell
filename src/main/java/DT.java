/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

public class DT
extends JTable {
    fr_2 a;
    DT I;
    jx_0 l;
    private static final long[] b;
    private static final Integer[] c;

    DT(jx_0 jx_02, fr_2 fr_22) {
        this.I = this;
        this.l = jx_02;
        this.a = fr_22;
        this.setModel(fr_22);
        this.setOpaque(false);
        this.setSelectionBackground((Color)fx_2.E);
        this.getTableHeader().setVisible(false);
        this.setTableHeader(null);
        ql_0 ql_02 = new ql_0();
        this.setDefaultRenderer(Object.class, ql_02);
        this.setRowHeight(DT.a(28146, 69380773180708842L));
        this.setShowGrid(true);
        int n10 = DT.a(24585, 6455712407774927376L);
        this.setGridColor(new Color(n10, n10, n10));
        this.addMouseListener(new m9(this, jx_02, fr_22));
    }

    public YI m(int n10) {
        YI yI;
        try {
            yI = (YI)this.a.b(this.convertRowIndexToModel(n10));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return yI;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4616535941730501940L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u008b_\u0019\u00a6\u00d0\u0006\u0012\u00ba\u00e1d\u00d5@\u00e6*\u001f\u00ec";
        int n11 = "\u008b_\u0019\u00a6\u00d0\u0006\u0012\u00ba\u00e1d\u00d5@\u00e6*\u001f\u00ec".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7A18;
        if (c[n11] == null) {
            DT.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

