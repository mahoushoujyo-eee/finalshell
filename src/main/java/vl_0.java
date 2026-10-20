/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Vl
 */
class vl_0
implements MouseMotionListener {
    final og_1 Q;

    vl_0(og_1 og_12) {
        this.Q = og_12;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        try {
            this.Q.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
}

