/*
 * Decompiled with CFR 0.152.
 */
package com.apple.eawt.event;

import com.apple.eawt.event.GesturePhaseEvent;
import com.apple.eawt.event.GesturePhaseListener;
import com.apple.eawt.event.MagnificationEvent;
import com.apple.eawt.event.MagnificationListener;
import com.apple.eawt.event.RotationEvent;
import com.apple.eawt.event.RotationListener;
import com.apple.eawt.event.SwipeEvent;
import com.apple.eawt.event.SwipeListener;

public abstract class GestureAdapter
implements GesturePhaseListener,
MagnificationListener,
RotationListener,
SwipeListener {
    @Override
    public void gestureBegan(GesturePhaseEvent event) {
    }

    @Override
    public void gestureEnded(GesturePhaseEvent event) {
    }

    @Override
    public void magnify(MagnificationEvent event) {
    }

    @Override
    public void rotate(RotationEvent event) {
    }

    @Override
    public void swipedDown(SwipeEvent event) {
    }

    @Override
    public void swipedLeft(SwipeEvent event) {
    }

    @Override
    public void swipedRight(SwipeEvent event) {
    }

    @Override
    public void swipedUp(SwipeEvent event) {
    }
}

