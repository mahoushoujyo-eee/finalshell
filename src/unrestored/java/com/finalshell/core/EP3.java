package com.finalshell.core;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EP3 extends ED3 {
   public final Object i = new Object();
   public final Map g = new HashMap();

   public EP3() {
   }

   public EP3(String var1) {
      this.e(var1);
   }

   public EP3(File var1) {
      this.x(var1);
   }

   public EP3(File[] var1) {
      this.v(var1);
   }

   public EP3(List var1) {
      this.r(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void F() {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      Object var2 = this.i;
      synchronized (this.i){} // $VF: monitorenter 
      String var1 = var10000;

      try {
         Iterator var3 = this.g.entrySet().iterator();

         while (true) {
            if (var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               ((Wo4)var4.getValue()).j(null);
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            }

            this.g.clear();
            // $VF: monitorexit
            break;
         }
      } finally {
         // $VF: monitorexit
      }
   }

   public Wo4 X(File var1) {
      String var2 = com.finalshell.ui.panel.Co2.U$String();
      File var10001 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return this.b(null);
         }

         var10001 = var1;
      }

      return this.b(var10001.getAbsolutePath());
   }

   public Wo4 b(String var1) {
      synchronized (this.i) {
         return (Wo4)this.g.get(var1);
      }
   }

   public void e(String var1) {
      this.F();
      this.K(this.J(this.i(new File(var1))));
   }

   public void x(File var1) {
      this.F();
      this.K(this.J(this.i(var1)));
   }

   public void v(File[] var1) {
      this.F();
      this.K(this.J(var1));
   }

   public void r(List var1) {
      this.F();
      this.K(this.v(var1));
   }

   public File[] i(File var1) {
      String var2 = com.finalshell.ui.panel.Co2.U$String();
      File var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return new File[0];
         }

         var10000 = var1;
      }

      return var10000.listFiles();
   }

   public List J(File[] var1) {
      String var2 = com.finalshell.ui.panel.Co2.U$String();
      ArrayList var3 = new ArrayList(var1 != null ? var1.length : 0);
      File[] var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return var3;
         }

         var10000 = var1;
      }

      File[] var4 = var10000;
      int var5 = var4.length;
      int var6 = 0;

      while (var6 < var5) {
         File var7 = var4[var6];
         Wo4 var8 = new Wo4(var7);
         if (var2 == null) {
            return var3;
         }

         var3.add(var8);
         synchronized (this.i) {
            this.g.put(var7.getAbsolutePath(), var8);
         }

         var6++;
         if (var2 == null) {
            break;
         }
      }

      return var3;
   }

   public List v(List var1) {
      String var2 = com.finalshell.ui.panel.Co2.U$String();
      ArrayList var3 = new ArrayList(var1 != null ? var1.size() : 0);
      List var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return var3;
         }

         var10000 = var1;
      }

      for (File var5 : var10000) {
         Wo4 var6 = new Wo4(var5);
         if (var2 == null) {
            return var3;
         }

         var3.add(var6);
         synchronized (this.i) {
            this.g.put(var5.getAbsolutePath(), var6);
         }

         if (var2 == null) {
            break;
         }
      }

      return var3;
   }
}





