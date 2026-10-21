package com.apple.eawt.event;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JComponent;

public final class GestureHandler {
   public static final String CLIENT_PROPERTY = "com.apple.eawt.event.internalGestureHandler";
   public static final int PHASE = 1;
   public static final int ROTATE = 2;
   public static final int MAGNIFY = 3;
   public static final int SWIPE = 4;
   public static final int PRESSURE = 5;

   public static void addGestureListenerTo(JComponent component, GestureListener listener) {
   }

   public static void removeGestureListenerFrom(JComponent component, GestureListener listener) {
   }

   public static void handleGestureFromNative(Window window, int type, double x, double y, double a, double b) {
   }

   public void addListener(GestureListener listener) {
   }

   public void removeListener(GestureListener listener) {
   }

   public static GestureHandler getHandlerForComponent(Component c) {
      return null;
   }

   public static PerComponentNotifier getNextNotifierForComponent(Component c) {
      return null;
   }
}





