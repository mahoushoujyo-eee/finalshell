/*
 * Decompiled with CFR 0.152.
 */
package org;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.F.c;
import org.U;
import org.Y;
import org.b_0;
import org.e_0;
import org.p_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface C
extends e_0,
p_0 {
    public static final Class G = Object.class;
    @Deprecated
    public static final Class y = Object.class;

    public void c(@c ClassLoader var1);

    public void w(boolean var1, boolean var2, boolean var3);

    public void l(@c U var1);

    public void X(@c Y var1);

    @c
    public Object V(@c Object[] var1) throws InvocationTargetException;

    public void E(Class var1);

    public Class o();

    public void b(Class[] var1);

    @Deprecated
    public void z(@Deprecated Class var1);

    public void y(Class var1);

    public void V(Class[] var1);

    public void C(boolean var1);

    public void Q(boolean[] var1);

    public void F(String[] var1, Class[] var2);

    public void O(String[][] var1, Class[][] var2);

    public void F(String var1);

    public void O(Class var1);

    public void u(String[] var1);

    public String[] F();

    public void M(boolean var1);

    public void W(boolean[] var1);

    public void v(String var1);

    public void V(String[] var1);

    public void K(Class[] var1);

    public void v(Class[][] var1);

    @c
    public Object C(int var1, @c Object[] var2) throws InvocationTargetException;

    public Object H(String var1, Class var2, String[] var3) throws b_0;

    public Object j(Reader var1, Class var2, String[] var3) throws b_0, IOException;

    public Method Z();

    public Method y(int var1);

    public Class Z();

    public Method[] l();
}

