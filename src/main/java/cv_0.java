/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Cv
 */
class cv_0
implements Runnable {
    final og_0 s;

    cv_0(og_0 og_02) {
        this.s = og_02;
    }

    @Override
    public void run() {
        try {
            this.s.R.D.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

