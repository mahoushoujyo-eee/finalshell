/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Uu
 */
class uu_0
extends MouseAdapter {
    final JR Z;

    uu_0(JR jR) {
        this.Z = jR;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        n_0 n_02;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n10 = ((JR)this.Z).columnAtPoint(mouseEvent.getPoint());
        String string = ((JR)this.Z).getColumnName(n10);
        try {
            object5 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4 = object5.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = object4.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n_02 = (n_0)object.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        n_0 n_03 = n_02;
    }
}

