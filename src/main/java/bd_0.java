/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Bd
 */
class bd_0
implements Runnable {
    final U X;
    final fo_2 F;

    bd_0(fo_2 fo_22, U u10) {
        this.F = fo_22;
        this.X = u10;
    }

    @Override
    public void run() {
        try {
            this.X.K();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

