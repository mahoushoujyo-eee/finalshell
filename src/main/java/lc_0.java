/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Renamed from Lc
 */
public class lc_0
extends DefaultTableCellRenderer {
    Border e;
    SimpleDateFormat t;
    cu_1 n;
    Color Q;
    Color Y;
    Color C;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    lc_0() {
        this.e = BorderFactory.createEmptyBorder(0, 2, 0, 2);
        this.t = new SimpleDateFormat(a);
        this.n = new cu_1();
        this.Q = new Color(lc_0.a(22521, 4040131510210101557L), lc_0.a(11527, 2377333170343508941L), lc_0.a(25769, 4580192591336813156L));
        this.Y = new Color(lc_0.a(12485, 5722945380884112903L), lc_0.a(22521, 4040131510210101557L), lc_0.a(20106, 4037014425940564035L));
        this.C = new Color(lc_0.a(22319, 8278112003377529319L), lc_0.a(30090, 1656303879778509633L), lc_0.a(30090, 1656303879778509633L));
        ((cu_1)this.n).setFont((Font)fx_2.X);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        ky_2[] ky_2Array;
        cu_1 cu_12;
        block64: {
            block63: {
                block62: {
                    li_1 li_12;
                    block51: {
                        String string;
                        block55: {
                            String string2;
                            u8_0 u8_02;
                            u8_0 u8_03;
                            block61: {
                                int n12;
                                int n13;
                                block58: {
                                    int n14;
                                    block59: {
                                        block60: {
                                            String string3;
                                            String string4;
                                            String string5;
                                            block56: {
                                                block57: {
                                                    String string6;
                                                    float f10;
                                                    block53: {
                                                        block54: {
                                                            String string7;
                                                            long l2;
                                                            u8_0 u8_04;
                                                            Object object2;
                                                            block52: {
                                                                Object object3;
                                                                block50: {
                                                                    cu_12 = (cu_1)this.n;
                                                                    Object var9_8 = null;
                                                                    Object var10_9 = null;
                                                                    ky_2[] ky_2Array2 = ka_1.y();
                                                                    int n15 = 2;
                                                                    boolean bl3 = false;
                                                                    JR jR = (JR)jTable;
                                                                    n14 = jTable.convertColumnIndexToModel(n11);
                                                                    cu_12.setAlignmentX(n15);
                                                                    cu_12.setHorizontalAlignment(2);
                                                                    li_12 = null;
                                                                    try {
                                                                        cu_12.w(false);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    try {
                                                                        cu_12.Z(false);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    try {
                                                                        cu_12.L(false);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    try {
                                                                        cu_12.i(li_12);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    cu_12.setOpaque(true);
                                                                    ky_2Array = ky_2Array2;
                                                                    object3 = object;
                                                                    if (ky_2Array != null) break block50;
                                                                    if (object3 == null) break block51;
                                                                    object3 = object;
                                                                }
                                                                object2 = object3.getClass();
                                                                if (ky_2Array != null) break block52;
                                                                if (!object2.equals(li_1.class)) break block51;
                                                                object2 = object;
                                                            }
                                                            li_12 = (li_1)object2;
                                                            try {
                                                                u8_04 = (u8_0)li_12.P();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            u8_03 = u8_04;
                                                            string = "";
                                                            n13 = n14;
                                                            if (ky_2Array != null) break block53;
                                                            if (n13 != 0) break block54;
                                                            try {
                                                                l2 = (Long)li_12.c();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                string7 = (String)lk_0.h(l2);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            string = string7 + " ";
                                                            try {
                                                                cu_12.Z(true);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            cu_12.setHorizontalAlignment(4);
                                                            if (ky_2Array == null) break block55;
                                                        }
                                                        n13 = n14;
                                                    }
                                                    n12 = 1;
                                                    if (ky_2Array != null) break block56;
                                                    if (n13 != n12) break block57;
                                                    try {
                                                        f10 = ((Float)li_12.r()).floatValue();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        string6 = (String)lk_0.k(f10);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    string = string6 + "";
                                                    try {
                                                        cu_12.w(true);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    cu_12.setHorizontalAlignment(4);
                                                    if (ky_2Array == null) break block55;
                                                }
                                                n13 = n14;
                                                n12 = 2;
                                            }
                                            if (ky_2Array != null) break block58;
                                            if (n13 != n12) break block59;
                                            try {
                                                string5 = (String)li_12.B();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string = string5;
                                            if (ky_2Array == null) {
                                                if (u8_03 != null) {
                                                    String string8;
                                                    try {
                                                        string8 = (String)li_12.B();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    string = string8;
                                                }
                                                string = string.trim();
                                            }
                                            String string9 = string;
                                            if (ky_2Array != null) break block60;
                                            try {
                                                string4 = (String)li_12.B();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (string9.equals(string4)) break block55;
                                            try {
                                                string3 = (String)li_12.B();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string9 = string = string3 + "\u250b" + string;
                                        }
                                        if (ky_2Array == null) break block55;
                                    }
                                    n13 = n14;
                                    n12 = 5;
                                }
                                if (n13 != n12) break block55;
                                u8_02 = u8_03;
                                if (ky_2Array != null) break block61;
                                if (u8_02 == null) break block55;
                                u8_02 = u8_03;
                            }
                            try {
                                string2 = (String)u8_02.M();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (ky_2Array == null) {
                                if (string2 != null) {
                                    try {
                                        string2 = (String)u8_03.M();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                }
                            } else {
                                string = string2;
                            }
                        }
                        cu_12.setText(string);
                    }
                    cu_12.setBorder((Border)this.e);
                    try {
                        cu_12.n(li_12);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    int n16 = n10 % 2;
                    if (ky_2Array != null) break block62;
                    if (n16 != 0) break block63;
                    cu_12.setBackground((Color)this.Q);
                }
                if (ky_2Array == null) break block64;
            }
            cu_12.setBackground((Color)this.Y);
        }
        cu_1 cu_13 = cu_12;
        if (ky_2Array == null) {
            cu_13.setForeground((Color)this.C);
            if (object == null) {
                cu_12.setText("");
                cu_12.setBackground(new Color(lc_0.a(31857, 8904999680057125567L), lc_0.a(2895, 3760025786835852672L), lc_0.a(22521, 4040131510210101557L)));
            }
            cu_13 = cu_12;
        }
        return cu_13;
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
                v0 = "f%\u0004G?\u001eT08\u0019\u001eX\u001b#r1".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 33;
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
                                v9 = 62;
                                break;
                            }
                            case 1: {
                                v9 = 125;
                                break;
                            }
                            case 2: {
                                v9 = 92;
                                break;
                            }
                            case 3: {
                                v9 = 31;
                                break;
                            }
                            case 4: {
                                v9 = 49;
                                break;
                            }
                            case 5: {
                                v9 = 114;
                                break;
                            }
                            default: {
                                v9 = 56;
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
                lc_0.a = new String(v10).intern();
                var0_1 = 3800560510689456704L;
                var6_2 = new long[9];
                var3_3 = 0;
                var4_4 = "\u00c2\u00bemb\u00c8\u0016Ip\u0014\u0006}[\u0099I\u00113\u00df\u00b4f\u0092\u000f2\u00b3\u0095j\u008c\u00a7*\u00c8U*\u00f95\u00b6aj\u00cd\u00c0\u0018\nf\u00ecD\u00ac\u00e9\u00ado:\u00a7D\u00f3E\u0004\u00ea3\u0080";
                var5_5 = "\u00c2\u00bemb\u00c8\u0016Ip\u0014\u0006}[\u0099I\u00113\u00df\u00b4f\u0092\u000f2\u00b3\u0095j\u008c\u00a7*\u00c8U*\u00f95\u00b6aj\u00cd\u00c0\u0018\nf\u00ecD\u00ac\u00e9\u00ado:\u00a7D\u00f3E\u0004\u00ea3\u0080".length();
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
                    var4_4 = "\u0092\u0093\u0098\u00c5\u00ea\u0084\u0000\u00db\u00cdx<\u0095S\u008a\u00d4\u00a1";
                    var5_5 = "\u0092\u0093\u0098\u00c5\u00ea\u0084\u0000\u00db\u00cdx<\u0095S\u008a\u00d4\u00a1".length();
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
        lc_0.b = var6_2;
        lc_0.c = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x56CA;
        if (c[n11] == null) {
            lc_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

