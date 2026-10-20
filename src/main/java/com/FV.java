/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class FV {
    private static String v;

    public static Window L(Component component) {
        String string = FV.D();
        Component component2 = component;
        if (string == null) {
            if (component2 == null) {
                return null;
            }
            component2 = component;
        }
        if (string == null) {
            if (component2 instanceof Window) {
                return (Window)component;
            }
            component2 = component;
        }
        Container container = component2.getParent();
        while (container != null) {
            Container container2 = container;
            if (string == null) {
                if (container2 instanceof Window) {
                    return (Window)container;
                }
                container2 = container = container.getParent();
            }
            if (string == null) continue;
        }
        return null;
    }

    public static void p(Runnable runnable) {
        block4: {
            block3: {
                String string;
                block2: {
                    string = FV.D();
                    if (string != null) break block2;
                    if (!SwingUtilities.isEventDispatchThread()) break block3;
                    runnable.run();
                }
                if (string == null) break block4;
            }
            SwingUtilities.invokeLater(runnable);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void T(Runnable var0) throws InterruptedException, InvocationTargetException {
        block9: {
            block8: {
                var1_1 = FV.D();
                try {
                    try {
                        if (var1_1 != null) break block8;
                        if (SwingUtilities.isEventDispatchThread()) {
                        }
                        ** GOTO lbl17
                    }
                    catch (InterruptedException v0) {
                        throw FV.a(v0);
                    }
                    var0.run();
                }
                catch (InterruptedException v1) {
                    throw FV.a(v1);
                }
            }
            try {
                if (var1_1 == null) break block9;
lbl17:
                // 2 sources

                SwingUtilities.invokeAndWait(var0);
            }
            catch (InterruptedException v2) {
                throw FV.a(v2);
            }
        }
    }

    public static void G(Runnable runnable) {
        try {
            FV.T(runnable);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static void D(String string) {
        v = string;
    }

    public static String D() {
        return v;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    static {
        if (FV.D() != null) {
            FV.D("gJ9Ic");
        }
    }
}

