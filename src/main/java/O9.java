/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class O9
implements Runnable {
    final FK E;

    O9(FK fK2) {
        this.E = fK2;
    }

    @Override
    public void run() {
        try {
            this.E.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

