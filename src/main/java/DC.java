/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class DC
extends JLabel {
    private static final long a;

    public DC(String string) {
        super(string);
        this.setOpaque(true);
        this.setHorizontalAlignment(0);
        int n10 = (int)a;
        this.setForeground(new Color(n10, n10, n10));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1014987571449219614L;
        a = 0xB7E4AA338FAACA7AL ^ l2;
    }
}

