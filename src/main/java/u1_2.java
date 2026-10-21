import java.util.HashMap;

public class u1_2 {
   HashMap B = new HashMap();
   private static final String a;

   public tp_4 V(String var1, int var2) {
      return (tp_4)this.B.get(var1 + ":" + var2);
   }

   public void i(tp_4 var1) {
      String var2 = var1.H().getHostAddress() + ":" + var1.c();
      System.out.println(a + var2);
      this.B.put(var2, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001ch\t\\'\b\u001d\u0018o\u0019v'\bS".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 55;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      } else {
         var6 = 55;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 74;
               break;
            case 1:
               var23 = 59;
               break;
            case 2:
               var23 = 90;
               break;
            case 3:
               var23 = 40;
               break;
            case 4:
               var23 = 127;
               break;
            case 5:
               var23 = 81;
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





