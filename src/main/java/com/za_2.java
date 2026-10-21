package com;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class za_2 implements com.On_2 {
   protected com.c8_2 F;
   protected Map R = new HashMap();
   protected boolean O = false;
   protected boolean z = false;
   protected boolean k = false;
   protected String A = "";

   public com.c8_2 W() {
      return this.F;
   }

   public void g(com.c8_2 var1) {
      String[] var2 = com.cB_3.C();
      Object var10001 = var1;
      if (var2 != null) {
         var10001 = var1 != null ? var1 : new com.FD();
      }

      this.F = (com.c8_2)var10001;
   }

   public boolean N() {
      return this.O;
   }

   public void u(boolean var1) {
      this.O = var1;
   }

   public boolean j() {
      return this.z;
   }

   public void Q(boolean var1) {
      this.z = var1;
   }

   public boolean T() {
      return this.k;
   }

   public void I(boolean var1) {
      this.k = var1;
   }

   public String W$String() {
      return this.A;
   }

   public void z(String var1) {
      this.A = var1;
   }

   public void A() {
      this.R.clear();
   }

   public void o(com.cB_3 var1) {
      this.x(var1.H());
   }

   public void x(String var1) {
      this.R.remove(var1);
   }

   public boolean r(com.cB_3 var1) {
      String[] var2;
      String var4;
      label29: {
         var2 = com.cB_3.C();
         com.za_2 var10000 = this;
         if (var2 != null) {
            if (this.O) {
               var4 = this.A;
               break label29;
            }

            var10000 = this;
         }

         var4 = var10000.A.toLowerCase();
      }

      String var3 = var4;
      boolean var5 = var3.equals("");
      if (var2 != null) {
         if (!var5) {
            boolean var6 = this.H(var1, var3);
            if (var2 == null) {
               return var6;
            }

            if (!var6) {
               return false;
            }
         }

         var5 = true;
      }

      return var5;
   }

   protected boolean H(com.cB_3 var1, String var2) {
      String[] var3 = com.cB_3.C();
      byte var10000 = this.s(var1, var2);
      if (var3 != null) {
         if (var10000 != 0) {
            return true;
         }

         var10000 = 0;
      }

      int var4 = var10000;

      while (true) {
         if (var4 < var1.getChildCount()) {
            var5 = this.H(var1.T(var4), var2);
            if (var3 == null) {
               break;
            }

            if (var3 == null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            var4++;
            if (var3 != null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }

   protected boolean s(com.cB_3 var1, String var2) {
      String[] var10000 = com.cB_3.C();
      Boolean var4 = (Boolean)this.R.get(var1.H());
      String[] var3 = var10000;
      Boolean var5 = var4;
      if (var3 != null) {
         if (var4 == null) {
            var4 = this.X(var1, var2);
            this.R.put(var1.H(), var4);
         }

         var5 = var4;
      }

      return var5;
   }

   protected boolean X(com.cB_3 var1, String var2) {
      String[] var3;
      String var6;
      label38: {
         var3 = com.cB_3.C();
         com.za_2 var10000 = this;
         if (var3 != null) {
            if (this.O) {
               var6 = this.F.C(var1);
               break label38;
            }

            var10000 = this;
         }

         var6 = var10000.F.C(var1).toLowerCase();
      }

      String var4 = var6;
      boolean var7 = this.z;
      if (var3 != null) {
         if (this.z) {
            StringTokenizer var5 = new StringTokenizer(var2, " ", false);

            while (var5.hasMoreTokens()) {
               boolean var8 = this.D(var4, var5.nextToken(), this.k);

               while (var8) {
                  var8 = true;
                  if (var3 != null) {
                     return true;
                  }
               }
            }

            return false;
         }

         var7 = this.D(var4, var2, this.k);
      }

      return var7;
   }

   protected boolean D(String var1, String var2, boolean var3) {
      String[] var4 = com.cB_3.C();
      boolean var10000 = var3;
      if (var4 != null) {
         var10000 = var3 ? var1.startsWith(var2) : var1.contains(var2);
      }

      return var10000;
   }

   @Override
   public boolean n(Object var1) {
      return this.r((com.cB_3)var1);
   }
}





