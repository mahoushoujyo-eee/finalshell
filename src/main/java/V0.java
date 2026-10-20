/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class V0
implements Runnable {
    final FK J;

    V0(FK fK2) {
        this.J = fK2;
    }

    @Override
    public void run() {
        try {
            this.J.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

