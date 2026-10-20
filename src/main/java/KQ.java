/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Window;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class KQ
extends JDialog {
    private long R;
    private boolean B;
    private boolean A;
    U r;
    Window m;
    long g;
    nj_0 a;
    Dimension K;
    Point V;
    int i;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public KQ(Window window) {
        String string;
        this.B = false;
        this.A = false;
        this.setFocusableWindowState(false);
        this.setIconImage((Image)cy_1.r);
        try {
            string = (String)lk_0.B(b);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setTitle(string);
        this.a = new nj_0();
        this.setContentPane((nj_0)this.a);
        this.addComponentListener(new ym_1(this));
        this.addWindowFocusListener(new b0_0(this));
        try {
            this.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        if (bl) {
            SwingUtilities.invokeLater(new zS(this));
        }
    }

    public void c(ck_2 ck_22, DefaultMutableTreeNode defaultMutableTreeNode) {
        block41: {
            JDialog jDialog;
            File file;
            JFrame jFrame;
            lv_2 lv_22;
            block43: {
                JFrame jFrame2;
                String[] stringArray;
                block42: {
                    int n10;
                    int n11;
                    JFrame jFrame3;
                    block37: {
                        block38: {
                            JDialog jDialog2;
                            File file2;
                            block40: {
                                JFrame jFrame4;
                                block39: {
                                    JFrame jFrame5;
                                    Object object;
                                    Object object2;
                                    Object object3;
                                    lv_2 lv_23;
                                    File file3;
                                    Object object4;
                                    Object object5;
                                    try {
                                        object5 = yt_1.i();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object4 = object5.g();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        file3 = (File)ck_22.i();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        lv_23 = (lv_2)object4.q(file3.getAbsolutePath());
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    lv_22 = lv_23;
                                    stringArray = F8.y();
                                    try {
                                        object3 = yt_1.i();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object2 = object3.v();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        object = lv_22.g();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    try {
                                        jFrame5 = (JFrame)object2.c(object);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    jFrame3 = jFrame5;
                                    try {
                                        n11 = (Integer)ck_22.I();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n10 = lv_2.C;
                                    if (stringArray != null) break block37;
                                    if (n11 != n10) break block38;
                                    jFrame4 = jFrame3;
                                    if (stringArray != null) break block39;
                                    if (jFrame4 == null) break block40;
                                    jFrame4 = jFrame3;
                                }
                                jFrame = (km_2)jFrame4;
                                try {
                                    jFrame.setVisible(true);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (stringArray == null) break block41;
                            }
                            try {
                                file2 = (File)ck_22.i();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string = file2.getParent();
                            try {
                                this.S();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                jDialog2 = (JDialog)U.T();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            jFrame = new km_2(string, this, jDialog2, lv_22, defaultMutableTreeNode);
                            if (stringArray == null) break block41;
                        }
                        try {
                            n11 = (Integer)ck_22.I();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = lv_2.F;
                    }
                    if (n11 != n10) break block41;
                    jFrame2 = jFrame3;
                    if (stringArray != null) break block42;
                    if (jFrame2 == null) break block43;
                    jFrame2 = jFrame3;
                }
                jFrame = (kb_0)jFrame2;
                try {
                    jFrame.setVisible(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray == null) break block41;
            }
            try {
                file = (File)ck_22.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string = file.getParent();
            try {
                this.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                jDialog = (JDialog)U.T();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            jFrame = new kb_0(string, this, jDialog, lv_22, defaultMutableTreeNode);
        }
    }

    public boolean U(JComponent jComponent) {
        Point point = jComponent.getLocationOnScreen();
        Point point2 = new Point(point);
        point2.x = point.x - KQ.a(3636, 792709501032229249L);
        point2.y = point.y + jComponent.getHeight() + 3;
        boolean bl = this.getLocationOnScreen().equals(point2);
        return bl;
    }

    public boolean O() {
        String[] stringArray = F8.y();
        boolean bl = this.getLocationOnScreen().equals((Point)this.V);
        if (stringArray == null) {
            bl = !bl;
        }
        return bl;
    }

    public void s(JComponent jComponent) {
        Point point = jComponent.getLocationOnScreen();
        Point point2 = new Point(point);
        point2.x = point.x - KQ.a(5354, 7574992466992395101L);
        point2.y = point.y + jComponent.getHeight() + 3;
        this.setLocation(point2);
        try {
            this.a.r(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setContentPane((nj_0)this.a);
        try {
            this.setVisible(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.V = this.getLocationOnScreen();
        try {
            lk_0.V(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void G() {
        int n10;
        int n11;
        block15: {
            int n12;
            block14: {
                int n13;
                block13: {
                    int n14;
                    String[] stringArray;
                    block12: {
                        int n15;
                        int n16;
                        block11: {
                            n16 = KQ.a(13367, 3601017576235750278L);
                            stringArray = F8.y();
                            int n17 = KQ.a(27896, 6877644600401201992L);
                            n14 = n11 = this.getPreferredSize().height;
                            n15 = n17;
                            if (stringArray != null) break block11;
                            if (n14 > n15) {
                                n11 = n17;
                            }
                            n14 = n11;
                            if (stringArray != null) break block12;
                            n15 = n16;
                        }
                        if (n14 < n15) {
                            n11 = n16;
                        }
                        n14 = KQ.a(23281, 4985566960271048005L);
                    }
                    int n18 = n14;
                    n12 = n10 = this.getPreferredSize().width + KQ.a(8706, 4893108247915644340L);
                    n13 = n18;
                    if (stringArray == null) {
                        if (n12 < n13) {
                            n10 = n18;
                        }
                        n12 = n10;
                        n13 = this.i;
                    }
                    if (stringArray != null) break block13;
                    if (n12 > n13) {
                        this.i = n10;
                    }
                    n12 = n10;
                    if (stringArray != null) break block14;
                    n13 = this.i;
                }
                if (n12 >= n13) break block15;
                n12 = this.i;
            }
            n10 = n12;
        }
        this.setSize(new Dimension(n10, n11));
        this.K = this.getSize();
    }

    public long w() {
        return this.R;
    }

    public void B(long l2) {
        this.R = l2;
    }

    public boolean k() {
        return this.B;
    }

    public void s(boolean bl) {
        this.B = bl;
    }

    public boolean y() {
        return this.A;
    }

    public void r(boolean bl) {
        this.A = bl;
    }

    public U S() {
        return (U)this.r;
    }

    public void Y(U u10) {
        this.r = u10;
        this.m = u10;
    }

    public Window Z() {
        return (Window)this.m;
    }

    public void O(Window window) {
        this.m = window;
    }

    public long r() {
        return this.g;
    }

    public void g(long l2) {
        this.g = l2;
    }

    public nj_0 i() {
        return (nj_0)this.a;
    }

    static boolean F(KQ kQ) {
        return kQ.B;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "=Ot\u001a\u0012?j\u0013Wi\u0004\u0005UF3tv\t\u0003Xz8nI+,;j\u0007a\u0019\u0017jdY/ \u000ey\u0005nn%s{=9U".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 2;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 104;
                                break;
                            }
                            case 1: {
                                v9 = 27;
                                break;
                            }
                            case 2: {
                                v9 = 35;
                                break;
                            }
                            case 3: {
                                v9 = 76;
                                break;
                            }
                            case 4: {
                                v9 = 67;
                                break;
                            }
                            case 5: {
                                v9 = 15;
                                break;
                            }
                            default: {
                                v9 = 42;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                KQ.b = new String(v10).intern();
                var0_1 = 4390531491311959915L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "x\u0010\n\\L1\u0083\u00da\u00ca;O\u00c6A\u00ca\u00d6\u00e0\u00bc\u00961\u0097\u00ce[z\u00f7j\u00f7\u0081\u00c3\u00d9\u0087\u00cc=";
                var5_5 = "x\u0010\n\\L1\u0083\u00da\u00ca;O\u00c6A\u00ca\u00d6\u00e0\u00bc\u00961\u0097\u00ce[z\u00f7j\u00f7\u0081\u00c3\u00d9\u0087\u00cc=".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "V%\u00fck8\u009c\u00b6\u00a9u\u00d7R\u007f\u000f\u00a8\u00ec%";
                    var5_5 = "V%\u00fck8\u009c\u00b6\u00a9u\u00d7R\u007f\u000f\u00a8\u00ec%".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        KQ.c = var6_2;
        KQ.d = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x67B4;
        if (d[n11] == null) {
            KQ.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

