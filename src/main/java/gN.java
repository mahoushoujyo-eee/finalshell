/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class gN
implements Iterator {
    private Iterator S = null;
    private static final String a;

    /*
     * Unable to fully structure code
     */
    public gN(Iterator var1_1) {
        super();
        var3_2 = new LinkedList<E>();
        var2_3 = QI.N();
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
        catch (UnsupportedOperationException v0) {
            throw gN.a(v0);
        }
        ** while (var1_1.hasNext())
lbl15:
        // 1 sources

        this.S = var3_2.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.S.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(a);
    }

    public Object next() {
        return this.S.next();
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
                char[] cArray3 = "\u0012'i\u00162`ef. \u0017whrk n\tk)\u007f2*r\u0004ffdh".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 46;
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
                            n17 = 104;
                            break;
                        }
                        case 1: {
                            n17 = 97;
                            break;
                        }
                        case 2: {
                            n17 = 46;
                            break;
                        }
                        case 3: {
                            n17 = 75;
                            break;
                        }
                        case 4: {
                            n17 = 60;
                            break;
                        }
                        case 5: {
                            n17 = 39;
                            break;
                        }
                        default: {
                            n17 = 56;
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
        a = new String(cArray).intern();
    }
}

