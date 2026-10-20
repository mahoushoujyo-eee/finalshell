/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class aB {
    ArrayList h;
    N a;

    public N q(String string) {
        N n102;
        block4: {
            N n11 = null;
            String string2 = W2.F();
            for (N n102 : (ArrayList)this.h) {
                String string3;
                if (string2 == null) break block4;
                N n12 = n102;
                try {
                    string3 = (String)n12.o();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (string.equals(string3)) {
                    n11 = n12;
                }
                if (string2 != null) continue;
            }
            n102 = n11;
        }
        return n102;
    }

    public ArrayList q() {
        return (ArrayList)this.h;
    }

    public void r(ArrayList arrayList) {
        this.h = arrayList;
    }

    public N x() {
        return (N)this.a;
    }

    public void S(N n10) {
        this.a = n10;
    }
}

