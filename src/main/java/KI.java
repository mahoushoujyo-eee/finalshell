/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

class KI
implements Runnable {
    final uf_2 z;
    final a3 D;

    KI(a3 a32, uf_2 uf_22) {
        this.D = a32;
        this.z = uf_22;
    }

    @Override
    public void run() {
        Iterator iterator = ((ArrayList)this.D.g).iterator();
        int[] nArray = a3.I();
        while (iterator.hasNext()) {
            td_2 td_22 = (td_2)iterator.next();
            try {
                td_22.E(this.z);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (nArray != null) continue;
        }
    }
}

