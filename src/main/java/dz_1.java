/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;

/*
 * Renamed from dZ
 */
class dz_1
implements Icon {
    final Image H;
    final Icon d;

    dz_1(Image image, Icon icon) {
        this.H = image;
        this.d = icon;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        graphics.drawImage((Image)this.H, n10, n11, component);
    }

    @Override
    public int getIconWidth() {
        return ((Icon)this.d).getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return ((Icon)this.d).getIconHeight();
    }
}

