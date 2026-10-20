/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class M
implements Runnable {
    final kr_1 n;

    M(kr_1 kr_12) {
        this.n = kr_12;
    }

    @Override
    public void run() {
        Object object;
        try {
            object = this.n.J.d.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.J(this.n.J.G, (Object)((a3)this.n.J.d).getParent(), true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

