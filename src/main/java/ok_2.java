/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/*
 * Renamed from ok
 */
class ok_2
implements PopupMenuListener {
    final KQ L;
    final aJ v;

    ok_2(aJ aJ2, KQ kQ) {
        this.v = aJ2;
        this.L = kQ;
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        try {
            this.L.r(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        try {
            this.L.r(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

