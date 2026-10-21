package org.v;

public final class Nr_2 extends Nt_2 implements hp_2 {
   public final Nt_2 u;
   private static final String d;

   public Nr_2(Nt_2 var1) {
      super(var1.Q());
      this.u = var1;
   }

   @Override
   public void n(x_3 var1) {
      super.n(var1);
      this.u.n(var1);
   }

   @Override
   public String toString() {
      return this.u.toString() + d;
   }

   @org.F.c
   @Override
   public Object p(X_2 var1) throws Throwable {
      return var1.u(this);
   }

   @org.F.c
   @Override
   public Object h(fz_2 var1) throws Throwable {
      return var1.n(this);
   }

   @org.F.c
   @Override
   public Object N(fE var1) throws Throwable {
      return var1.J(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "$d".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 85;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 85;
         var10006 = var0;
      } else {
         var6 = 85;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 85;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 42;
               break;
            case 1:
               var23 = 108;
               break;
            case 2:
               var23 = 119;
               break;
            case 3:
               var23 = 70;
               break;
            case 4:
               var23 = 107;
               break;
            case 5:
               var23 = 30;
               break;
            default:
               var23 = 67;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





