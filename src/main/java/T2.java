/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

class T2
implements Icon {
    final Icon V;

    T2(Icon icon) {
        this.V = icon;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        ((Icon)this.V).paintIcon(component, graphics, n10, n11);
        ((Icon)lk_0.H).paintIcon(component, graphics, n10, n11);
    }

    @Override
    public int getIconWidth() {
        return ((Icon)this.V).getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return ((Icon)this.V).getIconHeight();
    }
}

