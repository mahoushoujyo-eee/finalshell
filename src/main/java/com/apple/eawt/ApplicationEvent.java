/*
 * Decompiled with CFR 0.152.
 */
package com.apple.eawt;

import java.util.EventObject;

@Deprecated
public class ApplicationEvent
extends EventObject {
    private String fFilename;
    private boolean fHandled;

    ApplicationEvent(Object o2) {
        super(o2);
    }

    ApplicationEvent(Object o2, String s2) {
        super(o2);
    }

    @Deprecated
    public boolean isHandled() {
        return false;
    }

    @Deprecated
    public void setHandled(boolean b2) {
    }

    @Deprecated
    public String getFilename() {
        return null;
    }
}

