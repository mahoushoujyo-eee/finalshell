/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class OG
implements Runnable {
    final ArrayList R;
    final CB V;

    OG(CB cB, ArrayList arrayList) {
        this.V = cB;
        this.R = arrayList;
    }

    @Override
    public void run() {
        try {
            this.V.F.j(this.R);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

