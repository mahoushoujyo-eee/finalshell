/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from tP
 */
class tp_1
implements WindowFocusListener {
    final FK u;

    tp_1(FK fK2) {
        this.u = fK2;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
        this.u.f = System.currentTimeMillis();
        ((dv_0)this.u.Z).requestFocus();
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        try {
            this.u.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.u.l_ = System.currentTimeMillis();
    }
}

