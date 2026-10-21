package com.finalshell.core;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class An2 implements NA3 {
   protected final List i = new ArrayList();
   protected final Map H = new WeakHashMap();
   protected final Object B = new Object();

   public void V(Window var1) {
      this.y(var1, null);
   }

   @Override
   public void y(Window var1, Object var2) {
      synchronized (this.B) {
         this.i.add(var1);
         this.H.put(var1, var2);
         this.w();
      }
   }

   @Override
   public void o(Window var1) {
      synchronized (this.B) {
         this.i.remove(var1);
         this.H.remove(var1);
         this.w();
      }
   }
}





