package com;

class Y7 implements com.aB {
   private i3_2 G;
   private byte[] j;
   private String B;
   private String c;
   private static final String a;

   Y7(i3_2 var1, byte[] var2, String var3) {
      this.G = var1;
      this.j = var2;
      this.B = var3;
      this.c = E8.B(new uJ(var2).S());
   }

   @Override
   public boolean M(byte[] var1) throws Pc_2 {
      return true;
   }

   @Override
   public byte[] u() {
      return this.j;
   }

   @Override
   public byte[] v(byte[] var1) {
      return this.G.H(this.j, var1, null);
   }

   @Override
   public byte[] l(byte[] var1, String var2) {
      return this.G.H(this.j, var1, var2);
   }

   @Deprecated
   @Override
   public boolean j() {
      throw new RuntimeException(a);
   }

   @Override
   public String B() {
      return this.c;
   }

   @Override
   public String b() {
      return this.B;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void v() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "H\u001cBQqjFJ\u0016[\u0014vsSB".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 97;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 97;
         var10006 = var0;
      } else {
         var6 = 97;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 97;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 71;
               break;
            case 1:
               var23 = 18;
               break;
            case 2:
               var23 = 87;
               break;
            case 3:
               var23 = 16;
               break;
            case 4:
               var23 = 121;
               break;
            case 5:
               var23 = 102;
               break;
            default:
               var23 = 87;
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





