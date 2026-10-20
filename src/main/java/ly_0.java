/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

/*
 * Renamed from Ly
 */
class ly_0
implements WindowFocusListener {
    final C5 x;

    ly_0(C5 c5) {
        this.x = c5;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        this.x.F = System.currentTimeMillis();
        ((C5)this.x).setVisible(false);
    }
}

