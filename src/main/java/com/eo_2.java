/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.rt_1;
import com.u0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from com.eo
 */
public class eo_2
implements Map {
    protected Map m;
    protected Map a;
    private static final long b;

    public eo_2() {
        this((int)b);
    }

    public eo_2(int n10) {
        String[] stringArray = u0.P();
        String[] stringArray2 = stringArray;
        this.m = new HashMap(n10);
        this.a = new HashMap(n10);
        if (ky_2.F() != null) {
            u0.B(new String[4]);
        }
    }

    public eo_2(Map map) {
        this(map.size());
        this.putAll(map);
    }

    public Object u(Object object) {
        return this.m.get(object);
    }

    public Object M(Object object) {
        return this.a.get(object);
    }

    public Object E(Object object) {
        Object v2 = this.m.remove(object);
        String[] stringArray = u0.P();
        Object v3 = v2;
        if (stringArray != null) {
            if (v3 != null) {
                this.a.remove(v2);
            }
            v3 = v2;
        }
        return v3;
    }

    public Object R(Object object) {
        Object v2 = this.a.remove(object);
        String[] stringArray = u0.P();
        Object v3 = v2;
        if (stringArray != null) {
            if (v3 != null) {
                this.m.remove(v2);
            }
            v3 = v2;
        }
        return v3;
    }

    public Object put(Object object, Object object2) {
        Object v2;
        String[] stringArray;
        block7: {
            block6: {
                Object object3;
                Map map;
                block5: {
                    stringArray = u0.P();
                    map = this.m;
                    object3 = object;
                    if (stringArray == null) break block5;
                    if (!map.containsKey(object3)) break block6;
                    map = this.m;
                    object3 = object;
                }
                v2 = map.get(object3);
                this.m.remove(object);
                this.a.remove(v2);
                if (stringArray != null) break block7;
                ky_2.K(new String[5]);
            }
            v2 = null;
        }
        Map map = this.a;
        Object object4 = object2;
        if (stringArray != null) {
            if (map.containsKey(object4)) {
                Object v3 = this.a.get(object2);
                this.m.remove(v3);
                this.a.remove(object2);
            }
            this.m.put(object, object2);
            map = this.a;
            object4 = object2;
        }
        map.put(object4, object);
        return v2;
    }

    @Override
    public int size() {
        return this.m.size();
    }

    @Override
    public boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.m.containsKey(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    public Object get(Object object) {
        return this.m.get(object);
    }

    public Object remove(Object object) {
        return this.E(object);
    }

    public void putAll(Map map) {
        Iterator iterator = map.entrySet().iterator();
        String[] stringArray = u0.P();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            this.put(entry.getKey(), entry.getValue());
            if (stringArray != null) continue;
        }
    }

    @Override
    public void clear() {
        this.m.clear();
        this.a.clear();
    }

    public Set keySet() {
        return this.m.keySet();
    }

    public Collection values() {
        return this.m.values();
    }

    public Set entrySet() {
        return this.m.entrySet();
    }

    public Map d() {
        return rt_1.H(this.m);
    }

    public Map o() {
        return rt_1.H(this.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3603658500774711312L;
        b = 0xA3EC9B933E7E501AL ^ l2;
    }
}

