/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

public class st {
    private static boolean p;

    public static void main(String[] stringArray) {
        try {
            yt_1.I(stringArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void L(boolean bl) {
        p = bl;
    }

    public static boolean b() {
        return p;
    }

    public static boolean u() {
        boolean bl = st.b();
        return !bl;
    }

    static {
        if (!st.b()) {
            st.L(true);
        }
    }
}

