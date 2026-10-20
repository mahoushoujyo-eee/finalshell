/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from f6
 */
class f6_0
extends WindowAdapter {
    final U a;

    f6_0(U u10) {
        this.a = u10;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        try {
            this.a.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        try {
            this.a.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        try {
            this.a.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {
            this.a.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        try {
            this.a.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        try {
            this.a.hM.l(this.a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.a.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

