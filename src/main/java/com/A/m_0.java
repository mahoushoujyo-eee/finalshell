/*
 * Decompiled with CFR 0.152.
 */
package com.a;

import com.FN;
import com.eu_1;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * Renamed from com.A.m
 */
public class m_0
extends JComponent {
    public static final ImageIcon O;
    private static final Dimension h;

    public m_0() {
        FN.Y(this);
        this.setCursor(Cursor.getPredefinedCursor(5));
        eu_1.x(this, 4);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(O.getImage(), this.getWidth() - O.getIconWidth(), this.getHeight() - O.getIconHeight(), null);
    }

    @Override
    public Dimension getPreferredSize() {
        return h;
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
                char[] cArray3 = "-)?O,,T+8>D--G*-".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 79;
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
                            n17 = 11;
                            break;
                        }
                        case 1: {
                            n17 = 5;
                            break;
                        }
                        case 2: {
                            n17 = 31;
                            break;
                        }
                        case 3: {
                            n17 = 110;
                            break;
                        }
                        case 4: {
                            n17 = 16;
                            break;
                        }
                        case 5: {
                            n17 = 76;
                            break;
                        }
                        default: {
                            n17 = 120;
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
        O = new ImageIcon(m_0.class.getResource(string));
        h = new Dimension(O.getIconWidth(), O.getIconHeight());
    }
}

