/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uM
 */
public class um_1 {
    long m;
    tl_1 u;
    private static final long a;

    um_1() {
        da_1 da_12 = new da_1(null);
        try {
            yt_1.F.V((Object)new WW(this, da_12), (int)a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            da_12.j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 56449889732039166L;
        a = 0xA681956329169216L ^ l2;
    }
}

