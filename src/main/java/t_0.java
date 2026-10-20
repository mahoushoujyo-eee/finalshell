/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/*
 * Renamed from t
 */
public class t_0
extends JLabel {
    RenderingHints z;

    public t_0(String string) {
        super(string);
        this.setFont((Font)fx_2.b);
        this.z = new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        this.setOpaque(false);
        this.setHorizontalAlignment(0);
        this.setForeground((Color)fx_2.p);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
    }

    public RenderingHints P() {
        return (RenderingHints)this.z;
    }

    public void C(RenderingHints renderingHints) {
        this.z = renderingHints;
    }
}

