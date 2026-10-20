/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/*
 * Renamed from nd
 */
public class nd_0
extends JTable {
    df_0 n;
    nd_0 L;
    br_0 Q;
    private static final long[] a;
    private static final Integer[] b;

    nd_0(br_0 br_02, df_0 df_02) {
        this.n = df_02;
        this.Q = br_02;
        this.L = this;
        try {
            this.p(df_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setOpaque(false);
        int n10 = nd_0.a(8677, 1894970607044380565L);
        this.setGridColor(new Color(n10, n10, n10));
        this.setBorder(null);
        this.setSelectionMode(0);
        this.setRowSorter(null);
        this.getColumnModel().getColumn(0).setMinWidth(nd_0.a(15844, 5870797141390252950L));
        n3 n32 = new n3(0);
        nR nR2 = new nR();
        this.getColumnModel().getColumn(0).setCellRenderer(nR2);
        this.setRowHeight(nd_0.a(27449, 5285897594889932106L));
        ((nd_0)this.L).getTableHeader().setVisible(false);
        ((nd_0)this.L).setTableHeader(null);
        this.addMouseListener(new UB(this));
    }

    void p() {
        BS bS;
        Object object;
        int n10 = this.getSelectedRow();
        int n11 = this.convertRowIndexToModel(n10);
        try {
            object = this.C();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            bS = (BS)object.a(n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        BS bS2 = bS;
        FB fB2 = new FB((br_0)this.Q, bS2, true);
    }

    public void y(List list) {
        try {
            this.n.U(list);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public df_0 C() {
        return (df_0)this.n;
    }

    public void p(df_0 df_02) {
        super.setModel(df_02);
        this.n = df_02;
    }

    @Override
    public TableModel getModel() {
        df_0 df_02;
        try {
            df_02 = (df_0)this.C();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return df_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2357818293460717944L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = ">\u00ca\u00b4\u00b6\u00d2U\n\u00f0\u00a4 \u00e7\u0094\u00ac%\\&l\u0088\u00a4a\u00c6\u000b\u0016%";
        int n11 = ">\u00ca\u00b4\u00b6\u00d2U\n\u00f0\u00a4 \u00e7\u0094\u00ac%\\&l\u0088\u00a4a\u00c6\u000b\u0016%".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6672;
        if (b[n11] == null) {
            nd_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

