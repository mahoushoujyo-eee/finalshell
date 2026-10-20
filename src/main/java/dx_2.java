/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from dx
 */
public class dx_2 {
    ArrayList T;
    BH n;

    public dx_2() {
        this.T = new ArrayList();
    }

    public boolean B(String string) {
        boolean bl = false;
        bl = ((ArrayList)this.T).contains(string);
        return bl;
    }

    public int Q() {
        return ((ArrayList)this.T).size();
    }

    public synchronized L1 o(L1 l1) {
        L1 l12 = null;
        Iterator iterator = ((ArrayList)this.T).iterator();
        String[] stringArray = FK.i();
        while (iterator.hasNext()) {
            L1 l13;
            L1 l14 = l13 = (L1)iterator.next();
            if (stringArray == null) {
                String string;
                String string2;
                try {
                    string2 = (String)l14.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    string = (String)l1.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!string2.equals(string)) continue;
                l14 = l13;
            }
            l12 = l14;
            break;
        }
        return l12;
    }

    public synchronized L1 a(String string) {
        L1 l1 = null;
        Iterator iterator = ((ArrayList)this.T).iterator();
        String[] stringArray = FK.i();
        while (iterator.hasNext()) {
            String string2;
            L1 l12 = (L1)iterator.next();
            String string3 = string;
            if (stringArray == null) {
                if (string3 == null) continue;
                string3 = string;
            }
            try {
                string2 = (String)l12.A();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!string3.equals(string2)) continue;
            l1 = l12;
            break;
        }
        return l1;
    }

    public synchronized void h(L1 l1) {
        block20: {
            Object object;
            Object object2;
            String[] stringArray = FK.i();
            L1 l12 = l1;
            if (stringArray == null) {
                if (l12 != null) {
                    Object object3;
                    try {
                        l1.V(System.currentTimeMillis());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object3 = l1.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        l12 = (L1)this.a(object3);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                L1 l13;
                if ((l13 = l12) != null) {
                    ((ArrayList)this.T).remove(l13);
                }
                ((ArrayList)this.T).add(0, l1);
            }
            int n10 = 0;
            for (L1 l14 : (ArrayList)this.T) {
                try {
                    l14.m(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ++n10;
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block20;
            }
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.Q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void C(L1 l1) {
        L1 l12;
        String[] stringArray = FK.i();
        try {
            l12 = (L1)this.o(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((ArrayList)this.T).remove(l12);
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            Object object;
            Object object2;
            if ((BH)this.n != null) {
                try {
                    this.n.t(l1);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.Q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public ArrayList V() {
        return (ArrayList)this.T;
    }

    public void z(ArrayList arrayList) {
        this.T = arrayList;
    }

    public BH z() {
        return (BH)this.n;
    }

    public void O(BH bH) {
        this.n = bH;
    }
}

