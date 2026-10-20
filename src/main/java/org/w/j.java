/*
 * Decompiled with CFR 0.152.
 */
package org.w;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.F.c;

public final class j {
    private j() {
    }

    public static Object o(Method method, @c Object object, Object[] objectArray) throws Throwable {
        try {
            Object object2 = method.invoke(object, objectArray);
            return object2;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getTargetException();
            throw throwable;
        }
        catch (Exception exception) {
            throw new AssertionError((Object)exception);
        }
    }
}

