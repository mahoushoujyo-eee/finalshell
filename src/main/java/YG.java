/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jtermios.j;

class YG
implements Enumeration {
    List c;
    Iterator b;

    YG() {
        Object object;
        ky_2[] ky_2Array;
        Object object2;
        block7: {
            Object object3;
            this.c = new LinkedList();
            object2 = L2.X().values().iterator();
            ky_2Array = xA.P();
            while (object2.hasNext()) {
                object = (L2)object2.next();
                object3 = this.c;
                if (ky_2Array != null) {
                    object3.add(object);
                    if (ky_2Array != null) continue;
                }
                break block7;
            }
            object3 = object2 = j.Y();
        }
        if (ky_2Array != null) {
            if (object2 != null) {
                object = object2.iterator();
                while (object.hasNext()) {
                    String string = (String)object.next();
                    this.c.add(new L2(string, 1, null, null));
                    if (ky_2Array != null) {
                        if (ky_2Array != null) continue;
                    }
                    break;
                }
            } else {
                this.b = this.c.iterator();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasMoreElements() {
        ky_2[] ky_2Array = xA.P();
        Iterator iterator = this.b;
        if (ky_2Array != null) {
            if (iterator == null) return false;
            iterator = this.b;
        }
        boolean bl = iterator.hasNext();
        return bl;
    }

    public Object nextElement() {
        return this.b.next();
    }
}

