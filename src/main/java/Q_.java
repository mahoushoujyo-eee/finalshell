/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;

class Q_
implements Comparator {
    final Collator x;

    Q_(Collator collator) {
        this.x = collator;
    }

    public int x(tf_2 tf_22, tf_2 tf_23) {
        String string;
        String string2;
        try {
            string2 = (String)tf_22.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)tf_23.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return ((Collator)this.x).compare(string2, string);
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.x((Object)((tf_2)object), (Object)((tf_2)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

