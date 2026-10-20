/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

class x_
implements MouseMotionListener {
    final bq_0 V;

    x_(bq_0 bq_02) {
        this.V = bq_02;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        try {
            this.V.r();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        try {
            this.V.r();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

