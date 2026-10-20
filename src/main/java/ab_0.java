/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from ab
 */
class ab_0
implements Comparator {
    final boolean h;

    ab_0(boolean bl) {
        this.h = bl;
    }

    public int a(File file, File file2) {
        long l2;
        long l3;
        try {
            l3 = (Long)KT.i(file.getName());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        long l4 = l3;
        try {
            l2 = (Long)KT.i(file2.getName());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        long l5 = l2;
        boolean bl = KT.F();
        int n10 = this.h;
        if (bl) {
            if (n10 == 0) {
                return Long.compare(l4, l5);
            }
            n10 = Long.compare(l5, l4);
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.a((Object)((File)object), (Object)((File)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

