/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

/*
 * Renamed from bT
 */
class bt_1
implements Runnable {
    final yt_1 j;

    bt_1(yt_1 yt_12) {
        this.j = yt_12;
    }

    @Override
    public void run() {
        this.j.E = new ta_0();
        try {
            c.d(473928376202613579L).invoke(this.j, c.a(new ty_2(ty_2.E)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        U.u = new C5((Window)new JFrame());
        try {
            yt_1.F.J(new V8(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

