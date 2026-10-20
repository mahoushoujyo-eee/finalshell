/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class BF
implements Runnable {
    final ArrayList h;
    final CB R;

    BF(CB cB, ArrayList arrayList) {
        this.R = cB;
        this.h = arrayList;
    }

    @Override
    public void run() {
        try {
            this.R.F.o(this.h);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

