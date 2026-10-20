/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mg
 */
class mg_0
implements Runnable {
    final yf_2 j;

    mg_0(yf_2 yf_22) {
        this.j = yf_22;
    }

    @Override
    public void run() {
        try {
            this.j.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

