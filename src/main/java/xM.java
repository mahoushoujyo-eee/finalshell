/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class xM
extends DefaultTableCellRenderer {
    Border y;
    SimpleDateFormat T;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public xM() {
        this.y = BorderFactory.createEmptyBorder(4, xM.a(10704, 2691857988118825440L), 4, 2);
        this.T = new SimpleDateFormat(a);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        Component component;
        block21: {
            JLabel jLabel;
            block22: {
                block23: {
                    int n12;
                    String[] stringArray;
                    block19: {
                        int n13;
                        block20: {
                            block14: {
                                int n14;
                                block15: {
                                    String string;
                                    block18: {
                                        int n15;
                                        KeyStroke keyStroke;
                                        block16: {
                                            int n16;
                                            block17: {
                                                String string2;
                                                int n17;
                                                KeyStroke keyStroke2;
                                                component = super.getTableCellRendererComponent(jTable, object, bl, bl2, n10, n11);
                                                jLabel = (JLabel)component;
                                                n14 = 2;
                                                stringArray = zK.B();
                                                n16 = jTable.convertColumnIndexToModel(n11);
                                                n13 = object.getClass().equals(zG.class);
                                                if (stringArray == null) break block14;
                                                if (n13 == 0) break block15;
                                                zG zG2 = (zG)object;
                                                try {
                                                    keyStroke2 = (KeyStroke)zG2.f();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                keyStroke = keyStroke2;
                                                string = "";
                                                try {
                                                    n17 = (Integer)zG2.K();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                int n18 = n17;
                                                n15 = n16;
                                                if (stringArray == null) break block16;
                                                if (n15 != 0) break block17;
                                                try {
                                                    string2 = (String)zG2.y();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                string = string2;
                                                if (stringArray != null) break block18;
                                            }
                                            n15 = n16;
                                        }
                                        if (n15 == 1) {
                                            String string3;
                                            try {
                                                string3 = (String)xK.P(keyStroke);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string = string3;
                                        }
                                    }
                                    jLabel.setText(string);
                                }
                                jLabel.setHorizontalAlignment(n14);
                                jLabel.setBorder((Border)this.y);
                                jLabel.setForeground(new Color(xM.a(11096, 4778359838269262697L), xM.a(6685, 1667148110687894059L), xM.a(6685, 1667148110687894059L)));
                                n13 = bl ? 1 : 0;
                            }
                            if (stringArray == null) break block19;
                            if (n13 == 0) break block20;
                            jLabel.setOpaque(true);
                            if (stringArray != null) break block21;
                        }
                        n13 = n12 = n10 % 2;
                    }
                    if (stringArray == null) break block22;
                    if (n12 != 0) break block23;
                    jLabel.setOpaque(true);
                    jLabel.setBackground(new Color(xM.a(17820, 4325960600750597551L), xM.a(26418, 427748747234838272L), xM.a(26418, 427748747234838272L), 2));
                    if (stringArray != null) break block21;
                }
                jLabel.setOpaque(true);
            }
            jLabel.setBackground(new Color(xM.a(26418, 427748747234838272L), xM.a(26418, 427748747234838272L), xM.a(26418, 427748747234838272L), xM.a(20505, 3146127595539148846L)));
        }
        return component;
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
                v0 = "\u000f\nOJ\u001bE\u0010Y\u0017R\u0013|@g\u001b\u001e".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 3;
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
                                v9 = 117;
                                break;
                            }
                            case 1: {
                                v9 = 112;
                                break;
                            }
                            case 2: {
                                v9 = 53;
                                break;
                            }
                            case 3: {
                                v9 = 48;
                                break;
                            }
                            case 4: {
                                v9 = 55;
                                break;
                            }
                            case 5: {
                                v9 = 11;
                                break;
                            }
                            default: {
                                v9 = 94;
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
                xM.a = new String(v10).intern();
                var0_1 = 1561109702469855848L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "\u009b\u00c5\u008c \u00f3,\u00adZ|*=5\u00cf2\u008f\u00f5\u00e5\u00a0\u00b0\u0005(\u00bfc\u0082\u00b3&\r\u009a\u0016)\u00e1\u001f";
                var5_5 = "\u009b\u00c5\u008c \u00f3,\u00adZ|*=5\u00cf2\u008f\u00f5\u00e5\u00a0\u00b0\u0005(\u00bfc\u0082\u00b3&\r\u009a\u0016)\u00e1\u001f".length();
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
                    var4_4 = "\u0080\u0004j\u00f4z\u00a2P]\u00a0\u00de-4\u00c1\u000b\u009a@";
                    var5_5 = "\u0080\u0004j\u00f4z\u00a2P]\u00a0\u00de-4\u00c1\u000b\u009a@".length();
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
        xM.b = var6_2;
        xM.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6032;
        if (c[n11] == null) {
            xM.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

