/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/*
 * Renamed from tK
 */
class tk_1
implements PopupMenuListener {
    final KQ m;
    final oq_1 z;

    tk_1(oq_1 oq_12, KQ kQ) {
        this.z = oq_12;
        this.m = kQ;
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        try {
            this.m.r(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        try {
            this.m.r(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

