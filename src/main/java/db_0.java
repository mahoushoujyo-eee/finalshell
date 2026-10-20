/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Db
 */
class db_0
implements MouseMotionListener {
    final vn_0 i;

    db_0(vn_0 vn_02) {
        this.i = vn_02;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        try {
            this.i.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
}

