/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/*
 * Renamed from com.xk
 */
public class xk_2
extends ImageIcon {
    private static int h;

    public xk_2() {
    }

    public xk_2(byte[] byArray) {
        super(byArray);
    }

    public xk_2(byte[] byArray, String string) {
        super(byArray, string);
    }

    public xk_2(Image image) {
        super(image);
    }

    public xk_2(Image image, String string) {
        super(image, string);
    }

    public xk_2(URL uRL) {
        super(uRL);
    }

    public xk_2(URL uRL, String string) {
        super(uRL, string);
    }

    public xk_2(String string) {
        super(string);
    }

    public xk_2(String string, String string2) {
        super(string, string2);
    }

    public xk_2(ImageIcon imageIcon) {
        super(imageIcon.getImage());
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        block4: {
            boolean bl;
            int n12;
            int n13;
            block5: {
                int n14;
                block2: {
                    block3: {
                        n13 = this.getIconWidth();
                        n12 = this.getIconHeight();
                        n14 = xk_2.K();
                        if (n14 == 0) break block2;
                        if (component == null) break block3;
                        bl = component.getComponentOrientation().isLeftToRight();
                        if (n14 == 0) break block4;
                        if (!bl) break block5;
                    }
                    graphics.drawImage(this.getImage(), n10, n11, n13, n12, this.getImageObserver());
                }
                if (n14 != 0) break block4;
                ky_2.K(new String[2]);
            }
            bl = graphics.drawImage(this.getImage(), n10 + n13, n11, -n13, n12, this.getImageObserver());
        }
    }

    public static void w(int n10) {
        h = n10;
    }

    public static int K() {
        return h;
    }

    public static int e() {
        int n10 = xk_2.K();
        if (n10 == 0) {
            return 31;
        }
        return 0;
    }

    static {
        if (xk_2.K() == 0) {
            xk_2.w(38);
        }
    }
}

