/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class JR
extends JTable {
    k4_0 Y;
    int p;
    int B;
    n_0 h;
    Color i;
    Color k;
    String N;
    Color X;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public JR(n_0 n_02) {
        this.p = -1;
        this.B = -1;
        this.i = new Color(JR.a(25089, 7395008992551565110L), JR.a(19226, 1270942700254780985L), JR.a(5995, 8322675085880132167L));
        this.k = new Color(JR.a(16860, 7641780260002682104L), JR.a(32342, 4342733992817060704L), JR.a(11097, 1858316679076757100L));
        this.N = null;
        this.X = new Color(JR.a(19762, 349580683889235997L), JR.a(5087, 8862321516161795834L), JR.a(28206, 3219004516474157829L), JR.a(23550, 5536560008764509910L));
        this.h = n_02;
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setAutoscrolls(false);
        this.setSelectionMode(0);
        this.setCursor(new Cursor(JR.a(24513, 7117678895264910060L)));
        this.addMouseListener(new ya_2(this));
        this.getTableHeader().setDefaultRenderer(new bx_0(this, n_02));
        this.getTableHeader().setPreferredSize(new Dimension(JR.a(5975, 3196386394400588407L), JR.a(11236, 5782915369733439173L)));
        this.getTableHeader().addMouseListener(new bf_2(this, n_02));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setColor((Color)this.X);
        graphics.drawRect(0, -1, this.getWidth() - 1, this.getHeight());
    }

    /*
     * Unable to fully structure code
     */
    public void K(KV var1_1, String var2_2) {
        block16: {
            this.N = var2_2;
            try {
                v0 = (ArrayList)var1_1.K();
            }
            catch (InvocationTargetException v1) {
                throw v1.getTargetException();
            }
            var4_3 = v0;
            var3_4 = ka_1.y();
            var5_5 = ka_1.O;
            try {
                v2 = (ty_0)var1_1.O();
            }
            catch (InvocationTargetException v3) {
                throw v3.getTargetException();
            }
            if (var3_4 == null) {
                if (v2 != null) {
                    try {
                        v2 = (ty_0)var1_1.O();
                    }
                    catch (InvocationTargetException v4) {
                        throw v4.getTargetException();
                    }
                }
            } else {
                try {
                    v5 = (Integer)v2.n();
                }
                catch (InvocationTargetException v6) {
                    throw v6.getTargetException();
                }
                var5_5 = v5;
            }
            var6_6 = new ArrayList<li_1>();
            for (var7_7 = 0; var7_7 < n_0.h; ++var7_7) {
                v7 = var7_7;
                v8 = var4_3.size();
                if (var3_4 == null && var3_4 == null) {
                    if (v7 >= v8) break;
                    var6_6.add((li_1)var4_3.get(var7_7));
                    if (var3_4 == null) continue;
                }
                ** GOTO lbl46
            }
            do {
                v7 = var4_3.size();
                v8 = n_0.h;
lbl46:
                // 2 sources

                if (v7 >= v8) break;
                var4_3.add(null);
                if (var3_4 != null) break block16;
            } while (var3_4 == null);
            try {
                this.Y.r(var6_6);
            }
            catch (InvocationTargetException v9) {
                throw v9.getTargetException();
            }
        }
    }

    JLabel y() {
        JLabel jLabel = new JLabel();
        jLabel.setBorder(BorderFactory.createEmptyBorder(2, 2, 1, 0));
        jLabel.setOpaque(false);
        jLabel.setHorizontalAlignment(2);
        jLabel.setForeground(new Color(JR.a(28856, 185736809000134042L), JR.a(23550, 5536560008764509910L), JR.a(23550, 5536560008764509910L), JR.a(3029, 4684608334202117883L)));
        jLabel.setFont((Font)fx_2.X);
        return jLabel;
    }

    public void n(k4_0 k4_02) {
        boolean bl;
        block9: {
            ky_2[] ky_2Array = ka_1.y();
            this.Y = k4_02;
            ky_2[] ky_2Array2 = ky_2Array;
            super.setModel(k4_02);
            TableColumnModel tableColumnModel = this.getColumnModel();
            this.setPreferredScrollableViewportSize(new Dimension(JR.a(12719, 63017233631814790L), JR.a(31554, 4720521623290277480L)));
            if (ky_2Array2 == null) {
                if (tableColumnModel.getColumnCount() > 2) {
                    int n10;
                    int n11 = JR.a(7844, 3516213051383778178L);
                    cu_1 cu_12 = new cu_1();
                    cu_12.setFont((Font)fx_2.X);
                    cu_12.setText("888888M");
                    int n12 = cu_12.getPreferredSize().width;
                    tableColumnModel.getColumn(0).setPreferredWidth(++n12);
                    tableColumnModel.getColumn(0).setMinWidth(n12);
                    tableColumnModel.getColumn(0).setMaxWidth(n12);
                    try {
                        n10 = (Integer)lk_0.h((Object)"9999%", (Object)cu_12.getFont());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n12 = n10;
                    tableColumnModel.getColumn(1).setPreferredWidth(n12 += 4);
                    tableColumnModel.getColumn(1).setMinWidth(n12);
                    tableColumnModel.getColumn(1).setMaxWidth(n12);
                    tableColumnModel.getColumn(2).setPreferredWidth(JR.a(23550, 5536560008764509910L));
                    tableColumnModel.getColumn(2).setMinWidth(JR.a(23550, 5536560008764509910L));
                    tableColumnModel.getColumn(2).setMaxWidth(JR.a(24623, 8315527868074259720L));
                    lc_0 lc_02 = new lc_0();
                    for (int i2 = 0; i2 < tableColumnModel.getColumnCount(); ++i2) {
                        tableColumnModel.getColumn(i2).setCellRenderer(lc_02);
                        if (ky_2Array2 == null) {
                            if (ky_2Array2 == null) continue;
                        }
                        break block9;
                    }
                }
                this.getTableHeader().addMouseListener(new uu_0(this));
            }
        }
        JTableHeader jTableHeader = this.getTableHeader();
        try {
            bl = (Boolean)vk_0.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (bl) {
            jTableHeader.addMouseListener(new U6(this, jTableHeader));
        }
    }

    public int Z() {
        return this.p;
    }

    public void P(int n10) {
        this.p = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "~\u0015y\u00e8@\u0098\u009a\u0005(\u00be\u0093\u00bd!";
                    var12_3 = "~\u0015y\u00e8@\u0098\u009a\u0005(\u00be\u0093\u00bd!".length();
                    var9_4 = 7;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 25;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 85;
                                    break;
                                }
                                case 1: {
                                    v11 = 81;
                                    break;
                                }
                                case 2: {
                                    v11 = 33;
                                    break;
                                }
                                case 3: {
                                    v11 = 93;
                                    break;
                                }
                                case 4: {
                                    v11 = 118;
                                    break;
                                }
                                case 5: {
                                    v11 = 19;
                                    break;
                                }
                                default: {
                                    v11 = 20;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                JR.a = var13;
                JR.b = new String[2];
                var0_7 = 6076081918226795250L;
                var6_8 = new long[19];
                var3_9 = 0;
                var4_10 = "\u00c2F\"\u00ce2x~\u000e\u00d0\u00cc\u00fe\u0094\u0010G\u0081GN\u008b\u00f8A\n5\f\u009eK\u00a0\u00ebss\u0018^\u00c2W/\u00d9\u00d9\u0018\u009a\u00d4]\u0083\u0015\u0091\u00b9 ?\u00ef.q\u00f4yaQ\u000e\u00b4#\u0013\u00029\u00eay6\u0089q\u008f\u00b3\u001f\u000bI\u009bR\u00b5p\u00055Y]\u00e6\u0094\u00f6,\u0013I\u0087k\u009a@\u0012\r\u0014<\t\u00c0\u00f4\bg\u00d7X\u0092\u00b6\u0094\u00c4\u00f1%W\u0090\u008a<\u0004\u00d1C\u008a\u0087\u0095N7\u00fbO`T4\u00dd\u00fd\u0098\u0092\u001f\u00c4b\u008cE\u00f9\u00b4e\u00cf\u00fd\u009e";
                var5_11 = "\u00c2F\"\u00ce2x~\u000e\u00d0\u00cc\u00fe\u0094\u0010G\u0081GN\u008b\u00f8A\n5\f\u009eK\u00a0\u00ebss\u0018^\u00c2W/\u00d9\u00d9\u0018\u009a\u00d4]\u0083\u0015\u0091\u00b9 ?\u00ef.q\u00f4yaQ\u000e\u00b4#\u0013\u00029\u00eay6\u0089q\u008f\u00b3\u001f\u000bI\u009bR\u00b5p\u00055Y]\u00e6\u0094\u00f6,\u0013I\u0087k\u009a@\u0012\r\u0014<\t\u00c0\u00f4\bg\u00d7X\u0092\u00b6\u0094\u00c4\u00f1%W\u0090\u008a<\u0004\u00d1C\u008a\u0087\u0095N7\u00fbO`T4\u00dd\u00fd\u0098\u0092\u001f\u00c4b\u008cE\u00f9\u00b4e\u00cf\u00fd\u009e".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00a0\u00cb\u0089\u00c7)\u00ca\u00e1\u00f6\u007f\u00c6\"bj\u0098\u00b4\u00ce";
                    var5_11 = "\u00a0\u00cb\u0089\u00c7)\u00ca\u00e1\u00f6\u007f\u00c6\"bj\u0098\u00b4\u00ce".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        JR.c = var6_8;
        JR.d = new Integer[19];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x7BAA) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 149;
                    break;
                }
                case 1: {
                    n14 = 56;
                    break;
                }
                case 2: {
                    n14 = 15;
                    break;
                }
                case 3: {
                    n14 = 171;
                    break;
                }
                case 4: {
                    n14 = 20;
                    break;
                }
                case 5: {
                    n14 = 184;
                    break;
                }
                case 6: {
                    n14 = 133;
                    break;
                }
                case 7: {
                    n14 = 146;
                    break;
                }
                case 8: {
                    n14 = 27;
                    break;
                }
                case 9: {
                    n14 = 150;
                    break;
                }
                case 10: {
                    n14 = 36;
                    break;
                }
                case 11: {
                    n14 = 205;
                    break;
                }
                case 12: {
                    n14 = 231;
                    break;
                }
                case 13: {
                    n14 = 90;
                    break;
                }
                case 14: {
                    n14 = 7;
                    break;
                }
                case 15: {
                    n14 = 159;
                    break;
                }
                case 16: {
                    n14 = 223;
                    break;
                }
                case 17: {
                    n14 = 227;
                    break;
                }
                case 18: {
                    n14 = 25;
                    break;
                }
                case 19: {
                    n14 = 206;
                    break;
                }
                case 20: {
                    n14 = 78;
                    break;
                }
                case 21: {
                    n14 = 226;
                    break;
                }
                case 22: {
                    n14 = 102;
                    break;
                }
                case 23: {
                    n14 = 49;
                    break;
                }
                case 24: {
                    n14 = 12;
                    break;
                }
                case 25: {
                    n14 = 230;
                    break;
                }
                case 26: {
                    n14 = 58;
                    break;
                }
                case 27: {
                    n14 = 100;
                    break;
                }
                case 28: {
                    n14 = 245;
                    break;
                }
                case 29: {
                    n14 = 113;
                    break;
                }
                case 30: {
                    n14 = 2;
                    break;
                }
                case 31: {
                    n14 = 204;
                    break;
                }
                case 32: {
                    n14 = 190;
                    break;
                }
                case 33: {
                    n14 = 175;
                    break;
                }
                case 34: {
                    n14 = 185;
                    break;
                }
                case 35: {
                    n14 = 4;
                    break;
                }
                case 36: {
                    n14 = 188;
                    break;
                }
                case 37: {
                    n14 = 3;
                    break;
                }
                case 38: {
                    n14 = 57;
                    break;
                }
                case 39: {
                    n14 = 244;
                    break;
                }
                case 40: {
                    n14 = 99;
                    break;
                }
                case 41: {
                    n14 = 179;
                    break;
                }
                case 42: {
                    n14 = 129;
                    break;
                }
                case 43: {
                    n14 = 85;
                    break;
                }
                case 44: {
                    n14 = 86;
                    break;
                }
                case 45: {
                    n14 = 101;
                    break;
                }
                case 46: {
                    n14 = 107;
                    break;
                }
                case 47: {
                    n14 = 97;
                    break;
                }
                case 48: {
                    n14 = 26;
                    break;
                }
                case 49: {
                    n14 = 63;
                    break;
                }
                case 50: {
                    n14 = 62;
                    break;
                }
                case 51: {
                    n14 = 23;
                    break;
                }
                case 52: {
                    n14 = 220;
                    break;
                }
                case 53: {
                    n14 = 196;
                    break;
                }
                case 54: {
                    n14 = 191;
                    break;
                }
                case 55: {
                    n14 = 221;
                    break;
                }
                case 56: {
                    n14 = 10;
                    break;
                }
                case 57: {
                    n14 = 145;
                    break;
                }
                case 58: {
                    n14 = 119;
                    break;
                }
                case 59: {
                    n14 = 178;
                    break;
                }
                case 60: {
                    n14 = 193;
                    break;
                }
                case 61: {
                    n14 = 189;
                    break;
                }
                case 62: {
                    n14 = 117;
                    break;
                }
                case 63: {
                    n14 = 207;
                    break;
                }
                case 64: {
                    n14 = 8;
                    break;
                }
                case 65: {
                    n14 = 143;
                    break;
                }
                case 66: {
                    n14 = 83;
                    break;
                }
                case 67: {
                    n14 = 75;
                    break;
                }
                case 68: {
                    n14 = 240;
                    break;
                }
                case 69: {
                    n14 = 147;
                    break;
                }
                case 70: {
                    n14 = 53;
                    break;
                }
                case 71: {
                    n14 = 233;
                    break;
                }
                case 72: {
                    n14 = 141;
                    break;
                }
                case 73: {
                    n14 = 158;
                    break;
                }
                case 74: {
                    n14 = 130;
                    break;
                }
                case 75: {
                    n14 = 127;
                    break;
                }
                case 76: {
                    n14 = 115;
                    break;
                }
                case 77: {
                    n14 = 136;
                    break;
                }
                case 78: {
                    n14 = 22;
                    break;
                }
                case 79: {
                    n14 = 121;
                    break;
                }
                case 80: {
                    n14 = 54;
                    break;
                }
                case 81: {
                    n14 = 6;
                    break;
                }
                case 82: {
                    n14 = 9;
                    break;
                }
                case 83: {
                    n14 = 254;
                    break;
                }
                case 84: {
                    n14 = 67;
                    break;
                }
                case 85: {
                    n14 = 52;
                    break;
                }
                case 86: {
                    n14 = 37;
                    break;
                }
                case 87: {
                    n14 = 181;
                    break;
                }
                case 88: {
                    n14 = 24;
                    break;
                }
                case 89: {
                    n14 = 72;
                    break;
                }
                case 90: {
                    n14 = 126;
                    break;
                }
                case 91: {
                    n14 = 211;
                    break;
                }
                case 92: {
                    n14 = 96;
                    break;
                }
                case 93: {
                    n14 = 140;
                    break;
                }
                case 94: {
                    n14 = 71;
                    break;
                }
                case 95: {
                    n14 = 45;
                    break;
                }
                case 96: {
                    n14 = 229;
                    break;
                }
                case 97: {
                    n14 = 59;
                    break;
                }
                case 98: {
                    n14 = 84;
                    break;
                }
                case 99: {
                    n14 = 73;
                    break;
                }
                case 100: {
                    n14 = 156;
                    break;
                }
                case 101: {
                    n14 = 180;
                    break;
                }
                case 102: {
                    n14 = 108;
                    break;
                }
                case 103: {
                    n14 = 177;
                    break;
                }
                case 104: {
                    n14 = 13;
                    break;
                }
                case 105: {
                    n14 = 104;
                    break;
                }
                case 106: {
                    n14 = 170;
                    break;
                }
                case 107: {
                    n14 = 144;
                    break;
                }
                case 108: {
                    n14 = 32;
                    break;
                }
                case 109: {
                    n14 = 93;
                    break;
                }
                case 110: {
                    n14 = 46;
                    break;
                }
                case 111: {
                    n14 = 241;
                    break;
                }
                case 112: {
                    n14 = 92;
                    break;
                }
                case 113: {
                    n14 = 30;
                    break;
                }
                case 114: {
                    n14 = 239;
                    break;
                }
                case 115: {
                    n14 = 103;
                    break;
                }
                case 116: {
                    n14 = 77;
                    break;
                }
                case 117: {
                    n14 = 87;
                    break;
                }
                case 118: {
                    n14 = 203;
                    break;
                }
                case 119: {
                    n14 = 166;
                    break;
                }
                case 120: {
                    n14 = 222;
                    break;
                }
                case 121: {
                    n14 = 235;
                    break;
                }
                case 122: {
                    n14 = 213;
                    break;
                }
                case 123: {
                    n14 = 164;
                    break;
                }
                case 124: {
                    n14 = 55;
                    break;
                }
                case 125: {
                    n14 = 91;
                    break;
                }
                case 126: {
                    n14 = 69;
                    break;
                }
                case 127: {
                    n14 = 34;
                    break;
                }
                case 128: {
                    n14 = 165;
                    break;
                }
                case 129: {
                    n14 = 68;
                    break;
                }
                case 130: {
                    n14 = 1;
                    break;
                }
                case 131: {
                    n14 = 35;
                    break;
                }
                case 132: {
                    n14 = 16;
                    break;
                }
                case 133: {
                    n14 = 44;
                    break;
                }
                case 134: {
                    n14 = 48;
                    break;
                }
                case 135: {
                    n14 = 18;
                    break;
                }
                case 136: {
                    n14 = 215;
                    break;
                }
                case 137: {
                    n14 = 182;
                    break;
                }
                case 138: {
                    n14 = 236;
                    break;
                }
                case 139: {
                    n14 = 88;
                    break;
                }
                case 140: {
                    n14 = 0;
                    break;
                }
                case 141: {
                    n14 = 168;
                    break;
                }
                case 142: {
                    n14 = 82;
                    break;
                }
                case 143: {
                    n14 = 202;
                    break;
                }
                case 144: {
                    n14 = 28;
                    break;
                }
                case 145: {
                    n14 = 234;
                    break;
                }
                case 146: {
                    n14 = 200;
                    break;
                }
                case 147: {
                    n14 = 251;
                    break;
                }
                case 148: {
                    n14 = 33;
                    break;
                }
                case 149: {
                    n14 = 120;
                    break;
                }
                case 150: {
                    n14 = 139;
                    break;
                }
                case 151: {
                    n14 = 111;
                    break;
                }
                case 152: {
                    n14 = 225;
                    break;
                }
                case 153: {
                    n14 = 65;
                    break;
                }
                case 154: {
                    n14 = 160;
                    break;
                }
                case 155: {
                    n14 = 238;
                    break;
                }
                case 156: {
                    n14 = 106;
                    break;
                }
                case 157: {
                    n14 = 214;
                    break;
                }
                case 158: {
                    n14 = 195;
                    break;
                }
                case 159: {
                    n14 = 125;
                    break;
                }
                case 160: {
                    n14 = 153;
                    break;
                }
                case 161: {
                    n14 = 255;
                    break;
                }
                case 162: {
                    n14 = 163;
                    break;
                }
                case 163: {
                    n14 = 70;
                    break;
                }
                case 164: {
                    n14 = 208;
                    break;
                }
                case 165: {
                    n14 = 123;
                    break;
                }
                case 166: {
                    n14 = 137;
                    break;
                }
                case 167: {
                    n14 = 39;
                    break;
                }
                case 168: {
                    n14 = 5;
                    break;
                }
                case 169: {
                    n14 = 201;
                    break;
                }
                case 170: {
                    n14 = 237;
                    break;
                }
                case 171: {
                    n14 = 122;
                    break;
                }
                case 172: {
                    n14 = 60;
                    break;
                }
                case 173: {
                    n14 = 242;
                    break;
                }
                case 174: {
                    n14 = 249;
                    break;
                }
                case 175: {
                    n14 = 81;
                    break;
                }
                case 176: {
                    n14 = 80;
                    break;
                }
                case 177: {
                    n14 = 186;
                    break;
                }
                case 178: {
                    n14 = 89;
                    break;
                }
                case 179: {
                    n14 = 51;
                    break;
                }
                case 180: {
                    n14 = 216;
                    break;
                }
                case 181: {
                    n14 = 42;
                    break;
                }
                case 182: {
                    n14 = 154;
                    break;
                }
                case 183: {
                    n14 = 40;
                    break;
                }
                case 184: {
                    n14 = 224;
                    break;
                }
                case 185: {
                    n14 = 212;
                    break;
                }
                case 186: {
                    n14 = 31;
                    break;
                }
                case 187: {
                    n14 = 132;
                    break;
                }
                case 188: {
                    n14 = 248;
                    break;
                }
                case 189: {
                    n14 = 192;
                    break;
                }
                case 190: {
                    n14 = 98;
                    break;
                }
                case 191: {
                    n14 = 76;
                    break;
                }
                case 192: {
                    n14 = 194;
                    break;
                }
                case 193: {
                    n14 = 252;
                    break;
                }
                case 194: {
                    n14 = 243;
                    break;
                }
                case 195: {
                    n14 = 218;
                    break;
                }
                case 196: {
                    n14 = 247;
                    break;
                }
                case 197: {
                    n14 = 161;
                    break;
                }
                case 198: {
                    n14 = 174;
                    break;
                }
                case 199: {
                    n14 = 176;
                    break;
                }
                case 200: {
                    n14 = 21;
                    break;
                }
                case 201: {
                    n14 = 217;
                    break;
                }
                case 202: {
                    n14 = 167;
                    break;
                }
                case 203: {
                    n14 = 109;
                    break;
                }
                case 204: {
                    n14 = 43;
                    break;
                }
                case 205: {
                    n14 = 95;
                    break;
                }
                case 206: {
                    n14 = 187;
                    break;
                }
                case 207: {
                    n14 = 128;
                    break;
                }
                case 208: {
                    n14 = 152;
                    break;
                }
                case 209: {
                    n14 = 209;
                    break;
                }
                case 210: {
                    n14 = 172;
                    break;
                }
                case 211: {
                    n14 = 118;
                    break;
                }
                case 212: {
                    n14 = 142;
                    break;
                }
                case 213: {
                    n14 = 112;
                    break;
                }
                case 214: {
                    n14 = 155;
                    break;
                }
                case 215: {
                    n14 = 47;
                    break;
                }
                case 216: {
                    n14 = 74;
                    break;
                }
                case 217: {
                    n14 = 134;
                    break;
                }
                case 218: {
                    n14 = 124;
                    break;
                }
                case 219: {
                    n14 = 105;
                    break;
                }
                case 220: {
                    n14 = 219;
                    break;
                }
                case 221: {
                    n14 = 183;
                    break;
                }
                case 222: {
                    n14 = 197;
                    break;
                }
                case 223: {
                    n14 = 246;
                    break;
                }
                case 224: {
                    n14 = 38;
                    break;
                }
                case 225: {
                    n14 = 50;
                    break;
                }
                case 226: {
                    n14 = 151;
                    break;
                }
                case 227: {
                    n14 = 114;
                    break;
                }
                case 228: {
                    n14 = 162;
                    break;
                }
                case 229: {
                    n14 = 138;
                    break;
                }
                case 230: {
                    n14 = 79;
                    break;
                }
                case 231: {
                    n14 = 253;
                    break;
                }
                case 232: {
                    n14 = 41;
                    break;
                }
                case 233: {
                    n14 = 228;
                    break;
                }
                case 234: {
                    n14 = 148;
                    break;
                }
                case 235: {
                    n14 = 64;
                    break;
                }
                case 236: {
                    n14 = 199;
                    break;
                }
                case 237: {
                    n14 = 198;
                    break;
                }
                case 238: {
                    n14 = 29;
                    break;
                }
                case 239: {
                    n14 = 169;
                    break;
                }
                case 240: {
                    n14 = 232;
                    break;
                }
                case 241: {
                    n14 = 135;
                    break;
                }
                case 242: {
                    n14 = 61;
                    break;
                }
                case 243: {
                    n14 = 250;
                    break;
                }
                case 244: {
                    n14 = 116;
                    break;
                }
                case 245: {
                    n14 = 17;
                    break;
                }
                case 246: {
                    n14 = 94;
                    break;
                }
                case 247: {
                    n14 = 131;
                    break;
                }
                case 248: {
                    n14 = 157;
                    break;
                }
                case 249: {
                    n14 = 66;
                    break;
                }
                case 250: {
                    n14 = 14;
                    break;
                }
                case 251: {
                    n14 = 210;
                    break;
                }
                case 252: {
                    n14 = 173;
                    break;
                }
                case 253: {
                    n14 = 110;
                    break;
                }
                case 254: {
                    n14 = 19;
                    break;
                }
                default: {
                    n14 = 11;
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
            JR.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1527;
        if (d[n11] == null) {
            JR.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

