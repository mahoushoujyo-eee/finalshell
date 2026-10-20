/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;

/*
 * Renamed from tY
 */
class ty_1
implements Comparator {
    final Collator z;

    ty_1(Collator collator) {
        this.z = collator;
    }

    public int M(ck_2 ck_22, ck_2 ck_23) {
        String string;
        String string2;
        try {
            string2 = (String)ck_22.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)ck_23.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ((Collator)this.z).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.M((Object)((ck_2)object), (Object)((ck_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

