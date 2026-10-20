/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

class FW
extends MouseAdapter {
    final Color s;
    final Color H;
    final U p;

    FW(U u10, Color color, Color color2) {
        this.p = u10;
        this.s = color;
        this.H = color2;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        U u10 = (U)this.p;
        ((C_)this.p.O).setForeground((Color)this.s);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        ((C_)this.p.O).setForeground((Color)this.H);
    }
}

