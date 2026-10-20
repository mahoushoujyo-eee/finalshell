/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KT;
import com.c;
import com.cj_2;
import com.ky_2;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.n2
 */
public class n2_0 {
    static boolean M;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    public static String[] j(Component component, String string, String string2, String string3, String[] stringArray, boolean[] blArray) {
        block15: {
            String[] stringArray2;
            block10: {
                int n10;
                String[] stringArray3;
                JTextField[] jTextFieldArray;
                String[] stringArray4;
                block14: {
                    JPanel jPanel;
                    block9: {
                        GridBagConstraints gridBagConstraints = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, n2_0.a(23871, 4926583747465766740L), 0, new Insets(0, 0, 0, 0), 0, 0);
                        jPanel = new JPanel();
                        jPanel.setLayout(new GridBagLayout());
                        gridBagConstraints.weightx = 1.0;
                        String[] stringArray5 = cj_2.v();
                        gridBagConstraints.gridwidth = 0;
                        gridBagConstraints.gridx = 0;
                        jPanel.add((Component)new JLabel(string3), gridBagConstraints);
                        ++gridBagConstraints.gridy;
                        stringArray4 = stringArray5;
                        gridBagConstraints.gridwidth = -1;
                        jTextFieldArray = new JTextField[stringArray.length];
                        for (int i2 = 0; i2 < stringArray.length; ++i2) {
                            block13: {
                                block12: {
                                    block11: {
                                        gridBagConstraints.fill = 0;
                                        gridBagConstraints.gridx = 0;
                                        gridBagConstraints.weightx = 1.0;
                                        jPanel.add((Component)new JLabel(stringArray[i2]), gridBagConstraints);
                                        gridBagConstraints.gridx = 1;
                                        gridBagConstraints.fill = 2;
                                        gridBagConstraints.weighty = 1.0;
                                        if (stringArray4 != null) break block9;
                                        if (stringArray4 != null) break block11;
                                        if (!blArray[i2]) break block12;
                                        jTextFieldArray[i2] = new JTextField(n2_0.a(21109, 4954518799755470877L));
                                    }
                                    if (stringArray4 == null) break block13;
                                    ky_2.K(new String[5]);
                                }
                                jTextFieldArray[i2] = new JPasswordField(n2_0.a(17114, 3560628322228402352L));
                            }
                            jPanel.add((Component)jTextFieldArray[i2], gridBagConstraints);
                            ++gridBagConstraints.gridy;
                            if (stringArray4 == null) continue;
                        }
                        ((ScheduledExecutorService)yt_1.p).schedule(new KT(jTextFieldArray), d, TimeUnit.MILLISECONDS);
                    }
                    stringArray3 = null;
                    Component component2 = SwingUtilities.getRoot(component);
                    int n11 = JOptionPane.showConfirmDialog(component2, jPanel, string + a + string2, 2, 3);
                    if (stringArray4 == null) {
                        n11 = n11 == 0 ? 1 : 0;
                    }
                    M = n11;
                    n10 = M;
                    if (stringArray4 != null) break block14;
                    if (n10 == 0) break block15;
                    n10 = stringArray.length;
                }
                stringArray3 = new String[n10];
                for (int i3 = 0; i3 < stringArray.length; ++i3) {
                    stringArray2 = stringArray3;
                    if (stringArray4 == null) {
                        stringArray2[i3] = jTextFieldArray[i3].getText();
                        if (stringArray4 == null) continue;
                    }
                    break block10;
                }
                stringArray2 = stringArray3;
            }
            return stringArray2;
        }
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\u000b,".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 84;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 101;
                            break;
                        }
                        case 1: {
                            n17 = 88;
                            break;
                        }
                        case 2: {
                            n17 = 80;
                            break;
                        }
                        case 3: {
                            n17 = 85;
                            break;
                        }
                        case 4: {
                            n17 = 3;
                            break;
                        }
                        case 5: {
                            n17 = 11;
                            break;
                        }
                        default: {
                            n17 = 65;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 12962125292041866L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "fRo.\u00ea\u000e\u008e.ZpP\u00c7\u0016x\u0011\u00cc\u009f;\u00e0\u0010\u00dd\u00fb\u009e\u0083";
        int n19 = "fRo.\u00ea\u000e\u008e.ZpP\u00c7\u0016x\u0011\u00cc\u009f;\u00e0\u0010\u00dd\u00fb\u009e\u0083".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
        long l3 = 4609907156515215858L;
        d = 0x3FF9AE226F9ED93AL ^ l3;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3A6A;
        if (c[n11] == null) {
            n2_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

