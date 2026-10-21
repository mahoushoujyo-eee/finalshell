package com;

import java.awt.Component;
import java.awt.dnd.DragSource;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Rn_2 {
   protected static Map c;
   protected static com.Qm_2 f;
   protected static Object b;
   protected static BufferedImage W;
   protected static Component h;
   protected static up_2 F;
   protected static boolean x = false;
   private static int V;

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
      Pa_2 var1 = new Pa_2();
      DragSource.getDefaultDragSource().addDragSourceListener(var1);
      DragSource.getDefaultDragSource().addDragSourceMotionListener(var1);
   }

   public static void h(up_2 var0) {
      c.put(var0.y(), var0);
   }

   public static void F(up_2 var0) {
      c.remove(var0.y());
   }

   static {
      i(114);
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
}





