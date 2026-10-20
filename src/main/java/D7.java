/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class D7
implements Runnable {
    final mV B;

    D7(mV mV2) {
        this.B = mV2;
    }

    @Override
    public void run() {
        block4: {
            mV mV2;
            block3: {
                boolean bl = ln_2.i();
                mV2 = (mV)this.B;
                if (!bl) break block3;
                if (!mV2.H) break block4;
                try {
                    this.B.I();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                mV2 = (mV)this.B;
            }
            mV2.H = false;
        }
    }
}

