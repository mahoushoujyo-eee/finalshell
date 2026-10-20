/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

class a_
implements Comparator {
    a_() {
    }

    public int Q(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }

    public int compare(Object object, Object object2) {
        int n10;
        try {
            n10 = (Integer)this.Q((Object)((File)object), (Object)((File)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

