/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

public abstract class zP {
    protected zP() {
    }

    public abstract Object o();

    public abstract int U();

    public abstract int i();

    public abstract Object o(int var1, int var2);

    public String L(int n10, int n11) {
        String string;
        Object object;
        try {
            object = this.o(n10, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Object object2 = object;
        boolean bl = uo_0.k();
        Object object3 = object2;
        if (bl) {
            if (object3 == null) {
                return "";
            }
            object3 = object2;
        }
        String string2 = string = object3.toString();
        if (bl) {
            if (string2 == null) {
                return "";
            }
            string2 = string;
        }
        return string2;
    }

    public abstract Object U(int var1);
}

