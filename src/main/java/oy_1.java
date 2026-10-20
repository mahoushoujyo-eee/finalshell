/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/*
 * Renamed from oY
 */
class oy_1
implements Comparator {
    final Comparator i = Collator.getInstance(Locale.CHINA);

    oy_1() {
    }

    public int K(YE yE, YE yE2) {
        String string;
        String string2;
        try {
            string2 = (String)yE.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)yE2.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ((Comparator)this.i).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.K((Object)((YE)object), (Object)((YE)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

