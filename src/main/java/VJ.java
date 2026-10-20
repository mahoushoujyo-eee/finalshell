/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class VJ
extends JScrollPane {
    final F6 G;

    VJ(F6 f62, Component component) {
        this.G = f62;
        super(component);
    }

    @Override
    public void paint(Graphics graphics) {
        block4: {
            Component[] componentArray = this.getComponents();
            boolean bl = F6.i();
            Component[] componentArray2 = componentArray;
            int n10 = componentArray2.length;
            int n11 = 0;
            while (n11 < n10) {
                Component component = componentArray2[n11];
                if (bl) {
                    if (bl) {
                        if (component instanceof JViewport) {
                            JViewport jViewport = (JViewport)component;
                            jViewport.setOpaque(false);
                        }
                        ++n11;
                    }
                    if (bl) continue;
                }
                break block4;
            }
            super.paint(graphics);
        }
    }
}

