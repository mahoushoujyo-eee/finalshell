/*
 * Decompiled with CFR 0.152.
 */
package org.y;

import com.GO;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.F.F;
import org.V.J;
import org.V.T;

class H
extends ClassLoader {
    final J M;

    H(ClassLoader classLoader, J j2) {
        this.M = j2;
        super(classLoader);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @F(value=false)
    public URL getResource(String string) {
        Object object;
        boolean bl;
        Object object2;
        block11: {
            block12: {
                block10: {
                    URL uRL;
                    object2 = super.getResource(string);
                    bl = GO.B();
                    try {
                        uRL = object2;
                        if (bl) return uRL;
                        if (uRL == null) break block10;
                    }
                    catch (IOException iOException) {
                        throw H.a(iOException);
                    }
                    uRL = object2;
                    return uRL;
                }
                object2 = this.M.J(string);
                object = object2;
                if (bl) break block11;
                try {
                    if (object != null) break block12;
                    return null;
                    catch (IOException iOException) {
                        throw H.a(iOException);
                    }
                }
                catch (IOException iOException) {
                    throw H.a(iOException);
                }
            }
            object = object2;
        }
        try {
            if (bl) return ((T)object).T();
            if (!(object instanceof T)) return null;
        }
        catch (IOException iOException) {
            throw H.a(iOException);
        }
        try {
            object = object2;
            return ((T)object).T();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @F(value=false)
    public InputStream getResourceAsStream(String string) {
        InputStream inputStream;
        block6: {
            InputStream inputStream2 = super.getResourceAsStream(string);
            boolean bl = GO.B();
            inputStream = inputStream2;
            if (bl) return inputStream;
            try {
                if (inputStream == null) break block6;
                return inputStream2;
                catch (IOException iOException) {
                    throw H.a(iOException);
                }
            }
            catch (IOException iOException) {
                throw H.a(iOException);
            }
        }
        try {
            inputStream = this.M.l(string);
            return inputStream;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

