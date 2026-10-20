/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/*
 * Renamed from Ct
 */
class ct_0
implements Comparator {
    final Comparator G;
    final O8 v;
    final om_0 D;
    String W;
    final String C;
    final y6_0 L;

    ct_0(y6_0 y6_02, String string) {
        this.L = y6_02;
        this.C = string;
        this.G = Collator.getInstance(Locale.CHINA);
        this.v = new O8();
        this.D = new om_0();
        this.W = this.C;
    }

    public int H(ya_1 ya_12, ya_1 ya_13) {
        String[] stringArray = y6_0.Z();
        int n10 = ((String)this.W).equals((String)gR.Y);
        if (stringArray != null) {
            if (n10 != 0) {
                String string;
                String string2;
                try {
                    string2 = (String)ya_12.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    string = (String)ya_13.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return ((Comparator)this.G).compare(string2, string);
            }
            n10 = ((String)this.W).equals((String)gR.s) ? 1 : 0;
        }
        if (stringArray != null) {
            if (n10 != 0) {
                int n11;
                int n12;
                int n13;
                try {
                    n13 = (Integer)ya_12.I();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n12 = (Integer)ya_13.I();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n11 = (Integer)this.D.x((Object)n13, (Object)n12);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return n11;
            }
            n10 = ((String)this.W).equals((String)gR.Z) ? 1 : 0;
        }
        if (stringArray != null) {
            if (n10 != 0) {
                int n14;
                long l2;
                long l3;
                try {
                    l3 = (Long)ya_12.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    l2 = (Long)ya_13.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n14 = (Integer)this.v.t((Object)l3, (Object)l2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return n14;
            }
            n10 = ((String)this.W).equals((String)gR.R) ? 1 : 0;
        }
        if (stringArray != null) {
            if (n10 != 0) {
                int n15;
                long l4;
                long l5;
                try {
                    l5 = (Long)ya_12.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    l4 = (Long)ya_13.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n15 = (Integer)this.v.t((Object)l5, (Object)l4);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return n15;
            }
            n10 = 1;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.H((Object)((ya_1)object), (Object)((ya_1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

