/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class DG
implements PopupMenuListener {
    final y1_0 W;

    DG(y1_0 y1_02) {
        this.W = y1_02;
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        this.W.f = System.currentTimeMillis();
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
    }
}

