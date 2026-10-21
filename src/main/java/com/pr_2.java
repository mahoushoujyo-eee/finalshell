package com;

import java.util.HashMap;

public class Pr_2 {
   HashMap N = new HashMap();
   pA_3 Q;
   private static final long a;

   public Pr_2(pA_3 var1) {
      this.Q = var1;
   }

   public void S() {
      this.N.clear();
   }

   public synchronized void h(char var1, int var2, int var3, boolean var4) {
      String[] var5 = com.ap_2.F();
      if (var1 != (int)a) {
         com.ap_2 var6 = (com.ap_2)this.N.get(var3);
         com.ap_2 var10000 = var6;
         if (var5 == null) {
            if (var6 == null) {
               var6 = new com.ap_2(var3);
               this.N.put(var3, var6);
            }

            var10000 = var6;
         }

         var10000.t(var1, var2, var4);
      }
   }

   public synchronized void w() {
   }

   public synchronized void Q() {
   }

   public com.OT j() {
      return this.Q.N;
   }

   public HashMap R() {
      return this.N;
   }

   public void F(HashMap var1) {
      this.N = var1;
   }

   public int m() {
      return this.Q.c4.width;
   }

   public int F() {
      return this.Q.c4.height;
   }

   static {
      long var0 = 3174967673158164865L;
      long var10002 = 5764965267703652769L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





