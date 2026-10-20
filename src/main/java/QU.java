/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class QU
extends JScrollPane {
    QU(Component component, int n10, int n11) {
        super(component, n10, n11);
    }

    @Override
    public void paint(Graphics graphics) {
        block4: {
            Component[] componentArray = this.getComponents();
            ky_2[] ky_2Array = yt_1.c();
            Component[] componentArray2 = componentArray;
            int n10 = componentArray2.length;
            int n11 = 0;
            while (n11 < n10) {
                Component component = componentArray2[n11];
                if (ky_2Array != null) {
                    if (ky_2Array != null) {
                        if (component instanceof JViewport) {
                            JViewport jViewport = (JViewport)component;
                            jViewport.setOpaque(false);
                        }
                        ++n11;
                    }
                    if (ky_2Array != null) continue;
                }
                break block4;
            }
            super.paint(graphics);
        }
    }
}

