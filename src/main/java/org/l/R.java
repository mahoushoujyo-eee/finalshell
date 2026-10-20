/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;
import org.F.c;
import org.l.C;
import org.l.F;

class R
implements Iterator {
    @c
    private Iterator G;
    final C K;

    R(C c2) {
        this.K = c2;
        this.G = C.K(this.K).iterator();
    }

    public Object next() {
        Iterator iterator;
        block8: {
            block9: {
                block11: {
                    Iterator iterator2;
                    block10: {
                        Iterator iterator3 = this.G;
                        boolean bl = F.s();
                        try {
                            try {
                                try {
                                    try {
                                        iterator = iterator3;
                                        if (!bl) break block8;
                                        if (iterator == null) break block9;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw R.a(unsupportedOperationException);
                                    }
                                    iterator2 = iterator3;
                                    if (!bl) break block10;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw R.a(unsupportedOperationException);
                                }
                                if (!iterator2.hasNext()) break block11;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw R.a(unsupportedOperationException);
                            }
                            iterator2 = iterator3.next();
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw R.a(unsupportedOperationException);
                        }
                    }
                    return iterator2;
                }
                this.G = null;
            }
            iterator = C.R(this.K).next();
        }
        Iterator iterator4 = iterator;
        C.K(this.K).add(iterator4);
        return iterator4;
    }

    @Override
    public boolean hasNext() {
        boolean bl;
        block12: {
            block14: {
                block13: {
                    Iterator iterator;
                    boolean bl2;
                    block10: {
                        bl2 = F.s();
                        try {
                            block11: {
                                try {
                                    try {
                                        try {
                                            iterator = this.G;
                                            if (!bl2) break block10;
                                            if (iterator == null) break block11;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw R.a(unsupportedOperationException);
                                        }
                                        bl = this.G.hasNext();
                                        if (!bl2) break block12;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw R.a(unsupportedOperationException);
                                    }
                                    if (bl) break block13;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw R.a(unsupportedOperationException);
                                }
                            }
                            iterator = C.R(this.K);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw R.a(unsupportedOperationException);
                        }
                    }
                    try {
                        bl = iterator.hasNext();
                        if (!bl2) break block12;
                        if (!bl) break block14;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw R.a(unsupportedOperationException);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

