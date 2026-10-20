/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Qz
 */
class qz_0
implements Runnable {
    final File j;
    final U I;
    final d9_0 g;

    qz_0(d9_0 d9_02, File file, U u10) {
        this.g = d9_02;
        this.j = file;
        this.I = u10;
    }

    @Override
    public void run() {
        try {
            this.g.c.e(this.j, this.I);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

