/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractListModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.eD
 */
public class ed_1
extends AbstractListModel {
    protected Vector u = new Vector();
    private static final String a;

    public ed_1() {
    }

    public ed_1(Object[] objectArray) {
        Collections.addAll(this.u, objectArray);
    }

    public ed_1(Collection collection) {
        this.u.addAll(collection);
    }

    @Override
    public int getSize() {
        return this.u.size();
    }

    @Override
    public Object getElementAt(int n10) {
        return this.u.elementAt(n10);
    }

    public List p() {
        return new ArrayList(this.u);
    }

    public void M(Object[] objectArray) {
        this.u.copyInto(objectArray);
    }

    public void s() {
        this.u.trimToSize();
    }

    public void g(int n10) {
        this.u.ensureCapacity(n10);
    }

    public void f(int n10) {
        block11: {
            int n11;
            int n12;
            int n13;
            block9: {
                n13 = this.u.size();
                String[] stringArray = CI.c();
                try {
                    block10: {
                        try {
                            try {
                                this.u.setSize(n10);
                                n12 = n13;
                                n11 = n10;
                                if (stringArray != null) break block9;
                                if (n12 <= n11) break block10;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ed_1.a(illegalArgumentException);
                            }
                            this.fireIntervalRemoved(this, n10, n13 - 1);
                            if (stringArray == null) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ed_1.a(illegalArgumentException);
                        }
                    }
                    n12 = n13;
                    n11 = n10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            try {
                if (n12 < n11) {
                    this.fireIntervalAdded(this, n13, n10 - 1);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ed_1.a(illegalArgumentException);
            }
        }
    }

    public int u() {
        return this.u.capacity();
    }

    public int y() {
        return this.u.size();
    }

    public boolean m() {
        return this.u.isEmpty();
    }

    public Enumeration k() {
        return this.u.elements();
    }

    public boolean u(Object object) {
        return this.u.contains(object);
    }

    public int J(Object object) {
        return this.u.indexOf(object);
    }

    public int u(Object object, int n10) {
        return this.u.indexOf(object, n10);
    }

    public int n(Object object) {
        return this.u.lastIndexOf(object);
    }

    public int m(Object object, int n10) {
        return this.u.lastIndexOf(object, n10);
    }

    public Object r(int n10) {
        return this.u.elementAt(n10);
    }

    public Object N() {
        return this.u.firstElement();
    }

    public Object A() {
        return this.u.lastElement();
    }

    public void X(Object object, int n10) {
        this.u.setElementAt(object, n10);
        this.fireContentsChanged(this, n10, n10);
    }

    public void A(int n10) {
        this.u.removeElementAt(n10);
        this.fireIntervalRemoved(this, n10, n10);
    }

    public void q(Object object, int n10) {
        this.u.insertElementAt(object, n10);
        this.fireIntervalAdded(this, n10, n10);
    }

    public void T(Object object) {
        int n10 = this.u.size();
        this.u.addElement(object);
        this.fireIntervalAdded(this, n10, n10);
    }

    public void U(Object[] objectArray) {
        block5: {
            int n10;
            block4: {
                String[] stringArray = CI.c();
                try {
                    try {
                        n10 = objectArray.length;
                        if (stringArray != null) break block4;
                        if (n10 <= 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                    n10 = this.u.size();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            int n11 = n10;
            Collections.addAll(this.u, objectArray);
            this.fireIntervalAdded(this, n11, this.u.size() - 1);
        }
    }

    public void u(Collection collection) {
        block5: {
            int n10;
            block4: {
                String[] stringArray = CI.c();
                try {
                    try {
                        n10 = collection.size();
                        if (stringArray != null) break block4;
                        if (n10 <= 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                    n10 = this.u.size();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            int n11 = n10;
            this.u.addAll(collection);
            this.fireIntervalAdded(this, n11, this.u.size() - 1);
        }
    }

    public void K(Collection collection) {
        block5: {
            block4: {
                String[] stringArray = CI.c();
                this.B();
                String[] stringArray2 = stringArray;
                try {
                    int n10;
                    try {
                        n10 = collection.size();
                        if (stringArray2 != null) break block4;
                        if (n10 <= 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                    n10 = this.u.addAll(collection) ? 1 : 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            this.fireIntervalAdded(this, 0, this.u.size() - 1);
        }
    }

    public boolean y(Object object) {
        int n10;
        block4: {
            int n11;
            block5: {
                int n12 = this.J(object);
                n11 = this.u.removeElement(object);
                String[] stringArray = CI.c();
                try {
                    try {
                        n10 = n12;
                        if (stringArray != null) break block4;
                        if (n10 < 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                    this.fireIntervalRemoved(this, n12, n12);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            n10 = n11;
        }
        return n10 != 0;
    }

    public void s(Object[] objectArray) {
        Object[] objectArray2 = objectArray;
        int n10 = objectArray2.length;
        String[] stringArray = CI.c();
        for (int i2 = 0; i2 < n10; ++i2) {
            Object object = objectArray2[i2];
            this.y(object);
            if (stringArray == null) continue;
        }
    }

    public void x(Collection collection) {
        Iterator iterator = collection.iterator();
        String[] stringArray = CI.c();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            this.y(e2);
            if (stringArray == null) continue;
        }
    }

    public void C() {
        block5: {
            ed_1 ed_12;
            int n10;
            block4: {
                n10 = this.u.size() - 1;
                String[] stringArray = CI.c();
                try {
                    try {
                        ed_12 = this;
                        if (stringArray != null) break block4;
                        ed_12.u.removeAllElements();
                        if (n10 < 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                    ed_12 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            ed_12.fireIntervalRemoved(this, 0, n10);
        }
    }

    public void J(int n10) {
        block7: {
            String[] stringArray = CI.c();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    this.u.removeElementAt(n10);
                    if (stringArray == null) {
                        if (stringArray == null) continue;
                        break;
                    }
                    break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            try {
                if (n10 > 0) {
                    this.fireIntervalRemoved(this, 0, n10 - 1);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ed_1.a(illegalArgumentException);
            }
        }
    }

    public void i(int n10) {
        block7: {
            int n11 = this.y() - 1;
            String[] stringArray = CI.c();
            for (int i2 = n11; i2 > n10; --i2) {
                try {
                    this.u.removeElementAt(i2);
                    if (stringArray == null) {
                        if (stringArray == null) continue;
                        break;
                    }
                    break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            try {
                if (n11 > n10) {
                    this.fireIntervalRemoved(this, n10 + 1, n11);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ed_1.a(illegalArgumentException);
            }
        }
    }

    public String toString() {
        return this.u.toString();
    }

    public Object[] D() {
        Object[] objectArray = new Object[this.u.size()];
        this.u.copyInto(objectArray);
        return objectArray;
    }

    public Object A(int n10) {
        return this.u.elementAt(n10);
    }

    public Object A(int n10, Object object) {
        Object e2 = this.u.elementAt(n10);
        this.u.setElementAt(object, n10);
        this.fireContentsChanged(this, n10, n10);
        return e2;
    }

    public void O(Object object) {
        this.y(this.y(), object);
    }

    public void y(int n10, Object object) {
        this.u.insertElementAt(object, n10);
        this.fireIntervalAdded(this, n10, n10);
    }

    public Object v(Object object) {
        Object object2;
        int n10 = this.J(object);
        try {
            object2 = n10 != -1 ? this.c(n10) : null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ed_1.a(illegalArgumentException);
        }
        return object2;
    }

    public Object c(int n10) {
        Object e2 = this.u.elementAt(n10);
        this.u.removeElementAt(n10);
        this.fireIntervalRemoved(this, n10, n10);
        return e2;
    }

    public void B() {
        block5: {
            ed_1 ed_12;
            int n10;
            block4: {
                n10 = this.u.size() - 1;
                String[] stringArray = CI.c();
                try {
                    try {
                        ed_12 = this;
                        if (stringArray != null) break block4;
                        ed_12.u.removeAllElements();
                        if (n10 < 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                    ed_12 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            ed_12.fireIntervalRemoved(this, 0, n10);
        }
    }

    public void q(int n10, int n11) {
        block10: {
            int n12;
            String[] stringArray;
            block8: {
                int n13;
                block9: {
                    stringArray = CI.c();
                    try {
                        try {
                            n13 = n10;
                            if (stringArray != null) break block8;
                            if (n13 <= n11) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ed_1.a(illegalArgumentException);
                        }
                        throw new IllegalArgumentException(a);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ed_1.a(illegalArgumentException);
                    }
                }
                n13 = n12 = n11;
            }
            while (n12 >= n10) {
                try {
                    this.u.removeElementAt(n12);
                    --n12;
                    if (stringArray == null) {
                        if (stringArray == null) continue;
                        break;
                    }
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ed_1.a(illegalArgumentException);
                }
            }
            this.fireIntervalRemoved(this, n10, n11);
        }
    }

    public void S(Object object) {
        int n10 = this.J(object);
        try {
            if (n10 != -1) {
                this.fireContentsChanged(this, n10, n10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ed_1.a(illegalArgumentException);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
                char[] cArray3 = "KyG} *&Hs\b}\u001c76\riM0UybYda~\r!:".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 116;
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
                            n17 = 89;
                            break;
                        }
                        case 1: {
                            n17 = 127;
                            break;
                        }
                        case 2: {
                            n17 = 92;
                            break;
                        }
                        case 3: {
                            n17 = 100;
                            break;
                        }
                        case 4: {
                            n17 = 29;
                            break;
                        }
                        case 5: {
                            n17 = 48;
                            break;
                        }
                        default: {
                            n17 = 54;
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

