package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class O22 {
   public static int q;
   public static boolean l;
   public static Map j;
   public final Object W = new Object();
   public ExecutorService S;
   public static String a;

   public static void y(com.finalshell.ui.panel.Us2 var0, int var1) {
      f(var0).B(var1);
   }

   public static void P(com.finalshell.ui.panel.Us2 var0, Runnable var1) {
      f(var0).Y(var1);
   }

   public static O22 f(com.finalshell.ui.panel.Us2 var0) {
      return l ? b(var0) : b(null);
   }

   public static O22 b(com.finalshell.ui.panel.Us2 var0) {
      String[] var10000 = CB3.C$arrString();
      O22 var2 = (O22)j.get(var0);
      String[] var1 = var10000;
      O22 var3 = var2;
      if (var1 != null) {
         if (var2 == null && var1 != null) {
            if (var0 == null) {
               L();
            }

            var2 = new O22();
            j.put(var0, var2);
         }

         var3 = var2;
      }

      return var3;
   }

   public static void L() {
      String[] var10000 = CB3.C$arrString();
      Iterator var1 = j.entrySet().iterator();
      String[] var0 = var10000;

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         ((O22)var2.getValue()).A();
         if (var0 == null) {
            break;
         }
      }
   }

   public O22() {
      this.S = Executors.newFixedThreadPool(q);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void B(int var1) {
      String[] var10000 = CB3.C$arrString();
      Object var3 = this.W;
      synchronized (this.W){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         label45: {
            ExecutorService var7 = this.S;
            if (var2 != null) {
               if (this.S == null) {
                  break label45;
               }

               var7 = this.S;
            }

            var7.shutdown();
         }

         label39: {
            if (var1 > 0) {
               this.S = Executors.newFixedThreadPool(var1);
               if (var2 != null) {
                  break label39;
               }
            }

            this.S = null;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void A() {
      String[] var10000 = CB3.C$arrString();
      Object var2 = this.W;
      synchronized (this.W){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         var10000 = (String[])(this.S);
         if (var1 != null) {
            if (this.S != null) {
               this.S.shutdown();
            }

            var10000 = (String[])var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Y(Runnable var1) {
      String[] var10000 = CB3.C$arrString();
      Object var3 = this.W;
      synchronized (this.W){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         label38: {
            label37: {
               ExecutorService var7 = this.S;
               if (var2 != null) {
                  if (this.S == null) {
                     break label37;
                  }

                  var7 = this.S;
               }

               var7.execute(var1);
               if (var2 != null) {
                  break label38;
               }
            }

            new Thread(var1, a).start();
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\tI\fVW\\j-_$MQ}}".toCharArray();
      int var10004 = var10003.length;
      int var4 = 0;
      byte var16 = 122;
      char[] var10002 = var10003;
      int var7 = var10004;
      char[] var20;
      byte var24;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var20 = var10003;
         var10005 = var4;
         char var10008 = var10003[var4];
         var10007 = 122;
         var10006 = var10008;
         switch (var4 % 7) {
            case 0:
               var24 = 50;
               break;
            case 1:
               var24 = 64;
               break;
            case 2:
               var24 = 15;
               break;
            case 3:
               var24 = 66;
               break;
            case 4:
               var24 = 78;
               break;
            case 5:
               var24 = 114;
               break;
            default:
               var24 = 98;
         }
      } else {
         var16 = 122;
         var7 = var10004;
         if (var10004 <= var4) {
            String var19 = new String(var10003).intern();
            byte var11 = -1;
            a = var19;
            long var6 = 6330822487199183311L;
            long var15 = 472509150112248267L ^ var6;
            var11 = -1;
            long var5 = var15;
            q = (int)var5;
            l = true;
            j = new WeakHashMap();
            return;
         }

         var20 = var10003;
         var10005 = var4;
         char var25 = var10003[var4];
         var10007 = 122;
         var10006 = var25;
         switch (var4 % 7) {
            case 0:
               var24 = 50;
               break;
            case 1:
               var24 = 64;
               break;
            case 2:
               var24 = 15;
               break;
            case 3:
               var24 = 66;
               break;
            case 4:
               var24 = 78;
               break;
            case 5:
               var24 = 114;
               break;
            default:
               var24 = 98;
         }
      }

      while (true) {
         var20[var10005] = (char)(var10006 ^ var10007 ^ var24);
         var4++;
         if (var16 == 0) {
            var20 = var10002;
            var10005 = var16;
            char var27 = var10002[var16];
            var10007 = var16;
            var10006 = var27;
            switch (var4 % 7) {
               case 0:
                  var24 = 50;
                  break;
               case 1:
                  var24 = 64;
                  break;
               case 2:
                  var24 = 15;
                  break;
               case 3:
                  var24 = 66;
                  break;
               case 4:
                  var24 = 78;
                  break;
               case 5:
                  var24 = 114;
                  break;
               default:
                  var24 = 98;
            }
         } else {
            if (var7 <= var4) {
               String var18 = new String(var10002).intern();
               byte var9 = -1;
               a = var18;
               long var2 = 6330822487199183311L;
               long var14 = 472509150112248267L ^ var2;
               var9 = -1;
               long var0 = var14;
               q = (int)var0;
               l = true;
               j = new WeakHashMap();
               return;
            }

            var20 = var10002;
            var10005 = var4;
            char var26 = var10002[var4];
            var10007 = var16;
            var10006 = var26;
            switch (var4 % 7) {
               case 0:
                  var24 = 50;
                  break;
               case 1:
                  var24 = 64;
                  break;
               case 2:
                  var24 = 15;
                  break;
               case 3:
                  var24 = 66;
                  break;
               case 4:
                  var24 = 78;
                  break;
               case 5:
                  var24 = 114;
                  break;
               default:
                  var24 = 98;
            }
         }
      }
   }
}





