/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;

/*
 * Renamed from k1
 */
class k1_0
extends WindowAdapter {
    final JPanel y;
    final DU G;

    k1_0(DU dU, JPanel jPanel) {
        this.G = dU;
        this.y = jPanel;
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        ((JPanel)this.y).requestFocus();
    }
}

