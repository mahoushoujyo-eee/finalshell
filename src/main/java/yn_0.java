/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Yn
 */
class yn_0
implements Runnable {
    final ln_0 N;
    private static final long a;

    yn_0(ln_0 ln_02) {
        this.N = ln_02;
    }

    @Override
    public void run() {
        int n10;
        boolean bl = ln_2.R();
        try {
            n10 = ((Boolean)this.N.v()).booleanValue();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (!bl) {
            if (n10 == 0) {
                return;
            }
            n10 = (int)a;
        }
        int n11 = n10;
        try {
            this.N.Q(n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4470594266267196051L;
        a = 0x8CD8D11C87C16FA3L ^ l2;
    }
}

