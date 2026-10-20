/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Dc
 */
class dc_0
extends ComponentAdapter {
    final U A;

    dc_0(U u10) {
        this.A = u10;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        try {
            this.A.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        try {
            this.A.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

