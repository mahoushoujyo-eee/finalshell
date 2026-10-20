/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ls_2;
import com.pw_1;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class C6
extends DefaultTableCellRenderer {
    Border C;
    SimpleDateFormat b;
    private static final String a;
    private static final long[] c;
    private static final Integer[] d;

    public C6() {
        this.C = BorderFactory.createEmptyBorder(4, 4, 4, 2);
        this.b = new SimpleDateFormat(a);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        Component component;
        block23: {
            JLabel jLabel;
            block24: {
                block25: {
                    int n12;
                    String[] stringArray;
                    block21: {
                        int n13;
                        block22: {
                            block14: {
                                int n14;
                                block15: {
                                    String string;
                                    block18: {
                                        int n15;
                                        int n16;
                                        pw_1 pw_12;
                                        block19: {
                                            int n17;
                                            block20: {
                                                String string2;
                                                block16: {
                                                    block17: {
                                                        String string3;
                                                        pw_1 pw_13;
                                                        component = super.getTableCellRendererComponent(jTable, object, bl, bl2, n10, n11);
                                                        jLabel = (JLabel)component;
                                                        stringArray = Y_.j();
                                                        n14 = 2;
                                                        n17 = jTable.convertColumnIndexToModel(n11);
                                                        n13 = object.getClass().equals(ln_1.class);
                                                        if (stringArray == null) break block14;
                                                        if (n13 == 0) break block15;
                                                        ln_1 ln_12 = (ln_1)object;
                                                        string = "";
                                                        try {
                                                            pw_13 = (pw_1)ln_12.h();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        pw_12 = pw_13;
                                                        boolean bl3 = false;
                                                        n16 = n17;
                                                        if (stringArray == null) break block16;
                                                        if (n16 != 0) break block17;
                                                        try {
                                                            string3 = (String)ln_12.F();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        string = string3;
                                                        if (stringArray != null) break block18;
                                                    }
                                                    n16 = n17;
                                                }
                                                n15 = 1;
                                                if (stringArray == null) break block19;
                                                if (n16 != n15) break block20;
                                                try {
                                                    string2 = (String)om_2.G(pw_12.J().y());
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                string = string2;
                                                if (stringArray != null) break block18;
                                            }
                                            n16 = n17;
                                            n15 = 2;
                                        }
                                        if (n16 == n15) {
                                            int n18;
                                            try {
                                                n18 = (Integer)C6.i(pw_12.J());
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string = n18 + "";
                                        }
                                    }
                                    jLabel.setText(string);
                                }
                                jLabel.setHorizontalAlignment(n14);
                                jLabel.setBorder((Border)this.C);
                                jLabel.setForeground(new Color(C6.a(2203, 1732309420666866939L), C6.a(1033, 8704645618772656234L), C6.a(1033, 8704645618772656234L)));
                                n13 = bl ? 1 : 0;
                            }
                            if (stringArray == null) break block21;
                            if (n13 == 0) break block22;
                            jLabel.setOpaque(true);
                            if (stringArray != null) break block23;
                        }
                        n13 = n12 = n10 % 2;
                    }
                    if (stringArray == null) break block24;
                    if (n12 != 0) break block25;
                    jLabel.setOpaque(true);
                    jLabel.setBackground(new Color(C6.a(10234, 3121205797091271576L), C6.a(14095, 5239431937791718249L), C6.a(14095, 5239431937791718249L), 2));
                    if (stringArray != null) break block23;
                }
                jLabel.setOpaque(true);
            }
            jLabel.setBackground(new Color(C6.a(14095, 5239431937791718249L), C6.a(14095, 5239431937791718249L), C6.a(14095, 5239431937791718249L), C6.a(30660, 2627616057410892709L)));
        }
        return component;
    }

    public static int i(ls_2 ls_22) {
        return ls_22.r();
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
                v0 = "\u0012;\u0018;Jx1D&\u0005b-}F\u0006/".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 68;
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
                                v9 = 47;
                                break;
                            }
                            case 1: {
                                v9 = 6;
                                break;
                            }
                            case 2: {
                                v9 = 37;
                                break;
                            }
                            case 3: {
                                v9 = 6;
                                break;
                            }
                            case 4: {
                                v9 = 33;
                                break;
                            }
                            case 5: {
                                v9 = 113;
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
                C6.a = new String(v10).intern();
                var0_1 = 389958950445792470L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "1\u0005]\u0010\u00d8\u00cd\u00df|\u00cb\u00ce\u00ad\u0016\\\u00d4\u00fc\u00a2(\u008a6\u0006\u0005\u00a7p3";
                var5_5 = "1\u0005]\u0010\u00d8\u00cd\u00df|\u00cb\u00ce\u00ad\u0016\\\u00d4\u00fc\u00a2(\u008a6\u0006\u0005\u00a7p3".length();
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
                    var4_4 = "1\u008d\u00e15\u0082X\u008fu\u00a5\u00f3df\u001a\u00a7O\u008d";
                    var5_5 = "1\u008d\u00e15\u0082X\u008fu\u00a5\u00f3df\u001a\u00a7O\u008d".length();
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
        C6.c = var6_2;
        C6.d = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4462;
        if (d[n11] == null) {
            C6.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

