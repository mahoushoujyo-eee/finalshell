/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from yw
 */
class yw_2
implements Runnable {
    final FK G;

    yw_2(FK fK2) {
        this.G = fK2;
    }

    @Override
    public void run() {
        try {
            this.G.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

