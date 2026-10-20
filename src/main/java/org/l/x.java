/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.F.c;
import org.T.z;
import org.l.F;

public class x
implements Iterator {
    private final z b;
    private static final Object o;
    @c
    private static final Object A;
    @c
    private Object E = o;
    static final /* synthetic */ boolean L;
    private static final String a;

    public x(z z10) {
        this.b = z10;
    }

    @Override
    public boolean hasNext() {
        boolean bl;
        Object object;
        Object object2;
        block6: {
            block7: {
                boolean bl2 = F.G();
                try {
                    try {
                        object2 = this.E;
                        object = o;
                        if (bl2) break block6;
                        if (object2 != object) break block7;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw x.a(noSuchElementException);
                    }
                    this.E = this.b.h();
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw x.a(noSuchElementException);
                }
            }
            object2 = this.E;
            object = A;
        }
        try {
            bl = object2 != object;
        }
        catch (NoSuchElementException noSuchElementException) {
            throw x.a(noSuchElementException);
        }
        return bl;
    }

    public Object next() {
        Object object;
        block20: {
            Object object2;
            block21: {
                Object object3;
                boolean bl;
                block19: {
                    Object object4;
                    block17: {
                        block18: {
                            bl = F.s();
                            try {
                                try {
                                    object3 = this.E;
                                    object4 = o;
                                    if (!bl) break block17;
                                    if (object3 != object4) break block18;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw x.a(noSuchElementException);
                                }
                                this.E = this.b.h();
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw x.a(noSuchElementException);
                            }
                        }
                        try {
                            object3 = this.E;
                            if (!bl) break block19;
                            object4 = A;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw x.a(noSuchElementException);
                        }
                    }
                    try {
                        if (object3 == object4) {
                            throw new NoSuchElementException();
                        }
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw x.a(noSuchElementException);
                    }
                    object3 = this.E;
                }
                object2 = object3;
                try {
                    try {
                        try {
                            try {
                                object = this;
                                if (!bl) break block20;
                                ((x)object).E = o;
                                if (L) break block21;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw x.a(noSuchElementException);
                            }
                            object = object2;
                            if (!bl) break block20;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw x.a(noSuchElementException);
                        }
                        if (object != null) break block21;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw x.a(noSuchElementException);
                    }
                    throw new AssertionError();
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw x.a(noSuchElementException);
                }
            }
            object = object2;
        }
        return object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(a);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = " mBsk}".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 74;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 24;
                            break;
                        }
                        case 1: {
                            n17 = 66;
                            break;
                        }
                        case 2: {
                            n17 = 101;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 87;
                            break;
                        }
                        case 5: {
                            n17 = 82;
                            break;
                        }
                        default: {
                            n17 = 40;
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
        try {
            bl = !x.class.desiredAssertionStatus();
        }
        catch (NoSuchElementException noSuchElementException) {
            throw x.a(noSuchElementException);
        }
        L = bl;
        o = new Object();
        A = null;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}

