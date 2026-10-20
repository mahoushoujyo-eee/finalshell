/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

class YX
implements MouseMotionListener {
    final bq_0 U;

    YX(bq_0 bq_02) {
        this.U = bq_02;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.U.g = System.currentTimeMillis();
        try {
            this.U.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
}

