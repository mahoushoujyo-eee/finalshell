/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Dw
 */
class dw_0
implements KeyListener {
    final km_0 d;

    dw_0(km_0 km_02) {
        this.d = km_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        try {
            this.d.U.K(keyEvent);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

