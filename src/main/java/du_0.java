/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * Renamed from Du
 */
public class du_0
extends AbstractListModel {
    private ArrayList x;
    String[] a;
    Class[] W;
    private static final String b;

    public du_0() {
        this.x = new ArrayList();
        this.a = new String[]{b};
        this.W = new Class[]{Object.class};
    }

    public String z(int n10) {
        return ((String[])this.a)[n10];
    }

    public void b() {
        ((ArrayList)this.x).clear();
    }

    public Class U(int n10) {
        return ((Class[])this.W)[n10];
    }

    public void r(int n10) {
        ((ArrayList)this.x).remove(n10);
    }

    public synchronized void k(L1 l1) {
        ((ArrayList)this.x).add(l1);
    }

    void R() {
        this.fireContentsChanged(this, 0, ((ArrayList)this.x).size() - 1);
    }

    public synchronized void x(L1 l1) {
        ((ArrayList)this.x).add(0, l1);
    }

    @Override
    public int getSize() {
        return ((ArrayList)this.x).size();
    }

    public L1 Z(int n10) {
        L1 l1 = (L1)((ArrayList)this.x).get(n10);
        return l1;
    }

    @Override
    public Object getElementAt(int n10) {
        L1 l1;
        try {
            l1 = (L1)this.Z(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return l1;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\\IO".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 82;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 109;
                            break;
                        }
                        case 1: {
                            n17 = 118;
                            break;
                        }
                        case 2: {
                            n17 = 121;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 73;
                            break;
                        }
                        case 5: {
                            n17 = 21;
                            break;
                        }
                        default: {
                            n17 = 85;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        b = new String(cArray).intern();
    }
}

