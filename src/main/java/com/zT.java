/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.util.Collections;
import java.util.List;
import javax.swing.KeyStroke;
import org.jetbrains.annotations.NotNull;

public class zT {
    private final String t;
    private final List x;

    public zT(@NotNull String string, @NotNull KeyStroke keyStroke) {
        this(string, Collections.singletonList(keyStroke));
    }

    public zT(@NotNull String string, @NotNull List list) {
        this.t = string;
        this.x = list;
    }

    @NotNull
    public String s() {
        return this.t;
    }

    @NotNull
    public List j() {
        return this.x;
    }
}

