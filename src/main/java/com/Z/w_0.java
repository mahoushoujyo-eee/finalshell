/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import com.pg_0;
import com.z.d_0;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Z.w
 */
class w_0
extends MouseAdapter {
    final T L;
    private static final String a;

    w_0(T t2) {
        this.L = t2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block3: {
            block7: {
                String string;
                block6: {
                    pg_0 pg_02;
                    block5: {
                        int n10;
                        block4: {
                            block2: {
                                string = T.v();
                                n10 = SwingUtilities.isLeftMouseButton(mouseEvent);
                                if (string != null) break block2;
                                if (n10 == 0) break block3;
                                n10 = mouseEvent.getClickCount() % 2;
                            }
                            if (string != null) break block4;
                            if (n10 != 0) break block3;
                            pg_02 = this.L.hD;
                            if (string != null) break block5;
                            n10 = pg_02.getSelectedRow();
                        }
                        if (n10 == -1) break block3;
                        pg_02 = this.L.hD;
                    }
                    File file = pg_02.S();
                    if (string != null) break block6;
                    if (!file.isDirectory()) break block7;
                    this.L.M(file, d_0.table);
                }
                if (string == null) break block3;
            }
            this.L.v(new ActionEvent(this.L.hD, mouseEvent.getID(), a, mouseEvent.getWhen(), mouseEvent.getModifiers()));
        }
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
                char[] cArray3 = "yg\ttj\u00146Zb\u0000rmQ!".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 99;
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
                            n17 = 92;
                            break;
                        }
                        case 1: {
                            n17 = 109;
                            break;
                        }
                        case 2: {
                            n17 = 6;
                            break;
                        }
                        case 3: {
                            n17 = 114;
                            break;
                        }
                        case 4: {
                            n17 = 122;
                            break;
                        }
                        case 5: {
                            n17 = 87;
                            break;
                        }
                        default: {
                            n17 = 38;
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

