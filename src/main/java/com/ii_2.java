/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._Q;
import com.co_0;
import com.ui_0;
import com.uv_0;
import com.wx_2;
import com.yc_0;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * Renamed from com.ii
 */
public class ii_2
implements ListCellRenderer {
    protected Map V = new HashMap();
    private static final String a;

    /*
     * Unable to fully structure code
     */
    public Component getListCellRendererComponent(JList var1_1, Object var2_2, int var3_3, boolean var4_4, boolean var5_5) {
        var7_6 = (uv_0)var2_2;
        var8_7 = this.m(var7_6);
        v0 = co_0.U();
        var8_7.setFont(var1_1.getFont());
        var6_8 = v0;
        v1 = var8_7;
        v2 = var1_1;
        if (var6_8 == null) ** GOTO lbl15
        v1.setEnabled(v2.isEnabled());
        v1 = var8_7;
        if (var4_4) {
            v3 = var1_1.getSelectionForeground();
        } else {
            v2 = var1_1;
lbl15:
            // 2 sources

            v3 = v2.getForeground();
        }
        v1.setForeground(v3);
        v4 = var7_6.g();
        if (var6_8 == null) ** GOTO lbl23
        if (v4 == null) {
            v5 = "";
        } else {
            v4 = var7_6.g();
lbl23:
            // 2 sources

            v5 = v4.toString();
        }
        var8_7.setText(v5);
        var9_9 = var1_1.getUI();
        v6 = var9_9 instanceof yc_0;
        if (var6_8 != null) {
            v6 = v6 != 0 ? ((yc_0)var9_9).y() : wx_2.y;
        }
        var10_10 = v6;
        var8_7.f(var10_10 + 2, var10_10 + 2, var10_10 + 2, var10_10 + 4);
        var8_7.setComponentOrientation(var1_1.getComponentOrientation());
        return var8_7;
    }

    public ui_0 m(uv_0 uv_02) {
        String string;
        block3: {
            String string2;
            Map map;
            block2: {
                string = uv_02.o();
                String string3 = co_0.U();
                map = this.V;
                string2 = string;
                if (string3 == null) break block2;
                if (!map.containsKey(string2)) break block3;
                map = this.V;
                string2 = string;
            }
            ui_0 ui_02 = (ui_0)map.get(string2);
            ui_02.M(uv_02.Z(), _Q.v);
            return ui_02;
        }
        ui_0 ui_03 = new ui_0();
        ui_03.setName(a);
        ui_03.M(uv_02.Z(), false);
        this.V.put(string, ui_03);
        return ui_03;
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
                char[] cArray3 = "\u0012eyCs#S2`XR3$S,ix".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 92;
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
                            n17 = 2;
                            break;
                        }
                        case 1: {
                            n17 = 80;
                            break;
                        }
                        case 2: {
                            n17 = 86;
                            break;
                        }
                        case 3: {
                            n17 = 107;
                            break;
                        }
                        case 4: {
                            n17 = 1;
                            break;
                        }
                        case 5: {
                            n17 = 28;
                            break;
                        }
                        default: {
                            n17 = 106;
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
    }
}

