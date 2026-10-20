/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class YQ
extends JPanel {
    String w;
    String u;
    int z;
    JTextArea g;
    String E;
    private static int[] c;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    YQ(String string, String string2, int n10) {
        this.E = "";
        this.w = string;
        this.u = string2;
        this.z = n10;
        this.setOpaque(false);
        this.setLayout(new MigLayout("insets 0 0 0 0 ", "[]0[]", "[]0[]"));
        int[] nArray = YQ.m();
        this.setPreferredSize(new Dimension(YQ.a(27286, 8880871827334942601L), YQ.a(28005, 1942329851639220344L)));
        try {
            this.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.g = new yj_2(this);
        try {
            YJ.o(this.g);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((JTextArea)this.g).setForeground(new Color(YQ.a(14287, 2830261329524069073L), YQ.a(31176, 675600308766203092L), YQ.a(31176, 675600308766203092L)));
        ((JTextArea)this.g).setOpaque(false);
        ((JTextArea)this.g).setFont((Font)fx_2.j);
        ((JTextArea)this.g).setEditable(false);
        JScrollPane jScrollPane = new JScrollPane((JTextArea)this.g);
        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);
        this.add((Component)jScrollPane, "width :10000:,height :10000:");
        int[] nArray2 = nArray;
        try {
            yt_1.F.J(new CD(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new T(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new oq_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new yc_1(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new ul_2(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (nArray2 == null) {
            ky_2.K(new String[3]);
        }
    }

    void Q(String string) {
        block5: {
            String string2;
            block12: {
                int n10;
                String string3;
                block11: {
                    int[] nArray;
                    block10: {
                        block9: {
                            String string4;
                            block8: {
                                block7: {
                                    block6: {
                                        String string5;
                                        block4: {
                                            String string6;
                                            try {
                                                string6 = (String)lk_0.v((Object)string, this.u);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string3 = string6;
                                            nArray = YQ.m();
                                            string5 = string3;
                                            if (nArray == null) break block4;
                                            if (string5 == null) break block5;
                                            string5 = string3.toLowerCase();
                                        }
                                        string4 = string5;
                                        n10 = string4.contains("not allocated");
                                        if (nArray == null) break block6;
                                        if (n10 != 0) break block5;
                                        n10 = string4.contains("not managed");
                                    }
                                    if (nArray == null) break block7;
                                    if (n10 != 0) break block5;
                                    n10 = string4.contains("not administered");
                                }
                                if (nArray == null) break block8;
                                if (n10 != 0) break block5;
                                n10 = string4.contains("not registere");
                            }
                            if (nArray == null) break block9;
                            if (n10 != 0) break block5;
                            n10 = string4.contains("various registries");
                        }
                        if (nArray == null) break block10;
                        if (n10 != 0) break block5;
                        n10 = string3.equals((String)this.E) ? 1 : 0;
                    }
                    if (nArray == null) break block11;
                    if (n10 != 0) break block5;
                    string2 = string3;
                    if (nArray == null) break block12;
                    n10 = string2.length();
                }
                if (n10 <= ((String)this.E).length()) break block5;
                this.E = string3;
                string2 = "IP " + (String)this.u + "\n" + string3;
            }
            String string7 = string2;
            ((JTextArea)this.g).setText(string7);
        }
    }

    public void s() {
        Color color;
        nY nY2;
        Object object;
        Object object2;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            nY2 = (nY)object.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        nY nY3 = nY2;
        try {
            color = (Color)nY3.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        MatteBorder matteBorder = BorderFactory.createMatteBorder(2, 0, 0, 0, color);
        this.setBorder(null);
    }

    @Override
    public String getName() {
        return (String)this.w;
    }

    @Override
    public void setName(String string) {
        this.w = string;
    }

    public String C() {
        return (String)this.u;
    }

    public void T(String string) {
        this.u = string;
    }

    public int a() {
        return this.z;
    }

    public void Y(int n10) {
        this.z = n10;
    }

    public static void Y(int[] nArray) {
        c = nArray;
    }

    public static int[] m() {
        return c;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[10];
                        var11_1 = 0;
                        YQ.Y(new int[5]);
                        var10_2 = "\u0015%n,\u001f\\\u00d0I\u00fb\u00d45'\u00c1\u000b\u00d3\u0005\u00faQ\u00a4\u00c9D\u0005\u00f4\u00fbe\u009c|\rr\u009cb\u007f\u007f\u00cd]\u00f6\u00b6\u0015\u00e0\u0091\u00d3\u000b2\u000bj\u008da\u0097k1L\u00f5(\u0010\u00b3zZ\u00a3kW\u00a4\u0084\u00dfFeC\u00b7\t\u00b5\u009c\u0012A^\u0019\u00a1\u00cbfa\u00d8\u00a6\u00a1\u00c1/\u00a3<\u00f4\u00f1<G\r\"6h*-nm\u00ac\u00ca\u008dl\"p";
                        var12_3 = "\u0015%n,\u001f\\\u00d0I\u00fb\u00d45'\u00c1\u000b\u00d3\u0005\u00faQ\u00a4\u00c9D\u0005\u00f4\u00fbe\u009c|\rr\u009cb\u007f\u007f\u00cd]\u00f6\u00b6\u0015\u00e0\u0091\u00d3\u000b2\u000bj\u008da\u0097k1L\u00f5(\u0010\u00b3zZ\u00a3kW\u00a4\u0084\u00dfFeC\u00b7\t\u00b5\u009c\u0012A^\u0019\u00a1\u00cbfa\u00d8\u00a6\u00a1\u00c1/\u00a3<\u00f4\u00f1<G\r\"6h*-nm\u00ac\u00ca\u008dl\"p".length();
                        var9_4 = 15;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 94;
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
                            var10_2 = "\u008b\u009eK\u001cw\u0003i\u009f\u0097\u00cb\u00c5\u0002\u0091\u001d\u00fb\u009f\u0091\u0081I\u0098_r\u00fdS\u0092\u00c4#\u00af\u008c\u00c9u]";
                            var12_3 = "\u008b\u009eK\u001cw\u0003i\u009f\u0097\u00cb\u00c5\u0002\u0091\u001d\u00fb\u009f\u0091\u0081I\u0098_r\u00fdS\u0092\u00c4#\u00af\u008c\u00c9u]".length();
                            var9_4 = 3;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 123;
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
                                    v15 = 112;
                                    break;
                                }
                                case 1: {
                                    v15 = 119;
                                    break;
                                }
                                case 2: {
                                    v15 = 96;
                                    break;
                                }
                                case 3: {
                                    v15 = 53;
                                    break;
                                }
                                case 4: {
                                    v15 = 34;
                                    break;
                                }
                                case 5: {
                                    v15 = 80;
                                    break;
                                }
                                default: {
                                    v15 = 56;
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
                YQ.a = var13;
                YQ.b = new String[10];
                var0_7 = 6902805804539184255L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u00c8\u0010\u0083\u00a9r\u00de\u0096\u00b0\u00d50]\u008f\u00b9\u0002\u00ec\u00e6";
                var5_11 = "\u00c8\u0010\u0083\u00a9r\u00de\u0096\u00b0\u00d50]\u008f\u00b9\u0002\u00ec\u00e6".length();
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
                    var4_10 = "\u00ce\u0083\u00d5\b\u00c37X\u00b5\u00cek\u009a\u0091\u00f6\u0087\u00eb\u0017";
                    var5_11 = "\u00ce\u0083\u00d5\b\u00c37X\u00b5\u00cek\u009a\u0091\u00f6\u0087\u00eb\u0017".length();
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
        YQ.d = var6_8;
        YQ.e = new Integer[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF2D0) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 163;
                    break;
                }
                case 1: {
                    n14 = 32;
                    break;
                }
                case 2: {
                    n14 = 248;
                    break;
                }
                case 3: {
                    n14 = 10;
                    break;
                }
                case 4: {
                    n14 = 161;
                    break;
                }
                case 5: {
                    n14 = 187;
                    break;
                }
                case 6: {
                    n14 = 226;
                    break;
                }
                case 7: {
                    n14 = 216;
                    break;
                }
                case 8: {
                    n14 = 74;
                    break;
                }
                case 9: {
                    n14 = 164;
                    break;
                }
                case 10: {
                    n14 = 185;
                    break;
                }
                case 11: {
                    n14 = 20;
                    break;
                }
                case 12: {
                    n14 = 62;
                    break;
                }
                case 13: {
                    n14 = 121;
                    break;
                }
                case 14: {
                    n14 = 142;
                    break;
                }
                case 15: {
                    n14 = 222;
                    break;
                }
                case 16: {
                    n14 = 123;
                    break;
                }
                case 17: {
                    n14 = 147;
                    break;
                }
                case 18: {
                    n14 = 86;
                    break;
                }
                case 19: {
                    n14 = 5;
                    break;
                }
                case 20: {
                    n14 = 13;
                    break;
                }
                case 21: {
                    n14 = 209;
                    break;
                }
                case 22: {
                    n14 = 174;
                    break;
                }
                case 23: {
                    n14 = 145;
                    break;
                }
                case 24: {
                    n14 = 122;
                    break;
                }
                case 25: {
                    n14 = 221;
                    break;
                }
                case 26: {
                    n14 = 21;
                    break;
                }
                case 27: {
                    n14 = 69;
                    break;
                }
                case 28: {
                    n14 = 203;
                    break;
                }
                case 29: {
                    n14 = 230;
                    break;
                }
                case 30: {
                    n14 = 52;
                    break;
                }
                case 31: {
                    n14 = 181;
                    break;
                }
                case 32: {
                    n14 = 84;
                    break;
                }
                case 33: {
                    n14 = 124;
                    break;
                }
                case 34: {
                    n14 = 55;
                    break;
                }
                case 35: {
                    n14 = 175;
                    break;
                }
                case 36: {
                    n14 = 237;
                    break;
                }
                case 37: {
                    n14 = 233;
                    break;
                }
                case 38: {
                    n14 = 105;
                    break;
                }
                case 39: {
                    n14 = 219;
                    break;
                }
                case 40: {
                    n14 = 0;
                    break;
                }
                case 41: {
                    n14 = 40;
                    break;
                }
                case 42: {
                    n14 = 47;
                    break;
                }
                case 43: {
                    n14 = 160;
                    break;
                }
                case 44: {
                    n14 = 162;
                    break;
                }
                case 45: {
                    n14 = 236;
                    break;
                }
                case 46: {
                    n14 = 96;
                    break;
                }
                case 47: {
                    n14 = 37;
                    break;
                }
                case 48: {
                    n14 = 50;
                    break;
                }
                case 49: {
                    n14 = 99;
                    break;
                }
                case 50: {
                    n14 = 36;
                    break;
                }
                case 51: {
                    n14 = 240;
                    break;
                }
                case 52: {
                    n14 = 54;
                    break;
                }
                case 53: {
                    n14 = 81;
                    break;
                }
                case 54: {
                    n14 = 114;
                    break;
                }
                case 55: {
                    n14 = 97;
                    break;
                }
                case 56: {
                    n14 = 101;
                    break;
                }
                case 57: {
                    n14 = 88;
                    break;
                }
                case 58: {
                    n14 = 3;
                    break;
                }
                case 59: {
                    n14 = 173;
                    break;
                }
                case 60: {
                    n14 = 149;
                    break;
                }
                case 61: {
                    n14 = 151;
                    break;
                }
                case 62: {
                    n14 = 44;
                    break;
                }
                case 63: {
                    n14 = 232;
                    break;
                }
                case 64: {
                    n14 = 35;
                    break;
                }
                case 65: {
                    n14 = 212;
                    break;
                }
                case 66: {
                    n14 = 167;
                    break;
                }
                case 67: {
                    n14 = 199;
                    break;
                }
                case 68: {
                    n14 = 211;
                    break;
                }
                case 69: {
                    n14 = 119;
                    break;
                }
                case 70: {
                    n14 = 134;
                    break;
                }
                case 71: {
                    n14 = 82;
                    break;
                }
                case 72: {
                    n14 = 18;
                    break;
                }
                case 73: {
                    n14 = 137;
                    break;
                }
                case 74: {
                    n14 = 29;
                    break;
                }
                case 75: {
                    n14 = 155;
                    break;
                }
                case 76: {
                    n14 = 49;
                    break;
                }
                case 77: {
                    n14 = 150;
                    break;
                }
                case 78: {
                    n14 = 204;
                    break;
                }
                case 79: {
                    n14 = 238;
                    break;
                }
                case 80: {
                    n14 = 39;
                    break;
                }
                case 81: {
                    n14 = 61;
                    break;
                }
                case 82: {
                    n14 = 148;
                    break;
                }
                case 83: {
                    n14 = 171;
                    break;
                }
                case 84: {
                    n14 = 190;
                    break;
                }
                case 85: {
                    n14 = 169;
                    break;
                }
                case 86: {
                    n14 = 7;
                    break;
                }
                case 87: {
                    n14 = 26;
                    break;
                }
                case 88: {
                    n14 = 72;
                    break;
                }
                case 89: {
                    n14 = 58;
                    break;
                }
                case 90: {
                    n14 = 14;
                    break;
                }
                case 91: {
                    n14 = 48;
                    break;
                }
                case 92: {
                    n14 = 125;
                    break;
                }
                case 93: {
                    n14 = 27;
                    break;
                }
                case 94: {
                    n14 = 157;
                    break;
                }
                case 95: {
                    n14 = 188;
                    break;
                }
                case 96: {
                    n14 = 16;
                    break;
                }
                case 97: {
                    n14 = 194;
                    break;
                }
                case 98: {
                    n14 = 158;
                    break;
                }
                case 99: {
                    n14 = 64;
                    break;
                }
                case 100: {
                    n14 = 12;
                    break;
                }
                case 101: {
                    n14 = 144;
                    break;
                }
                case 102: {
                    n14 = 159;
                    break;
                }
                case 103: {
                    n14 = 98;
                    break;
                }
                case 104: {
                    n14 = 76;
                    break;
                }
                case 105: {
                    n14 = 179;
                    break;
                }
                case 106: {
                    n14 = 24;
                    break;
                }
                case 107: {
                    n14 = 120;
                    break;
                }
                case 108: {
                    n14 = 103;
                    break;
                }
                case 109: {
                    n14 = 220;
                    break;
                }
                case 110: {
                    n14 = 94;
                    break;
                }
                case 111: {
                    n14 = 217;
                    break;
                }
                case 112: {
                    n14 = 234;
                    break;
                }
                case 113: {
                    n14 = 193;
                    break;
                }
                case 114: {
                    n14 = 66;
                    break;
                }
                case 115: {
                    n14 = 191;
                    break;
                }
                case 116: {
                    n14 = 45;
                    break;
                }
                case 117: {
                    n14 = 92;
                    break;
                }
                case 118: {
                    n14 = 183;
                    break;
                }
                case 119: {
                    n14 = 178;
                    break;
                }
                case 120: {
                    n14 = 189;
                    break;
                }
                case 121: {
                    n14 = 136;
                    break;
                }
                case 122: {
                    n14 = 106;
                    break;
                }
                case 123: {
                    n14 = 17;
                    break;
                }
                case 124: {
                    n14 = 255;
                    break;
                }
                case 125: {
                    n14 = 170;
                    break;
                }
                case 126: {
                    n14 = 31;
                    break;
                }
                case 127: {
                    n14 = 140;
                    break;
                }
                case 128: {
                    n14 = 186;
                    break;
                }
                case 129: {
                    n14 = 73;
                    break;
                }
                case 130: {
                    n14 = 206;
                    break;
                }
                case 131: {
                    n14 = 15;
                    break;
                }
                case 132: {
                    n14 = 215;
                    break;
                }
                case 133: {
                    n14 = 250;
                    break;
                }
                case 134: {
                    n14 = 168;
                    break;
                }
                case 135: {
                    n14 = 156;
                    break;
                }
                case 136: {
                    n14 = 25;
                    break;
                }
                case 137: {
                    n14 = 1;
                    break;
                }
                case 138: {
                    n14 = 146;
                    break;
                }
                case 139: {
                    n14 = 59;
                    break;
                }
                case 140: {
                    n14 = 139;
                    break;
                }
                case 141: {
                    n14 = 53;
                    break;
                }
                case 142: {
                    n14 = 90;
                    break;
                }
                case 143: {
                    n14 = 198;
                    break;
                }
                case 144: {
                    n14 = 247;
                    break;
                }
                case 145: {
                    n14 = 153;
                    break;
                }
                case 146: {
                    n14 = 152;
                    break;
                }
                case 147: {
                    n14 = 184;
                    break;
                }
                case 148: {
                    n14 = 192;
                    break;
                }
                case 149: {
                    n14 = 214;
                    break;
                }
                case 150: {
                    n14 = 231;
                    break;
                }
                case 151: {
                    n14 = 30;
                    break;
                }
                case 152: {
                    n14 = 28;
                    break;
                }
                case 153: {
                    n14 = 67;
                    break;
                }
                case 154: {
                    n14 = 235;
                    break;
                }
                case 155: {
                    n14 = 138;
                    break;
                }
                case 156: {
                    n14 = 2;
                    break;
                }
                case 157: {
                    n14 = 126;
                    break;
                }
                case 158: {
                    n14 = 223;
                    break;
                }
                case 159: {
                    n14 = 243;
                    break;
                }
                case 160: {
                    n14 = 56;
                    break;
                }
                case 161: {
                    n14 = 176;
                    break;
                }
                case 162: {
                    n14 = 60;
                    break;
                }
                case 163: {
                    n14 = 83;
                    break;
                }
                case 164: {
                    n14 = 218;
                    break;
                }
                case 165: {
                    n14 = 46;
                    break;
                }
                case 166: {
                    n14 = 195;
                    break;
                }
                case 167: {
                    n14 = 207;
                    break;
                }
                case 168: {
                    n14 = 110;
                    break;
                }
                case 169: {
                    n14 = 71;
                    break;
                }
                case 170: {
                    n14 = 23;
                    break;
                }
                case 171: {
                    n14 = 228;
                    break;
                }
                case 172: {
                    n14 = 201;
                    break;
                }
                case 173: {
                    n14 = 51;
                    break;
                }
                case 174: {
                    n14 = 224;
                    break;
                }
                case 175: {
                    n14 = 229;
                    break;
                }
                case 176: {
                    n14 = 252;
                    break;
                }
                case 177: {
                    n14 = 109;
                    break;
                }
                case 178: {
                    n14 = 8;
                    break;
                }
                case 179: {
                    n14 = 244;
                    break;
                }
                case 180: {
                    n14 = 4;
                    break;
                }
                case 181: {
                    n14 = 93;
                    break;
                }
                case 182: {
                    n14 = 249;
                    break;
                }
                case 183: {
                    n14 = 182;
                    break;
                }
                case 184: {
                    n14 = 41;
                    break;
                }
                case 185: {
                    n14 = 143;
                    break;
                }
                case 186: {
                    n14 = 131;
                    break;
                }
                case 187: {
                    n14 = 251;
                    break;
                }
                case 188: {
                    n14 = 130;
                    break;
                }
                case 189: {
                    n14 = 19;
                    break;
                }
                case 190: {
                    n14 = 9;
                    break;
                }
                case 191: {
                    n14 = 63;
                    break;
                }
                case 192: {
                    n14 = 89;
                    break;
                }
                case 193: {
                    n14 = 177;
                    break;
                }
                case 194: {
                    n14 = 57;
                    break;
                }
                case 195: {
                    n14 = 197;
                    break;
                }
                case 196: {
                    n14 = 115;
                    break;
                }
                case 197: {
                    n14 = 68;
                    break;
                }
                case 198: {
                    n14 = 6;
                    break;
                }
                case 199: {
                    n14 = 102;
                    break;
                }
                case 200: {
                    n14 = 227;
                    break;
                }
                case 201: {
                    n14 = 113;
                    break;
                }
                case 202: {
                    n14 = 129;
                    break;
                }
                case 203: {
                    n14 = 42;
                    break;
                }
                case 204: {
                    n14 = 75;
                    break;
                }
                case 205: {
                    n14 = 200;
                    break;
                }
                case 206: {
                    n14 = 165;
                    break;
                }
                case 207: {
                    n14 = 202;
                    break;
                }
                case 208: {
                    n14 = 87;
                    break;
                }
                case 209: {
                    n14 = 180;
                    break;
                }
                case 210: {
                    n14 = 253;
                    break;
                }
                case 211: {
                    n14 = 242;
                    break;
                }
                case 212: {
                    n14 = 128;
                    break;
                }
                case 213: {
                    n14 = 239;
                    break;
                }
                case 214: {
                    n14 = 111;
                    break;
                }
                case 215: {
                    n14 = 34;
                    break;
                }
                case 216: {
                    n14 = 100;
                    break;
                }
                case 217: {
                    n14 = 77;
                    break;
                }
                case 218: {
                    n14 = 70;
                    break;
                }
                case 219: {
                    n14 = 11;
                    break;
                }
                case 220: {
                    n14 = 172;
                    break;
                }
                case 221: {
                    n14 = 78;
                    break;
                }
                case 222: {
                    n14 = 208;
                    break;
                }
                case 223: {
                    n14 = 80;
                    break;
                }
                case 224: {
                    n14 = 22;
                    break;
                }
                case 225: {
                    n14 = 95;
                    break;
                }
                case 226: {
                    n14 = 210;
                    break;
                }
                case 227: {
                    n14 = 108;
                    break;
                }
                case 228: {
                    n14 = 117;
                    break;
                }
                case 229: {
                    n14 = 154;
                    break;
                }
                case 230: {
                    n14 = 196;
                    break;
                }
                case 231: {
                    n14 = 116;
                    break;
                }
                case 232: {
                    n14 = 33;
                    break;
                }
                case 233: {
                    n14 = 65;
                    break;
                }
                case 234: {
                    n14 = 135;
                    break;
                }
                case 235: {
                    n14 = 213;
                    break;
                }
                case 236: {
                    n14 = 127;
                    break;
                }
                case 237: {
                    n14 = 91;
                    break;
                }
                case 238: {
                    n14 = 141;
                    break;
                }
                case 239: {
                    n14 = 245;
                    break;
                }
                case 240: {
                    n14 = 254;
                    break;
                }
                case 241: {
                    n14 = 133;
                    break;
                }
                case 242: {
                    n14 = 241;
                    break;
                }
                case 243: {
                    n14 = 118;
                    break;
                }
                case 244: {
                    n14 = 79;
                    break;
                }
                case 245: {
                    n14 = 43;
                    break;
                }
                case 246: {
                    n14 = 38;
                    break;
                }
                case 247: {
                    n14 = 246;
                    break;
                }
                case 248: {
                    n14 = 112;
                    break;
                }
                case 249: {
                    n14 = 166;
                    break;
                }
                case 250: {
                    n14 = 104;
                    break;
                }
                case 251: {
                    n14 = 85;
                    break;
                }
                case 252: {
                    n14 = 205;
                    break;
                }
                case 253: {
                    n14 = 107;
                    break;
                }
                case 254: {
                    n14 = 225;
                    break;
                }
                default: {
                    n14 = 132;
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
            YQ.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x251E;
        if (e[n11] == null) {
            YQ.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

