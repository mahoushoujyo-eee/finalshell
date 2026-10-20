/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class JV
implements Runnable {
    final CB y;

    JV(CB cB) {
        this.y = cB;
    }

    @Override
    public void run() {
        block5: {
            CB cB;
            block4: {
                String[] stringArray = KV.b();
                cB = (CB)this.y;
                if (stringArray != null) break block4;
                if (!cB.U) break block5;
                cB = (CB)this.y;
            }
            try {
                cB.V();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

