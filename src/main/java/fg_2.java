/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from fg
 */
public class fg_2
extends JPanel
implements TableCellRenderer {
    JLabel I;
    Color U;
    boolean x;
    boolean u;
    int j;
    String Q;
    ArrayList b;
    private static final String[] a;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    public fg_2() {
        this.U = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        this.x = false;
        this.u = false;
        this.j = -1;
        this.Q = null;
        this.setOpaque(true);
        this.setLayout(new MigLayout("align left,insets 0 0 0 0", "0[]0", "0[]0"));
        this.setBorder(null);
        this.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        this.I = new JLabel();
        ((JLabel)this.I).setBorder(null);
        ((JLabel)this.I).setOpaque(false);
        ((JLabel)this.I).setHorizontalAlignment(2);
        this.add((Component)((JLabel)this.I), "");
        this.b = null;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean n10, boolean bl, int n11, int n12) {
        block91: {
            block90: {
                boolean bl2;
                L1 l1;
                String[] stringArray;
                block89: {
                    L1 l12;
                    block78: {
                        block79: {
                            Icon icon;
                            block88: {
                                fg_2 fg_22;
                                block87: {
                                    block86: {
                                        boolean bl3;
                                        Object object2;
                                        Object object3;
                                        int n13;
                                        block85: {
                                            int n14;
                                            block62: {
                                                block84: {
                                                    block80: {
                                                        String string;
                                                        fg_2 fg_23;
                                                        block81: {
                                                            block82: {
                                                                int n15;
                                                                int n16;
                                                                Object object4;
                                                                block83: {
                                                                    block76: {
                                                                        int n17;
                                                                        block77: {
                                                                            int n18;
                                                                            Point point;
                                                                            block61: {
                                                                                block75: {
                                                                                    int n19;
                                                                                    block74: {
                                                                                        block66: {
                                                                                            fg_2 fg_24;
                                                                                            block67: {
                                                                                                block68: {
                                                                                                    String string2;
                                                                                                    int n20;
                                                                                                    block65: {
                                                                                                        block64: {
                                                                                                            Point point2;
                                                                                                            block63: {
                                                                                                                l12 = (L1)object;
                                                                                                                Object var9_8 = null;
                                                                                                                Object var10_9 = null;
                                                                                                                stringArray = FK.i();
                                                                                                                Point point3 = jTable.getMousePosition();
                                                                                                                n19 = -1;
                                                                                                                point = MouseInfo.getPointerInfo().getLocation();
                                                                                                                SwingUtilities.convertPointFromScreen(point, jTable);
                                                                                                                point2 = point;
                                                                                                                if (stringArray != null) break block63;
                                                                                                                if (point2 == null) break block64;
                                                                                                                point2 = new Point(3, point.y);
                                                                                                            }
                                                                                                            object4 = point2;
                                                                                                            n19 = jTable.rowAtPoint((Point)object4);
                                                                                                        }
                                                                                                        n20 = n10;
                                                                                                        if (stringArray != null) break block65;
                                                                                                        if (n20 == 0) break block66;
                                                                                                        this.setBackground(new Color(0.8f, 0.8f, 0.8f, 1.0f));
                                                                                                        fg_24 = this;
                                                                                                        if (stringArray != null) break block67;
                                                                                                        n20 = fg_24.u ? 1 : 0;
                                                                                                    }
                                                                                                    if (n20 == 0 || n10 == 0) break block68;
                                                                                                    try {
                                                                                                        string2 = (String)l12.A();
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    object4 = string2.trim();
                                                                                                    this.b = new ArrayList();
                                                                                                    char[] cArray = ((String)object4).toCharArray();
                                                                                                    Object object5 = new StringBuffer();
                                                                                                    int n21 = 1;
                                                                                                    n16 = 0;
                                                                                                    char[] cArray2 = cArray;
                                                                                                    int n22 = cArray2.length;
                                                                                                    int n23 = 0;
                                                                                                    while (n23 < n22) {
                                                                                                        boolean bl4;
                                                                                                        int n24;
                                                                                                        block73: {
                                                                                                            int n25;
                                                                                                            block72: {
                                                                                                                block71: {
                                                                                                                    int n26;
                                                                                                                    block69: {
                                                                                                                        block70: {
                                                                                                                            n25 = cArray2[n23];
                                                                                                                            n24 = 0;
                                                                                                                            n26 = n25;
                                                                                                                            if (stringArray != null) break block69;
                                                                                                                            n18 = fg_2.a(26769, 8075255855381267327L);
                                                                                                                            if (stringArray != null) break block61;
                                                                                                                            if (n26 == n18) break block70;
                                                                                                                            n24 = 1;
                                                                                                                            if (stringArray == null) break block71;
                                                                                                                        }
                                                                                                                        n26 = 0;
                                                                                                                    }
                                                                                                                    n24 = n26;
                                                                                                                }
                                                                                                                bl4 = false;
                                                                                                                int n27 = n21;
                                                                                                                int n28 = n24;
                                                                                                                if (stringArray == null) {
                                                                                                                    if (n27 != n28) {
                                                                                                                        bl4 = true;
                                                                                                                        ((ArrayList)this.b).add(object5);
                                                                                                                        object5 = new StringBuffer();
                                                                                                                    }
                                                                                                                    n27 = n25;
                                                                                                                    n28 = fg_2.a(14762, 8854418964381307463L);
                                                                                                                }
                                                                                                                if (n27 != n28) break block72;
                                                                                                                ((StringBuffer)object5).append("&nbsp;");
                                                                                                                if (stringArray == null) break block73;
                                                                                                            }
                                                                                                            ((StringBuffer)object5).append((char)n25);
                                                                                                        }
                                                                                                        n21 = n24;
                                                                                                        ++n16;
                                                                                                        if (stringArray == null) {
                                                                                                            if (n16 == cArray.length) {
                                                                                                                if (!bl4) {
                                                                                                                    // empty if block
                                                                                                                }
                                                                                                                ((ArrayList)this.b).add(object5);
                                                                                                            }
                                                                                                            ++n23;
                                                                                                        }
                                                                                                        if (stringArray == null) continue;
                                                                                                    }
                                                                                                    if (stringArray == null) break block74;
                                                                                                }
                                                                                                fg_24 = this;
                                                                                            }
                                                                                            fg_24.b = null;
                                                                                            if (stringArray == null) break block74;
                                                                                        }
                                                                                        this.setBackground(new Color(0.97f, 0.97f, 0.97f, 1.0f));
                                                                                        ((JLabel)this.I).setForeground(new Color(1.0f, 1.0f, 1.0f, 1.0f));
                                                                                    }
                                                                                    n17 = n10;
                                                                                    if (stringArray != null) break block75;
                                                                                    if (n17 != 0) break block76;
                                                                                    n17 = n19;
                                                                                }
                                                                                if (stringArray != null) break block77;
                                                                                n18 = n11;
                                                                            }
                                                                            if (n17 != n18) break block76;
                                                                            n17 = point.y;
                                                                        }
                                                                        if (n17 > 0) {
                                                                            this.setBackground(new Color(0.9f, 0.9f, 0.9f, 1.0f));
                                                                        }
                                                                    }
                                                                    l1 = l12;
                                                                    if (stringArray != null) break block78;
                                                                    if (l1 == null) break block79;
                                                                    object4 = new StringBuffer();
                                                                    if (n12 != 0) break block80;
                                                                    fg_23 = this;
                                                                    if (stringArray != null) break block81;
                                                                    if ((ArrayList)fg_23.b == null) break block82;
                                                                    n15 = n10;
                                                                    if (stringArray != null) break block83;
                                                                    if (n15 == 0) break block82;
                                                                    ((StringBuffer)object4).append("<html><body>");
                                                                    n15 = 0;
                                                                }
                                                                int n29 = n15;
                                                                for (StringBuffer stringBuffer : (ArrayList)this.b) {
                                                                    int n30 = this.j;
                                                                    if (stringArray == null) {
                                                                        n14 = n29;
                                                                        if (stringArray != null) break block62;
                                                                        n30 = n30 == n14 ? 1 : 0;
                                                                    }
                                                                    int n31 = n16 = n30;
                                                                    if (stringArray == null) {
                                                                        if (n31 != 0) {
                                                                            ((StringBuffer)object4).append("<font color=red>");
                                                                        }
                                                                        ((StringBuffer)object4).append(stringBuffer);
                                                                        n31 = n16;
                                                                    }
                                                                    if (stringArray == null) {
                                                                        if (n31 != 0) {
                                                                            ((StringBuffer)object4).append("</font>");
                                                                        }
                                                                        n31 = stringBuffer.toString().startsWith("&nbsp;") ? 1 : 0;
                                                                    }
                                                                    if (n31 == 0) {
                                                                        ++n29;
                                                                    }
                                                                    if (stringArray == null) continue;
                                                                }
                                                                ((StringBuffer)object4).append("</body></html>");
                                                                ((JLabel)this.I).setText(((StringBuffer)object4).toString());
                                                                if (stringArray == null) break block84;
                                                            }
                                                            fg_23 = this;
                                                        }
                                                        try {
                                                            string = (String)l12.A();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        ((JLabel)fg_23.I).setText(string);
                                                        if (stringArray == null) break block84;
                                                    }
                                                    ((JLabel)this.I).setText("");
                                                }
                                                n13 = jTable.getRowCount() - n11;
                                                if (stringArray != null) break block85;
                                                n14 = TI.K;
                                            }
                                            if (n13 <= n14) break block86;
                                            fg_22 = this;
                                            if (stringArray != null) break block87;
                                            n13 = fg_22.x ? 1 : 0;
                                        }
                                        if (n13 == 0) break block86;
                                        try {
                                            object3 = yt_1.i();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            object2 = object3.P();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            bl3 = (Boolean)object2.v();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (bl3) break block86;
                                        ((JLabel)this.I).setEnabled(false);
                                        if (stringArray == null) break block88;
                                    }
                                    fg_22 = this;
                                }
                                ((JLabel)fg_22.I).setEnabled(true);
                            }
                            try {
                                icon = (Icon)l12.b();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            Icon icon2 = icon;
                            ((JLabel)this.I).setIcon(icon2);
                            ((JLabel)this.I).setMinimumSize(new Dimension(fg_2.a(29360, 6594772236769614172L), ((JLabel)com.c.c((long)442347690627635916L).get((Object)this)).getPreferredSize().height));
                        }
                        l1 = l12;
                    }
                    if (stringArray != null) break block89;
                    if (l1 == null) break block90;
                    l1 = l12;
                }
                try {
                    bl2 = (Boolean)l1.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!bl2) break block90;
                ((JLabel)this.I).setForeground(new Color(0.7f, 0.0f, 0.0f, 1.0f));
                if (stringArray == null) break block91;
            }
            ((JLabel)this.I).setForeground(new Color(0.0f, 0.0f, 0.0f, 0.9f));
        }
        return this;
    }

    public void q() {
        this.j = -1;
    }

    public int r() {
        return this.j;
    }

    public void j() {
        block8: {
            int n10;
            int n11;
            int n12;
            block12: {
                String[] stringArray;
                block11: {
                    fg_2 fg_22;
                    block9: {
                        block10: {
                            ArrayList arrayList;
                            block7: {
                                String[] stringArray2 = FK.i();
                                this.Q = null;
                                stringArray = stringArray2;
                                arrayList = (ArrayList)this.b;
                                if (stringArray != null) break block7;
                                if (arrayList == null) break block8;
                                arrayList = (ArrayList)this.b;
                            }
                            int n13 = (arrayList.size() + 1) / 2;
                            fg_22 = this;
                            if (stringArray != null) break block9;
                            if (fg_22.j != -1) break block10;
                            this.j = n13 - 1;
                            if (stringArray == null) break block11;
                        }
                        fg_22 = this;
                    }
                    fg_22.j = fg_22.j - 1;
                }
                n11 = n12 = this.j * 2;
                n10 = -1;
                if (stringArray != null) break block12;
                if (n11 <= n10) break block8;
                n11 = n12;
                n10 = ((ArrayList)this.b).size();
            }
            if (n11 < n10) {
                this.Q = ((StringBuffer)((ArrayList)this.b).get(n12)).toString();
            }
        }
    }

    public void x() {
        block7: {
            int n10;
            int n11;
            int n12;
            block8: {
                ArrayList arrayList;
                String[] stringArray;
                block6: {
                    stringArray = FK.i();
                    arrayList = (ArrayList)this.b;
                    if (stringArray != null) break block6;
                    if (arrayList == null) break block7;
                    fg_2 fg_22 = this;
                    fg_22.j = fg_22.j + 1;
                    arrayList = (ArrayList)this.b;
                }
                int n13 = (arrayList.size() + 1) / 2;
                int n14 = this.j;
                int n15 = n13;
                if (stringArray == null) {
                    if (n14 > n15) {
                        this.j = 0;
                    }
                    n14 = this.j;
                    n15 = 2;
                }
                n11 = n12 = n14 * n15;
                n10 = -1;
                if (stringArray != null) break block8;
                if (n11 <= n10) break block7;
                n11 = n12;
                n10 = ((ArrayList)this.b).size();
            }
            if (n11 < n10) {
                this.Q = ((StringBuffer)((ArrayList)this.b).get(n12)).toString();
            }
        }
    }

    public boolean K() {
        return this.x;
    }

    public void h(boolean bl) {
        this.x = bl;
    }

    public boolean G() {
        return this.u;
    }

    public void e(boolean bl) {
        this.u = bl;
    }

    public String H() {
        return (String)this.Q;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "\u0086\u00dfa\u00fe\u00f7\u00d1\u009d\u0096KZ;\u00d9\u00a4>+\u00ab\u0007\u0087\u00ecH\u00f9\u00e0D{\u0004\u00cd\u00b1\u00b7\u00f7\f\u00bf\u008a]\u0098\u0010`%p\u00eb!G\u00df\u0006\u00155G\u00b7\u009b]\u0019\u0089\u00f6p\u0099\t\u0015\u0014\u0004\u009eX\u0094\u00b5\u00d8{:\u009d\u0098\u00a8\u0013\u009c\u009epNo\u000e\u000e\u0095\u0083\u000e\u0014\u00a6\u00f4\u00f8\u0013R\u00d45\u00bf\u00bd\u00f3";
                        var12_3 = "\u0086\u00dfa\u00fe\u00f7\u00d1\u009d\u0096KZ;\u00d9\u00a4>+\u00ab\u0007\u0087\u00ecH\u00f9\u00e0D{\u0004\u00cd\u00b1\u00b7\u00f7\f\u00bf\u008a]\u0098\u0010`%p\u00eb!G\u00df\u0006\u00155G\u00b7\u009b]\u0019\u0089\u00f6p\u0099\t\u0015\u0014\u0004\u009eX\u0094\u00b5\u00d8{:\u009d\u0098\u00a8\u0013\u009c\u009epNo\u000e\u000e\u0095\u0083\u000e\u0014\u00a6\u00f4\u00f8\u0013R\u00d45\u00bf\u00bd\u00f3".length();
                        var9_4 = 16;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 54;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
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
                            var10_2 = "\u00c0)\u0010\u00d9\u009c}\u0004<:dk";
                            var12_3 = "\u00c0)\u0010\u00d9\u009c}\u0004<:dk".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 115;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 93;
                                    break;
                                }
                                case 1: {
                                    v15 = 66;
                                    break;
                                }
                                case 2: {
                                    v15 = 62;
                                    break;
                                }
                                case 3: {
                                    v15 = 121;
                                    break;
                                }
                                case 4: {
                                    v15 = 26;
                                    break;
                                }
                                case 5: {
                                    v15 = 82;
                                    break;
                                }
                                default: {
                                    v15 = 73;
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
                fg_2.a = var13;
                fg_2.c = new String[9];
                var0_7 = 5396316259461862845L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "?\u008a$\u00b7\u00af\u00a1K1\u00fe\u00c5\u00f9\u0086\u00a4\u008d\u0087\u00da\u00a3\u00cd\u008cov\u0087V\u00e2";
                var5_11 = "?\u008a$\u00b7\u00af\u00a1K1\u00fe\u00c5\u00f9\u0086\u00a4\u008d\u0087\u00da\u00a3\u00cd\u008cov\u0087V\u00e2".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        fg_2.d = var6_8;
        fg_2.e = new Integer[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4B75) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 204;
                    break;
                }
                case 1: {
                    n14 = 154;
                    break;
                }
                case 2: {
                    n14 = 149;
                    break;
                }
                case 3: {
                    n14 = 23;
                    break;
                }
                case 4: {
                    n14 = 250;
                    break;
                }
                case 5: {
                    n14 = 151;
                    break;
                }
                case 6: {
                    n14 = 172;
                    break;
                }
                case 7: {
                    n14 = 5;
                    break;
                }
                case 8: {
                    n14 = 78;
                    break;
                }
                case 9: {
                    n14 = 35;
                    break;
                }
                case 10: {
                    n14 = 223;
                    break;
                }
                case 11: {
                    n14 = 241;
                    break;
                }
                case 12: {
                    n14 = 68;
                    break;
                }
                case 13: {
                    n14 = 81;
                    break;
                }
                case 14: {
                    n14 = 216;
                    break;
                }
                case 15: {
                    n14 = 109;
                    break;
                }
                case 16: {
                    n14 = 221;
                    break;
                }
                case 17: {
                    n14 = 32;
                    break;
                }
                case 18: {
                    n14 = 170;
                    break;
                }
                case 19: {
                    n14 = 237;
                    break;
                }
                case 20: {
                    n14 = 190;
                    break;
                }
                case 21: {
                    n14 = 217;
                    break;
                }
                case 22: {
                    n14 = 4;
                    break;
                }
                case 23: {
                    n14 = 243;
                    break;
                }
                case 24: {
                    n14 = 69;
                    break;
                }
                case 25: {
                    n14 = 20;
                    break;
                }
                case 26: {
                    n14 = 49;
                    break;
                }
                case 27: {
                    n14 = 196;
                    break;
                }
                case 28: {
                    n14 = 184;
                    break;
                }
                case 29: {
                    n14 = 177;
                    break;
                }
                case 30: {
                    n14 = 40;
                    break;
                }
                case 31: {
                    n14 = 29;
                    break;
                }
                case 32: {
                    n14 = 208;
                    break;
                }
                case 33: {
                    n14 = 0;
                    break;
                }
                case 34: {
                    n14 = 201;
                    break;
                }
                case 35: {
                    n14 = 218;
                    break;
                }
                case 36: {
                    n14 = 27;
                    break;
                }
                case 37: {
                    n14 = 53;
                    break;
                }
                case 38: {
                    n14 = 86;
                    break;
                }
                case 39: {
                    n14 = 65;
                    break;
                }
                case 40: {
                    n14 = 138;
                    break;
                }
                case 41: {
                    n14 = 160;
                    break;
                }
                case 42: {
                    n14 = 153;
                    break;
                }
                case 43: {
                    n14 = 43;
                    break;
                }
                case 44: {
                    n14 = 194;
                    break;
                }
                case 45: {
                    n14 = 77;
                    break;
                }
                case 46: {
                    n14 = 80;
                    break;
                }
                case 47: {
                    n14 = 134;
                    break;
                }
                case 48: {
                    n14 = 135;
                    break;
                }
                case 49: {
                    n14 = 198;
                    break;
                }
                case 50: {
                    n14 = 127;
                    break;
                }
                case 51: {
                    n14 = 193;
                    break;
                }
                case 52: {
                    n14 = 215;
                    break;
                }
                case 53: {
                    n14 = 233;
                    break;
                }
                case 54: {
                    n14 = 178;
                    break;
                }
                case 55: {
                    n14 = 24;
                    break;
                }
                case 56: {
                    n14 = 166;
                    break;
                }
                case 57: {
                    n14 = 155;
                    break;
                }
                case 58: {
                    n14 = 185;
                    break;
                }
                case 59: {
                    n14 = 111;
                    break;
                }
                case 60: {
                    n14 = 128;
                    break;
                }
                case 61: {
                    n14 = 186;
                    break;
                }
                case 62: {
                    n14 = 26;
                    break;
                }
                case 63: {
                    n14 = 71;
                    break;
                }
                case 64: {
                    n14 = 13;
                    break;
                }
                case 65: {
                    n14 = 168;
                    break;
                }
                case 66: {
                    n14 = 79;
                    break;
                }
                case 67: {
                    n14 = 253;
                    break;
                }
                case 68: {
                    n14 = 157;
                    break;
                }
                case 69: {
                    n14 = 112;
                    break;
                }
                case 70: {
                    n14 = 156;
                    break;
                }
                case 71: {
                    n14 = 147;
                    break;
                }
                case 72: {
                    n14 = 203;
                    break;
                }
                case 73: {
                    n14 = 202;
                    break;
                }
                case 74: {
                    n14 = 25;
                    break;
                }
                case 75: {
                    n14 = 182;
                    break;
                }
                case 76: {
                    n14 = 245;
                    break;
                }
                case 77: {
                    n14 = 7;
                    break;
                }
                case 78: {
                    n14 = 63;
                    break;
                }
                case 79: {
                    n14 = 234;
                    break;
                }
                case 80: {
                    n14 = 192;
                    break;
                }
                case 81: {
                    n14 = 34;
                    break;
                }
                case 82: {
                    n14 = 44;
                    break;
                }
                case 83: {
                    n14 = 101;
                    break;
                }
                case 84: {
                    n14 = 240;
                    break;
                }
                case 85: {
                    n14 = 162;
                    break;
                }
                case 86: {
                    n14 = 214;
                    break;
                }
                case 87: {
                    n14 = 228;
                    break;
                }
                case 88: {
                    n14 = 171;
                    break;
                }
                case 89: {
                    n14 = 36;
                    break;
                }
                case 90: {
                    n14 = 54;
                    break;
                }
                case 91: {
                    n14 = 188;
                    break;
                }
                case 92: {
                    n14 = 197;
                    break;
                }
                case 93: {
                    n14 = 133;
                    break;
                }
                case 94: {
                    n14 = 33;
                    break;
                }
                case 95: {
                    n14 = 115;
                    break;
                }
                case 96: {
                    n14 = 74;
                    break;
                }
                case 97: {
                    n14 = 85;
                    break;
                }
                case 98: {
                    n14 = 100;
                    break;
                }
                case 99: {
                    n14 = 45;
                    break;
                }
                case 100: {
                    n14 = 106;
                    break;
                }
                case 101: {
                    n14 = 12;
                    break;
                }
                case 102: {
                    n14 = 75;
                    break;
                }
                case 103: {
                    n14 = 125;
                    break;
                }
                case 104: {
                    n14 = 50;
                    break;
                }
                case 105: {
                    n14 = 173;
                    break;
                }
                case 106: {
                    n14 = 191;
                    break;
                }
                case 107: {
                    n14 = 42;
                    break;
                }
                case 108: {
                    n14 = 252;
                    break;
                }
                case 109: {
                    n14 = 19;
                    break;
                }
                case 110: {
                    n14 = 62;
                    break;
                }
                case 111: {
                    n14 = 232;
                    break;
                }
                case 112: {
                    n14 = 102;
                    break;
                }
                case 113: {
                    n14 = 46;
                    break;
                }
                case 114: {
                    n14 = 11;
                    break;
                }
                case 115: {
                    n14 = 37;
                    break;
                }
                case 116: {
                    n14 = 2;
                    break;
                }
                case 117: {
                    n14 = 219;
                    break;
                }
                case 118: {
                    n14 = 116;
                    break;
                }
                case 119: {
                    n14 = 136;
                    break;
                }
                case 120: {
                    n14 = 56;
                    break;
                }
                case 121: {
                    n14 = 131;
                    break;
                }
                case 122: {
                    n14 = 91;
                    break;
                }
                case 123: {
                    n14 = 22;
                    break;
                }
                case 124: {
                    n14 = 92;
                    break;
                }
                case 125: {
                    n14 = 88;
                    break;
                }
                case 126: {
                    n14 = 64;
                    break;
                }
                case 127: {
                    n14 = 108;
                    break;
                }
                case 128: {
                    n14 = 229;
                    break;
                }
                case 129: {
                    n14 = 130;
                    break;
                }
                case 130: {
                    n14 = 73;
                    break;
                }
                case 131: {
                    n14 = 6;
                    break;
                }
                case 132: {
                    n14 = 169;
                    break;
                }
                case 133: {
                    n14 = 226;
                    break;
                }
                case 134: {
                    n14 = 144;
                    break;
                }
                case 135: {
                    n14 = 57;
                    break;
                }
                case 136: {
                    n14 = 242;
                    break;
                }
                case 137: {
                    n14 = 137;
                    break;
                }
                case 138: {
                    n14 = 150;
                    break;
                }
                case 139: {
                    n14 = 123;
                    break;
                }
                case 140: {
                    n14 = 9;
                    break;
                }
                case 141: {
                    n14 = 17;
                    break;
                }
                case 142: {
                    n14 = 158;
                    break;
                }
                case 143: {
                    n14 = 180;
                    break;
                }
                case 144: {
                    n14 = 161;
                    break;
                }
                case 145: {
                    n14 = 38;
                    break;
                }
                case 146: {
                    n14 = 8;
                    break;
                }
                case 147: {
                    n14 = 58;
                    break;
                }
                case 148: {
                    n14 = 210;
                    break;
                }
                case 149: {
                    n14 = 183;
                    break;
                }
                case 150: {
                    n14 = 14;
                    break;
                }
                case 151: {
                    n14 = 129;
                    break;
                }
                case 152: {
                    n14 = 126;
                    break;
                }
                case 153: {
                    n14 = 209;
                    break;
                }
                case 154: {
                    n14 = 10;
                    break;
                }
                case 155: {
                    n14 = 238;
                    break;
                }
                case 156: {
                    n14 = 3;
                    break;
                }
                case 157: {
                    n14 = 72;
                    break;
                }
                case 158: {
                    n14 = 143;
                    break;
                }
                case 159: {
                    n14 = 227;
                    break;
                }
                case 160: {
                    n14 = 248;
                    break;
                }
                case 161: {
                    n14 = 255;
                    break;
                }
                case 162: {
                    n14 = 247;
                    break;
                }
                case 163: {
                    n14 = 159;
                    break;
                }
                case 164: {
                    n14 = 1;
                    break;
                }
                case 165: {
                    n14 = 21;
                    break;
                }
                case 166: {
                    n14 = 225;
                    break;
                }
                case 167: {
                    n14 = 239;
                    break;
                }
                case 168: {
                    n14 = 83;
                    break;
                }
                case 169: {
                    n14 = 174;
                    break;
                }
                case 170: {
                    n14 = 87;
                    break;
                }
                case 171: {
                    n14 = 163;
                    break;
                }
                case 172: {
                    n14 = 70;
                    break;
                }
                case 173: {
                    n14 = 236;
                    break;
                }
                case 174: {
                    n14 = 205;
                    break;
                }
                case 175: {
                    n14 = 230;
                    break;
                }
                case 176: {
                    n14 = 105;
                    break;
                }
                case 177: {
                    n14 = 118;
                    break;
                }
                case 178: {
                    n14 = 94;
                    break;
                }
                case 179: {
                    n14 = 121;
                    break;
                }
                case 180: {
                    n14 = 146;
                    break;
                }
                case 181: {
                    n14 = 97;
                    break;
                }
                case 182: {
                    n14 = 200;
                    break;
                }
                case 183: {
                    n14 = 231;
                    break;
                }
                case 184: {
                    n14 = 165;
                    break;
                }
                case 185: {
                    n14 = 212;
                    break;
                }
                case 186: {
                    n14 = 15;
                    break;
                }
                case 187: {
                    n14 = 251;
                    break;
                }
                case 188: {
                    n14 = 249;
                    break;
                }
                case 189: {
                    n14 = 30;
                    break;
                }
                case 190: {
                    n14 = 222;
                    break;
                }
                case 191: {
                    n14 = 207;
                    break;
                }
                case 192: {
                    n14 = 28;
                    break;
                }
                case 193: {
                    n14 = 164;
                    break;
                }
                case 194: {
                    n14 = 89;
                    break;
                }
                case 195: {
                    n14 = 244;
                    break;
                }
                case 196: {
                    n14 = 246;
                    break;
                }
                case 197: {
                    n14 = 124;
                    break;
                }
                case 198: {
                    n14 = 213;
                    break;
                }
                case 199: {
                    n14 = 176;
                    break;
                }
                case 200: {
                    n14 = 140;
                    break;
                }
                case 201: {
                    n14 = 67;
                    break;
                }
                case 202: {
                    n14 = 181;
                    break;
                }
                case 203: {
                    n14 = 220;
                    break;
                }
                case 204: {
                    n14 = 113;
                    break;
                }
                case 205: {
                    n14 = 179;
                    break;
                }
                case 206: {
                    n14 = 235;
                    break;
                }
                case 207: {
                    n14 = 60;
                    break;
                }
                case 208: {
                    n14 = 104;
                    break;
                }
                case 209: {
                    n14 = 254;
                    break;
                }
                case 210: {
                    n14 = 142;
                    break;
                }
                case 211: {
                    n14 = 41;
                    break;
                }
                case 212: {
                    n14 = 52;
                    break;
                }
                case 213: {
                    n14 = 84;
                    break;
                }
                case 214: {
                    n14 = 117;
                    break;
                }
                case 215: {
                    n14 = 59;
                    break;
                }
                case 216: {
                    n14 = 76;
                    break;
                }
                case 217: {
                    n14 = 148;
                    break;
                }
                case 218: {
                    n14 = 152;
                    break;
                }
                case 219: {
                    n14 = 139;
                    break;
                }
                case 220: {
                    n14 = 145;
                    break;
                }
                case 221: {
                    n14 = 132;
                    break;
                }
                case 222: {
                    n14 = 39;
                    break;
                }
                case 223: {
                    n14 = 55;
                    break;
                }
                case 224: {
                    n14 = 122;
                    break;
                }
                case 225: {
                    n14 = 82;
                    break;
                }
                case 226: {
                    n14 = 95;
                    break;
                }
                case 227: {
                    n14 = 187;
                    break;
                }
                case 228: {
                    n14 = 175;
                    break;
                }
                case 229: {
                    n14 = 103;
                    break;
                }
                case 230: {
                    n14 = 189;
                    break;
                }
                case 231: {
                    n14 = 98;
                    break;
                }
                case 232: {
                    n14 = 110;
                    break;
                }
                case 233: {
                    n14 = 199;
                    break;
                }
                case 234: {
                    n14 = 47;
                    break;
                }
                case 235: {
                    n14 = 61;
                    break;
                }
                case 236: {
                    n14 = 90;
                    break;
                }
                case 237: {
                    n14 = 107;
                    break;
                }
                case 238: {
                    n14 = 16;
                    break;
                }
                case 239: {
                    n14 = 206;
                    break;
                }
                case 240: {
                    n14 = 31;
                    break;
                }
                case 241: {
                    n14 = 48;
                    break;
                }
                case 242: {
                    n14 = 211;
                    break;
                }
                case 243: {
                    n14 = 195;
                    break;
                }
                case 244: {
                    n14 = 119;
                    break;
                }
                case 245: {
                    n14 = 120;
                    break;
                }
                case 246: {
                    n14 = 114;
                    break;
                }
                case 247: {
                    n14 = 167;
                    break;
                }
                case 248: {
                    n14 = 141;
                    break;
                }
                case 249: {
                    n14 = 51;
                    break;
                }
                case 250: {
                    n14 = 18;
                    break;
                }
                case 251: {
                    n14 = 99;
                    break;
                }
                case 252: {
                    n14 = 93;
                    break;
                }
                case 253: {
                    n14 = 66;
                    break;
                }
                case 254: {
                    n14 = 224;
                    break;
                }
                default: {
                    n14 = 96;
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
            fg_2.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2BEC;
        if (e[n11] == null) {
            fg_2.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

