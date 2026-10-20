/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/*
 * Renamed from y2
 */
class y2_0
implements Comparator {
    final Comparator d = Collator.getInstance(Locale.CHINA);

    y2_0() {
    }

    public int M(YE yE, YE yE2) {
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
        return ((Comparator)this.d).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.M((Object)((YE)object), (Object)((YE)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

