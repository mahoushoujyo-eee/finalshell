class Ux_2 implements Runnable {
   final U h;
   private static final String a;

   Ux_2(U var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      ((aE)com.c.c(132798821314429637L).get(com.c.c(338897995870391143L).get(this))).addPropertyChangeListener(a, new WL(this));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0019I@c\u0002xi1OUk\u0012tt\u0013".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 95;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      } else {
         var6 = 95;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 34;
               break;
            case 1:
               var23 = 127;
               break;
            case 2:
               var23 = 105;
               break;
            case 3:
               var23 = 85;
               break;
            case 4:
               var23 = 57;
               break;
            case 5:
               var23 = 66;
               break;
            default:
               var23 = 68;
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





