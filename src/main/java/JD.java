/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

class JD
extends WindowAdapter {
    final dl_2 b;

    JD(dl_2 dl_22) {
        this.b = dl_22;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {
            yt_1.F.J(new TB(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

