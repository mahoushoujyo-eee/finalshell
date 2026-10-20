/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

class BK
extends WindowAdapter {
    final U h;

    BK(U u10) {
        this.h = u10;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {
            this.h.r();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

