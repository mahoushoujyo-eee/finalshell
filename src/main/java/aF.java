/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class aF
implements ChangeListener {
    final qg_0 d;

    aF(qg_0 qg_02) {
        this.d = qg_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        try {
            this.d.t.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((vn_0)this.d.t).repaint();
    }
}

