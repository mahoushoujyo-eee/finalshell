/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class gD
extends MouseAdapter {
    final yg_0 H;
    private static final long a;

    private gD(yg_0 yg_02) {
        this.H = yg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        String[] stringArray = aM.s();
        if (stringArray == null) {
            if (mouseEvent.getModifiers() != (int)a) {
                this.H.f = true;
            }
            ((yg_0)this.H).repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.H.f = false;
        ((yg_0)this.H).repaint();
    }

    gD(yg_0 yg_02, ko_1 ko_12) {
        this(yg_02);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7755986918984966462L;
        a = 0x7F91BAB84ACE12EL ^ l2;
    }
}

