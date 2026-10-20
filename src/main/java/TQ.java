/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class TQ
implements Iterator {
    private Iterator j;
    private static final String a;

    /*
     * Unable to fully structure code
     */
    public TQ(Iterator var1_1) {
        v0 = qm_0.J();
        super();
        this.j = null;
        var3_2 = new LinkedList<E>();
        var2_3 = v0;
        try {
            if (var2_3 == null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2.add(var1_1.next());
                    continue;
                    break;
                }
            }
        }
        catch (UnsupportedOperationException v1) {
            throw TQ.a(v1);
        }
        ** while (var1_1.hasNext())
lbl16:
        // 1 sources

        this.j = var3_2.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.j.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(a);
    }

    public Object next() {
        return this.j.next();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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
                char[] cArray3 = "(Gs?\f=\u0012\\N:>I5\u0005Q@t Ut\b\bJh-X;\u0013R".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 36;
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
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ (switch (n12 % 7) {
                        case 0 -> 88;
                        case 1 -> 11;
                        case 2 -> 62;
                        case 3 -> 104;
                        case 4 -> 8;
                        case 5 -> 112;
                        default -> 69;
                    })));
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
        a = new String(cArray).intern();
    }
}

