/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.PJ;
import com.n1;
import com.om_0;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/*
 * Renamed from com.Ot
 */
public class ot_0
extends om_0 {
    public static final ImageIcon s;
    private AWTEventListener h = null;
    private static final long a;

    public ot_0() {
        this.setIcon(s);
        this.h = new n1(this);
        Toolkit.getDefaultToolkit().addAWTEventListener(this.h, a);
    }

    private void S(MouseEvent mouseEvent) {
        FN.p(new PJ(this, mouseEvent));
    }

    static void s(ot_0 ot_02, MouseEvent mouseEvent) {
        ot_02.S(mouseEvent);
    }

    static AWTEventListener a(ot_0 ot_02) {
        return ot_02.h;
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
                char[] cArray3 = "\u0018'5\u007fq##\u00046)~p\"0\u001f#".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 54;
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
                            n17 = 71;
                            break;
                        }
                        case 1: {
                            n17 = 114;
                            break;
                        }
                        case 2: {
                            n17 = 108;
                            break;
                        }
                        case 3: {
                            n17 = 39;
                            break;
                        }
                        case 4: {
                            n17 = 52;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 118;
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
        long l2 = 2591893747437425493L;
        a = 0x23F841A17F905345L ^ l2;
        s = new ImageIcon(ot_0.class.getResource(string));
    }
}

