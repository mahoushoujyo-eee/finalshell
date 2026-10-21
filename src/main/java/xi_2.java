import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

class xi_2 implements SyntaxConstants {
   String P;
   private static final String a;

   public xi_2() {
      String var10001 = a;
      com.c.c(511327344401471650L).set(this, var10001);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\fPPOGgr".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 60;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 60;
         var10006 = var0;
      } else {
         var6 = 60;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 60;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 82;
               break;
            case 1:
               var23 = 8;
               break;
            case 2:
               var23 = 10;
               break;
            case 3:
               var23 = 17;
               break;
            case 4:
               var23 = 29;
               break;
            case 5:
               var23 = 60;
               break;
            default:
               var23 = 44;
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





