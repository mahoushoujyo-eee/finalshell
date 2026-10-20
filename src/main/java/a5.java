/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class a5
implements Runnable {
    final FK j;

    a5(FK fK2) {
        this.j = fK2;
    }

    @Override
    public void run() {
        try {
            this.j.z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

