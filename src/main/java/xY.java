/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class xY
implements PopupMenuListener {
    xY() {
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        YJ.q = System.currentTimeMillis();
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
    }
}

