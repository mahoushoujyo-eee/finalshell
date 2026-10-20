/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.F.c;
import org.V.J;
import org.V.N;
import org.V.U;
import org.V.f;

/*
 * Renamed from org.V.s
 */
public class s_0
extends U {
    private final Iterable D;

    public s_0(Iterable iterable) {
        this.D = iterable;
    }

    public s_0(J[] jArray) {
        this(Arrays.asList(jArray));
    }

    @Override
    @c
    public final N J(String string) {
        Iterator iterator = this.D.iterator();
        int[] nArray = f.h();
        while (iterator.hasNext()) {
            block4: {
                N n10;
                block3: {
                    N n11;
                    J j2 = (J)iterator.next();
                    n10 = n11 = j2.J(string);
                    if (nArray != null) break block3;
                    if (n10 == null) break block4;
                    n10 = n11;
                }
                return n10;
            }
            if (nArray == null) continue;
        }
        return null;
    }

    @Override
    @c
    public Iterable E(String string, boolean bl) throws IOException {
        ArrayList<N> arrayList = new ArrayList<N>();
        Iterator iterator = this.D.iterator();
        int[] nArray = f.h();
        block2: while (iterator.hasNext()) {
            block5: {
                Iterable iterable;
                block4: {
                    J j2 = (J)iterator.next();
                    Iterable iterable2 = ((U)j2).E(string, bl);
                    try {
                        iterable = iterable2;
                        if (nArray != null) break block4;
                        if (iterable == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw s_0.a(iOException);
                    }
                    iterable = iterable2;
                }
                for (N n10 : iterable) {
                    arrayList.add(n10);
                    if (nArray != null) continue block2;
                    if (nArray == null) continue;
                }
            }
            if (nArray == null) continue;
        }
        return arrayList;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

