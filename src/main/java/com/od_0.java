/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.m.G;
import com.m.J;
import com.xg_0;
import java.awt.Component;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.ImageIcon;
import javax.swing.JTree;

/*
 * Renamed from com.Od
 */
public class od_0
extends J {
    public static final ImageIcon Y;
    public static final Map W;

    public static ImageIcon p(ImageIcon imageIcon) {
        ImageIcon imageIcon2 = (ImageIcon)W.get(imageIcon);
        String[] stringArray = cb_1.C();
        ImageIcon imageIcon3 = imageIcon2;
        if (stringArray != null) {
            if (imageIcon3 == null) {
                imageIcon2 = xg_0.I(new ImageIcon[]{imageIcon, Y});
                W.put(imageIcon, imageIcon2);
            }
            imageIcon3 = imageIcon2;
        }
        return imageIcon3;
    }

    @Override
    public G x(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        String[] stringArray = cb_1.C();
        od_0 od_02 = this;
        if (stringArray != null) {
            cb_1 cb_12;
            super.x(jTree, object, bl, bl2, bl3, n10, bl4);
            if (object instanceof cb_1 && (cb_12 = (cb_1)object).d()) {
                this.setIcon(cb_12.Y());
            }
            od_02 = this;
        }
        return od_02;
    }

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        return this.x(jTree, object, bl, bl2, bl3, n10, bl4);
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
                char[] cArray3 = "~8[\r~\u001apv2X\u0006i\u001bfy<".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 18;
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
                            n17 = 5;
                            break;
                        }
                        case 1: {
                            n17 = 73;
                            break;
                        }
                        case 2: {
                            n17 = 38;
                            break;
                        }
                        case 3: {
                            n17 = 113;
                            break;
                        }
                        case 4: {
                            n17 = 31;
                            break;
                        }
                        case 5: {
                            n17 = 39;
                            break;
                        }
                        default: {
                            n17 = 4;
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
        String string = new String(cArray).intern();
        Y = new ImageIcon(cb_1.class.getResource(string));
        W = new WeakHashMap(5);
    }
}

