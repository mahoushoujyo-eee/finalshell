/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class Q1
implements Runnable {
    final nq_0 S;
    final ArrayList f;
    final String D;
    final String d;
    final String h;
    final F6 q;

    Q1(F6 f62, nq_0 nq_02, ArrayList arrayList, String string, String string2, String string3) {
        this.q = f62;
        this.S = nq_02;
        this.f = arrayList;
        this.D = string;
        this.d = string2;
        this.h = string3;
    }

    @Override
    public void run() {
        try {
            this.S.Y(this.f, this.D, this.d, this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

