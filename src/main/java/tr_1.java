/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JSplitPane;

/*
 * Renamed from tR
 */
class tr_1
implements PropertyChangeListener {
    final yb_1 Y;

    tr_1(yb_1 yb_12) {
        this.Y = yb_12;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        u6_0 u6_02;
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            u6_02 = (u6_0)object.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        u6_0 u6_03 = u6_02;
        int n10 = ((JSplitPane)this.Y.a).getDividerLocation();
        try {
            u6_03.b(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

