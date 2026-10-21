package com.finalshell.core;

import java.awt.Component;
import java.awt.dnd.DragSource;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Rn2 {
   protected static Map c;
   protected static com.finalshell.ui.panel.Qm2 f;
   protected static Object b;
   protected static BufferedImage W;
   protected static Component h;
   protected static Up2 F;
   protected static boolean x;
   public static int V;

   public static synchronized void z() {
      int var0 = R();
      boolean var10000 = x;
      if (var0 == 0) {
         if (x) {
            return;
         }

         var10000 = true;
      }

      x = var10000;
      c = new HashMap();
      Pa2 var1 = new Pa2();
      DragSource.getDefaultDragSource().addDragSourceListener(var1);
      DragSource.getDefaultDragSource().addDragSourceMotionListener(var1);
   }

   public static void h(Up2 var0) {
      c.put(var0.y(), var0);
   }

   public static void F(Up2 var0) {
      c.remove(var0.y());
   }

   static {
      __vfClinit__();
   }

   public static void i(int var0) {
      V = var0;
   }

   public static int Y() {
      return V;
   }

   public static int R() {
      int var0 = Y();
      return var0 == 0 ? 21 : 0;
   }

   public static void __vfClinit__() {
      x = false;
      i(114);
   }
}





