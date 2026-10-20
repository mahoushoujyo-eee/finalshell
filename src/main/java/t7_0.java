/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/*
 * Renamed from t7
 */
class t7_0
implements Runnable {
    final yt_1 X;

    t7_0(yt_1 yt_12) {
        this.X = yt_12;
    }

    @Override
    public void run() {
        HashSet hashSet;
        long l2 = System.currentTimeMillis();
        try {
            hashSet = (HashSet)this.X.V.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        HashSet hashSet2 = hashSet;
        try {
            KT.s(hashSet2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.X.V.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.X.V.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ty_2 ty_22 = new ty_2(ty_2.l);
        try {
            c.d(473928376202613579L).invoke(this.X, c.a(ty_22));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

