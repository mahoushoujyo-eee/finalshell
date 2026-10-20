/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class x6
extends WindowAdapter {
    final U J;

    x6(U u10) {
        this.J = u10;
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        ArrayList arrayList;
        super.windowActivated(windowEvent);
        try {
            arrayList = (ArrayList)this.J.C.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (arrayList.size() > 0) {
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
        }
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        super.windowDeactivated(windowEvent);
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        super.windowIconified(windowEvent);
    }
}

