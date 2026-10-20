/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.OS;
import com.ky_2;
import com.wx_2;
import com.yc_0;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * Renamed from com.Oq
 */
public class oq_0
extends OS
implements ListCellRenderer {
    private static final String c;

    public oq_0() {
        this.setName(c);
    }

    /*
     * Unable to fully structure code
     */
    public Component getListCellRendererComponent(JList var1_1, Object var2_2, int var3_3, boolean var4_4, boolean var5_5) {
        block7: {
            block5: {
                block6: {
                    v0 = CI.c();
                    this.setFont(var1_1.getFont());
                    var6_6 = v0;
                    v1 = this;
                    v2 = var1_1;
                    if (var6_6 != null) ** GOTO lbl13
                    v1.setEnabled(v2.isEnabled());
                    v1 = this;
                    if (var4_4) {
                        v3 = var1_1.getSelectionForeground();
                    } else {
                        v2 = var1_1;
lbl13:
                        // 2 sources

                        v3 = v2.getForeground();
                    }
                    v1.setForeground(v3);
                    if (var6_6 != null) break block5;
                    if (!(var2_2 instanceof Icon)) break block6;
                    this.setIcon((Icon)var2_2);
                    this.setText("");
                    if (var6_6 == null) break block7;
                    ky_2.K(new String[2]);
                }
                this.setIcon(null);
            }
            v4 = var2_2;
            if (var6_6 != null) ** GOTO lbl30
            if (v4 == null) {
                v5 = "";
            } else {
                v4 = var2_2;
lbl30:
                // 2 sources

                v5 = v4.toString();
            }
            this.setText(v5);
        }
        var7_7 = var1_1.getUI();
        v6 = var7_7 instanceof yc_0;
        if (var6_6 == null) {
            v6 = v6 != 0 ? ((yc_0)var7_7).y() : wx_2.y;
        }
        var8_8 = v6;
        this.G(var8_8 + 2, var8_8 + (this.getIcon() != null ? 2 : 4), var8_8 + 2, var8_8 + 4);
        this.setComponentOrientation(var1_1.getComponentOrientation());
        return this;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "<U\u0017N\u001aH?\u001cP6_ZO?\u0002Y\u0016".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 95;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 99;
                            break;
                        }
                        case 2: {
                            n17 = 59;
                            break;
                        }
                        case 3: {
                            n17 = 101;
                            break;
                        }
                        case 4: {
                            n17 = 107;
                            break;
                        }
                        case 5: {
                            n17 = 116;
                            break;
                        }
                        default: {
                            n17 = 5;
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
        c = new String(cArray).intern();
    }
}

