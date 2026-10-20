/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/*
 * Renamed from Up
 */
class up_0
extends JLabel {
    final bx_0 H;

    up_0(bx_0 bx_02) {
        this.H = bx_02;
    }

    @Override
    public void paint(Graphics graphics) {
        ((JLabel)this.H.z).setBackground((Color)this.H.t);
        this.paintComponent(graphics);
    }
}

