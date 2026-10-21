package com.finalshell.core;

public class K5 {
   public byte[] q;
   public byte[] K;
   public int b;
   public com.finalshell.ui.model.Yu4 J;

   public K5(byte[] var1) {
      this(var1, com.finalshell.ui.model.Yu4.BIN);
   }

   public K5(byte[] var1, com.finalshell.ui.model.Yu4 var2) {
      this.q = var1;
      this.J = var2;
      this.K = new byte[this.q.length * 2];
      this.x();
   }

   public void p(byte var1) {
      this.K[this.b] = var1;
      this.b++;
   }

   public void x() {
      byte var7;
      String[] var10000 = Ub2.A();
      byte var2 = 0;
      String[] var1 = var10000;

      for (byte var6 : this.q) {
         var7 = (byte)((this.J.d()) ? 1 : 0);
         label23:
         if (var1 == null) {
            if (var7 == 0) {
               var7 = (byte)((XP_2.W(var6, var2, false)) ? 1 : 0);
               if (var1 != null) {
                  break label23;
               }

               if (var7 != 0) {
                  this.p(com.finalshell.ui.model.X9.ZDLE.r());
                  var6 = XP_2.c(var6);
               }
            }

            this.p(var6);
            var7 = var6;
         }

         var2 = var7;
         if (var1 != null) {
            break;
         }
      }
   }

   public byte[] v() {
      return this.q;
   }

   public int e() {
      return this.b;
   }

   public byte[] n() {
      return this.K;
   }
}





