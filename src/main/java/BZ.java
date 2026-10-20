/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class BZ
implements Comparator {
    final Comparator X = Collator.getInstance(Locale.CHINA);

    BZ() {
    }

    public int M(ln_1 ln_12, ln_1 ln_13) {
        String string;
        String string2;
        try {
            string2 = (String)ln_12.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)ln_13.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ((Comparator)this.X).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.M((Object)((ln_1)object), (Object)((ln_1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

