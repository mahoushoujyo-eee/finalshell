/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ar
 */
class ar_0
extends WindowAdapter {
    final ta_2 M;

    ar_0(ta_2 ta_22) {
        this.M = ta_22;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {
            this.M.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

