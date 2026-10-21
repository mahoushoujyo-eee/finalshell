package org;

public class d_2 extends Exception {
   @org.F.c
   private final I D;
   private static com.ky_4[] B;
   private static final String a;

   public d_2(String var1, @org.F.c I var2) {
      super(var1);
      this.D = var2;
   }

   public d_2(String var1, @org.F.c I var2, @org.F.c Throwable var3) {
      super(var1, var3);
      this.D = var2;
   }

   @Override
   public String getMessage() {
      com.ky_4[] var1 = b();
      d_2 var10000 = this;
      if (var1 != null) {
         if (this.D != null) {
            return this.D.toString() + a + super.getMessage();
         }

         var10000 = this;
      }

      return var10000.getMessage();
   }

   @org.F.c
   public I Z() {
      return this.D;
   }

   public static void N(com.ky_4[] var0) {
      B = var0;
   }

   public static com.ky_4[] b() {
      return B;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (b() == null) {
         N(new com.ky_4[5]);
      }

      char[] var10003 = "\u0018\t".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 109;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 109;
         var10006 = var0;
      } else {
         var6 = 109;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 109;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 79;
               break;
            case 1:
               var23 = 68;
               break;
            case 2:
               var23 = 100;
               break;
            case 3:
               var23 = 104;
               break;
            case 4:
               var23 = 77;
               break;
            case 5:
               var23 = 45;
               break;
            default:
               var23 = 58;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





