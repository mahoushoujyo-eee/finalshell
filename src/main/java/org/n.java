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

public interface n
extends e_0,
p_0 {
    public static final Class M = Void.TYPE;

    public void e(@c ClassLoader var1);

    public void L(boolean var1, boolean var2, boolean var3);

    public void e(@c U var1);

    public void s(@c Y var1);

    public void Z(String var1);

    public void j(Class[] var1);

    public void c(Class var1);

    public void A(Class var1);

    public Class c();

    public void h(boolean var1);

    public void Y(boolean var1);

    public void J(Class var1);

    public void L(@c String var1);

    public void N(String[] var1, Class[] var2);

    public void I(Class[] var1);

    @c
    public Object s(@c Object[] var1) throws InvocationTargetException;

    public Method E();

    public void e(boolean[] var1);

    public void p(boolean[] var1);

    public void B(Class[] var1);

    public void E(String[] var1);

    public void Y(String[][] var1, Class[][] var2);

    public void q(Class[][] var1);

    @Override
    public void g(Reader[] var1) throws b_0, IOException;

    @Override
    public void a(String[] var1, Reader[] var2) throws b_0, IOException;

    @Override
    public void b(String[] var1) throws b_0;

    @Override
    public void E(String[] var1, String[] var2) throws b_0;

    @c
    public Object W(int var1, @c Object[] var2) throws InvocationTargetException;

    public Method R(int var1);

    public Object F(String var1, Class var2, String[] var3) throws b_0;

    public Object K(Reader var1, Class var2, String[] var3) throws b_0, IOException;

    public void A(String[] var1);

    public String[] H();

    public Class e();

    public Method[] C();
}

