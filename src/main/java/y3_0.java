/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from y3
 */
class y3_0
extends MouseAdapter {
    final aj_0 R;

    y3_0(aj_0 aj_02) {
        this.R = aj_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Object object;
        super.mouseClicked(mouseEvent);
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.T();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

