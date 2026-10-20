/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import com.co_0;
import com.z.d_0;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Z.h
 */
class h_0
extends MouseAdapter {
    final T h;
    private static final String a;

    h_0(T t2) {
        this.h = t2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block3: {
            block7: {
                String string;
                block6: {
                    co_0 co_02;
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
                            co_02 = this.h.E;
                            if (string != null) break block5;
                            n10 = co_02.getSelectedIndex();
                        }
                        if (n10 == -1) break block3;
                        co_02 = this.h.E;
                    }
                    File file = co_02.J();
                    if (string != null) break block6;
                    if (!file.isDirectory()) break block7;
                    this.h.M(file, d_0.list);
                }
                if (string == null) break block3;
            }
            this.h.v(new ActionEvent(this.h.E, mouseEvent.getID(), a, mouseEvent.getWhen(), mouseEvent.getModifiers()));
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
                char[] cArray3 = "\u0011\u0015xHW,\u00142\u0010qNPi\u0003".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 77;
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
                            n17 = 26;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 89;
                            break;
                        }
                        case 3: {
                            n17 = 96;
                            break;
                        }
                        case 4: {
                            n17 = 105;
                            break;
                        }
                        case 5: {
                            n17 = 65;
                            break;
                        }
                        default: {
                            n17 = 42;
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

