/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;

/*
 * Renamed from lJ
 */
class lj_1
implements Runnable {
    final Socket t;
    final ga_0 I;

    lj_1(ga_0 ga_02, Socket socket) {
        this.I = ga_02;
        this.t = socket;
    }

    @Override
    public void run() {
        try {
            this.I.K.Y(this.t);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

