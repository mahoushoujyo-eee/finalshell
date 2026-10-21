package com.apple.eawt.event;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JComponent;

public final class GestureHandler {
   public static final String CLIENT_PROPERTY = "com.apple.eawt.event.internalGestureHandler";
   static final int PHASE = 1;
   static final int ROTATE = 2;
   static final int MAGNIFY = 3;
   static final int SWIPE = 4;
   static final int PRESSURE = 5;

   static void addGestureListenerTo(JComponent component, GestureListener listener) {
   }

   static void removeGestureListenerFrom(JComponent component, GestureListener listener) {
   }

   static void handleGestureFromNative(Window window, int type, double x, double y, double a, double b) {
   }

   GestureHandler() {
   }

   void addListener(GestureListener listener) {
   }

   void removeListener(GestureListener listener) {
   }

   static GestureHandler getHandlerForComponent(Component c) {
      return null;
   }

   static PerComponentNotifier getNextNotifierForComponent(Component c) {
      return null;
   }
}





