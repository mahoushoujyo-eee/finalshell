/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.IG;
import com.O0;
import com.ex_1;
import com.hi_0;
import com.ks_0;
import com.ok_0;
import java.io.IOException;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Oc
 */
public class oc_0
extends ok_0
implements List,
Cloneable,
RandomAccess,
Serializable {
    private final List l;
    protected transient Object g;
    protected transient Type m;
    private static final String d;

    public oc_0() {
        this.l = new ArrayList();
    }

    public oc_0(List list) {
        block4: {
            block5: {
                String string = hi_0.C();
                String string2 = string;
                try {
                    try {
                        if (string2 != null) break block4;
                        if (list != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(d);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            this.l = list;
        }
    }

    public oc_0(int n10) {
        this.l = new ArrayList(n10);
    }

    public Object U() {
        return this.g;
    }

    public void L(Object object) {
        this.g = object;
    }

    public Type v() {
        return this.m;
    }

    public void w(Type type) {
        this.m = type;
    }

    @Override
    public int size() {
        return this.l.size();
    }

    @Override
    public boolean isEmpty() {
        return this.l.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.l.contains(object);
    }

    @Override
    public Iterator iterator() {
        return this.l.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.l.toArray();
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return this.l.toArray(objectArray);
    }

    @Override
    public boolean add(Object object) {
        return this.l.add(object);
    }

    public oc_0 W(Object object) {
        this.l.add(object);
        return this;
    }

    @Override
    public boolean remove(Object object) {
        return this.l.remove(object);
    }

    public oc_0 D(Object object) {
        this.l.remove(object);
        return this;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.l.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.l.addAll(collection);
    }

    public oc_0 S(Collection collection) {
        this.l.addAll(collection);
        return this;
    }

    public boolean addAll(int n10, Collection collection) {
        return this.l.addAll(n10, collection);
    }

    public oc_0 b(int n10, Collection collection) {
        this.l.addAll(n10, collection);
        return this;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.l.removeAll(collection);
    }

    public oc_0 l(Collection collection) {
        this.l.removeAll(collection);
        return this;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.l.retainAll(collection);
    }

    public oc_0 o(Collection collection) {
        this.l.retainAll(collection);
        return this;
    }

    @Override
    public void clear() {
        this.l.clear();
    }

    public oc_0 s() {
        this.l.clear();
        return this;
    }

    public Object set(int n10, Object object) {
        Object object2;
        block13: {
            int n11;
            int n12;
            String string;
            block11: {
                block12: {
                    string = hi_0.C();
                    try {
                        try {
                            n12 = n10;
                            n11 = -1;
                            if (string != null) break block11;
                            if (n12 != n11) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw oc_0.b(illegalArgumentException);
                        }
                        this.l.add(object);
                        return null;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                }
                try {
                    object2 = this.l;
                    if (string != null) break block13;
                    n12 = object2.size();
                    n11 = n10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            if (n12 <= n11) {
                block14: {
                    for (int i2 = this.l.size(); i2 < n10; ++i2) {
                        try {
                            this.l.add(null);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw oc_0.b(illegalArgumentException);
                        }
                    }
                    this.l.add(object);
                }
                return null;
            }
            object2 = this.l.set(n10, object);
        }
        return object2;
    }

    public oc_0 Z(int n10, Object object) {
        this.set(n10, object);
        return this;
    }

    public void add(int n10, Object object) {
        this.l.add(n10, object);
    }

    public oc_0 S(int n10, Object object) {
        this.l.add(n10, object);
        return this;
    }

    public Object remove(int n10) {
        return this.l.remove(n10);
    }

    public oc_0 m(int n10) {
        this.l.remove(n10);
        return this;
    }

    @Override
    public int indexOf(Object object) {
        return this.l.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.l.lastIndexOf(object);
    }

    public ListIterator listIterator() {
        return this.l.listIterator();
    }

    public ListIterator listIterator(int n10) {
        return this.l.listIterator(n10);
    }

    public List subList(int n10, int n11) {
        return this.l.subList(n10, n11);
    }

    public Object get(int n10) {
        return this.l.get(n10);
    }

    public O0 V(int n10) {
        Object object;
        block11: {
            boolean bl;
            Object e2;
            block9: {
                String string;
                block10: {
                    e2 = this.l.get(n10);
                    string = hi_0.C();
                    try {
                        try {
                            bl = e2 instanceof O0;
                            if (string != null) break block9;
                            if (!bl) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw oc_0.b(illegalArgumentException);
                        }
                        return (O0)e2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                }
                try {
                    object = e2;
                    if (string != null) break block11;
                    bl = object instanceof Map;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            try {
                if (bl) {
                    return new O0((Map)e2);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw oc_0.b(illegalArgumentException);
            }
            object = oc_0.b(e2);
        }
        return (O0)object;
    }

    public oc_0 Y(int n10) {
        Object object;
        block11: {
            boolean bl;
            Object e2;
            block9: {
                String string;
                block10: {
                    e2 = this.l.get(n10);
                    string = hi_0.C();
                    try {
                        try {
                            bl = e2 instanceof oc_0;
                            if (string != null) break block9;
                            if (!bl) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw oc_0.b(illegalArgumentException);
                        }
                        return (oc_0)e2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                }
                try {
                    object = e2;
                    if (string != null) break block11;
                    bl = object instanceof List;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            try {
                if (bl) {
                    return new oc_0((List)e2);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw oc_0.b(illegalArgumentException);
            }
            object = oc_0.b(e2);
        }
        return (oc_0)object;
    }

    public Object u(int n10, Class clazz) {
        Object e2 = this.l.get(n10);
        return B8.t(e2, clazz);
    }

    public Object y(int n10, Type type) {
        Type type2;
        block4: {
            Object e2;
            block5: {
                e2 = this.l.get(n10);
                String string = hi_0.C();
                try {
                    try {
                        type2 = type;
                        if (string != null) break block4;
                        if (!(type2 instanceof Class)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return B8.t(e2, (Class)type);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            type2 = e2;
        }
        String string = ok_0.x(type2);
        return ok_0.B(string, type, new ks_0[0]);
    }

    public Boolean b(int n10) {
        Object object;
        block4: {
            Object object2;
            block5: {
                object2 = this.get(n10);
                String string = hi_0.C();
                try {
                    try {
                        object = object2;
                        if (string != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            object = object2;
        }
        return B8.J(object);
    }

    public boolean P(int n10) {
        Object object;
        block4: {
            Object object2;
            block5: {
                object2 = this.get(n10);
                String string = hi_0.C();
                try {
                    try {
                        object = object2;
                        if (string != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            object = object2;
        }
        return B8.J(object);
    }

    public Byte w(int n10) {
        Object object = this.get(n10);
        return B8.d(object);
    }

    public byte d(int n10) {
        Byte by;
        block4: {
            Byte by2;
            block5: {
                Object object = this.get(n10);
                by2 = B8.d(object);
                String string = hi_0.C();
                try {
                    try {
                        by = by2;
                        if (string != null) break block4;
                        if (by != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            by = by2;
        }
        return by;
    }

    public Short i(int n10) {
        Object object = this.get(n10);
        return B8.Q(object);
    }

    public short c(int n10) {
        Short s2;
        block4: {
            Short s3;
            block5: {
                Object object = this.get(n10);
                String string = hi_0.C();
                s3 = B8.Q(object);
                try {
                    try {
                        s2 = s3;
                        if (string != null) break block4;
                        if (s2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            s2 = s3;
        }
        return s2;
    }

    public Integer p(int n10) {
        Object object = this.get(n10);
        return B8.Y(object);
    }

    public int v(int n10) {
        Integer n11;
        block4: {
            Integer n12;
            block5: {
                Object object = this.get(n10);
                n12 = B8.Y(object);
                String string = hi_0.C();
                try {
                    try {
                        n11 = n12;
                        if (string != null) break block4;
                        if (n11 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            n11 = n12;
        }
        return n11;
    }

    public Long I(int n10) {
        Object object = this.get(n10);
        return B8.s(object);
    }

    public long F(int n10) {
        Long l2;
        block4: {
            Long l3;
            block5: {
                Object object = this.get(n10);
                String string = hi_0.C();
                l3 = B8.s(object);
                try {
                    try {
                        l2 = l3;
                        if (string != null) break block4;
                        if (l2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return 0L;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            l2 = l3;
        }
        return l2;
    }

    public Float D(int n10) {
        Object object = this.get(n10);
        return B8.h(object);
    }

    public float B(int n10) {
        Float f10;
        block4: {
            Float f11;
            block5: {
                Object object = this.get(n10);
                String string = hi_0.C();
                f11 = B8.h(object);
                try {
                    try {
                        f10 = f11;
                        if (string != null) break block4;
                        if (f10 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return 0.0f;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            f10 = f11;
        }
        return f10.floatValue();
    }

    public Double q(int n10) {
        Object object = this.get(n10);
        return B8.Z(object);
    }

    public double D(int n10) {
        Double d2;
        block4: {
            Double d3;
            block5: {
                Object object = this.get(n10);
                String string = hi_0.C();
                d3 = B8.Z(object);
                try {
                    try {
                        d2 = d3;
                        if (string != null) break block4;
                        if (d2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return 0.0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            d2 = d3;
        }
        return d2;
    }

    public BigDecimal E(int n10) {
        Object object = this.get(n10);
        return B8.b(object);
    }

    public BigInteger l(int n10) {
        Object object = this.get(n10);
        return B8.I(object);
    }

    public String M(int n10) {
        Object object = this.get(n10);
        return B8.i(object);
    }

    public Date n(int n10) {
        Object object = this.get(n10);
        return B8.C(object);
    }

    public Object Q(int n10) {
        Object object = this.get(n10);
        return B8.p(object);
    }

    public Object t(int n10) {
        Object object = this.get(n10);
        return B8.q(object);
    }

    public List E(Class clazz) {
        ArrayList<Object> arrayList;
        block4: {
            ArrayList<Object> arrayList2 = new ArrayList<Object>(this.size());
            String string = hi_0.C();
            IG iG = IG.G();
            for (Object e2 : this) {
                Object object = B8.B(e2, clazz, iG);
                try {
                    arrayList = arrayList2;
                    if (string == null) {
                        arrayList.add(object);
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public Object clone() {
        return new oc_0(new ArrayList(this.l));
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        block10: {
            block11: {
                Object object2;
                String string;
                block8: {
                    block9: {
                        string = hi_0.C();
                        try {
                            try {
                                object2 = this;
                                if (string != null) break block8;
                                if (object2 != object) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw oc_0.b(illegalArgumentException);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw oc_0.b(illegalArgumentException);
                        }
                    }
                    object2 = object;
                }
                try {
                    try {
                        bl = object2 instanceof oc_0;
                        if (string != null) break block10;
                        if (!bl) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw oc_0.b(illegalArgumentException);
                    }
                    return this.l.equals(((oc_0)object).l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw oc_0.b(illegalArgumentException);
                }
            }
            bl = this.l.equals(object);
        }
        return bl;
    }

    @Override
    public int hashCode() {
        return this.l.hashCode();
    }

    /*
     * Loose catch block
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String string;
        block15: {
            block16: {
                String string2 = hi_0.C();
                ex_1.w();
                string = string2;
                if (string != null) break block15;
                try {
                    block20: {
                        if (ex_1.j == null) break block16;
                        break block20;
                        catch (NotActiveException notActiveException) {
                            throw oc_0.b(notActiveException);
                        }
                    }
                    if (ex_1.R) break block16;
                }
                catch (NotActiveException notActiveException) {
                    throw oc_0.b(notActiveException);
                }
                ex_1 ex_12 = new ex_1(objectInputStream);
                try {
                    ex_12.defaultReadObject();
                    return;
                }
                catch (NotActiveException notActiveException) {
                    // empty catch block
                }
            }
            objectInputStream.defaultReadObject();
        }
        for (Object e2 : this.l) {
            block19: {
                Object e3;
                block17: {
                    block18: {
                        try {
                            try {
                                e3 = e2;
                                if (string != null) break block17;
                                if (e3 != null) break block18;
                            }
                            catch (NotActiveException notActiveException) {
                                throw oc_0.b(notActiveException);
                            }
                            if (string == null) continue;
                        }
                        catch (NotActiveException notActiveException) {
                            throw oc_0.b(notActiveException);
                        }
                    }
                    e3 = e2;
                }
                String string3 = e3.getClass().getName();
                try {
                    Class clazz;
                    try {
                        clazz = B8.A(string3);
                        if (string != null || clazz != null) break block19;
                    }
                    catch (NotActiveException notActiveException) {
                        throw oc_0.b(notActiveException);
                    }
                    clazz = IG.D.Z(string3, null);
                }
                catch (NotActiveException notActiveException) {
                    throw oc_0.b(notActiveException);
                }
            }
            if (string == null) continue;
        }
    }

    private static Exception b(Exception exception) {
        return exception;
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
                char[] cArray3 = "o\u0007Gu?>E#\u0000Amsy".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 105;
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
                            n17 = 106;
                            break;
                        }
                        case 1: {
                            n17 = 7;
                            break;
                        }
                        case 2: {
                            n17 = 93;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 118;
                            break;
                        }
                        case 5: {
                            n17 = 62;
                            break;
                        }
                        default: {
                            n17 = 95;
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
        d = new String(cArray).intern();
    }
}

