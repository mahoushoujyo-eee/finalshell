/*
 * Decompiled with CFR 0.152.
 */
package org;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;
import org.F.c;
import org.b_0;

/*
 * Renamed from org.e
 */
public interface e_0 {
    public void Y(@c String var1, Reader var2) throws b_0, IOException;

    public void f(Reader var1) throws b_0, IOException;

    public void i(InputStream var1) throws b_0, IOException;

    public void f(@c String var1, InputStream var2) throws b_0, IOException;

    public void V(InputStream var1, @c String var2) throws b_0, IOException;

    public void d(@c String var1, InputStream var2, @c String var3) throws b_0, IOException;

    public void D(String var1) throws b_0;

    public void E(@c String var1, String var2) throws b_0;

    public void O(File var1) throws b_0, IOException;

    public void o(File var1, @c String var2) throws b_0, IOException;

    public void c(String var1) throws b_0, IOException;

    public void r(String var1, @c String var2) throws b_0, IOException;

    public void n(int var1);

    public void v(int var1);

    public Map Q();
}

