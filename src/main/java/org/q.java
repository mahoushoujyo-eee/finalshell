/*
 * Decompiled with CFR 0.152.
 */
package org;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import org.X;

public final class q {
    private final AccessControlContext Q;

    public q(PermissionCollection permissionCollection) {
        this.Q = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissionCollection)});
    }

    public Object F(PrivilegedAction privilegedAction) {
        return AccessController.doPrivileged(privilegedAction, this.Q);
    }

    public Object z(PrivilegedExceptionAction privilegedExceptionAction) throws Exception {
        try {
            return AccessController.doPrivileged(privilegedExceptionAction, this.Q);
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw privilegedActionException.getException();
        }
    }

    static {
        if (System.getSecurityManager() == null) {
            Policy.setPolicy(new X());
            System.setSecurityManager(new SecurityManager());
        }
    }
}

