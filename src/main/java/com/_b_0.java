/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NI;
import com.ph_0;
import com.xy_2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from com._b
 */
abstract class _b_0
implements Iterator {
    NI K;
    int L;
    int p;
    NI A;
    final xy_2 O;

    _b_0(xy_2 xy_22) {
        block6: {
            this.O = xy_22;
            int n10 = ph_0.u();
            this.L = xy_22.b;
            xy_2 xy_23 = xy_22;
            if (n10 == 0) {
                try {
                    if (xy_23.t <= 0) break block6;
                    xy_23 = xy_22;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw _b_0.a(concurrentModificationException);
                }
            }
            NI[] nIArray = xy_23.v;
            while (this.p < nIArray.length) {
                try {
                    if ((this.K = nIArray[this.p++]) == null && n10 == 0) continue;
                    break;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw _b_0.a(concurrentModificationException);
                }
            }
        }
    }

    @Override
    public final boolean hasNext() {
        boolean bl;
        try {
            bl = this.K != null;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            throw _b_0.a(concurrentModificationException);
        }
        return bl;
    }

    final NI L() {
        NI nI2;
        block21: {
            NI nI3;
            block22: {
                int n10;
                block19: {
                    block20: {
                        _b_0 _b_02;
                        block17: {
                            block18: {
                                n10 = ph_0.w();
                                try {
                                    try {
                                        _b_02 = this;
                                        if (n10 == 0) break block17;
                                        if (_b_02.O.b == this.L) break block18;
                                    }
                                    catch (ConcurrentModificationException concurrentModificationException) {
                                        throw _b_0.a(concurrentModificationException);
                                    }
                                    throw new ConcurrentModificationException();
                                }
                                catch (ConcurrentModificationException concurrentModificationException) {
                                    throw _b_0.a(concurrentModificationException);
                                }
                            }
                            _b_02 = this;
                        }
                        nI3 = _b_02.K;
                        try {
                            try {
                                nI2 = nI3;
                                if (n10 == 0) break block19;
                                if (nI2 != null) break block20;
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw _b_0.a(concurrentModificationException);
                            }
                            throw new NoSuchElementException();
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw _b_0.a(concurrentModificationException);
                        }
                    }
                    nI2 = this.K = nI3.N;
                }
                try {
                    if (n10 == 0) break block21;
                    if (nI2 != null) break block22;
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw _b_0.a(concurrentModificationException);
                }
                NI[] nIArray = this.O.v;
                while (this.p < nIArray.length) {
                    try {
                        try {
                            try {
                                nI2 = nIArray[this.p++];
                                this.K = this.K;
                                if (n10 == 0 || n10 == 0) break block21;
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw _b_0.a(concurrentModificationException);
                            }
                            if (nI2 != null) break;
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw _b_0.a(concurrentModificationException);
                        }
                        if (n10 != 0) continue;
                        break;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw _b_0.a(concurrentModificationException);
                    }
                }
            }
            this.A = nI3;
            nI2 = nI3;
        }
        return nI2;
    }

    @Override
    public void remove() {
        Object object;
        block10: {
            block11: {
                _b_0 _b_02;
                int n10;
                block8: {
                    block9: {
                        n10 = ph_0.w();
                        try {
                            try {
                                _b_02 = this;
                                if (n10 == 0) break block8;
                                if (_b_02.A != null) break block9;
                            }
                            catch (ConcurrentModificationException concurrentModificationException) {
                                throw _b_0.a(concurrentModificationException);
                            }
                            throw new IllegalStateException();
                        }
                        catch (ConcurrentModificationException concurrentModificationException) {
                            throw _b_0.a(concurrentModificationException);
                        }
                    }
                    _b_02 = this;
                }
                try {
                    try {
                        object = _b_02.O;
                        if (n10 == 0) break block10;
                        if (((xy_2)object).b == this.L) break block11;
                    }
                    catch (ConcurrentModificationException concurrentModificationException) {
                        throw _b_0.a(concurrentModificationException);
                    }
                    throw new ConcurrentModificationException();
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    throw _b_0.a(concurrentModificationException);
                }
            }
            object = this.A.V;
        }
        xy_2 xy_22 = object;
        this.A = null;
        this.O.O(xy_22);
        this.L = this.O.b;
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }
}

