/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;

/*
 * Renamed from Vn
 */
public class vn_0
extends JTable {
    int K;
    int q;
    CL I;
    private static String r;
    private static final long[] a;
    private static final Integer[] b;

    vn_0(CL cL) {
        this.K = -1;
        this.q = -1;
        this.I = cL;
        this.setOpaque(false);
        this.setSelectionBackground((Color)fx_2.E);
        this.getTableHeader().setVisible(false);
        this.setTableHeader(null);
        aS aS2 = new aS();
        this.setDefaultRenderer(Object.class, aS2);
        this.setShowGrid(false);
        this.setGridColor(new Color(vn_0.a(2765, 8526025809660217061L), vn_0.a(19248, 8220591915562714906L), vn_0.a(19248, 8220591915562714906L)));
        this.setRowHeight(vn_0.a(3430, 3791341709877084495L));
        this.addMouseMotionListener(new db_0(this));
        this.addMouseListener(new d9_0(this));
    }

    public void H() {
        try {
            lk_0.C(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void e(File file, U u10) {
        lv_2 lv_22;
        Object object;
        Object object2;
        int n10;
        Object object3;
        aM aM2;
        try {
            aM2 = (aM)u10.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        aM aM3 = aM2;
        String string = vn_0.C();
        try {
            object3 = this.I.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)object3.C();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lv_22 = (lv_2)object.q(file.getPath());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        lv_2 lv_23 = lv_22;
        if (string == null) {
            int n12;
            try {
                n12 = (Integer)lv_23.I();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (n12 == lv_2.C) {
                Object object4;
                try {
                    object4 = this.I.X();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    aM3.a(object4);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                u10.w((Object)file, true, n11);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void q() {
        Point point = this.getMousePosition();
        String string = vn_0.C();
        if (point != null) {
            int n10 = this.rowAtPoint(point);
            int n11 = this.convertRowIndexToModel(n10);
            if (string == null) {
                if (n11 != this.K) {
                    this.q = n11;
                    this.repaint();
                }
                this.K = n11;
            }
            try {
                yt_1.F.W((Object)new x2(this), vn_0.a(7652, 3611851308453532111L));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public int v() {
        return this.q;
    }

    public void T(int n10) {
        this.q = n10;
    }

    public static void X(String string) {
        r = string;
    }

    public static String C() {
        return r;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2228943107703638312L;
                var6_1 = new long[4];
                vn_0.X(null);
                var3_2 = 0;
                var4_3 = "\u00f6\u00a3\u001eD\u00f0c\u0088~_\u00b4N\u00b3}\u00a7\u000f2";
                var5_4 = "\u00f6\u00a3\u001eD\u00f0c\u0088~_\u00b4N\u00b3}\u00a7\u000f2".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "3\u00a8\u00cc\u00c6\u0082\u00dc\u0018/\u00ba\u0095@e\u0085\u00abN\u00cd";
                    var5_4 = "3\u00a8\u00cc\u00c6\u0082\u00dc\u0018/\u00ba\u0095@e\u0085\u00abN\u00cd".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl39:
                // 1 sources

                ** continue;
            }
        }
        vn_0.a = var6_1;
        vn_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xC29;
        if (b[n11] == null) {
            vn_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

