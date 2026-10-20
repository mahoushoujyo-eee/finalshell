/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class gL
implements Runnable {
    final yt_1 S;

    gL(yt_1 yt_12) {
        this.S = yt_12;
    }

    @Override
    public void run() {
        try {
            c.d(473928376202613579L).invoke(this.S, c.a(new ty_2(ty_2.W)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

