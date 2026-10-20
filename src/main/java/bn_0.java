/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/*
 * Renamed from Bn
 */
class bn_0
implements Comparator {
    final boolean H;
    final yt_1 d;

    bn_0(yt_1 yt_12, boolean bl) {
        this.d = yt_12;
        this.H = bl;
    }

    public int M(File file, File file2) {
        long l2;
        long l3;
        try {
            l3 = (Long)yt_1.w(this.d, (Object)file.getName());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        long l4 = l3;
        try {
            l2 = (Long)yt_1.w(this.d, (Object)file2.getName());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        long l5 = l2;
        ky_2[] ky_2Array = yt_1.c();
        int n10 = this.H;
        if (ky_2Array != null) {
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
            n10 = (Integer)this.M((Object)((File)object), (Object)((File)object2));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }
}

