/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class L4
extends JScrollPane {
    final xl_0 S;

    L4(xl_0 xl_02, Component component) {
        this.S = xl_02;
        super(component);
    }

    @Override
    public void paint(Graphics graphics) {
        block4: {
            Component[] componentArray;
            Component[] componentArray2 = componentArray = this.getComponents();
            boolean bl = F6.i();
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

