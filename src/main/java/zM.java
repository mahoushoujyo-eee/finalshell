/*
 * Decompiled with CFR 0.152.
 */
import com.KD;
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class zM
extends z7 {
    JList O;
    ListModel o;
    JTextField P;
    int v;
    int f;
    JComboBox g;
    boolean F;
    private static ky_2[] Y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] i;

    public zM() {
        JCheckBox jCheckBox;
        u6_0 u6_02;
        block16: {
            int n10;
            Object object;
            Object object2;
            boolean bl;
            u6_0 u6_03;
            Object object3;
            this.v = zM.a(11345, 9071719247284532724L);
            this.f = zM.a(23114, 8646614288436495340L);
            ky_2[] ky_2Array = zM.I();
            this.F = false;
            try {
                object3 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                u6_03 = (u6_0)object3.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            u6_02 = u6_03;
            JPanel jPanel = new JPanel(new MigLayout("insets 0 0 0 0"));
            this.add((Component)jPanel, "wrap");
            try {
                bl = (Boolean)u6_02.J();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            jCheckBox = new JCheckBox("启用背景图片", bl);
            jCheckBox.setForeground(new Color(zM.a(16906, 6456310998628703149L), 0, zM.a(18249, 1688511695136890605L)));
            jPanel.add((Component)jCheckBox, "");
            ky_2[] ky_2Array2 = ky_2Array;
            jCheckBox.addItemListener(new mH(this, u6_02, jCheckBox));
            JLabel jLabel = new JLabel("模糊级别");
            jLabel.setForeground(new Color(0, 0, zM.a(1027, 6037901765845966243L)));
            jLabel.setFont((Font)fx_2.U);
            this.g = new JComboBox();
            ((JComboBox)this.g).setForeground(new Color(0, 0, zM.a(26953, 6250026264920731880L)));
            ((JComboBox)this.g).setFont((Font)fx_2.U);
            for (int i2 = 0; i2 < zM.a(11348, 4264436767161710071L); ++i2) {
                ((JComboBox)this.g).addItem(i2);
                if (ky_2Array2 != null) {
                    if (ky_2Array2 != null) continue;
                    ky_2.K(new String[3]);
                    break;
                }
                break block16;
            }
            ((JComboBox)this.g).addItemListener(new fd_0(this));
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                n10 = (Integer)object.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JComboBox)this.g).setSelectedItem(n10);
        }
        JPanel jPanel = new JPanel(new MigLayout("insets 0 0 0 0"));
        this.add((Component)jPanel, "wrap");
        jPanel.add(new JLabel("当前背景"));
        this.P = new JTextField();
        ((JTextField)this.P).setOpaque(false);
        ((JTextField)this.P).setEditable(false);
        jPanel.add((JTextField)this.P);
        KD kD = new KD("选择本机图片...");
        this.add((Component)kD, "wrap");
        kD.V(2, 4, 2, 4);
        kD.addActionListener(new oi_0(this, u6_02));
        this.add((Component)new JLabel("图片列表:"), "width :100%:,wrap");
        this.O = new JList();
        ((JList)this.O).setBackground(new Color(zM.a(718, 6942612082025454433L), zM.a(27051, 5966837600905998345L), zM.a(27051, 5966837600905998345L)));
        this.o = ((JList)this.O).getModel();
        ((JList)this.O).getSelectionModel().setSelectionMode(0);
        ((JList)this.O).addListSelectionListener(new mL(this, jCheckBox));
        JScrollPane jScrollPane = new JScrollPane((JList)this.O);
        this.add((Component)jScrollPane, "width :100%:,height :100%:,wrap");
        try {
            this.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void g(String var1_1) {
        block37: {
            block40: {
                block38: {
                    block39: {
                        try {
                            v0 = yt_1.i();
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        try {
                            v2 = v0.h();
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        try {
                            v4 = (fx_1)v2.o();
                        }
                        catch (InvocationTargetException v5) {
                            throw v5.getTargetException();
                        }
                        var3_2 = v4;
                        var2_3 = zM.I();
                        v6 = var1_1.startsWith("bg");
                        if (var2_3 == null) break block38;
                        if (v6 == 0) break block39;
                        try {
                            v7 = yt_1.i();
                        }
                        catch (InvocationTargetException v8) {
                            throw v8.getTargetException();
                        }
                        try {
                            v9 = v7.h();
                        }
                        catch (InvocationTargetException v10) {
                            throw v10.getTargetException();
                        }
                        try {
                            v9.l(var1_1);
                        }
                        catch (InvocationTargetException v11) {
                            throw v11.getTargetException();
                        }
                        if (var2_3 != null) break block40;
                    }
                    v6 = new File(var1_1).exists();
                }
                if (var2_3 != null) {
                    if (v6 != 0) {
                        try {
                            var3_2.f(var1_1);
                        }
                        catch (InvocationTargetException v12) {
                            throw v12.getTargetException();
                        }
                        try {
                            v13 = yt_1.i();
                        }
                        catch (InvocationTargetException v14) {
                            throw v14.getTargetException();
                        }
                        try {
                            v15 = v13.h();
                        }
                        catch (InvocationTargetException v16) {
                            throw v16.getTargetException();
                        }
                        try {
                            v15.l(var1_1);
                        }
                        catch (InvocationTargetException v17) {
                            throw v17.getTargetException();
                        }
                    } else {
                        ** GOTO lbl67
                    }
                }
                ** GOTO lbl76
            }
            do {
                try {
                    v18 = (ArrayList)var3_2.x();
                }
                catch (InvocationTargetException v19) {
                    throw v19.getTargetException();
                }
                v6 = v18.size();
lbl76:
                // 2 sources

                if (v6 <= this.f) break;
                try {
                    v20 = (ArrayList)var3_2.x();
                }
                catch (InvocationTargetException v21) {
                    throw v21.getTargetException();
                }
                try {
                    v22 = (ArrayList)var3_2.x();
                }
                catch (InvocationTargetException v23) {
                    throw v23.getTargetException();
                }
                v20.remove(v22.size() - 1);
                if (var2_3 == null) break block37;
            } while (var2_3 != null);
            try {
                this.o();
            }
            catch (InvocationTargetException v24) {
                throw v24.getTargetException();
            }
            try {
                v25 = yt_1.i();
            }
            catch (InvocationTargetException v26) {
                throw v26.getTargetException();
            }
            try {
                v25.S();
            }
            catch (InvocationTargetException v27) {
                throw v27.getTargetException();
            }
            SwingUtilities.invokeLater(new mU(this));
            try {
                yt_1.F.J(new YC(this));
            }
            catch (InvocationTargetException v28) {
                throw v28.getTargetException();
            }
        }
    }

    void o() {
        block19: {
            String string;
            Object object;
            Object object2;
            ky_2[] ky_2Array;
            ArrayList<String> arrayList;
            block18: {
                ArrayList arrayList2;
                fx_1 fx_12;
                Object object3;
                Object object4;
                try {
                    object4 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object3 = object4.h();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    fx_12 = (fx_1)object3.o();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                fx_1 fx_13 = fx_12;
                arrayList = new ArrayList<String>();
                ky_2Array = zM.I();
                for (int i2 = 0; i2 < this.v; ++i2) {
                    arrayList.add("bg" + (i2 + 1) + ".jpg");
                    if (ky_2Array != null) {
                        if (ky_2Array != null) continue;
                    }
                    break block18;
                }
                try {
                    arrayList2 = (ArrayList)fx_13.x();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                arrayList.addAll(arrayList2);
            }
            String[] stringArray = new String[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                stringArray[i3] = (String)arrayList.get(i3);
                if (ky_2Array != null) {
                    if (ky_2Array != null) continue;
                }
                break block19;
            }
            ((JList)this.O).setListData(stringArray);
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string = (String)object.Y();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JTextField)this.P).setText(string);
        }
    }

    @Override
    public void A(lv_2 lv_22) {
        if (lv_22 != null) {
            // empty if block
        }
    }

    @Override
    public vg_0 c() {
        vg_0 vg_02 = new vg_0();
        try {
            vg_02.n(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            vg_02.j(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return vg_02;
    }

    @Override
    public void F(lv_2 lv_22) {
    }

    public static void R(ky_2[] ky_2Array) {
        Y = ky_2Array;
    }

    public static ky_2[] I() {
        return Y;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[14];
                        var11_1 = 0;
                        var10_2 = "\u0012\u0019c%\u000ex\u00c2\u00e1\u00d4K\u00d7\u00f9K;\u00b6)\u00ce\u00d6\u0095\u001f\u00bb^S\u00b1\u00f4\u001b\u008b\u00ea<\u00a3\u00def\u0081\u0093`~{\u00a9\u008e\u0087[y&\u00d1\u009d(\u00e9EzP\u00da\u0004\u6ab0\u7c2e\u7e6d\u5237\u0004DP\u00a9\f\u0005\u56cb\u72f3\u5296\u88f3\u0003\u0011OI\u00cdS'G\u00f1as\u00d27H\u00bcI\u00d0\u00d1\u008f\t\u909d\u6233\u676e\u67c2\u5684\u7295\u00d5\u00af\u007f\u0006\u54b2\u753e\u8089\u66cf\u5684\u72cb\u000eC\u00fe\u0086S\u00a7'dU\u0088u_\u00b6\u0018\u009a\u0004\u5f3d\u520d\u808b\u6660\u0004[\u008d)\u00bb";
                        var12_3 = "\u0012\u0019c%\u000ex\u00c2\u00e1\u00d4K\u00d7\u00f9K;\u00b6)\u00ce\u00d6\u0095\u001f\u00bb^S\u00b1\u00f4\u001b\u008b\u00ea<\u00a3\u00def\u0081\u0093`~{\u00a9\u008e\u0087[y&\u00d1\u009d(\u00e9EzP\u00da\u0004\u6ab0\u7c2e\u7e6d\u5237\u0004DP\u00a9\f\u0005\u56cb\u72f3\u5296\u88f3\u0003\u0011OI\u00cdS'G\u00f1as\u00d27H\u00bcI\u00d0\u00d1\u008f\t\u909d\u6233\u676e\u67c2\u5684\u7295\u00d5\u00af\u007f\u0006\u54b2\u753e\u8089\u66cf\u5684\u72cb\u000eC\u00fe\u0086S\u00a7'dU\u0088u_\u00b6\u0018\u009a\u0004\u5f3d\u520d\u808b\u6660\u0004[\u008d)\u00bb".length();
                        var9_4 = 4;
                        zM.R(new ky_2[3]);
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 58;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u0013\u00e3\u0002\u00e1\u00aa";
                            var12_3 = "\u0013\u00e3\u0002\u00e1\u00aa".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 108;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 101;
                                    break;
                                }
                                case 1: {
                                    v15 = 18;
                                    break;
                                }
                                case 2: {
                                    v15 = 8;
                                    break;
                                }
                                case 3: {
                                    v15 = 117;
                                    break;
                                }
                                case 4: {
                                    v15 = 98;
                                    break;
                                }
                                case 5: {
                                    v15 = 36;
                                    break;
                                }
                                default: {
                                    v15 = 123;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                zM.a = var13;
                zM.b = new String[14];
                var0_7 = 5216992543731064123L;
                var6_8 = new long[9];
                var3_9 = 0;
                var4_10 = "\u0016&\u008d\u00c9\u0094E\u0086\u0082r\u0086\u00d2|\u00d0\u00e0\u009e\u00c3\u00e6,\u00bb\u00b5\u0080\u0084h\u00caL\u00cb\u001bj/I\u0083@\u00e4P\u00d9\u00cc\u00b5:h\u00c7L\u00d4\u00fe\u001c\u00d6\u0081\u00ad\u00c8\u0095j\u00f0z\u00f9\u0085\u00ad,";
                var5_11 = "\u0016&\u008d\u00c9\u0094E\u0086\u0082r\u0086\u00d2|\u00d0\u00e0\u009e\u00c3\u00e6,\u00bb\u00b5\u0080\u0084h\u00caL\u00cb\u001bj/I\u0083@\u00e4P\u00d9\u00cc\u00b5:h\u00c7L\u00d4\u00fe\u001c\u00d6\u0081\u00ad\u00c8\u0095j\u00f0z\u00f9\u0085\u00ad,".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00b2\u00ba\u00ec\u0091\u0091\u0000@g\u00c3&\u0003\u00e3V\u0085\u00c6\u00a0";
                    var5_11 = "\u00b2\u00ba\u00ec\u0091\u0091\u0000@g\u00c3&\u0003\u00e3V\u0085\u00c6\u00a0".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        zM.d = var6_8;
        zM.i = new Integer[9];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x23C1) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 115;
                    break;
                }
                case 1: {
                    n14 = 210;
                    break;
                }
                case 2: {
                    n14 = 169;
                    break;
                }
                case 3: {
                    n14 = 61;
                    break;
                }
                case 4: {
                    n14 = 146;
                    break;
                }
                case 5: {
                    n14 = 39;
                    break;
                }
                case 6: {
                    n14 = 223;
                    break;
                }
                case 7: {
                    n14 = 153;
                    break;
                }
                case 8: {
                    n14 = 94;
                    break;
                }
                case 9: {
                    n14 = 155;
                    break;
                }
                case 10: {
                    n14 = 135;
                    break;
                }
                case 11: {
                    n14 = 133;
                    break;
                }
                case 12: {
                    n14 = 242;
                    break;
                }
                case 13: {
                    n14 = 177;
                    break;
                }
                case 14: {
                    n14 = 124;
                    break;
                }
                case 15: {
                    n14 = 57;
                    break;
                }
                case 16: {
                    n14 = 17;
                    break;
                }
                case 17: {
                    n14 = 73;
                    break;
                }
                case 18: {
                    n14 = 189;
                    break;
                }
                case 19: {
                    n14 = 46;
                    break;
                }
                case 20: {
                    n14 = 127;
                    break;
                }
                case 21: {
                    n14 = 107;
                    break;
                }
                case 22: {
                    n14 = 254;
                    break;
                }
                case 23: {
                    n14 = 10;
                    break;
                }
                case 24: {
                    n14 = 11;
                    break;
                }
                case 25: {
                    n14 = 197;
                    break;
                }
                case 26: {
                    n14 = 12;
                    break;
                }
                case 27: {
                    n14 = 27;
                    break;
                }
                case 28: {
                    n14 = 126;
                    break;
                }
                case 29: {
                    n14 = 230;
                    break;
                }
                case 30: {
                    n14 = 68;
                    break;
                }
                case 31: {
                    n14 = 196;
                    break;
                }
                case 32: {
                    n14 = 113;
                    break;
                }
                case 33: {
                    n14 = 193;
                    break;
                }
                case 34: {
                    n14 = 106;
                    break;
                }
                case 35: {
                    n14 = 95;
                    break;
                }
                case 36: {
                    n14 = 186;
                    break;
                }
                case 37: {
                    n14 = 31;
                    break;
                }
                case 38: {
                    n14 = 238;
                    break;
                }
                case 39: {
                    n14 = 152;
                    break;
                }
                case 40: {
                    n14 = 226;
                    break;
                }
                case 41: {
                    n14 = 112;
                    break;
                }
                case 42: {
                    n14 = 165;
                    break;
                }
                case 43: {
                    n14 = 200;
                    break;
                }
                case 44: {
                    n14 = 19;
                    break;
                }
                case 45: {
                    n14 = 205;
                    break;
                }
                case 46: {
                    n14 = 235;
                    break;
                }
                case 47: {
                    n14 = 104;
                    break;
                }
                case 48: {
                    n14 = 74;
                    break;
                }
                case 49: {
                    n14 = 161;
                    break;
                }
                case 50: {
                    n14 = 105;
                    break;
                }
                case 51: {
                    n14 = 217;
                    break;
                }
                case 52: {
                    n14 = 232;
                    break;
                }
                case 53: {
                    n14 = 100;
                    break;
                }
                case 54: {
                    n14 = 251;
                    break;
                }
                case 55: {
                    n14 = 3;
                    break;
                }
                case 56: {
                    n14 = 1;
                    break;
                }
                case 57: {
                    n14 = 215;
                    break;
                }
                case 58: {
                    n14 = 154;
                    break;
                }
                case 59: {
                    n14 = 122;
                    break;
                }
                case 60: {
                    n14 = 114;
                    break;
                }
                case 61: {
                    n14 = 151;
                    break;
                }
                case 62: {
                    n14 = 20;
                    break;
                }
                case 63: {
                    n14 = 32;
                    break;
                }
                case 64: {
                    n14 = 66;
                    break;
                }
                case 65: {
                    n14 = 21;
                    break;
                }
                case 66: {
                    n14 = 35;
                    break;
                }
                case 67: {
                    n14 = 13;
                    break;
                }
                case 68: {
                    n14 = 198;
                    break;
                }
                case 69: {
                    n14 = 239;
                    break;
                }
                case 70: {
                    n14 = 190;
                    break;
                }
                case 71: {
                    n14 = 233;
                    break;
                }
                case 72: {
                    n14 = 213;
                    break;
                }
                case 73: {
                    n14 = 55;
                    break;
                }
                case 74: {
                    n14 = 36;
                    break;
                }
                case 75: {
                    n14 = 248;
                    break;
                }
                case 76: {
                    n14 = 240;
                    break;
                }
                case 77: {
                    n14 = 201;
                    break;
                }
                case 78: {
                    n14 = 0;
                    break;
                }
                case 79: {
                    n14 = 111;
                    break;
                }
                case 80: {
                    n14 = 78;
                    break;
                }
                case 81: {
                    n14 = 211;
                    break;
                }
                case 82: {
                    n14 = 44;
                    break;
                }
                case 83: {
                    n14 = 172;
                    break;
                }
                case 84: {
                    n14 = 24;
                    break;
                }
                case 85: {
                    n14 = 63;
                    break;
                }
                case 86: {
                    n14 = 208;
                    break;
                }
                case 87: {
                    n14 = 202;
                    break;
                }
                case 88: {
                    n14 = 59;
                    break;
                }
                case 89: {
                    n14 = 144;
                    break;
                }
                case 90: {
                    n14 = 45;
                    break;
                }
                case 91: {
                    n14 = 221;
                    break;
                }
                case 92: {
                    n14 = 47;
                    break;
                }
                case 93: {
                    n14 = 159;
                    break;
                }
                case 94: {
                    n14 = 209;
                    break;
                }
                case 95: {
                    n14 = 227;
                    break;
                }
                case 96: {
                    n14 = 178;
                    break;
                }
                case 97: {
                    n14 = 109;
                    break;
                }
                case 98: {
                    n14 = 188;
                    break;
                }
                case 99: {
                    n14 = 50;
                    break;
                }
                case 100: {
                    n14 = 212;
                    break;
                }
                case 101: {
                    n14 = 147;
                    break;
                }
                case 102: {
                    n14 = 108;
                    break;
                }
                case 103: {
                    n14 = 120;
                    break;
                }
                case 104: {
                    n14 = 102;
                    break;
                }
                case 105: {
                    n14 = 62;
                    break;
                }
                case 106: {
                    n14 = 118;
                    break;
                }
                case 107: {
                    n14 = 96;
                    break;
                }
                case 108: {
                    n14 = 103;
                    break;
                }
                case 109: {
                    n14 = 185;
                    break;
                }
                case 110: {
                    n14 = 72;
                    break;
                }
                case 111: {
                    n14 = 139;
                    break;
                }
                case 112: {
                    n14 = 119;
                    break;
                }
                case 113: {
                    n14 = 76;
                    break;
                }
                case 114: {
                    n14 = 58;
                    break;
                }
                case 115: {
                    n14 = 99;
                    break;
                }
                case 116: {
                    n14 = 30;
                    break;
                }
                case 117: {
                    n14 = 231;
                    break;
                }
                case 118: {
                    n14 = 247;
                    break;
                }
                case 119: {
                    n14 = 255;
                    break;
                }
                case 120: {
                    n14 = 28;
                    break;
                }
                case 121: {
                    n14 = 156;
                    break;
                }
                case 122: {
                    n14 = 142;
                    break;
                }
                case 123: {
                    n14 = 234;
                    break;
                }
                case 124: {
                    n14 = 117;
                    break;
                }
                case 125: {
                    n14 = 180;
                    break;
                }
                case 126: {
                    n14 = 91;
                    break;
                }
                case 127: {
                    n14 = 244;
                    break;
                }
                case 128: {
                    n14 = 25;
                    break;
                }
                case 129: {
                    n14 = 56;
                    break;
                }
                case 130: {
                    n14 = 174;
                    break;
                }
                case 131: {
                    n14 = 110;
                    break;
                }
                case 132: {
                    n14 = 79;
                    break;
                }
                case 133: {
                    n14 = 195;
                    break;
                }
                case 134: {
                    n14 = 140;
                    break;
                }
                case 135: {
                    n14 = 37;
                    break;
                }
                case 136: {
                    n14 = 166;
                    break;
                }
                case 137: {
                    n14 = 141;
                    break;
                }
                case 138: {
                    n14 = 89;
                    break;
                }
                case 139: {
                    n14 = 181;
                    break;
                }
                case 140: {
                    n14 = 182;
                    break;
                }
                case 141: {
                    n14 = 130;
                    break;
                }
                case 142: {
                    n14 = 49;
                    break;
                }
                case 143: {
                    n14 = 125;
                    break;
                }
                case 144: {
                    n14 = 241;
                    break;
                }
                case 145: {
                    n14 = 71;
                    break;
                }
                case 146: {
                    n14 = 252;
                    break;
                }
                case 147: {
                    n14 = 33;
                    break;
                }
                case 148: {
                    n14 = 187;
                    break;
                }
                case 149: {
                    n14 = 179;
                    break;
                }
                case 150: {
                    n14 = 129;
                    break;
                }
                case 151: {
                    n14 = 5;
                    break;
                }
                case 152: {
                    n14 = 160;
                    break;
                }
                case 153: {
                    n14 = 158;
                    break;
                }
                case 154: {
                    n14 = 162;
                    break;
                }
                case 155: {
                    n14 = 170;
                    break;
                }
                case 156: {
                    n14 = 14;
                    break;
                }
                case 157: {
                    n14 = 167;
                    break;
                }
                case 158: {
                    n14 = 82;
                    break;
                }
                case 159: {
                    n14 = 123;
                    break;
                }
                case 160: {
                    n14 = 67;
                    break;
                }
                case 161: {
                    n14 = 224;
                    break;
                }
                case 162: {
                    n14 = 214;
                    break;
                }
                case 163: {
                    n14 = 92;
                    break;
                }
                case 164: {
                    n14 = 243;
                    break;
                }
                case 165: {
                    n14 = 132;
                    break;
                }
                case 166: {
                    n14 = 191;
                    break;
                }
                case 167: {
                    n14 = 164;
                    break;
                }
                case 168: {
                    n14 = 53;
                    break;
                }
                case 169: {
                    n14 = 18;
                    break;
                }
                case 170: {
                    n14 = 84;
                    break;
                }
                case 171: {
                    n14 = 206;
                    break;
                }
                case 172: {
                    n14 = 75;
                    break;
                }
                case 173: {
                    n14 = 42;
                    break;
                }
                case 174: {
                    n14 = 80;
                    break;
                }
                case 175: {
                    n14 = 16;
                    break;
                }
                case 176: {
                    n14 = 163;
                    break;
                }
                case 177: {
                    n14 = 134;
                    break;
                }
                case 178: {
                    n14 = 86;
                    break;
                }
                case 179: {
                    n14 = 137;
                    break;
                }
                case 180: {
                    n14 = 9;
                    break;
                }
                case 181: {
                    n14 = 81;
                    break;
                }
                case 182: {
                    n14 = 249;
                    break;
                }
                case 183: {
                    n14 = 8;
                    break;
                }
                case 184: {
                    n14 = 54;
                    break;
                }
                case 185: {
                    n14 = 173;
                    break;
                }
                case 186: {
                    n14 = 176;
                    break;
                }
                case 187: {
                    n14 = 250;
                    break;
                }
                case 188: {
                    n14 = 64;
                    break;
                }
                case 189: {
                    n14 = 199;
                    break;
                }
                case 190: {
                    n14 = 101;
                    break;
                }
                case 191: {
                    n14 = 43;
                    break;
                }
                case 192: {
                    n14 = 83;
                    break;
                }
                case 193: {
                    n14 = 216;
                    break;
                }
                case 194: {
                    n14 = 121;
                    break;
                }
                case 195: {
                    n14 = 157;
                    break;
                }
                case 196: {
                    n14 = 65;
                    break;
                }
                case 197: {
                    n14 = 222;
                    break;
                }
                case 198: {
                    n14 = 34;
                    break;
                }
                case 199: {
                    n14 = 70;
                    break;
                }
                case 200: {
                    n14 = 98;
                    break;
                }
                case 201: {
                    n14 = 97;
                    break;
                }
                case 202: {
                    n14 = 40;
                    break;
                }
                case 203: {
                    n14 = 60;
                    break;
                }
                case 204: {
                    n14 = 149;
                    break;
                }
                case 205: {
                    n14 = 131;
                    break;
                }
                case 206: {
                    n14 = 29;
                    break;
                }
                case 207: {
                    n14 = 93;
                    break;
                }
                case 208: {
                    n14 = 52;
                    break;
                }
                case 209: {
                    n14 = 204;
                    break;
                }
                case 210: {
                    n14 = 150;
                    break;
                }
                case 211: {
                    n14 = 87;
                    break;
                }
                case 212: {
                    n14 = 218;
                    break;
                }
                case 213: {
                    n14 = 184;
                    break;
                }
                case 214: {
                    n14 = 26;
                    break;
                }
                case 215: {
                    n14 = 229;
                    break;
                }
                case 216: {
                    n14 = 237;
                    break;
                }
                case 217: {
                    n14 = 77;
                    break;
                }
                case 218: {
                    n14 = 203;
                    break;
                }
                case 219: {
                    n14 = 220;
                    break;
                }
                case 220: {
                    n14 = 90;
                    break;
                }
                case 221: {
                    n14 = 85;
                    break;
                }
                case 222: {
                    n14 = 225;
                    break;
                }
                case 223: {
                    n14 = 41;
                    break;
                }
                case 224: {
                    n14 = 6;
                    break;
                }
                case 225: {
                    n14 = 171;
                    break;
                }
                case 226: {
                    n14 = 15;
                    break;
                }
                case 227: {
                    n14 = 245;
                    break;
                }
                case 228: {
                    n14 = 51;
                    break;
                }
                case 229: {
                    n14 = 148;
                    break;
                }
                case 230: {
                    n14 = 48;
                    break;
                }
                case 231: {
                    n14 = 168;
                    break;
                }
                case 232: {
                    n14 = 192;
                    break;
                }
                case 233: {
                    n14 = 253;
                    break;
                }
                case 234: {
                    n14 = 175;
                    break;
                }
                case 235: {
                    n14 = 22;
                    break;
                }
                case 236: {
                    n14 = 69;
                    break;
                }
                case 237: {
                    n14 = 246;
                    break;
                }
                case 238: {
                    n14 = 138;
                    break;
                }
                case 239: {
                    n14 = 116;
                    break;
                }
                case 240: {
                    n14 = 145;
                    break;
                }
                case 241: {
                    n14 = 128;
                    break;
                }
                case 242: {
                    n14 = 207;
                    break;
                }
                case 243: {
                    n14 = 143;
                    break;
                }
                case 244: {
                    n14 = 236;
                    break;
                }
                case 245: {
                    n14 = 4;
                    break;
                }
                case 246: {
                    n14 = 88;
                    break;
                }
                case 247: {
                    n14 = 23;
                    break;
                }
                case 248: {
                    n14 = 219;
                    break;
                }
                case 249: {
                    n14 = 136;
                    break;
                }
                case 250: {
                    n14 = 228;
                    break;
                }
                case 251: {
                    n14 = 194;
                    break;
                }
                case 252: {
                    n14 = 2;
                    break;
                }
                case 253: {
                    n14 = 38;
                    break;
                }
                case 254: {
                    n14 = 7;
                    break;
                }
                default: {
                    n14 = 183;
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
            zM.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x59A7;
        if (i[n11] == null) {
            zM.i[n11] = (int)(d[n11] ^ l2);
        }
        return i[n11];
    }
}

