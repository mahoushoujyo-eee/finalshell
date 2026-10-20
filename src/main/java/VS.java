/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.beans.ConstructorProperties;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class VS
extends AbstractBorder {
    private static Border n;
    private static Border e;
    protected int m;
    protected Color j;
    protected boolean t;

    public static Border z() {
        String string = km_0.U();
        Border border = (Border)VS.n;
        if (string == null) {
            if (border == null) {
                VS.n = new VS(Color.black, 1);
            }
            border = (Border)VS.n;
        }
        return border;
    }

    public static Border i() {
        String string = km_0.U();
        Border border = (Border)VS.e;
        if (string == null) {
            if (border == null) {
                VS.e = new VS(Color.gray, 1);
            }
            border = (Border)VS.e;
        }
        return border;
    }

    public VS(Color color) {
        this(color, 1, false);
    }

    public VS(Color color, int n10) {
        this(color, n10, false);
    }

    @ConstructorProperties(value={"lineColor", "thickness", "roundedCorners"})
    public VS(Color color, int n10, boolean bl) {
        this.j = color;
        this.m = n10;
        this.t = bl;
    }

    @Override
    public void paintBorder(Component component, Graphics graphics, int n10, int n11, int n12, int n13) {
        block3: {
            Graphics graphics2;
            block4: {
                int n14;
                block2: {
                    String string = km_0.U();
                    n14 = this.m;
                    if (string != null) break block2;
                    if (n14 <= 0) break block3;
                    graphics2 = graphics;
                    if (string != null) break block4;
                    n14 = graphics2 instanceof Graphics2D;
                }
                if (n14 == 0) break block3;
                graphics2 = graphics;
            }
            Graphics2D graphics2D = (Graphics2D)graphics2;
            Color color = graphics2D.getColor();
            graphics2D.setColor((Color)this.j);
            graphics2D.drawRect(0, 0, n12 - 1, n13 - 1);
            graphics2D.setColor(color);
        }
    }

    @Override
    public Insets getBorderInsets(Component component, Insets insets) {
        insets.set(this.m, this.m, this.m, this.m);
        return insets;
    }

    public Color getJ() {
        return (Color)this.j;
    }

    public int getM() {
        return this.m;
    }

    public boolean getT() {
        return this.t;
    }

    @Override
    public boolean isBorderOpaque() {
        String string = km_0.U();
        boolean bl = this.t;
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }
}

