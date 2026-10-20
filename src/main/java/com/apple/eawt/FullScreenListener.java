/*
 * Decompiled with CFR 0.152.
 */
package com.apple.eawt;

import com.apple.eawt.AppEvent;

public interface FullScreenListener {
    public void windowEnteringFullScreen(AppEvent.FullScreenEvent var1);

    public void windowEnteredFullScreen(AppEvent.FullScreenEvent var1);

    public void windowExitingFullScreen(AppEvent.FullScreenEvent var1);

    public void windowExitedFullScreen(AppEvent.FullScreenEvent var1);
}

