package org.v;

class hK_2 extends hd_2 {
   final hd_2 a;
   final _L Q;
   private static final String c;
   private static final long j;

   hK_2(_L var1, hd_2 var2) {
      this.Q = var1;
      this.a = var2;
   }

   @Override
   protected _J[] V() {
      return new _J[0];
   }

   @Override
   public hv_2[] C() {
      return new hv_2[0];
   }

   @Override
   public hP[] H() {
      return new hP[]{new hX(this)};
   }

   @Override
   public u_3[] A() {
      return new u_3[0];
   }

   @Override
   public hd_2[] j() {
      return new hd_2[0];
   }

   @org.F.c
   @Override
   public hd_2 V$hd_2() {
      return null;
   }

   @org.F.c
   @Override
   public hd_2 l() {
      return null;
   }

   @Override
   public hd_2 g() {
      return this.Q.P;
   }

   @Override
   public hd_2[] l$hd_2() {
      return new hd_2[0];
   }

   @Override
   public String J() {
      return (int)j + this.a.z();
   }

   @Override
   public _S r() {
      return this.a.r();
   }

   @Override
   public boolean M() {
      return true;
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean P() {
      return false;
   }

   @Override
   public boolean B() {
      return false;
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public boolean o() {
      return false;
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public hd_2 G() {
      return this.a;
   }

   @Override
   public String toString() {
      return this.a.toString() + c;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ",H".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 101;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 101;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 18;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 60;
               break;
            case 3:
               var21 = 89;
               break;
            case 4:
               var21 = 104;
               break;
            case 5:
               var21 = 39;
               break;
            default:
               var21 = 99;
         }
      } else {
         var13 = 101;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            c = var16;
            long var3 = 989244416118431113L;
            long var12 = -3384939707660558894L ^ var3;
            var8 = -1;
            j = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 101;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 18;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 60;
               break;
            case 3:
               var21 = 89;
               break;
            case 4:
               var21 = 104;
               break;
            case 5:
               var21 = 39;
               break;
            default:
               var21 = 99;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 18;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 60;
                  break;
               case 3:
                  var21 = 89;
                  break;
               case 4:
                  var21 = 104;
                  break;
               case 5:
                  var21 = 39;
                  break;
               default:
                  var21 = 99;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               c = var15;
               long var0 = 989244416118431113L;
               long var11 = -3384939707660558894L ^ var0;
               var6 = -1;
               j = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 18;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 60;
                  break;
               case 3:
                  var21 = 89;
                  break;
               case 4:
                  var21 = 104;
                  break;
               case 5:
                  var21 = 39;
                  break;
               default:
                  var21 = 99;
            }
         }
      }
   }
}





