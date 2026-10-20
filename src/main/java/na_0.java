/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from na
 */
public class na_0
extends DefaultTreeCellRenderer {
    static Border F;
    static JT y;
    static ImageIcon J;
    public static ImageIcon l;
    public static ImageIcon C;
    public static ImageIcon w;
    JPanel x;
    JLabel e;
    JLabel V;
    JLabel H;
    JLabel O;
    JLabel m;
    int Q;
    HashMap d;
    int M;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] f;

    public na_0() {
        this.Q = na_0.a(30496, 9174425883681745552L);
        this.d = new HashMap();
        this.M = na_0.a(10916, 2811595078739572503L);
        String string = aA.z();
        this.x = new JPanel();
        ((JPanel)this.x).setOpaque(false);
        ((JPanel)this.x).setLayout(new MigLayout(na_0.a(4096, -17585), na_0.a(4105, -4449), ""));
        this.e = new JLabel();
        ((JLabel)this.e).setOpaque(false);
        String string2 = string;
        ((JLabel)this.e).setText(" ");
        ((JPanel)this.x).add((Component)((JLabel)this.e), na_0.a(4111, 5522));
        this.V = new JLabel();
        ((JLabel)this.V).setOpaque(false);
        ((JPanel)this.x).add((Component)((JLabel)this.V), na_0.a(4102, -11542));
        this.H = new JLabel();
        ((JLabel)this.H).setOpaque(false);
        ((JPanel)this.x).add((Component)((JLabel)this.H), na_0.a(4098, -21257));
        this.O = new JLabel();
        ((JLabel)this.O).setOpaque(false);
        ((JPanel)this.x).add((Component)((JLabel)this.O), na_0.a(4108, 13912));
        this.m = new JLabel();
        ((JLabel)this.m).setOpaque(false);
        ((JLabel)this.m).setBackground(Color.blue);
        ((JPanel)this.x).add((Component)((JLabel)this.m), na_0.a(4097, 29898));
        ((JPanel)this.x).setBorder((Border)na_0.F);
        ((JPanel)this.x).setBackground(Color.yellow);
        if (ky_2.F() != null) {
            aA.F("Syungc");
        }
    }

    public static ImageIcon F(tf_2 tf_22, boolean bl) {
        if (!bl) {
            return (ImageIcon)na_0.l;
        }
        return (ImageIcon)na_0.J;
    }

    public static ImageIcon Y(ck_2 ck_22) {
        int n10;
        String string = aA.z();
        try {
            n10 = (Integer)ck_22.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = lv_2.F;
        if (string == null) {
            if (n10 == n11) {
                return (ImageIcon)na_0.w;
            }
            try {
                n10 = (Integer)ck_22.I();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            n11 = lv_2.C;
        }
        if (n10 == n11) {
            return (ImageIcon)na_0.C;
        }
        return (ImageIcon)na_0.C;
    }

    /*
     * WARNING - void declaration
     */
    public JPanel t(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        int n11;
        block57: {
            Object object2;
            ArrayList<int[]> arrayList;
            Object object3;
            Object object4;
            String string;
            block58: {
                Serializable serializable;
                block60: {
                    int n12;
                    block68: {
                        void var15_23;
                        int n13;
                        block61: {
                            lv_2 lv_22;
                            Object object5;
                            Object object6;
                            Object object7;
                            String string2;
                            ImageIcon imageIcon;
                            Object object8;
                            block62: {
                                block63: {
                                    block67: {
                                        ImageIcon imageIcon2;
                                        block66: {
                                            boolean bl5;
                                            String string3;
                                            lo_1 lo_12;
                                            Object object9;
                                            Object object10;
                                            block65: {
                                                block64: {
                                                    String n18;
                                                    File file;
                                                    Object object11;
                                                    block59: {
                                                        String string4 = aA.z();
                                                        this.setBackgroundNonSelectionColor(new Color(0, 0, 0, 0));
                                                        n13 = na_0.a(3023, 2560562060492084862L);
                                                        string = string4;
                                                        n11 = 0;
                                                        if (object == null) break block58;
                                                        object4 = Color.black;
                                                        object11 = object.getClass();
                                                        if (string != null) break block59;
                                                        if (!object11.equals(DefaultMutableTreeNode.class)) break block58;
                                                        object11 = object;
                                                    }
                                                    object3 = (DefaultMutableTreeNode)object11;
                                                    arrayList = ((DefaultMutableTreeNode)object3).getUserObject();
                                                    String object52 = " ";
                                                    if (string != null) break block60;
                                                    if (arrayList == null) break block61;
                                                    n12 = arrayList.getClass().equals(tf_2.class);
                                                    if (string != null) break block62;
                                                    if (n12 == 0) break block63;
                                                    serializable = (tf_2)((Object)arrayList);
                                                    try {
                                                        file = (File)serializable.M();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    object8 = file.getName();
                                                    String string5 = object8;
                                                    if (string != null) break block64;
                                                    if (!string5.equals(na_0.a(4107, -18934))) break block65;
                                                    string5 = n18 = na_0.a(4099, -8609);
                                                }
                                                if (string == null) break block66;
                                            }
                                            try {
                                                object10 = yt_1.i();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object9 = object10.g();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                lo_12 = (lo_1)object9.m(object8);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            lo_1 lo_13 = lo_12;
                                            try {
                                                string3 = (String)lo_13.F();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            String string6 = string3;
                                            if (string != null) break block67;
                                            try {
                                                bl5 = (Boolean)le_2.H(lo_13);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (bl5) {
                                                object4 = Color.red;
                                            }
                                        }
                                        try {
                                            imageIcon2 = (ImageIcon)na_0.F((Object)serializable, bl2);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        ((JLabel)this.e).setIcon(imageIcon2);
                                        ((JLabel)this.V).setText("");
                                        ((JLabel)this.H).setText("");
                                        ((JLabel)this.O).setText("");
                                        ((JLabel)this.m).setText("");
                                    }
                                    if (string == null) break block61;
                                }
                                n12 = arrayList.getClass().equals(ck_2.class);
                            }
                            if (string != null) break block68;
                            if (n12 == 0) break block61;
                            serializable = (ck_2)((Object)arrayList);
                            try {
                                imageIcon = (ImageIcon)na_0.Y(serializable);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            ((JLabel)this.e).setIcon(imageIcon);
                            try {
                                string2 = (String)serializable.a();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            String string7 = string2.replace(na_0.a(4104, 17200), "");
                            try {
                                object7 = yt_1.i();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object6 = object7.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object5 = serializable.d();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                lv_22 = (lv_2)object6.q(object5);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            Object object12 = object8 = lv_22;
                            if (string == null) {
                                if (object12 != null) {
                                    String string8;
                                    String string9;
                                    int n14;
                                    String string10;
                                    String string11;
                                    try {
                                        string11 = (String)object8.F();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    String string12 = string11;
                                    try {
                                        string10 = (String)object8.v();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    ((JLabel)this.V).setText(string10);
                                    try {
                                        n14 = (Integer)object8.X();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    ((JLabel)this.H).setText(n14 + "");
                                    try {
                                        string9 = (String)object8.E();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    ((JLabel)this.O).setText(string9);
                                    try {
                                        string8 = (String)object8.Q();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    ((JLabel)this.m).setText(string8);
                                }
                                object12 = object8;
                            }
                            try {
                                n12 = ((Boolean)le_2.H(object12)).booleanValue() ? 1 : 0;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (string != null) break block68;
                            if (n12 != 0) {
                                object4 = Color.red;
                            }
                        }
                        ((JLabel)this.e).setText((String)var15_23);
                        n12 = this.Q - ((DefaultMutableTreeNode)object3).getLevel() * n13;
                    }
                    n11 = n12;
                }
                serializable = ((JLabel)this.e).getPreferredSize();
                ((Dimension)serializable).setSize(n11, ((Dimension)serializable).getHeight());
                ((JLabel)this.e).setMaximumSize((Dimension)serializable);
                ((JLabel)this.e).setMinimumSize((Dimension)serializable);
                ((JLabel)this.e).setPreferredSize((Dimension)serializable);
                ((JLabel)this.e).setForeground((Color)object4);
                ((JLabel)this.V).setForeground((Color)object4);
                ((JLabel)this.H).setForeground((Color)object4);
                ((JLabel)this.O).setForeground((Color)object4);
                ((JLabel)this.m).setForeground((Color)object4);
            }
            object4 = ((JPanel)this.x).getComponents();
            object3 = object.hashCode() + "";
            ArrayList<int[]> arrayList2 = arrayList = (ArrayList)((HashMap)this.d).get(object3);
            if (string == null) {
                if (arrayList2 == null) {
                    arrayList = new ArrayList<int[]>();
                }
                arrayList2 = arrayList;
            }
            arrayList2.clear();
            for (Component component : object4) {
                String string13;
                int n15;
                int n16;
                JLabel jLabel;
                block70: {
                    String string14;
                    block69: {
                        jLabel = (JLabel)component;
                        n16 = 0;
                        JLabel jLabel2 = jLabel;
                        if (string == null) {
                            object2 = jLabel2.getIcon();
                            if (string != null) break block57;
                            if (object2 != null) {
                                n16 = jLabel.getIcon().getIconWidth() + jLabel.getIconTextGap();
                            }
                            jLabel2 = jLabel;
                        }
                        n15 = jLabel2.getX();
                        string14 = string13 = jLabel.getText();
                        if (string != null) break block69;
                        if (string14 != null) break block70;
                        string14 = "";
                    }
                    string13 = string14;
                }
                int n17 = n15 + jLabel.getFontMetrics(jLabel.getFont()).stringWidth(string13) + n16;
                int[] nArray = new int[]{n15, n17};
                arrayList.add(nArray);
                if (string == null) continue;
            }
            object2 = ((HashMap)this.d).put(n10, arrayList);
        }
        int n18 = this.M - (this.Q - n11);
        ((JPanel)this.x).setPreferredSize(new Dimension(n18, ((JPanel)com.c.c((long)518604784742329380L).get((Object)this)).getPreferredSize().height));
        return (JPanel)this.x;
    }

    /*
     * Unable to fully structure code
     */
    public boolean C(int var1_1, int var2_2) {
        block9: {
            var4_3 = (ArrayList)((HashMap)this.d).get(var1_1);
            var3_4 = aA.z();
            var5_5 = 0;
            for (int[] var7_7 : var4_3) {
                block13: {
                    block12: {
                        block11: {
                            block10: {
                                var8_8 = var7_7[0];
                                var9_9 = var7_7[1];
                                v0 = var2_2;
                                if (var3_4 != null) break block9;
                                v1 = var8_8;
                                if (var3_4 != null) break block10;
                                if (v0 < v1) ** GOTO lbl-1000
                                v2 = var2_2;
                                if (var3_4 != null) break block11;
                                v1 = var9_9;
                            }
                            ** if (v2 > v1) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                v2 = 1;
                                ** GOTO lbl21
                            }
lbl-1000:
                            // 2 sources

                            {
                                v2 = 0;
                            }
                        }
                        v3 = var10_10 = v2;
                        if (var3_4 != null) break block12;
                        if (v3 == 0) break block13;
                        v3 = var5_5 = 1;
                    }
                    if (var3_4 == null) break;
                }
                if (var3_4 == null) continue;
            }
            v0 = var5_5;
        }
        return (boolean)v0;
    }

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        JPanel jPanel;
        try {
            jPanel = (JPanel)this.t((Object)jTree, object, bl, bl2, bl3, n10, bl4);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return jPanel;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block36: {
            block35: {
                block34: {
                    block33: {
                        var13 = new String[14];
                        var11_1 = 0;
                        var10_2 = "\u00c6s\u00d33\r\n\u00f1W\u00eb\u0002a\u009b\"!z\u00ac\u0086\u007fh\u00a8>a\u0004\u001f\u0012\u00acT\u0005\u00ea\u0016\u00ebpQ\u0012;\u00b9\"fp\u00f3\u00d3\u00b8a\u0092\u00bd\u00a6H\u00c9\u000f\u00e2\u00a4\r\u0011\u00f6\u00a7\u00d5\u00a9\u00cdY\u00e9=\u00e8O\u00012.\u0017\u00e4\u0017\u00ab\u000e\u00bb}\u00a4eK\u00e2\u0088 %\u0083Zg\u009b\u00f3\fY\u00f4\u00f8T\u00c0\u00c4\u00f3\u00e1\u000b\u001c\u00d6\u00d9\u0013\u00cf\u00dd\u00f2\u00e6)\u00b0u\u0012q\u00e4p\u00964A$;;\u0018!\f*<\u0096M\r\u00e7D\u00852\u009e\u00f1F\u0002\u8f51\u63f8\u000e\u00f71\u00e7\u001a\u00cam5\u00ed\u00d2\u0095\u00a4\u00eb\u0004\u00cd\u000b\u00d6#\t\u00ae\u00fe\u009b>\n\u00f3c\u0088";
                        var12_3 = "\u00c6s\u00d33\r\n\u00f1W\u00eb\u0002a\u009b\"!z\u00ac\u0086\u007fh\u00a8>a\u0004\u001f\u0012\u00acT\u0005\u00ea\u0016\u00ebpQ\u0012;\u00b9\"fp\u00f3\u00d3\u00b8a\u0092\u00bd\u00a6H\u00c9\u000f\u00e2\u00a4\r\u0011\u00f6\u00a7\u00d5\u00a9\u00cdY\u00e9=\u00e8O\u00012.\u0017\u00e4\u0017\u00ab\u000e\u00bb}\u00a4eK\u00e2\u0088 %\u0083Zg\u009b\u00f3\fY\u00f4\u00f8T\u00c0\u00c4\u00f3\u00e1\u000b\u001c\u00d6\u00d9\u0013\u00cf\u00dd\u00f2\u00e6)\u00b0u\u0012q\u00e4p\u00964A$;;\u0018!\f*<\u0096M\r\u00e7D\u00852\u009e\u00f1F\u0002\u8f51\u63f8\u000e\u00f71\u00e7\u001a\u00cam5\u00ed\u00d2\u0095\u00a4\u00eb\u0004\u00cd\u000b\u00d6#\t\u00ae\u00fe\u009b>\n\u00f3c\u0088".length();
                        var9_4 = 22;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 117;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block33;
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
                            var10_2 = "\u00c4\u0097\u00eb\u0098\u0002\u00fd\u0002e\u00b7M\u00ab\u0018fz\u0011\u00d9\u00c3\u0090\u0085\u00c5|H,pd>*T\u00b4\u0094\u00c3\u0005";
                            var12_3 = "\u00c4\u0097\u00eb\u0098\u0002\u00fd\u0002e\u00b7M\u00ab\u0018fz\u0011\u00d9\u00c3\u0090\u0085\u00c5|H,pd>*T\u00b4\u0094\u00c3\u0005".length();
                            var9_4 = 14;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 81;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block33;
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
                            break block34;
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
                                    v15 = 11;
                                    break;
                                }
                                case 2: {
                                    v15 = 62;
                                    break;
                                }
                                case 3: {
                                    v15 = 64;
                                    break;
                                }
                                case 4: {
                                    v15 = 67;
                                    break;
                                }
                                case 5: {
                                    v15 = 71;
                                    break;
                                }
                                default: {
                                    v15 = 5;
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
                na_0.a = var13;
                na_0.b = new String[14];
                var0_7 = 3628691881662373830L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00db`\u001d\u00f0\u00c5-I\u00a1\u00ac5T\u0084\u00cb+\u00b5\u00ac\u0082\b\"\u0015\u008dVj[";
                var5_11 = "\u00db`\u001d\u00f0\u00c5-I\u00a1\u00ac5T\u0084\u00cb+\u00b5\u00ac\u0082\b\"\u0015\u008dVj[".length();
                var2_12 = 0;
                while (true) {
                    break block35;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block36;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        na_0.c = var6_8;
        na_0.f = new Integer[3];
        na_0.F = BorderFactory.createEmptyBorder(2, 1, 2, 1);
        try {
            v18 = yt_1.i();
        }
        catch (InvocationTargetException v19) {
            throw v19.getTargetException();
        }
        try {
            v20 = v18.x();
        }
        catch (InvocationTargetException v21) {
            throw v21.getTargetException();
        }
        na_0.y = v20;
        try {
            v22 = na_0.y.P(na_0.a(4106, -16413));
        }
        catch (InvocationTargetException v23) {
            throw v23.getTargetException();
        }
        na_0.J = v22;
        try {
            v24 = na_0.y.P(na_0.a(4110, -19276));
        }
        catch (InvocationTargetException v25) {
            throw v25.getTargetException();
        }
        na_0.l = v24;
        try {
            v26 = na_0.y.P(na_0.a(4109, -21911));
        }
        catch (InvocationTargetException v27) {
            throw v27.getTargetException();
        }
        na_0.C = v26;
        try {
            v28 = na_0.y.P(na_0.a(4103, 30273));
        }
        catch (InvocationTargetException v29) {
            throw v29.getTargetException();
        }
        na_0.w = v28;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x100A) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 73;
                    break;
                }
                case 1: {
                    n14 = 129;
                    break;
                }
                case 2: {
                    n14 = 190;
                    break;
                }
                case 3: {
                    n14 = 149;
                    break;
                }
                case 4: {
                    n14 = 140;
                    break;
                }
                case 5: {
                    n14 = 104;
                    break;
                }
                case 6: {
                    n14 = 98;
                    break;
                }
                case 7: {
                    n14 = 4;
                    break;
                }
                case 8: {
                    n14 = 1;
                    break;
                }
                case 9: {
                    n14 = 85;
                    break;
                }
                case 10: {
                    n14 = 23;
                    break;
                }
                case 11: {
                    n14 = 55;
                    break;
                }
                case 12: {
                    n14 = 186;
                    break;
                }
                case 13: {
                    n14 = 79;
                    break;
                }
                case 14: {
                    n14 = 124;
                    break;
                }
                case 15: {
                    n14 = 175;
                    break;
                }
                case 16: {
                    n14 = 84;
                    break;
                }
                case 17: {
                    n14 = 35;
                    break;
                }
                case 18: {
                    n14 = 91;
                    break;
                }
                case 19: {
                    n14 = 226;
                    break;
                }
                case 20: {
                    n14 = 136;
                    break;
                }
                case 21: {
                    n14 = 133;
                    break;
                }
                case 22: {
                    n14 = 197;
                    break;
                }
                case 23: {
                    n14 = 234;
                    break;
                }
                case 24: {
                    n14 = 134;
                    break;
                }
                case 25: {
                    n14 = 223;
                    break;
                }
                case 26: {
                    n14 = 69;
                    break;
                }
                case 27: {
                    n14 = 18;
                    break;
                }
                case 28: {
                    n14 = 132;
                    break;
                }
                case 29: {
                    n14 = 80;
                    break;
                }
                case 30: {
                    n14 = 13;
                    break;
                }
                case 31: {
                    n14 = 221;
                    break;
                }
                case 32: {
                    n14 = 76;
                    break;
                }
                case 33: {
                    n14 = 245;
                    break;
                }
                case 34: {
                    n14 = 166;
                    break;
                }
                case 35: {
                    n14 = 116;
                    break;
                }
                case 36: {
                    n14 = 28;
                    break;
                }
                case 37: {
                    n14 = 165;
                    break;
                }
                case 38: {
                    n14 = 53;
                    break;
                }
                case 39: {
                    n14 = 163;
                    break;
                }
                case 40: {
                    n14 = 239;
                    break;
                }
                case 41: {
                    n14 = 243;
                    break;
                }
                case 42: {
                    n14 = 205;
                    break;
                }
                case 43: {
                    n14 = 36;
                    break;
                }
                case 44: {
                    n14 = 3;
                    break;
                }
                case 45: {
                    n14 = 168;
                    break;
                }
                case 46: {
                    n14 = 57;
                    break;
                }
                case 47: {
                    n14 = 252;
                    break;
                }
                case 48: {
                    n14 = 139;
                    break;
                }
                case 49: {
                    n14 = 33;
                    break;
                }
                case 50: {
                    n14 = 143;
                    break;
                }
                case 51: {
                    n14 = 48;
                    break;
                }
                case 52: {
                    n14 = 179;
                    break;
                }
                case 53: {
                    n14 = 110;
                    break;
                }
                case 54: {
                    n14 = 19;
                    break;
                }
                case 55: {
                    n14 = 177;
                    break;
                }
                case 56: {
                    n14 = 218;
                    break;
                }
                case 57: {
                    n14 = 38;
                    break;
                }
                case 58: {
                    n14 = 247;
                    break;
                }
                case 59: {
                    n14 = 101;
                    break;
                }
                case 60: {
                    n14 = 141;
                    break;
                }
                case 61: {
                    n14 = 246;
                    break;
                }
                case 62: {
                    n14 = 103;
                    break;
                }
                case 63: {
                    n14 = 21;
                    break;
                }
                case 64: {
                    n14 = 224;
                    break;
                }
                case 65: {
                    n14 = 29;
                    break;
                }
                case 66: {
                    n14 = 194;
                    break;
                }
                case 67: {
                    n14 = 207;
                    break;
                }
                case 68: {
                    n14 = 87;
                    break;
                }
                case 69: {
                    n14 = 120;
                    break;
                }
                case 70: {
                    n14 = 160;
                    break;
                }
                case 71: {
                    n14 = 20;
                    break;
                }
                case 72: {
                    n14 = 182;
                    break;
                }
                case 73: {
                    n14 = 15;
                    break;
                }
                case 74: {
                    n14 = 137;
                    break;
                }
                case 75: {
                    n14 = 61;
                    break;
                }
                case 76: {
                    n14 = 176;
                    break;
                }
                case 77: {
                    n14 = 112;
                    break;
                }
                case 78: {
                    n14 = 231;
                    break;
                }
                case 79: {
                    n14 = 93;
                    break;
                }
                case 80: {
                    n14 = 253;
                    break;
                }
                case 81: {
                    n14 = 41;
                    break;
                }
                case 82: {
                    n14 = 119;
                    break;
                }
                case 83: {
                    n14 = 122;
                    break;
                }
                case 84: {
                    n14 = 146;
                    break;
                }
                case 85: {
                    n14 = 77;
                    break;
                }
                case 86: {
                    n14 = 131;
                    break;
                }
                case 87: {
                    n14 = 156;
                    break;
                }
                case 88: {
                    n14 = 164;
                    break;
                }
                case 89: {
                    n14 = 152;
                    break;
                }
                case 90: {
                    n14 = 159;
                    break;
                }
                case 91: {
                    n14 = 59;
                    break;
                }
                case 92: {
                    n14 = 9;
                    break;
                }
                case 93: {
                    n14 = 216;
                    break;
                }
                case 94: {
                    n14 = 255;
                    break;
                }
                case 95: {
                    n14 = 25;
                    break;
                }
                case 96: {
                    n14 = 153;
                    break;
                }
                case 97: {
                    n14 = 114;
                    break;
                }
                case 98: {
                    n14 = 170;
                    break;
                }
                case 99: {
                    n14 = 92;
                    break;
                }
                case 100: {
                    n14 = 45;
                    break;
                }
                case 101: {
                    n14 = 138;
                    break;
                }
                case 102: {
                    n14 = 2;
                    break;
                }
                case 103: {
                    n14 = 40;
                    break;
                }
                case 104: {
                    n14 = 230;
                    break;
                }
                case 105: {
                    n14 = 105;
                    break;
                }
                case 106: {
                    n14 = 173;
                    break;
                }
                case 107: {
                    n14 = 195;
                    break;
                }
                case 108: {
                    n14 = 10;
                    break;
                }
                case 109: {
                    n14 = 68;
                    break;
                }
                case 110: {
                    n14 = 235;
                    break;
                }
                case 111: {
                    n14 = 248;
                    break;
                }
                case 112: {
                    n14 = 121;
                    break;
                }
                case 113: {
                    n14 = 237;
                    break;
                }
                case 114: {
                    n14 = 83;
                    break;
                }
                case 115: {
                    n14 = 70;
                    break;
                }
                case 116: {
                    n14 = 161;
                    break;
                }
                case 117: {
                    n14 = 51;
                    break;
                }
                case 118: {
                    n14 = 97;
                    break;
                }
                case 119: {
                    n14 = 88;
                    break;
                }
                case 120: {
                    n14 = 115;
                    break;
                }
                case 121: {
                    n14 = 227;
                    break;
                }
                case 122: {
                    n14 = 187;
                    break;
                }
                case 123: {
                    n14 = 204;
                    break;
                }
                case 124: {
                    n14 = 24;
                    break;
                }
                case 125: {
                    n14 = 50;
                    break;
                }
                case 126: {
                    n14 = 185;
                    break;
                }
                case 127: {
                    n14 = 54;
                    break;
                }
                case 128: {
                    n14 = 58;
                    break;
                }
                case 129: {
                    n14 = 145;
                    break;
                }
                case 130: {
                    n14 = 75;
                    break;
                }
                case 131: {
                    n14 = 225;
                    break;
                }
                case 132: {
                    n14 = 181;
                    break;
                }
                case 133: {
                    n14 = 178;
                    break;
                }
                case 134: {
                    n14 = 202;
                    break;
                }
                case 135: {
                    n14 = 191;
                    break;
                }
                case 136: {
                    n14 = 67;
                    break;
                }
                case 137: {
                    n14 = 56;
                    break;
                }
                case 138: {
                    n14 = 94;
                    break;
                }
                case 139: {
                    n14 = 8;
                    break;
                }
                case 140: {
                    n14 = 169;
                    break;
                }
                case 141: {
                    n14 = 211;
                    break;
                }
                case 142: {
                    n14 = 206;
                    break;
                }
                case 143: {
                    n14 = 193;
                    break;
                }
                case 144: {
                    n14 = 171;
                    break;
                }
                case 145: {
                    n14 = 100;
                    break;
                }
                case 146: {
                    n14 = 189;
                    break;
                }
                case 147: {
                    n14 = 167;
                    break;
                }
                case 148: {
                    n14 = 151;
                    break;
                }
                case 149: {
                    n14 = 210;
                    break;
                }
                case 150: {
                    n14 = 148;
                    break;
                }
                case 151: {
                    n14 = 127;
                    break;
                }
                case 152: {
                    n14 = 196;
                    break;
                }
                case 153: {
                    n14 = 203;
                    break;
                }
                case 154: {
                    n14 = 174;
                    break;
                }
                case 155: {
                    n14 = 128;
                    break;
                }
                case 156: {
                    n14 = 81;
                    break;
                }
                case 157: {
                    n14 = 123;
                    break;
                }
                case 158: {
                    n14 = 157;
                    break;
                }
                case 159: {
                    n14 = 254;
                    break;
                }
                case 160: {
                    n14 = 34;
                    break;
                }
                case 161: {
                    n14 = 74;
                    break;
                }
                case 162: {
                    n14 = 5;
                    break;
                }
                case 163: {
                    n14 = 63;
                    break;
                }
                case 164: {
                    n14 = 109;
                    break;
                }
                case 165: {
                    n14 = 244;
                    break;
                }
                case 166: {
                    n14 = 126;
                    break;
                }
                case 167: {
                    n14 = 183;
                    break;
                }
                case 168: {
                    n14 = 17;
                    break;
                }
                case 169: {
                    n14 = 22;
                    break;
                }
                case 170: {
                    n14 = 90;
                    break;
                }
                case 171: {
                    n14 = 49;
                    break;
                }
                case 172: {
                    n14 = 241;
                    break;
                }
                case 173: {
                    n14 = 198;
                    break;
                }
                case 174: {
                    n14 = 219;
                    break;
                }
                case 175: {
                    n14 = 6;
                    break;
                }
                case 176: {
                    n14 = 208;
                    break;
                }
                case 177: {
                    n14 = 251;
                    break;
                }
                case 178: {
                    n14 = 86;
                    break;
                }
                case 179: {
                    n14 = 180;
                    break;
                }
                case 180: {
                    n14 = 52;
                    break;
                }
                case 181: {
                    n14 = 27;
                    break;
                }
                case 182: {
                    n14 = 150;
                    break;
                }
                case 183: {
                    n14 = 71;
                    break;
                }
                case 184: {
                    n14 = 82;
                    break;
                }
                case 185: {
                    n14 = 62;
                    break;
                }
                case 186: {
                    n14 = 228;
                    break;
                }
                case 187: {
                    n14 = 238;
                    break;
                }
                case 188: {
                    n14 = 43;
                    break;
                }
                case 189: {
                    n14 = 108;
                    break;
                }
                case 190: {
                    n14 = 89;
                    break;
                }
                case 191: {
                    n14 = 158;
                    break;
                }
                case 192: {
                    n14 = 242;
                    break;
                }
                case 193: {
                    n14 = 65;
                    break;
                }
                case 194: {
                    n14 = 201;
                    break;
                }
                case 195: {
                    n14 = 250;
                    break;
                }
                case 196: {
                    n14 = 99;
                    break;
                }
                case 197: {
                    n14 = 188;
                    break;
                }
                case 198: {
                    n14 = 39;
                    break;
                }
                case 199: {
                    n14 = 214;
                    break;
                }
                case 200: {
                    n14 = 147;
                    break;
                }
                case 201: {
                    n14 = 249;
                    break;
                }
                case 202: {
                    n14 = 78;
                    break;
                }
                case 203: {
                    n14 = 46;
                    break;
                }
                case 204: {
                    n14 = 32;
                    break;
                }
                case 205: {
                    n14 = 192;
                    break;
                }
                case 206: {
                    n14 = 47;
                    break;
                }
                case 207: {
                    n14 = 232;
                    break;
                }
                case 208: {
                    n14 = 106;
                    break;
                }
                case 209: {
                    n14 = 135;
                    break;
                }
                case 210: {
                    n14 = 118;
                    break;
                }
                case 211: {
                    n14 = 113;
                    break;
                }
                case 212: {
                    n14 = 155;
                    break;
                }
                case 213: {
                    n14 = 184;
                    break;
                }
                case 214: {
                    n14 = 130;
                    break;
                }
                case 215: {
                    n14 = 117;
                    break;
                }
                case 216: {
                    n14 = 60;
                    break;
                }
                case 217: {
                    n14 = 215;
                    break;
                }
                case 218: {
                    n14 = 229;
                    break;
                }
                case 219: {
                    n14 = 233;
                    break;
                }
                case 220: {
                    n14 = 154;
                    break;
                }
                case 221: {
                    n14 = 0;
                    break;
                }
                case 222: {
                    n14 = 31;
                    break;
                }
                case 223: {
                    n14 = 240;
                    break;
                }
                case 224: {
                    n14 = 26;
                    break;
                }
                case 225: {
                    n14 = 172;
                    break;
                }
                case 226: {
                    n14 = 96;
                    break;
                }
                case 227: {
                    n14 = 217;
                    break;
                }
                case 228: {
                    n14 = 220;
                    break;
                }
                case 229: {
                    n14 = 7;
                    break;
                }
                case 230: {
                    n14 = 200;
                    break;
                }
                case 231: {
                    n14 = 11;
                    break;
                }
                case 232: {
                    n14 = 37;
                    break;
                }
                case 233: {
                    n14 = 44;
                    break;
                }
                case 234: {
                    n14 = 142;
                    break;
                }
                case 235: {
                    n14 = 212;
                    break;
                }
                case 236: {
                    n14 = 125;
                    break;
                }
                case 237: {
                    n14 = 95;
                    break;
                }
                case 238: {
                    n14 = 14;
                    break;
                }
                case 239: {
                    n14 = 107;
                    break;
                }
                case 240: {
                    n14 = 162;
                    break;
                }
                case 241: {
                    n14 = 199;
                    break;
                }
                case 242: {
                    n14 = 222;
                    break;
                }
                case 243: {
                    n14 = 12;
                    break;
                }
                case 244: {
                    n14 = 72;
                    break;
                }
                case 245: {
                    n14 = 111;
                    break;
                }
                case 246: {
                    n14 = 102;
                    break;
                }
                case 247: {
                    n14 = 144;
                    break;
                }
                case 248: {
                    n14 = 209;
                    break;
                }
                case 249: {
                    n14 = 16;
                    break;
                }
                case 250: {
                    n14 = 30;
                    break;
                }
                case 251: {
                    n14 = 236;
                    break;
                }
                case 252: {
                    n14 = 66;
                    break;
                }
                case 253: {
                    n14 = 64;
                    break;
                }
                case 254: {
                    n14 = 213;
                    break;
                }
                default: {
                    n14 = 42;
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
            na_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1DB1;
        if (f[n11] == null) {
            na_0.f[n11] = (int)(c[n11] ^ l2);
        }
        return f[n11];
    }
}

