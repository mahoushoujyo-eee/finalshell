/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/*
 * Renamed from lK
 */
class lk_1
implements Comparator {
    final Comparator K = Collator.getInstance(Locale.CHINA);

    lk_1() {
    }

    public int U(ld_1 ld_12, ld_1 ld_13) {
        String string;
        String string2;
        try {
            string2 = (String)ld_12.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)ld_13.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ((Comparator)this.K).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.U((Object)((ld_1)object), (Object)((ld_1)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

