/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class BD
implements Runnable {
    final ty_0 l;

    BD(ty_0 ty_02) {
        this.l = ty_02;
    }

    @Override
    public void run() {
        try {
            this.l.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

