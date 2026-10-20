/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import org.F.c;
import org.l.F;
import org.l.G;

public class N
implements Iterator {
    private final Stack i = new Stack();
    @c
    private Object S;
    private boolean M;
    static final /* synthetic */ boolean Y;

    public N(Iterator iterator) {
        this.i.push(iterator);
    }

    @Override
    public boolean hasNext() {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    boolean bl2 = F.s();
                    try {
                        try {
                            try {
                                bl = this.M;
                                if (!bl2) break block6;
                                if (bl) break block7;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw N.a(noSuchElementException);
                            }
                            bl = this.p();
                            if (!bl2) break block6;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw N.a(noSuchElementException);
                        }
                        if (!bl) break block8;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw N.a(noSuchElementException);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public Object next() {
        Object object;
        block18: {
            block19: {
                boolean bl;
                boolean bl2;
                block16: {
                    block17: {
                        bl2 = F.s();
                        try {
                            try {
                                try {
                                    try {
                                        bl = this.M;
                                        if (!bl2) break block16;
                                        if (bl) break block17;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        throw N.a(noSuchElementException);
                                    }
                                    bl = this.p();
                                    if (!bl2) break block16;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw N.a(noSuchElementException);
                                }
                                if (bl) break block17;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw N.a(noSuchElementException);
                            }
                            throw new NoSuchElementException();
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw N.a(noSuchElementException);
                        }
                    }
                    try {
                        object = this;
                        if (!bl2) break block18;
                        ((N)object).M = false;
                        bl = Y;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw N.a(noSuchElementException);
                    }
                }
                try {
                    try {
                        try {
                            if (bl) break block19;
                            object = this.S;
                            if (!bl2) break block18;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw N.a(noSuchElementException);
                        }
                        if (object != null) break block19;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw N.a(noSuchElementException);
                    }
                    throw new AssertionError();
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw N.a(noSuchElementException);
                }
            }
            object = this.S;
        }
        return object;
    }

    private boolean p() {
        boolean bl;
        block32: {
            boolean bl2 = F.s();
            while (!this.i.empty()) {
                block36: {
                    boolean bl3;
                    block41: {
                        Iterator iterator;
                        block39: {
                            block37: {
                                block34: {
                                    Iterator iterator2;
                                    block31: {
                                        Iterator iterator3;
                                        block33: {
                                            iterator3 = (Iterator)this.i.peek();
                                            try {
                                                try {
                                                    try {
                                                        iterator2 = iterator3;
                                                        if (!bl2) break block31;
                                                        bl = iterator2.hasNext();
                                                        if (!bl2) break block32;
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        throw N.a(noSuchElementException);
                                                    }
                                                    if (bl) break block33;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    throw N.a(noSuchElementException);
                                                }
                                                this.i.pop();
                                                if (bl2) continue;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                throw N.a(noSuchElementException);
                                            }
                                        }
                                        iterator2 = iterator3.next();
                                    }
                                    iterator = iterator2;
                                    try {
                                        block35: {
                                            try {
                                                try {
                                                    bl3 = iterator instanceof Iterator;
                                                    if (!bl2) break block34;
                                                    if (!bl3) break block35;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    throw N.a(noSuchElementException);
                                                }
                                                this.i.push(iterator);
                                                if (bl2) break block36;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                throw N.a(noSuchElementException);
                                            }
                                        }
                                        bl3 = iterator instanceof Object[];
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        throw N.a(noSuchElementException);
                                    }
                                }
                                try {
                                    block38: {
                                        try {
                                            try {
                                                if (!bl2) break block37;
                                                if (!bl3) break block38;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                throw N.a(noSuchElementException);
                                            }
                                            this.i.push(Arrays.asList((Object[])iterator).iterator());
                                            if (bl2) break block36;
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            throw N.a(noSuchElementException);
                                        }
                                    }
                                    bl3 = iterator instanceof Collection;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw N.a(noSuchElementException);
                                }
                            }
                            try {
                                block40: {
                                    try {
                                        try {
                                            if (!bl2) break block39;
                                            if (!bl3) break block40;
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            throw N.a(noSuchElementException);
                                        }
                                        this.i.push(((Collection)((Object)iterator)).iterator());
                                        if (bl2) break block36;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        throw N.a(noSuchElementException);
                                    }
                                }
                                bl3 = iterator instanceof Enumeration;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                throw N.a(noSuchElementException);
                            }
                        }
                        try {
                            block42: {
                                try {
                                    try {
                                        if (!bl2) break block41;
                                        if (!bl3) break block42;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        throw N.a(noSuchElementException);
                                    }
                                    this.i.push(new G((Enumeration)((Object)iterator)));
                                    if (bl2) break block36;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    throw N.a(noSuchElementException);
                                }
                            }
                            this.S = iterator;
                            this.M = true;
                            bl3 = true;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            throw N.a(noSuchElementException);
                        }
                    }
                    return bl3;
                }
                if (bl2) continue;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void remove() {
        ((Iterator)this.i.peek()).remove();
    }

    static {
        boolean bl;
        try {
            bl = !N.class.desiredAssertionStatus();
        }
        catch (NoSuchElementException noSuchElementException) {
            throw N.a(noSuchElementException);
        }
        Y = bl;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}

