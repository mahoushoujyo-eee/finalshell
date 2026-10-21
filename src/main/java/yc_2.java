import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Yc_2 {
   private Map e = null;
   private static final String a;

   public Yc_2() {
      this.e = new HashMap();
   }

   public Map x() {
      return this.e;
   }

   public boolean b(String var1) {
      int var2 = D5.K();
      char var10000 = var1.startsWith(a);
      if (var2 != 0) {
         if (var10000 != 0) {
            return true;
         }

         var10000 = var1.charAt(0);
      }

      char var3 = var10000;
      String var4 = var1.substring(2, var1.length());
      Object var5 = (Set)this.e.get(var3);
      if (var2 != 0) {
         if (var5 == null) {
            var5 = new HashSet();
         }

         var5.add(var4);
         this.e.put(var3, var5);
      }

      return true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "FT".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 106;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      } else {
         var6 = 106;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 3;
               break;
            case 1:
               var23 = 17;
               break;
            case 2:
               var23 = 52;
               break;
            case 3:
               var23 = 25;
               break;
            case 4:
               var23 = 16;
               break;
            case 5:
               var23 = 92;
               break;
            default:
               var23 = 7;
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





