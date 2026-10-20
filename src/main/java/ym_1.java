/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from yM
 */
class ym_1
extends ComponentAdapter {
    final KQ q;

    ym_1(KQ kQ) {
        this.q = kQ;
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
        ((KQ)this.q).setFocusableWindowState(true);
        ((KQ)this.q).getContentPane().requestFocus();
        SwingUtilities.invokeLater(new nV(this));
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
        ((KQ)this.q).setFocusableWindowState(false);
    }
}

