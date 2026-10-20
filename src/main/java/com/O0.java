/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.E6;
import com.HI;
import com.IG;
import com.ex_1;
import com.hi_0;
import com.oc_0;
import com.ok_0;
import java.io.IOException;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O0
extends ok_0
implements Map,
Cloneable,
Serializable,
InvocationHandler {
    private final Map q;
    private static final String[] d;
    private static final String[] e;
    private static final long[] g;
    private static final Integer[] k;

    public O0() {
        this(O0.b(17736, 8729208656318436868L), false);
    }

    public O0(Map map) {
        block4: {
            block5: {
                String string = hi_0.C();
                String string2 = string;
                try {
                    try {
                        if (string2 != null) break block4;
                        if (map != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12578 out of bounds for length 2");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            this.q = map;
        }
    }

    public O0(boolean bl) {
        this(O0.b(10747, 4742170905293945526L), bl);
    }

    public O0(int n10) {
        this(n10, false);
    }

    /*
     * Unable to fully structure code
     */
    public O0(int var1_1, boolean var2_2) {
        block9: {
            block8: {
                v0 = hi_0.C();
                super();
                var3_3 = v0;
                try {
                    try {
                        if (var3_3 != null) break block8;
                        if (var2_2) {
                        }
                        ** GOTO lbl19
                    }
                    catch (IllegalArgumentException v1) {
                        throw O0.a(v1);
                    }
                    this.q = new LinkedHashMap<K, V>(var1_1);
                }
                catch (IllegalArgumentException v2) {
                    throw O0.a(v2);
                }
            }
            try {
                if (var3_3 == null) break block9;
lbl19:
                // 2 sources

                this.q = new HashMap<K, V>(var1_1);
            }
            catch (IllegalArgumentException v3) {
                throw O0.a(v3);
            }
        }
    }

    @Override
    public int size() {
        return this.q.size();
    }

    @Override
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        boolean bl;
        block20: {
            boolean bl2;
            block21: {
                boolean bl3;
                block22: {
                    bl2 = this.q.containsKey(object);
                    String string = hi_0.C();
                    try {
                        block23: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                bl = bl2;
                                                                if (string != null) break block20;
                                                                if (bl) break block21;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw O0.a(illegalArgumentException);
                                                            }
                                                            bl3 = object instanceof Number;
                                                            if (string != null) break block22;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw O0.a(illegalArgumentException);
                                                        }
                                                        if (bl3) break block23;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw O0.a(illegalArgumentException);
                                                    }
                                                    bl3 = object instanceof Character;
                                                    if (string != null) break block22;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw O0.a(illegalArgumentException);
                                                }
                                                if (bl3) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw O0.a(illegalArgumentException);
                                            }
                                            bl3 = object instanceof Boolean;
                                            if (string != null) break block22;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw O0.a(illegalArgumentException);
                                        }
                                        if (bl3) break block23;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw O0.a(illegalArgumentException);
                                    }
                                    bl = object instanceof UUID;
                                    if (string != null) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw O0.a(illegalArgumentException);
                                }
                                if (!bl) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                        }
                        bl3 = this.q.containsKey(object.toString());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                }
                bl2 = bl3;
            }
            bl = bl2;
        }
        return bl;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.q.containsValue(object);
    }

    public Object get(Object object) {
        Object object2;
        block20: {
            Object object3;
            block21: {
                Object object4;
                block22: {
                    object3 = this.q.get(object);
                    String string = hi_0.C();
                    try {
                        block23: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                object2 = object3;
                                                                if (string != null) break block20;
                                                                if (object2 != null) break block21;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw O0.a(illegalArgumentException);
                                                            }
                                                            object4 = object;
                                                            if (string != null) break block22;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw O0.a(illegalArgumentException);
                                                        }
                                                        if (object4 instanceof Number) break block23;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw O0.a(illegalArgumentException);
                                                    }
                                                    object4 = object;
                                                    if (string != null) break block22;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw O0.a(illegalArgumentException);
                                                }
                                                if (object4 instanceof Character) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw O0.a(illegalArgumentException);
                                            }
                                            object4 = object;
                                            if (string != null) break block22;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw O0.a(illegalArgumentException);
                                        }
                                        if (object4 instanceof Boolean) break block23;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw O0.a(illegalArgumentException);
                                    }
                                    object2 = object;
                                    if (string != null) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw O0.a(illegalArgumentException);
                                }
                                if (!(object2 instanceof UUID)) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                        }
                        object4 = this.q.get(object.toString());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                }
                object3 = object4;
            }
            object2 = object3;
        }
        return object2;
    }

    public O0 D(String string) {
        Object object;
        block17: {
            boolean bl;
            Object v2;
            block15: {
                String string2;
                block16: {
                    block13: {
                        block14: {
                            v2 = this.q.get(string);
                            string2 = hi_0.C();
                            try {
                                try {
                                    bl = v2 instanceof O0;
                                    if (string2 != null) break block13;
                                    if (!bl) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw O0.a(illegalArgumentException);
                                }
                                return (O0)v2;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                        }
                        bl = v2 instanceof Map;
                    }
                    try {
                        try {
                            if (string2 != null) break block15;
                            if (!bl) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                        return new O0((Map)v2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                }
                try {
                    object = v2;
                    if (string2 != null) break block17;
                    bl = object instanceof String;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            try {
                if (bl) {
                    return ok_0.y((String)v2);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw O0.a(illegalArgumentException);
            }
            object = O0.b(v2);
        }
        return (O0)object;
    }

    public oc_0 J(String string) {
        Object object;
        block17: {
            boolean bl;
            Object v2;
            block15: {
                String string2;
                block16: {
                    block13: {
                        block14: {
                            v2 = this.q.get(string);
                            string2 = hi_0.C();
                            try {
                                try {
                                    bl = v2 instanceof oc_0;
                                    if (string2 != null) break block13;
                                    if (!bl) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw O0.a(illegalArgumentException);
                                }
                                return (oc_0)v2;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                        }
                        bl = v2 instanceof List;
                    }
                    try {
                        try {
                            if (string2 != null) break block15;
                            if (!bl) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                        return new oc_0((List)v2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                }
                try {
                    object = v2;
                    if (string2 != null) break block17;
                    bl = object instanceof String;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            try {
                if (bl) {
                    return (oc_0)ok_0.X((String)v2);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw O0.a(illegalArgumentException);
            }
            object = O0.b(v2);
        }
        return (oc_0)object;
    }

    public Object E(String string, Class clazz) {
        Object v2 = this.q.get(string);
        return B8.t(v2, clazz);
    }

    public Object a(String string, Type type) {
        Object v2 = this.q.get(string);
        return B8.I(v2, type, IG.G());
    }

    public Object x(String string, HI hI2) {
        Object object;
        block4: {
            Object v2;
            block5: {
                v2 = this.q.get(string);
                String string2 = hi_0.C();
                try {
                    try {
                        object = hI2;
                        if (string2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return v2;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            object = B8.I(v2, hI2.O(), IG.G());
        }
        return object;
    }

    public Boolean x(String string) {
        Object object;
        block4: {
            Object object2;
            block5: {
                object2 = this.get(string);
                String string2 = hi_0.C();
                try {
                    try {
                        object = object2;
                        if (string2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            object = object2;
        }
        return B8.J(object);
    }

    public byte[] Z(String string) {
        Object object;
        block4: {
            Object object2;
            block5: {
                object2 = this.get(string);
                String string2 = hi_0.C();
                try {
                    try {
                        object = object2;
                        if (string2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            object = object2;
        }
        return B8.B(object);
    }

    public boolean G(String string) {
        Boolean bl;
        block4: {
            Boolean bl2;
            block5: {
                Object object = this.get(string);
                bl2 = B8.J(object);
                String string2 = hi_0.C();
                try {
                    try {
                        bl = bl2;
                        if (string2 != null) break block4;
                        if (bl != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public Byte r(String string) {
        Object object = this.get(string);
        return B8.d(object);
    }

    public byte X(String string) {
        Byte by;
        block4: {
            Byte by2;
            block5: {
                Object object = this.get(string);
                by2 = B8.d(object);
                String string2 = hi_0.C();
                try {
                    try {
                        by = by2;
                        if (string2 != null) break block4;
                        if (by != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            by = by2;
        }
        return by;
    }

    public Short v(String string) {
        Object object = this.get(string);
        return B8.Q(object);
    }

    public short n(String string) {
        Short s2;
        block4: {
            Short s3;
            block5: {
                Object object = this.get(string);
                String string2 = hi_0.C();
                s3 = B8.Q(object);
                try {
                    try {
                        s2 = s3;
                        if (string2 != null) break block4;
                        if (s2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            s2 = s3;
        }
        return s2;
    }

    public Integer e(String string) {
        Object object = this.get(string);
        return B8.Y(object);
    }

    public int b(String string) {
        Integer n10;
        block4: {
            Integer n11;
            block5: {
                Object object = this.get(string);
                n11 = B8.Y(object);
                String string2 = hi_0.C();
                try {
                    try {
                        n10 = n11;
                        if (string2 != null) break block4;
                        if (n10 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    public Long h(String string) {
        Object object = this.get(string);
        return B8.s(object);
    }

    public long I(String string) {
        Long l2;
        block4: {
            Long l3;
            block5: {
                Object object = this.get(string);
                l3 = B8.s(object);
                String string2 = hi_0.C();
                try {
                    try {
                        l2 = l3;
                        if (string2 != null) break block4;
                        if (l2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return 0L;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            l2 = l3;
        }
        return l2;
    }

    public Float F(String string) {
        Object object = this.get(string);
        return B8.h(object);
    }

    public float o(String string) {
        Float f10;
        block4: {
            Float f11;
            block5: {
                Object object = this.get(string);
                f11 = B8.h(object);
                String string2 = hi_0.C();
                try {
                    try {
                        f10 = f11;
                        if (string2 != null) break block4;
                        if (f10 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return 0.0f;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            f10 = f11;
        }
        return f10.floatValue();
    }

    public Double f(String string) {
        Object object = this.get(string);
        return B8.Z(object);
    }

    public double l(String string) {
        Double d2;
        block4: {
            Double d3;
            block5: {
                Object object = this.get(string);
                String string2 = hi_0.C();
                d3 = B8.Z(object);
                try {
                    try {
                        d2 = d3;
                        if (string2 != null) break block4;
                        if (d2 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return 0.0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            d2 = d3;
        }
        return d2;
    }

    public BigDecimal i(String string) {
        Object object = this.get(string);
        return B8.b(object);
    }

    public BigInteger c(String string) {
        Object object = this.get(string);
        return B8.I(object);
    }

    public String C(String string) {
        Object object;
        block4: {
            Object object2;
            block5: {
                object2 = this.get(string);
                String string2 = hi_0.C();
                try {
                    try {
                        object = object2;
                        if (string2 != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            object = object2;
        }
        return object.toString();
    }

    public Date B(String string) {
        Object object = this.get(string);
        return B8.C(object);
    }

    public Object C(String string) {
        Object object = this.get(string);
        return B8.p(object);
    }

    public Object k(String string) {
        Object object = this.get(string);
        return B8.q(object);
    }

    public Object C(String string, Object object) {
        return this.q.put(string, object);
    }

    public O0 U(String string, Object object) {
        this.q.put(string, object);
        return this;
    }

    public void putAll(Map map) {
        this.q.putAll(map);
    }

    public O0 d(Map map) {
        this.q.putAll(map);
        return this;
    }

    @Override
    public void clear() {
        this.q.clear();
    }

    public O0 H() {
        this.q.clear();
        return this;
    }

    public Object remove(Object object) {
        return this.q.remove(object);
    }

    public O0 p(Object object) {
        this.q.remove(object);
        return this;
    }

    public Set keySet() {
        return this.q.keySet();
    }

    public Collection values() {
        return this.q.values();
    }

    public Set entrySet() {
        return this.q.entrySet();
    }

    public O0 K() {
        HashMap hashMap;
        O0 o0;
        O0 o02;
        try {
            O0 o03;
            o02 = o03;
            o0 = o03;
            hashMap = this.q instanceof LinkedHashMap ? new LinkedHashMap(this.q) : new HashMap(this.q);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw O0.a(illegalArgumentException);
        }
        o02(hashMap);
        return o0;
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
                                throw O0.a(illegalArgumentException);
                            }
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                    }
                    object2 = object;
                }
                try {
                    try {
                        bl = object2 instanceof O0;
                        if (string != null) break block10;
                        if (!bl) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return this.q.equals(((O0)object).q);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            bl = this.q.equals(object);
        }
        return bl;
    }

    @Override
    public int hashCode() {
        return this.q.hashCode();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Object invoke(Object var1_1, Method var2_2, Object[] var3_3) throws Throwable {
        block92: {
            block80: {
                block81: {
                    block91: {
                        block90: {
                            block88: {
                                block89: {
                                    block85: {
                                        block86: {
                                            block87: {
                                                block82: {
                                                    block83: {
                                                        block84: {
                                                            block78: {
                                                                block79: {
                                                                    block77: {
                                                                        block65: {
                                                                            block66: {
                                                                                block72: {
                                                                                    block73: {
                                                                                        block76: {
                                                                                            block74: {
                                                                                                block75: {
                                                                                                    block70: {
                                                                                                        block71: {
                                                                                                            block69: {
                                                                                                                block67: {
                                                                                                                    block68: {
                                                                                                                        var5_4 = var2_2.getParameterTypes();
                                                                                                                        var4_5 = hi_0.C();
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v0 = var5_4.length;
                                                                                                                                        if (var4_5 != null) break block65;
                                                                                                                                        if (v0 != 1) break block66;
                                                                                                                                    }
                                                                                                                                    catch (Throwable v1) {
                                                                                                                                        throw O0.a(v1);
                                                                                                                                    }
                                                                                                                                    v2 = var2_2;
                                                                                                                                    if (var4_5 != null) break block67;
                                                                                                                                }
                                                                                                                                catch (Throwable v3) {
                                                                                                                                    throw O0.a(v3);
                                                                                                                                }
                                                                                                                                if (!v2.getName().equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12576 out of bounds for length 2")) break block68;
                                                                                                                            }
                                                                                                                            catch (Throwable v4) {
                                                                                                                                throw O0.a(v4);
                                                                                                                            }
                                                                                                                            return this.equals(var3_3[0]);
                                                                                                                        }
                                                                                                                        catch (Throwable v5) {
                                                                                                                            throw O0.a(v5);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v2 = var2_2;
                                                                                                                }
                                                                                                                var6_6 = v2.getReturnType();
                                                                                                                try {
                                                                                                                    if (var6_6 != Void.TYPE) {
                                                                                                                        throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12586 out of bounds for length 2");
                                                                                                                    }
                                                                                                                }
                                                                                                                catch (Throwable v6) {
                                                                                                                    throw O0.a(v6);
                                                                                                                }
                                                                                                                var7_8 = null;
                                                                                                                var8_10 = (E6)B8.J(var2_2, E6.class);
                                                                                                                try {
                                                                                                                    v7 = var8_10;
                                                                                                                    if (var4_5 != null) break block69;
                                                                                                                    if (v7 == null) break block70;
                                                                                                                }
                                                                                                                catch (Throwable v8) {
                                                                                                                    throw O0.a(v8);
                                                                                                                }
                                                                                                                v7 = var8_10;
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v9 = v7.W();
                                                                                                                    if (var4_5 != null) break block71;
                                                                                                                    if (v9.length() == 0) break block70;
                                                                                                                }
                                                                                                                catch (Throwable v10) {
                                                                                                                    throw O0.a(v10);
                                                                                                                }
                                                                                                                v9 = var8_10.W();
                                                                                                            }
                                                                                                            catch (Throwable v11) {
                                                                                                                throw O0.a(v11);
                                                                                                            }
                                                                                                        }
                                                                                                        var7_8 = v9;
                                                                                                    }
                                                                                                    try {
                                                                                                        v12 = var7_8;
                                                                                                        if (var4_5 != null) break block72;
                                                                                                        if (v12 != null) break block73;
                                                                                                    }
                                                                                                    catch (Throwable v13) {
                                                                                                        throw O0.a(v13);
                                                                                                    }
                                                                                                    var7_8 = var2_2.getName();
                                                                                                    try {
                                                                                                        try {
                                                                                                            v14 = var7_8.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12577 out of bounds for length 2");
                                                                                                            if (var4_5 != null) break block74;
                                                                                                            if (v14 != 0) break block75;
                                                                                                        }
                                                                                                        catch (Throwable v15) {
                                                                                                            throw O0.a(v15);
                                                                                                        }
                                                                                                        throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12581 out of bounds for length 2");
                                                                                                    }
                                                                                                    catch (Throwable v16) {
                                                                                                        throw O0.a(v16);
                                                                                                    }
                                                                                                }
                                                                                                var7_8 = var7_8.substring(3);
                                                                                                try {
                                                                                                    v17 = var7_8;
                                                                                                    if (var4_5 != null) break block76;
                                                                                                    v14 = v17.length();
                                                                                                }
                                                                                                catch (Throwable v18) {
                                                                                                    throw O0.a(v18);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (v14 == 0) {
                                                                                                    throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12581 out of bounds for length 2");
                                                                                                }
                                                                                            }
                                                                                            catch (Throwable v19) {
                                                                                                throw O0.a(v19);
                                                                                            }
                                                                                            v17 = Character.toLowerCase(var7_8.charAt(0)) + var7_8.substring(1);
                                                                                        }
                                                                                        var7_8 = v17;
                                                                                    }
                                                                                    v12 = this.q.put(var7_8, var3_3[0]);
                                                                                }
                                                                                return null;
                                                                            }
                                                                            v0 = var5_4.length;
                                                                        }
                                                                        if (v0 != 0) break block92;
                                                                        var6_7 = var2_2.getReturnType();
                                                                        try {
                                                                            if (var6_7 == Void.TYPE) {
                                                                                throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12580 out of bounds for length 2");
                                                                            }
                                                                        }
                                                                        catch (Throwable v20) {
                                                                            throw O0.a(v20);
                                                                        }
                                                                        var7_9 = null;
                                                                        var8_11 = (E6)B8.J(var2_2, E6.class);
                                                                        try {
                                                                            v21 = var8_11;
                                                                            if (var4_5 != null) break block77;
                                                                            if (v21 == null) break block78;
                                                                        }
                                                                        catch (Throwable v22) {
                                                                            throw O0.a(v22);
                                                                        }
                                                                        v21 = var8_11;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v23 = v21.W();
                                                                            if (var4_5 != null) break block79;
                                                                            if (v23.length() == 0) break block78;
                                                                        }
                                                                        catch (Throwable v24) {
                                                                            throw O0.a(v24);
                                                                        }
                                                                        v23 = var8_11.W();
                                                                    }
                                                                    catch (Throwable v25) {
                                                                        throw O0.a(v25);
                                                                    }
                                                                }
                                                                var7_9 = v23;
                                                            }
                                                            try {
                                                                v26 /* !! */  = var7_9;
                                                                if (var4_5 != null) break block80;
                                                                if (v26 /* !! */  != null) break block81;
                                                            }
                                                            catch (Throwable v27) {
                                                                throw O0.a(v27);
                                                            }
                                                            var7_9 = var2_2.getName();
                                                            try {
                                                                v28 = var7_9.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12583 out of bounds for length 2");
                                                                if (var4_5 != null) break block82;
                                                                if (v28) {
                                                                }
                                                                ** GOTO lbl174
                                                            }
                                                            catch (Throwable v29) {
                                                                throw O0.a(v29);
                                                            }
                                                            var7_9 = var7_9.substring(3);
                                                            try {
                                                                try {
                                                                    v30 = var7_9;
                                                                    if (var4_5 != null) break block83;
                                                                    if (v30.length() != 0) break block84;
                                                                }
                                                                catch (Throwable v31) {
                                                                    throw O0.a(v31);
                                                                }
                                                                throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12584 out of bounds for length 2");
                                                            }
                                                            catch (Throwable v32) {
                                                                throw O0.a(v32);
                                                            }
                                                        }
                                                        v30 = Character.toLowerCase(var7_9.charAt(0)) + var7_9.substring(1);
                                                    }
                                                    var7_9 = v30;
                                                    try {
                                                        if (var4_5 == null) break block81;
lbl174:
                                                        // 2 sources

                                                        v28 = var7_9.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12582 out of bounds for length 2");
                                                    }
                                                    catch (Throwable v33) {
                                                        throw O0.a(v33);
                                                    }
                                                }
                                                try {
                                                    if (var4_5 != null) break block85;
                                                    if (v28) {
                                                    }
                                                    ** GOTO lbl204
                                                }
                                                catch (Throwable v34) {
                                                    throw O0.a(v34);
                                                }
                                                var7_9 = var7_9.substring(2);
                                                try {
                                                    try {
                                                        v35 = var7_9;
                                                        if (var4_5 != null) break block86;
                                                        if (v35.length() != 0) break block87;
                                                    }
                                                    catch (Throwable v36) {
                                                        throw O0.a(v36);
                                                    }
                                                    throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12584 out of bounds for length 2");
                                                }
                                                catch (Throwable v37) {
                                                    throw O0.a(v37);
                                                }
                                            }
                                            v35 = Character.toLowerCase(var7_9.charAt(0)) + var7_9.substring(1);
                                        }
                                        var7_9 = v35;
                                        try {
                                            if (var4_5 == null) break block81;
lbl204:
                                            // 2 sources

                                            v28 = var7_9.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12579 out of bounds for length 2");
                                        }
                                        catch (Throwable v38) {
                                            throw O0.a(v38);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_5 != null) break block88;
                                            if (!v28) break block89;
                                        }
                                        catch (Throwable v39) {
                                            throw O0.a(v39);
                                        }
                                        return this.hashCode();
                                    }
                                    catch (Throwable v40) {
                                        throw O0.a(v40);
                                    }
                                }
                                try {
                                    v41 = var7_9;
                                    if (var4_5 != null) break block90;
                                    v28 = v41.startsWith("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12585 out of bounds for length 2");
                                }
                                catch (Throwable v42) {
                                    throw O0.a(v42);
                                }
                            }
                            try {
                                if (!v28) break block91;
                                v41 = this.toString();
                            }
                            catch (Throwable v43) {
                                throw O0.a(v43);
                            }
                        }
                        return v41;
                    }
                    throw new hi_0("\u0000ERR:ArrayIndexOutOfBoundsException:Index 12584 out of bounds for length 2");
                }
                v26 /* !! */  = this.q.get(var7_9);
            }
            var9_12 = v26 /* !! */ ;
            return B8.I(var9_12, var2_2.getGenericReturnType(), IG.G());
        }
        throw new UnsupportedOperationException(var2_2.toGenericString());
    }

    public Map d() {
        return this.q;
    }

    /*
     * Loose catch block
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String string;
        block14: {
            block15: {
                String string2 = hi_0.C();
                ex_1.w();
                string = string2;
                if (string != null) break block14;
                try {
                    block18: {
                        if (ex_1.j == null) break block15;
                        break block18;
                        catch (NotActiveException notActiveException) {
                            throw O0.a(notActiveException);
                        }
                    }
                    if (ex_1.R) break block15;
                }
                catch (NotActiveException notActiveException) {
                    throw O0.a(notActiveException);
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
        for (Map.Entry entry : this.q.entrySet()) {
            Object object;
            block16: {
                block17: {
                    Object k2 = entry.getKey();
                    try {
                        try {
                            object = k2;
                            if (string != null) break block16;
                            if (object == null) break block17;
                        }
                        catch (NotActiveException notActiveException) {
                            throw O0.a(notActiveException);
                        }
                        IG.D.E(k2.getClass());
                    }
                    catch (NotActiveException notActiveException) {
                        throw O0.a(notActiveException);
                    }
                }
                object = entry.getValue();
            }
            Object k3 = object;
            try {
                if (k3 != null) {
                    IG.D.E(k3.getClass());
                }
            }
            catch (NotActiveException notActiveException) {
                throw O0.a(notActiveException);
            }
            if (string == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object X(Class clazz) {
        Object object;
        block24: {
            Class clazz2;
            String string;
            block22: {
                block23: {
                    block21: {
                        block20: {
                            string = hi_0.C();
                            try {
                                try {
                                    object = clazz;
                                    clazz2 = Map.class;
                                    if (string != null) break block20;
                                    if (object == clazz2) return this;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw O0.a(illegalArgumentException);
                                }
                                object = clazz;
                                clazz2 = O0.class;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (string != null) break block21;
                                if (object == clazz2) return this;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                            object = clazz;
                            clazz2 = ok_0.class;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (string != null) break block22;
                            if (object != clazz2) break block23;
                            return this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                }
                try {
                    object = clazz;
                    if (string != null) return object;
                    clazz2 = Object.class;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            try {
                try {
                    try {
                        if (object != clazz2) break block24;
                        object = this;
                        if (string != null) return object;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    if (((O0)object).containsKey(ok_0.Z)) break block24;
                    return this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw O0.a(illegalArgumentException);
            }
        }
        object = B8.g(this, clazz, IG.G());
        return object;
    }

    public Object C(Class clazz, IG iG, int n10) {
        Object object;
        block14: {
            block15: {
                Class clazz2;
                String string;
                block12: {
                    block13: {
                        string = hi_0.C();
                        try {
                            try {
                                object = clazz;
                                clazz2 = Map.class;
                                if (string != null) break block12;
                                if (object != clazz2) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw O0.a(illegalArgumentException);
                            }
                            return this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                    }
                    try {
                        object = clazz;
                        if (string != null) break block14;
                        clazz2 = Object.class;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        try {
                            if (object != clazz2) break block15;
                            object = this;
                            if (string != null) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw O0.a(illegalArgumentException);
                        }
                        if (((O0)object).containsKey(ok_0.Z)) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw O0.a(illegalArgumentException);
                    }
                    return this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw O0.a(illegalArgumentException);
                }
            }
            object = B8.g(this, clazz, iG);
        }
        return object;
    }

    public Object clone() throws CloneNotSupportedException {
        return this.K();
    }

    public Object put(Object object, Object object2) {
        return this.C((String)object, object2);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "\u00bb\u001f\u00c5\u00cb\u001fM\u0003\u0092F5\fZ\u00e8\u00f5f\u00b9\u0091\u00a5\u00e9\u00df\u00fcZ@\b\u00b15.\u0095\u008b\u00b2\u00c8\u0019\u000ed\u00f1\u00aa\u00ac\u00c37i#\u0091+\u00db\u00c8\u00eeg\u000e\u00ed\u00bc\u009b\u0005\u00e5\u0002\u00ad\u0085\u001d\u00ff\u00dcR\u000e4\u0002b\u00bb\u0003\u00ec\u0001l\u000eo\u00ec\u00cb\u000f\u00efC\u00ec\u00ad!\u00fa\u00cd\u00f2, ";
                        var12_3 = "\u00bb\u001f\u00c5\u00cb\u001fM\u0003\u0092F5\fZ\u00e8\u00f5f\u00b9\u0091\u00a5\u00e9\u00df\u00fcZ@\b\u00b15.\u0095\u008b\u00b2\u00c8\u0019\u000ed\u00f1\u00aa\u00ac\u00c37i#\u0091+\u00db\u00c8\u00eeg\u000e\u00ed\u00bc\u009b\u0005\u00e5\u0002\u00ad\u0085\u001d\u00ff\u00dcR\u000e4\u0002b\u00bb\u0003\u00ec\u0001l\u000eo\u00ec\u00cb\u000f\u00efC\u00ec\u00ad!\u00fa\u00cd\u00f2, ".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 63;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00806r\u00e3\u00d0 {J\u000e5\u00ddE\u00ec\u00fb\u00fa\u00ab_\u0018a\u00b9Dg3";
                            var12_3 = "\u00806r\u00e3\u00d0 {J\u000e5\u00ddE\u00ec\u00fb\u00fa\u00ab_\u0018a\u00b9Dg3".length();
                            var9_4 = 8;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 115;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 22;
                                    break;
                                }
                                case 1: {
                                    v15 = 14;
                                    break;
                                }
                                case 2: {
                                    v15 = 20;
                                    break;
                                }
                                case 3: {
                                    v15 = 15;
                                    break;
                                }
                                case 4: {
                                    v15 = 74;
                                    break;
                                }
                                case 5: {
                                    v15 = 51;
                                    break;
                                }
                                default: {
                                    v15 = 103;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                O0.d = var13;
                O0.e = new String[11];
                var0_7 = 7016074164471791000L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00b3_*\u0007\u00a9\u0002\u00eb\u008c>K\u00c6\u00fe\u0091\u001e\u0007>";
                var5_11 = "\u00b3_*\u0007\u00a9\u0002\u00eb\u008c>K\u00c6\u00fe\u0091\u001e\u0007>".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        O0.g = var6_8;
        O0.k = new Integer[2];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x2AC1) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 211;
                    break;
                }
                case 1: {
                    n14 = 65;
                    break;
                }
                case 2: {
                    n14 = 229;
                    break;
                }
                case 3: {
                    n14 = 250;
                    break;
                }
                case 4: {
                    n14 = 200;
                    break;
                }
                case 5: {
                    n14 = 29;
                    break;
                }
                case 6: {
                    n14 = 171;
                    break;
                }
                case 7: {
                    n14 = 147;
                    break;
                }
                case 8: {
                    n14 = 17;
                    break;
                }
                case 9: {
                    n14 = 40;
                    break;
                }
                case 10: {
                    n14 = 33;
                    break;
                }
                case 11: {
                    n14 = 124;
                    break;
                }
                case 12: {
                    n14 = 10;
                    break;
                }
                case 13: {
                    n14 = 7;
                    break;
                }
                case 14: {
                    n14 = 168;
                    break;
                }
                case 15: {
                    n14 = 11;
                    break;
                }
                case 16: {
                    n14 = 105;
                    break;
                }
                case 17: {
                    n14 = 103;
                    break;
                }
                case 18: {
                    n14 = 143;
                    break;
                }
                case 19: {
                    n14 = 176;
                    break;
                }
                case 20: {
                    n14 = 142;
                    break;
                }
                case 21: {
                    n14 = 202;
                    break;
                }
                case 22: {
                    n14 = 59;
                    break;
                }
                case 23: {
                    n14 = 254;
                    break;
                }
                case 24: {
                    n14 = 225;
                    break;
                }
                case 25: {
                    n14 = 87;
                    break;
                }
                case 26: {
                    n14 = 72;
                    break;
                }
                case 27: {
                    n14 = 88;
                    break;
                }
                case 28: {
                    n14 = 73;
                    break;
                }
                case 29: {
                    n14 = 210;
                    break;
                }
                case 30: {
                    n14 = 106;
                    break;
                }
                case 31: {
                    n14 = 79;
                    break;
                }
                case 32: {
                    n14 = 187;
                    break;
                }
                case 33: {
                    n14 = 173;
                    break;
                }
                case 34: {
                    n14 = 163;
                    break;
                }
                case 35: {
                    n14 = 215;
                    break;
                }
                case 36: {
                    n14 = 76;
                    break;
                }
                case 37: {
                    n14 = 230;
                    break;
                }
                case 38: {
                    n14 = 80;
                    break;
                }
                case 39: {
                    n14 = 218;
                    break;
                }
                case 40: {
                    n14 = 243;
                    break;
                }
                case 41: {
                    n14 = 164;
                    break;
                }
                case 42: {
                    n14 = 193;
                    break;
                }
                case 43: {
                    n14 = 174;
                    break;
                }
                case 44: {
                    n14 = 12;
                    break;
                }
                case 45: {
                    n14 = 57;
                    break;
                }
                case 46: {
                    n14 = 123;
                    break;
                }
                case 47: {
                    n14 = 195;
                    break;
                }
                case 48: {
                    n14 = 182;
                    break;
                }
                case 49: {
                    n14 = 246;
                    break;
                }
                case 50: {
                    n14 = 154;
                    break;
                }
                case 51: {
                    n14 = 113;
                    break;
                }
                case 52: {
                    n14 = 130;
                    break;
                }
                case 53: {
                    n14 = 93;
                    break;
                }
                case 54: {
                    n14 = 221;
                    break;
                }
                case 55: {
                    n14 = 2;
                    break;
                }
                case 56: {
                    n14 = 162;
                    break;
                }
                case 57: {
                    n14 = 181;
                    break;
                }
                case 58: {
                    n14 = 58;
                    break;
                }
                case 59: {
                    n14 = 216;
                    break;
                }
                case 60: {
                    n14 = 214;
                    break;
                }
                case 61: {
                    n14 = 161;
                    break;
                }
                case 62: {
                    n14 = 61;
                    break;
                }
                case 63: {
                    n14 = 28;
                    break;
                }
                case 64: {
                    n14 = 94;
                    break;
                }
                case 65: {
                    n14 = 136;
                    break;
                }
                case 66: {
                    n14 = 4;
                    break;
                }
                case 67: {
                    n14 = 240;
                    break;
                }
                case 68: {
                    n14 = 25;
                    break;
                }
                case 69: {
                    n14 = 114;
                    break;
                }
                case 70: {
                    n14 = 235;
                    break;
                }
                case 71: {
                    n14 = 23;
                    break;
                }
                case 72: {
                    n14 = 208;
                    break;
                }
                case 73: {
                    n14 = 120;
                    break;
                }
                case 74: {
                    n14 = 199;
                    break;
                }
                case 75: {
                    n14 = 109;
                    break;
                }
                case 76: {
                    n14 = 122;
                    break;
                }
                case 77: {
                    n14 = 119;
                    break;
                }
                case 78: {
                    n14 = 102;
                    break;
                }
                case 79: {
                    n14 = 129;
                    break;
                }
                case 80: {
                    n14 = 24;
                    break;
                }
                case 81: {
                    n14 = 178;
                    break;
                }
                case 82: {
                    n14 = 183;
                    break;
                }
                case 83: {
                    n14 = 236;
                    break;
                }
                case 84: {
                    n14 = 157;
                    break;
                }
                case 85: {
                    n14 = 74;
                    break;
                }
                case 86: {
                    n14 = 89;
                    break;
                }
                case 87: {
                    n14 = 239;
                    break;
                }
                case 88: {
                    n14 = 86;
                    break;
                }
                case 89: {
                    n14 = 47;
                    break;
                }
                case 90: {
                    n14 = 141;
                    break;
                }
                case 91: {
                    n14 = 207;
                    break;
                }
                case 92: {
                    n14 = 232;
                    break;
                }
                case 93: {
                    n14 = 111;
                    break;
                }
                case 94: {
                    n14 = 108;
                    break;
                }
                case 95: {
                    n14 = 253;
                    break;
                }
                case 96: {
                    n14 = 100;
                    break;
                }
                case 97: {
                    n14 = 69;
                    break;
                }
                case 98: {
                    n14 = 67;
                    break;
                }
                case 99: {
                    n14 = 205;
                    break;
                }
                case 100: {
                    n14 = 242;
                    break;
                }
                case 101: {
                    n14 = 50;
                    break;
                }
                case 102: {
                    n14 = 48;
                    break;
                }
                case 103: {
                    n14 = 39;
                    break;
                }
                case 104: {
                    n14 = 27;
                    break;
                }
                case 105: {
                    n14 = 148;
                    break;
                }
                case 106: {
                    n14 = 177;
                    break;
                }
                case 107: {
                    n14 = 244;
                    break;
                }
                case 108: {
                    n14 = 145;
                    break;
                }
                case 109: {
                    n14 = 217;
                    break;
                }
                case 110: {
                    n14 = 83;
                    break;
                }
                case 111: {
                    n14 = 52;
                    break;
                }
                case 112: {
                    n14 = 37;
                    break;
                }
                case 113: {
                    n14 = 71;
                    break;
                }
                case 114: {
                    n14 = 44;
                    break;
                }
                case 115: {
                    n14 = 9;
                    break;
                }
                case 116: {
                    n14 = 233;
                    break;
                }
                case 117: {
                    n14 = 249;
                    break;
                }
                case 118: {
                    n14 = 118;
                    break;
                }
                case 119: {
                    n14 = 196;
                    break;
                }
                case 120: {
                    n14 = 223;
                    break;
                }
                case 121: {
                    n14 = 43;
                    break;
                }
                case 122: {
                    n14 = 101;
                    break;
                }
                case 123: {
                    n14 = 227;
                    break;
                }
                case 124: {
                    n14 = 82;
                    break;
                }
                case 125: {
                    n14 = 104;
                    break;
                }
                case 126: {
                    n14 = 203;
                    break;
                }
                case 127: {
                    n14 = 169;
                    break;
                }
                case 128: {
                    n14 = 98;
                    break;
                }
                case 129: {
                    n14 = 99;
                    break;
                }
                case 130: {
                    n14 = 135;
                    break;
                }
                case 131: {
                    n14 = 63;
                    break;
                }
                case 132: {
                    n14 = 146;
                    break;
                }
                case 133: {
                    n14 = 206;
                    break;
                }
                case 134: {
                    n14 = 213;
                    break;
                }
                case 135: {
                    n14 = 95;
                    break;
                }
                case 136: {
                    n14 = 252;
                    break;
                }
                case 137: {
                    n14 = 204;
                    break;
                }
                case 138: {
                    n14 = 150;
                    break;
                }
                case 139: {
                    n14 = 134;
                    break;
                }
                case 140: {
                    n14 = 126;
                    break;
                }
                case 141: {
                    n14 = 31;
                    break;
                }
                case 142: {
                    n14 = 175;
                    break;
                }
                case 143: {
                    n14 = 5;
                    break;
                }
                case 144: {
                    n14 = 55;
                    break;
                }
                case 145: {
                    n14 = 185;
                    break;
                }
                case 146: {
                    n14 = 238;
                    break;
                }
                case 147: {
                    n14 = 64;
                    break;
                }
                case 148: {
                    n14 = 77;
                    break;
                }
                case 149: {
                    n14 = 201;
                    break;
                }
                case 150: {
                    n14 = 49;
                    break;
                }
                case 151: {
                    n14 = 53;
                    break;
                }
                case 152: {
                    n14 = 245;
                    break;
                }
                case 153: {
                    n14 = 1;
                    break;
                }
                case 154: {
                    n14 = 219;
                    break;
                }
                case 155: {
                    n14 = 92;
                    break;
                }
                case 156: {
                    n14 = 36;
                    break;
                }
                case 157: {
                    n14 = 179;
                    break;
                }
                case 158: {
                    n14 = 220;
                    break;
                }
                case 159: {
                    n14 = 165;
                    break;
                }
                case 160: {
                    n14 = 152;
                    break;
                }
                case 161: {
                    n14 = 117;
                    break;
                }
                case 162: {
                    n14 = 234;
                    break;
                }
                case 163: {
                    n14 = 15;
                    break;
                }
                case 164: {
                    n14 = 14;
                    break;
                }
                case 165: {
                    n14 = 194;
                    break;
                }
                case 166: {
                    n14 = 18;
                    break;
                }
                case 167: {
                    n14 = 156;
                    break;
                }
                case 168: {
                    n14 = 38;
                    break;
                }
                case 169: {
                    n14 = 149;
                    break;
                }
                case 170: {
                    n14 = 66;
                    break;
                }
                case 171: {
                    n14 = 60;
                    break;
                }
                case 172: {
                    n14 = 3;
                    break;
                }
                case 173: {
                    n14 = 84;
                    break;
                }
                case 174: {
                    n14 = 107;
                    break;
                }
                case 175: {
                    n14 = 133;
                    break;
                }
                case 176: {
                    n14 = 144;
                    break;
                }
                case 177: {
                    n14 = 51;
                    break;
                }
                case 178: {
                    n14 = 128;
                    break;
                }
                case 179: {
                    n14 = 251;
                    break;
                }
                case 180: {
                    n14 = 70;
                    break;
                }
                case 181: {
                    n14 = 41;
                    break;
                }
                case 182: {
                    n14 = 184;
                    break;
                }
                case 183: {
                    n14 = 115;
                    break;
                }
                case 184: {
                    n14 = 26;
                    break;
                }
                case 185: {
                    n14 = 13;
                    break;
                }
                case 186: {
                    n14 = 56;
                    break;
                }
                case 187: {
                    n14 = 121;
                    break;
                }
                case 188: {
                    n14 = 8;
                    break;
                }
                case 189: {
                    n14 = 30;
                    break;
                }
                case 190: {
                    n14 = 131;
                    break;
                }
                case 191: {
                    n14 = 112;
                    break;
                }
                case 192: {
                    n14 = 158;
                    break;
                }
                case 193: {
                    n14 = 21;
                    break;
                }
                case 194: {
                    n14 = 0;
                    break;
                }
                case 195: {
                    n14 = 140;
                    break;
                }
                case 196: {
                    n14 = 189;
                    break;
                }
                case 197: {
                    n14 = 167;
                    break;
                }
                case 198: {
                    n14 = 212;
                    break;
                }
                case 199: {
                    n14 = 226;
                    break;
                }
                case 200: {
                    n14 = 75;
                    break;
                }
                case 201: {
                    n14 = 20;
                    break;
                }
                case 202: {
                    n14 = 159;
                    break;
                }
                case 203: {
                    n14 = 32;
                    break;
                }
                case 204: {
                    n14 = 231;
                    break;
                }
                case 205: {
                    n14 = 46;
                    break;
                }
                case 206: {
                    n14 = 127;
                    break;
                }
                case 207: {
                    n14 = 153;
                    break;
                }
                case 208: {
                    n14 = 180;
                    break;
                }
                case 209: {
                    n14 = 34;
                    break;
                }
                case 210: {
                    n14 = 68;
                    break;
                }
                case 211: {
                    n14 = 186;
                    break;
                }
                case 212: {
                    n14 = 247;
                    break;
                }
                case 213: {
                    n14 = 45;
                    break;
                }
                case 214: {
                    n14 = 81;
                    break;
                }
                case 215: {
                    n14 = 125;
                    break;
                }
                case 216: {
                    n14 = 116;
                    break;
                }
                case 217: {
                    n14 = 228;
                    break;
                }
                case 218: {
                    n14 = 85;
                    break;
                }
                case 219: {
                    n14 = 188;
                    break;
                }
                case 220: {
                    n14 = 138;
                    break;
                }
                case 221: {
                    n14 = 132;
                    break;
                }
                case 222: {
                    n14 = 19;
                    break;
                }
                case 223: {
                    n14 = 90;
                    break;
                }
                case 224: {
                    n14 = 237;
                    break;
                }
                case 225: {
                    n14 = 22;
                    break;
                }
                case 226: {
                    n14 = 6;
                    break;
                }
                case 227: {
                    n14 = 170;
                    break;
                }
                case 228: {
                    n14 = 191;
                    break;
                }
                case 229: {
                    n14 = 224;
                    break;
                }
                case 230: {
                    n14 = 151;
                    break;
                }
                case 231: {
                    n14 = 78;
                    break;
                }
                case 232: {
                    n14 = 241;
                    break;
                }
                case 233: {
                    n14 = 137;
                    break;
                }
                case 234: {
                    n14 = 198;
                    break;
                }
                case 235: {
                    n14 = 110;
                    break;
                }
                case 236: {
                    n14 = 35;
                    break;
                }
                case 237: {
                    n14 = 139;
                    break;
                }
                case 238: {
                    n14 = 160;
                    break;
                }
                case 239: {
                    n14 = 155;
                    break;
                }
                case 240: {
                    n14 = 172;
                    break;
                }
                case 241: {
                    n14 = 248;
                    break;
                }
                case 242: {
                    n14 = 222;
                    break;
                }
                case 243: {
                    n14 = 96;
                    break;
                }
                case 244: {
                    n14 = 54;
                    break;
                }
                case 245: {
                    n14 = 97;
                    break;
                }
                case 246: {
                    n14 = 42;
                    break;
                }
                case 247: {
                    n14 = 209;
                    break;
                }
                case 248: {
                    n14 = 197;
                    break;
                }
                case 249: {
                    n14 = 91;
                    break;
                }
                case 250: {
                    n14 = 192;
                    break;
                }
                case 251: {
                    n14 = 16;
                    break;
                }
                case 252: {
                    n14 = 166;
                    break;
                }
                case 253: {
                    n14 = 62;
                    break;
                }
                case 254: {
                    n14 = 255;
                    break;
                }
                default: {
                    n14 = 190;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            O0.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x534C;
        if (k[n11] == null) {
            O0.k[n11] = (int)(g[n11] ^ l2);
        }
        return k[n11];
    }
}

