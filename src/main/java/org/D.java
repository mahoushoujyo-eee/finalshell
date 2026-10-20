/*
 * Decompiled with CFR 0.152.
 */
package org;

import java.io.IOException;
import java.io.Reader;
import org.F.c;
import org.U;
import org.Y;
import org.b_0;
import org.e_0;

public interface D
extends e_0 {
    public void w(@c ClassLoader var1);

    public void N(boolean var1, boolean var2, boolean var3);

    public void q(@c U var1);

    public void t(@c Y var1);

    public void P(String[] var1);

    public String[] i();

    public void t(String var1);

    public void Q(@c Class var1);

    @Deprecated
    public void Z(@c Class var1);

    public void P(Class[] var1);

    @Deprecated
    public void Q(Class[] var1);

    public Class t();

    public Object c(Reader var1) throws b_0, IOException;
}

