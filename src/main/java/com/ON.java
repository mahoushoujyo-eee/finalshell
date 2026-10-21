package com;

import java.awt.Component;
import java.awt.Toolkit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class ON {
   protected static final Object A = new Object();
   protected static final Map r = new WeakHashMap();
   protected static final Object x = new Object();
   protected static final List B = new ArrayList(2);
   protected static WeakReference y;
   protected static WeakReference f;
   protected static boolean I = false;
   private static final long a;

   public static synchronized void e() {
      int[] var0 = com.c4_2.g();
      boolean var10000 = I;
      if (var0 == null) {
         if (I) {
            return;
         }

         var10000 = true;
      }

      I = var10000;
      Toolkit.getDefaultToolkit().addAWTEventListener(new uH(), a);
      F(new xp_4());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected static Map d() {
      int[] var10000 = com.c4_2.g();
      Object var1 = A;
      synchronized (A){} // $VF: monitorenter 
      int[] var0 = var10000;

      try {
         HashMap var2 = new HashMap(r.size());
         Iterator var3 = r.entrySet().iterator();

         while (true) {
            if (var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               Map var5 = (Map)var4.getValue();
               var12 = new HashMap(var5.size());
               if (var0 != null) {
                  break;
               }

               HashMap var6 = var12;

               label60: {
                  for (Entry var8 : var5.entrySet()) {
                     var6.put((p6_2)var8.getKey(), (Boolean)var8.getValue());
                     if (var0 != null) {
                        break label60;
                     }

                     if (var0 != null) {
                        break;
                     }
                  }

                  var2.put((Component)var4.getKey(), var6);
               }

               if (var0 == null) {
                  continue;
               }
            }

            var12 = var2;
            // $VF: monitorexit
            break;
         }

         return var12;
      } finally {
         // $VF: monitorexit
      }
   }

   public static Component b() {
      int[] var0 = com.c4_2.g();
      Object var10000 = f;
      if (var0 == null) {
         if (f == null) {
            return null;
         }

         var10000 = f.get();
      }

      return (Component)var10000;
   }

   public static Component z() {
      return (Component)y.get();
   }

   public static void F(com.Ka_2 var0) {
      synchronized (x) {
         B.add(var0);
      }
   }

   public static void x(com.Ka_2 var0) {
      synchronized (x) {
         B.remove(var0);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected static void u(Component var0, Component var1) {
      int[] var10000 = com.c4_2.g();
      Object var4 = x;
      synchronized (x){} // $VF: monitorenter 
      int[] var2 = var10000;
      boolean var7 = false /* VF: Semaphore variable */;

      ArrayList var3;
      try {
         var7 = true;
         var3 = com.aL.J((Collection)B);
         // $VF: monitorexit
         var7 = false;
      } finally {
         if (var7) {
            // $VF: monitorexit
         }
      }

      for (com.Ka_2 var5 : var3) {
         var5.N(var0, var1);
         if (var2 != null) {
            break;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void b(Component var0, p6_2 var1) {
      int[] var10000 = com.c4_2.g();
      Object var3 = A;
      synchronized (A){} // $VF: monitorenter 
      int[] var2 = var10000;
      boolean var7 = false /* VF: Semaphore variable */;

      try {
         var7 = true;
         Object var4 = (Map)r.get(var0);
         var10000 = (int[])var4;
         if (var2 == null) {
            if (var4 == null) {
               var4 = new WeakHashMap();
               r.put(var0, var4);
            }

            var4.put(var1, var1.h(b(), var0));
            var10000 = (int[])var3;
         }

         // $VF: monitorexit
         var7 = false;
      } finally {
         if (var7) {
            // $VF: monitorexit
         }
      }

      if (var2 != null) {
         com.ky_4.K(new String[5]);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void i(p6_2 var0) {
      int[] var10000 = com.c4_2.g();
      Object var2 = A;
      synchronized (A){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Iterator var3 = r.entrySet().iterator();

         while (true) {
            if (var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               Map var5 = (Map)var4.getValue();
               var5.remove(var0);
               var10000 = (int[])var5;
               if (var1 != null) {
                  break;
               }

               if (var5.size() == 0) {
                  var3.remove();
               }

               if (var1 == null) {
                  continue;
               }
            }

            var10000 = (int[])var2;
            break;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void z(Component var0) {
      int[] var10000 = com.c4_2.g();
      Object var2 = A;
      synchronized (A){} // $VF: monitorenter 
      int[] var1 = var10000;

      try {
         Map var3 = (Map)r.get(var0);
         var10000 = (int[])var3;
         label37:
         if (var1 == null) {
            if (var3 != null) {
               var10000 = (int[])var3;
               if (var1 != null) {
                  break label37;
               }

               if (var3.size() > 0) {
                  var3.clear();
               }
            }

            r.remove(var0);
            var10000 = (int[])var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   static {
      long var0 = 3717671776506141743L;
      long var10002 = 3717671776506141739L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





