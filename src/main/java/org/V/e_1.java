/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;
import org.F.c;
import org.V.J;
import org.V.N;
import org.v.RG;
import org.v.rt_0;
import org.v.w_1;
import org.z.D;
import org.z.t;

/*
 * Renamed from org.v.E
 */
class e_1
extends J {
    final w_1 v;

    e_1(w_1 w_12) {
        this.v = w_12;
    }

    /*
     * Loose catch block
     */
    @Override
    @c
    public N J(String string) {
        String[] stringArray = RG.C();
        try {
            Set set = t.c().W();
            Iterator iterator = set.iterator();
            while (true) {
                Iterator iterator2;
                block9: {
                    iterator2 = iterator;
                    if (stringArray == null) break block9;
                    try {
                        block10: {
                            if (!iterator2.hasNext()) break;
                            break block10;
                            catch (IOException iOException) {
                                throw e_1.a(iOException);
                            }
                        }
                        iterator2 = iterator.next();
                    }
                    catch (IOException iOException) {
                        throw e_1.a(iOException);
                    }
                }
                D d2 = (D)((Object)iterator2);
                URI uRI = (URI)d2.H().l();
                URL uRL = new URL(uRI + "/" + string);
                URLConnection uRLConnection = uRL.openConnection();
                try {
                    uRLConnection.connect();
                    return new rt_0(this, uRLConnection, uRI, string);
                }
                catch (IOException iOException) {
                    if (stringArray != null) continue;
                }
                break;
            }
            return null;
        }
        catch (Exception exception) {
            throw new AssertionError((Object)exception);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

