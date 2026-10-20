/*
 * Decompiled with CFR 0.152.
 */
import com.KD;
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Window;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class YB
extends JDialog {
    xl_0 q;
    public static int O;
    public static int v;
    int N;
    public static int M;
    public static int l;
    public static int j;
    public static int g;
    int C;
    String t;
    km_0 A;
    kl_2 H;
    ArrayList S;
    String k;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static void main(String[] stringArray) {
        YB yB = new YB(YB.l, null, "", new t__0(), false);
        yB.setTitle("选择编辑器");
        try {
            yB.s((Object)"C:\\", true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        yB.setSize(YB.a(19435, 531607233426334616L), YB.a(18587, 2600783524684505316L));
        yB.setLocationRelativeTo(null);
        yB.setVisible(true);
    }

    public YB(int n10, Window window, String string, boolean bl) {
        this(n10, window, string, null, bl);
    }

    public YB(int n10, Window window, String string, zv_0 zv_02, boolean bl) {
        JButton jButton;
        JPanel jPanel;
        boolean bl2;
        block30: {
            int n11;
            int n12;
            block31: {
                block32: {
                    Object object;
                    block28: {
                        block29: {
                            Object object2;
                            super(window, string);
                            this.N = YB.v;
                            boolean bl3 = F6.g();
                            this.C = YB.M;
                            bl2 = bl3;
                            this.S = new ArrayList();
                            this.setModal(true);
                            this.C = n10;
                            jPanel = (JPanel)this.getContentPane();
                            jPanel.setLayout(new MigLayout("insets 0 0 0 0", "", "[]0[]"));
                            this.q = new xl_0(n10, zv_02, true);
                            try {
                                n12 = ((Boolean)vk_0.g()).booleanValue();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl2) {
                                Object object3;
                                Object object4;
                                if (n12 != 0) {
                                    try {
                                        this.q.G(true);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                                try {
                                    this.q.X(n10);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object4 = this.q.V();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                this.A = object4;
                                try {
                                    object3 = this.q.T();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                this.H = object3;
                                n12 = n10;
                            }
                            n11 = YB.M;
                            if (bl2) break block28;
                            if (n12 != n11) break block29;
                            try {
                                object2 = this.q.V();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            this.A = object2;
                            ((km_0)this.A).setSelectionMode(0);
                            if (!bl2) break block30;
                        }
                        n12 = n10;
                        n11 = YB.l;
                    }
                    if (bl2) break block31;
                    if (n12 != n11) break block32;
                    try {
                        object = this.q.V();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.A = object;
                    ((km_0)this.A).setSelectionMode(0);
                    if (!bl2) break block30;
                }
                n12 = n10;
                n11 = YB.j;
            }
            if (n12 == n11) {
                Object object;
                try {
                    object = this.q.V();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.A = object;
                ((km_0)this.A).setSelectionMode(0);
            }
        }
        try {
            this.H.C(zv_02);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new MigLayout("insets 0 0 0 0"));
        jPanel.add((Component)jPanel2, "wrap");
        jPanel2.add((xl_0)this.q);
        JPanel jPanel3 = new JPanel();
        jPanel.add((Component)jPanel3, "growx");
        jPanel3.setLayout(new MigLayout("alignx right,insets 5 0 5 20", "[]10[]", ""));
        if (bl) {
            jButton = new KD("推荐文本编辑器 Notepad++ 点击下载 ");
            ((KD)jButton).V(0, 0, 0, YB.a(30781, 3209545710036389964L));
            ((KD)jButton).G(true);
            jButton.setForeground(new Color(YB.a(28408, 8804557846128526990L)));
            ((KD)jButton).t(new Color(YB.a(17784, 73431894817287428L)));
            JButton jButton2 = jButton;
            if (!bl2) {
                boolean bl4;
                jButton2.setCursor(new Cursor(YB.a(417, 3503167313153714655L)));
                try {
                    bl4 = (Boolean)vk_0.s();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (bl4) {
                    jPanel3.add(jButton);
                }
                jButton2 = jButton;
            }
            jButton2.addActionListener(new QO(this));
        }
        jButton = new JButton("确定");
        jPanel3.add(jButton);
        jButton.addActionListener(new fu_1(this, n10));
        ((km_0)this.A).addMouseListener(new jt_0(this, n10));
        JButton jButton3 = new JButton("取消");
        jPanel3.add(jButton3);
        jButton3.addActionListener(new yr_1(this));
    }

    void j() {
        block32: {
            Object object;
            Object object2;
            u6_0 u6_02;
            Object object3;
            int n10;
            int n11;
            block31: {
                boolean bl;
                block28: {
                    Object object4;
                    tf_2 tf_22;
                    a3 a32;
                    n11 = 0;
                    try {
                        a32 = (a3)this.q.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    a3 a33 = a32;
                    a33.setDragEnabled(false);
                    boolean bl2 = F6.g();
                    try {
                        tf_22 = (tf_2)a33.f();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    tf_2 tf_23 = tf_22;
                    try {
                        object4 = tf_23.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.k = object4;
                    int[] nArray = ((km_0)this.A).getSelectedRows();
                    bl = bl2;
                    kl_2 kl_22 = (kl_2)((km_0)this.A).getModel();
                    for (int n12 : nArray) {
                        Class<?> clazz;
                        Serializable serializable;
                        block30: {
                            boolean bl3;
                            Class<?> clazz2;
                            block29: {
                                Class<?> clazz3;
                                int n13 = ((km_0)this.A).convertRowIndexToModel(n12);
                                try {
                                    clazz3 = kl_22.G(n13);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                clazz2 = clazz3;
                                ((ArrayList)this.S).add(clazz2);
                                n10 = clazz2.getClass().equals(tf_2.class) ? 1 : 0;
                                if (bl) break block28;
                                if (bl) break block29;
                                if (n10 != 0) {
                                    serializable = (tf_2)((Object)clazz2);
                                    if (!bl) continue;
                                }
                                clazz = clazz2.getClass();
                                if (bl) break block30;
                                bl3 = clazz.equals(ck_2.class);
                            }
                            if (!bl3) continue;
                            clazz = clazz2;
                        }
                        serializable = (ck_2)((Object)clazz);
                        if (!bl) continue;
                    }
                    n10 = ((ArrayList)this.S).size();
                }
                if (bl) break block31;
                if (n10 <= 0) break block32;
                n10 = 1;
            }
            n11 = n10;
            this.N = YB.O;
            this.setVisible(false);
            try {
                object3 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                u6_02 = (u6_0)object3.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            u6_0 u6_03 = u6_02;
            try {
                u6_03.c(this.k);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = u6_03.C();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2.f(this.k);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.S();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void s(String string, boolean bl, boolean bl2) {
        try {
            this.q.p((Object)string, bl, bl2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public int s() {
        return this.N;
    }

    public void D(int n10) {
        this.N = n10;
    }

    public String E() {
        return (String)this.t;
    }

    public ArrayList n() {
        return (ArrayList)this.S;
    }

    public void U(ArrayList arrayList) {
        this.S = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[12];
                        var11_1 = 0;
                        var10_2 = "O\rw\u00c8\u0017\u633e\u8372\u659b\u671d\u7f62\u8f4b\u5628M\u00d7\u0084,\u0007\u00df\u0090F\u008dm\u00fa\u702a\u5150\u4e18\u8f54\u00b0\u0003ft\u00dd\u001c\u008d\u0091\u00f3\u0091$\u0011\u00df\u0080O-\u00e0*\u0085\u000e\u00d0\u000f\u00ba\u00ad\u009d\u00bfCT2\u00e8`i}\u00e1\u0002\u78ac\u5b40\u0005\u008f\u00ed\u00975\u00e9\u000e\u008d5\u00e0E\u0005\u00c2\u00a2\u00d2\u00a9:\u00141V\u00f8\u0005\u0010n\u0080\u00a3\u009a\u000e\u0016\u00b2\u0093\u00b5k\u00dco\u0011\u0010B#>\u00b0\u0019\u0005\u90cc\u623e\u7fc1\u8fa7\u56f4";
                        var12_3 = "O\rw\u00c8\u0017\u633e\u8372\u659b\u671d\u7f62\u8f4b\u5628M\u00d7\u0084,\u0007\u00df\u0090F\u008dm\u00fa\u702a\u5150\u4e18\u8f54\u00b0\u0003ft\u00dd\u001c\u008d\u0091\u00f3\u0091$\u0011\u00df\u0080O-\u00e0*\u0085\u000e\u00d0\u000f\u00ba\u00ad\u009d\u00bfCT2\u00e8`i}\u00e1\u0002\u78ac\u5b40\u0005\u008f\u00ed\u00975\u00e9\u000e\u008d5\u00e0E\u0005\u00c2\u00a2\u00d2\u00a9:\u00141V\u00f8\u0005\u0010n\u0080\u00a3\u009a\u000e\u0016\u00b2\u0093\u00b5k\u00dco\u0011\u0010B#>\u00b0\u0019\u0005\u90cc\u623e\u7fc1\u8fa7\u56f4".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 126;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u53d4\u6de0\u0006T\u00ab+P\u009fw";
                            var12_3 = "\u53d4\u6de0\u0006T\u00ab+P\u009fw".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 120;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 94;
                                    break;
                                }
                                case 1: {
                                    v15 = 108;
                                    break;
                                }
                                case 2: {
                                    v15 = 28;
                                    break;
                                }
                                case 3: {
                                    v15 = 25;
                                    break;
                                }
                                case 4: {
                                    v15 = 66;
                                    break;
                                }
                                case 5: {
                                    v15 = 66;
                                    break;
                                }
                                default: {
                                    v15 = 33;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                YB.a = var13;
                YB.b = new String[12];
                var0_7 = 5991288027738860901L;
                var6_8 = new long[12];
                var3_9 = 0;
                var4_10 = "4_Lg\u00ca\u00a7\u0083\u00a5\u00a0\u00f3\f\u0096\u0098B\u00bd\f\u0096\u00859\u00bdJk\u00bc\u008f\u00b0\u009c=\u00e1\u00b6\u00f1\u0005\u0005\u008a6H\u00a8Qu\u00fd7\u00f4\u00bd+'\u00deE\u00d6}>\u001c\u00a9\u00b2\u0084\u000bLA\u007f\u000fh\u00d3\u00cd\u00a1\u00df\u00a3\u00ca\u00ff\u00ee\u0088\u00a3\u0083A^\u00bd\u0017K\u00f0\u0085\u00eb.\u008f";
                var5_11 = "4_Lg\u00ca\u00a7\u0083\u00a5\u00a0\u00f3\f\u0096\u0098B\u00bd\f\u0096\u00859\u00bdJk\u00bc\u008f\u00b0\u009c=\u00e1\u00b6\u00f1\u0005\u0005\u008a6H\u00a8Qu\u00fd7\u00f4\u00bd+'\u00deE\u00d6}>\u001c\u00a9\u00b2\u0084\u000bLA\u007f\u000fh\u00d3\u00cd\u00a1\u00df\u00a3\u00ca\u00ff\u00ee\u0088\u00a3\u0083A^\u00bd\u0017K\u00f0\u0085\u00eb.\u008f".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "5\u0098\u00c5.\u00de\u00ee\u00ccu\u0081\u00d3K\u00cf\u0089%\u0084\u00b6";
                    var5_11 = "5\u0098\u00c5.\u00de\u00ee\u00ccu\u0081\u00d3K\u00cf\u0089%\u0084\u00b6".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        YB.c = var6_8;
        YB.d = new Integer[12];
        YB.O = YB.a(14549, 7838248353575882913L);
        YB.v = YB.a(21060, 3147860374190635572L);
        YB.M = YB.a(14965, 5436345331258708482L);
        YB.l = YB.a(1353, 3378588255221673276L);
        YB.j = YB.a(16448, 8956493048883161149L);
        YB.g = YB.a(24312, 417383470626322058L);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x405C) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 92;
                    break;
                }
                case 1: {
                    n14 = 253;
                    break;
                }
                case 2: {
                    n14 = 174;
                    break;
                }
                case 3: {
                    n14 = 90;
                    break;
                }
                case 4: {
                    n14 = 193;
                    break;
                }
                case 5: {
                    n14 = 177;
                    break;
                }
                case 6: {
                    n14 = 124;
                    break;
                }
                case 7: {
                    n14 = 126;
                    break;
                }
                case 8: {
                    n14 = 101;
                    break;
                }
                case 9: {
                    n14 = 169;
                    break;
                }
                case 10: {
                    n14 = 202;
                    break;
                }
                case 11: {
                    n14 = 23;
                    break;
                }
                case 12: {
                    n14 = 15;
                    break;
                }
                case 13: {
                    n14 = 14;
                    break;
                }
                case 14: {
                    n14 = 222;
                    break;
                }
                case 15: {
                    n14 = 125;
                    break;
                }
                case 16: {
                    n14 = 145;
                    break;
                }
                case 17: {
                    n14 = 156;
                    break;
                }
                case 18: {
                    n14 = 39;
                    break;
                }
                case 19: {
                    n14 = 186;
                    break;
                }
                case 20: {
                    n14 = 32;
                    break;
                }
                case 21: {
                    n14 = 139;
                    break;
                }
                case 22: {
                    n14 = 129;
                    break;
                }
                case 23: {
                    n14 = 45;
                    break;
                }
                case 24: {
                    n14 = 239;
                    break;
                }
                case 25: {
                    n14 = 152;
                    break;
                }
                case 26: {
                    n14 = 51;
                    break;
                }
                case 27: {
                    n14 = 94;
                    break;
                }
                case 28: {
                    n14 = 235;
                    break;
                }
                case 29: {
                    n14 = 97;
                    break;
                }
                case 30: {
                    n14 = 144;
                    break;
                }
                case 31: {
                    n14 = 0;
                    break;
                }
                case 32: {
                    n14 = 199;
                    break;
                }
                case 33: {
                    n14 = 102;
                    break;
                }
                case 34: {
                    n14 = 89;
                    break;
                }
                case 35: {
                    n14 = 120;
                    break;
                }
                case 36: {
                    n14 = 146;
                    break;
                }
                case 37: {
                    n14 = 8;
                    break;
                }
                case 38: {
                    n14 = 137;
                    break;
                }
                case 39: {
                    n14 = 72;
                    break;
                }
                case 40: {
                    n14 = 150;
                    break;
                }
                case 41: {
                    n14 = 215;
                    break;
                }
                case 42: {
                    n14 = 133;
                    break;
                }
                case 43: {
                    n14 = 60;
                    break;
                }
                case 44: {
                    n14 = 40;
                    break;
                }
                case 45: {
                    n14 = 123;
                    break;
                }
                case 46: {
                    n14 = 24;
                    break;
                }
                case 47: {
                    n14 = 223;
                    break;
                }
                case 48: {
                    n14 = 31;
                    break;
                }
                case 49: {
                    n14 = 103;
                    break;
                }
                case 50: {
                    n14 = 48;
                    break;
                }
                case 51: {
                    n14 = 3;
                    break;
                }
                case 52: {
                    n14 = 140;
                    break;
                }
                case 53: {
                    n14 = 26;
                    break;
                }
                case 54: {
                    n14 = 241;
                    break;
                }
                case 55: {
                    n14 = 160;
                    break;
                }
                case 56: {
                    n14 = 75;
                    break;
                }
                case 57: {
                    n14 = 164;
                    break;
                }
                case 58: {
                    n14 = 159;
                    break;
                }
                case 59: {
                    n14 = 210;
                    break;
                }
                case 60: {
                    n14 = 36;
                    break;
                }
                case 61: {
                    n14 = 105;
                    break;
                }
                case 62: {
                    n14 = 219;
                    break;
                }
                case 63: {
                    n14 = 93;
                    break;
                }
                case 64: {
                    n14 = 62;
                    break;
                }
                case 65: {
                    n14 = 78;
                    break;
                }
                case 66: {
                    n14 = 136;
                    break;
                }
                case 67: {
                    n14 = 28;
                    break;
                }
                case 68: {
                    n14 = 176;
                    break;
                }
                case 69: {
                    n14 = 98;
                    break;
                }
                case 70: {
                    n14 = 190;
                    break;
                }
                case 71: {
                    n14 = 20;
                    break;
                }
                case 72: {
                    n14 = 214;
                    break;
                }
                case 73: {
                    n14 = 138;
                    break;
                }
                case 74: {
                    n14 = 74;
                    break;
                }
                case 75: {
                    n14 = 197;
                    break;
                }
                case 76: {
                    n14 = 57;
                    break;
                }
                case 77: {
                    n14 = 104;
                    break;
                }
                case 78: {
                    n14 = 17;
                    break;
                }
                case 79: {
                    n14 = 232;
                    break;
                }
                case 80: {
                    n14 = 59;
                    break;
                }
                case 81: {
                    n14 = 19;
                    break;
                }
                case 82: {
                    n14 = 191;
                    break;
                }
                case 83: {
                    n14 = 91;
                    break;
                }
                case 84: {
                    n14 = 38;
                    break;
                }
                case 85: {
                    n14 = 141;
                    break;
                }
                case 86: {
                    n14 = 100;
                    break;
                }
                case 87: {
                    n14 = 192;
                    break;
                }
                case 88: {
                    n14 = 244;
                    break;
                }
                case 89: {
                    n14 = 158;
                    break;
                }
                case 90: {
                    n14 = 116;
                    break;
                }
                case 91: {
                    n14 = 188;
                    break;
                }
                case 92: {
                    n14 = 187;
                    break;
                }
                case 93: {
                    n14 = 12;
                    break;
                }
                case 94: {
                    n14 = 37;
                    break;
                }
                case 95: {
                    n14 = 53;
                    break;
                }
                case 96: {
                    n14 = 35;
                    break;
                }
                case 97: {
                    n14 = 185;
                    break;
                }
                case 98: {
                    n14 = 49;
                    break;
                }
                case 99: {
                    n14 = 233;
                    break;
                }
                case 100: {
                    n14 = 95;
                    break;
                }
                case 101: {
                    n14 = 198;
                    break;
                }
                case 102: {
                    n14 = 70;
                    break;
                }
                case 103: {
                    n14 = 154;
                    break;
                }
                case 104: {
                    n14 = 21;
                    break;
                }
                case 105: {
                    n14 = 245;
                    break;
                }
                case 106: {
                    n14 = 196;
                    break;
                }
                case 107: {
                    n14 = 134;
                    break;
                }
                case 108: {
                    n14 = 227;
                    break;
                }
                case 109: {
                    n14 = 6;
                    break;
                }
                case 110: {
                    n14 = 76;
                    break;
                }
                case 111: {
                    n14 = 148;
                    break;
                }
                case 112: {
                    n14 = 4;
                    break;
                }
                case 113: {
                    n14 = 80;
                    break;
                }
                case 114: {
                    n14 = 47;
                    break;
                }
                case 115: {
                    n14 = 118;
                    break;
                }
                case 116: {
                    n14 = 200;
                    break;
                }
                case 117: {
                    n14 = 122;
                    break;
                }
                case 118: {
                    n14 = 181;
                    break;
                }
                case 119: {
                    n14 = 208;
                    break;
                }
                case 120: {
                    n14 = 142;
                    break;
                }
                case 121: {
                    n14 = 225;
                    break;
                }
                case 122: {
                    n14 = 201;
                    break;
                }
                case 123: {
                    n14 = 175;
                    break;
                }
                case 124: {
                    n14 = 113;
                    break;
                }
                case 125: {
                    n14 = 52;
                    break;
                }
                case 126: {
                    n14 = 178;
                    break;
                }
                case 127: {
                    n14 = 254;
                    break;
                }
                case 128: {
                    n14 = 171;
                    break;
                }
                case 129: {
                    n14 = 44;
                    break;
                }
                case 130: {
                    n14 = 69;
                    break;
                }
                case 131: {
                    n14 = 5;
                    break;
                }
                case 132: {
                    n14 = 168;
                    break;
                }
                case 133: {
                    n14 = 217;
                    break;
                }
                case 134: {
                    n14 = 30;
                    break;
                }
                case 135: {
                    n14 = 71;
                    break;
                }
                case 136: {
                    n14 = 131;
                    break;
                }
                case 137: {
                    n14 = 251;
                    break;
                }
                case 138: {
                    n14 = 250;
                    break;
                }
                case 139: {
                    n14 = 29;
                    break;
                }
                case 140: {
                    n14 = 153;
                    break;
                }
                case 141: {
                    n14 = 179;
                    break;
                }
                case 142: {
                    n14 = 85;
                    break;
                }
                case 143: {
                    n14 = 255;
                    break;
                }
                case 144: {
                    n14 = 79;
                    break;
                }
                case 145: {
                    n14 = 149;
                    break;
                }
                case 146: {
                    n14 = 166;
                    break;
                }
                case 147: {
                    n14 = 189;
                    break;
                }
                case 148: {
                    n14 = 13;
                    break;
                }
                case 149: {
                    n14 = 1;
                    break;
                }
                case 150: {
                    n14 = 228;
                    break;
                }
                case 151: {
                    n14 = 81;
                    break;
                }
                case 152: {
                    n14 = 220;
                    break;
                }
                case 153: {
                    n14 = 205;
                    break;
                }
                case 154: {
                    n14 = 106;
                    break;
                }
                case 155: {
                    n14 = 108;
                    break;
                }
                case 156: {
                    n14 = 55;
                    break;
                }
                case 157: {
                    n14 = 82;
                    break;
                }
                case 158: {
                    n14 = 87;
                    break;
                }
                case 159: {
                    n14 = 163;
                    break;
                }
                case 160: {
                    n14 = 161;
                    break;
                }
                case 161: {
                    n14 = 77;
                    break;
                }
                case 162: {
                    n14 = 143;
                    break;
                }
                case 163: {
                    n14 = 112;
                    break;
                }
                case 164: {
                    n14 = 218;
                    break;
                }
                case 165: {
                    n14 = 107;
                    break;
                }
                case 166: {
                    n14 = 184;
                    break;
                }
                case 167: {
                    n14 = 27;
                    break;
                }
                case 168: {
                    n14 = 64;
                    break;
                }
                case 169: {
                    n14 = 242;
                    break;
                }
                case 170: {
                    n14 = 54;
                    break;
                }
                case 171: {
                    n14 = 58;
                    break;
                }
                case 172: {
                    n14 = 127;
                    break;
                }
                case 173: {
                    n14 = 61;
                    break;
                }
                case 174: {
                    n14 = 183;
                    break;
                }
                case 175: {
                    n14 = 172;
                    break;
                }
                case 176: {
                    n14 = 243;
                    break;
                }
                case 177: {
                    n14 = 128;
                    break;
                }
                case 178: {
                    n14 = 195;
                    break;
                }
                case 179: {
                    n14 = 99;
                    break;
                }
                case 180: {
                    n14 = 130;
                    break;
                }
                case 181: {
                    n14 = 182;
                    break;
                }
                case 182: {
                    n14 = 230;
                    break;
                }
                case 183: {
                    n14 = 234;
                    break;
                }
                case 184: {
                    n14 = 63;
                    break;
                }
                case 185: {
                    n14 = 73;
                    break;
                }
                case 186: {
                    n14 = 224;
                    break;
                }
                case 187: {
                    n14 = 203;
                    break;
                }
                case 188: {
                    n14 = 249;
                    break;
                }
                case 189: {
                    n14 = 96;
                    break;
                }
                case 190: {
                    n14 = 119;
                    break;
                }
                case 191: {
                    n14 = 46;
                    break;
                }
                case 192: {
                    n14 = 211;
                    break;
                }
                case 193: {
                    n14 = 207;
                    break;
                }
                case 194: {
                    n14 = 212;
                    break;
                }
                case 195: {
                    n14 = 246;
                    break;
                }
                case 196: {
                    n14 = 173;
                    break;
                }
                case 197: {
                    n14 = 114;
                    break;
                }
                case 198: {
                    n14 = 115;
                    break;
                }
                case 199: {
                    n14 = 25;
                    break;
                }
                case 200: {
                    n14 = 162;
                    break;
                }
                case 201: {
                    n14 = 155;
                    break;
                }
                case 202: {
                    n14 = 50;
                    break;
                }
                case 203: {
                    n14 = 209;
                    break;
                }
                case 204: {
                    n14 = 34;
                    break;
                }
                case 205: {
                    n14 = 213;
                    break;
                }
                case 206: {
                    n14 = 147;
                    break;
                }
                case 207: {
                    n14 = 226;
                    break;
                }
                case 208: {
                    n14 = 83;
                    break;
                }
                case 209: {
                    n14 = 65;
                    break;
                }
                case 210: {
                    n14 = 10;
                    break;
                }
                case 211: {
                    n14 = 110;
                    break;
                }
                case 212: {
                    n14 = 41;
                    break;
                }
                case 213: {
                    n14 = 248;
                    break;
                }
                case 214: {
                    n14 = 33;
                    break;
                }
                case 215: {
                    n14 = 216;
                    break;
                }
                case 216: {
                    n14 = 117;
                    break;
                }
                case 217: {
                    n14 = 66;
                    break;
                }
                case 218: {
                    n14 = 88;
                    break;
                }
                case 219: {
                    n14 = 9;
                    break;
                }
                case 220: {
                    n14 = 43;
                    break;
                }
                case 221: {
                    n14 = 157;
                    break;
                }
                case 222: {
                    n14 = 18;
                    break;
                }
                case 223: {
                    n14 = 42;
                    break;
                }
                case 224: {
                    n14 = 170;
                    break;
                }
                case 225: {
                    n14 = 247;
                    break;
                }
                case 226: {
                    n14 = 132;
                    break;
                }
                case 227: {
                    n14 = 22;
                    break;
                }
                case 228: {
                    n14 = 11;
                    break;
                }
                case 229: {
                    n14 = 238;
                    break;
                }
                case 230: {
                    n14 = 121;
                    break;
                }
                case 231: {
                    n14 = 7;
                    break;
                }
                case 232: {
                    n14 = 231;
                    break;
                }
                case 233: {
                    n14 = 68;
                    break;
                }
                case 234: {
                    n14 = 194;
                    break;
                }
                case 235: {
                    n14 = 86;
                    break;
                }
                case 236: {
                    n14 = 221;
                    break;
                }
                case 237: {
                    n14 = 240;
                    break;
                }
                case 238: {
                    n14 = 84;
                    break;
                }
                case 239: {
                    n14 = 16;
                    break;
                }
                case 240: {
                    n14 = 109;
                    break;
                }
                case 241: {
                    n14 = 151;
                    break;
                }
                case 242: {
                    n14 = 236;
                    break;
                }
                case 243: {
                    n14 = 67;
                    break;
                }
                case 244: {
                    n14 = 204;
                    break;
                }
                case 245: {
                    n14 = 2;
                    break;
                }
                case 246: {
                    n14 = 111;
                    break;
                }
                case 247: {
                    n14 = 180;
                    break;
                }
                case 248: {
                    n14 = 252;
                    break;
                }
                case 249: {
                    n14 = 167;
                    break;
                }
                case 250: {
                    n14 = 206;
                    break;
                }
                case 251: {
                    n14 = 56;
                    break;
                }
                case 252: {
                    n14 = 165;
                    break;
                }
                case 253: {
                    n14 = 237;
                    break;
                }
                case 254: {
                    n14 = 135;
                    break;
                }
                default: {
                    n14 = 229;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            YB.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6875;
        if (d[n11] == null) {
            YB.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

