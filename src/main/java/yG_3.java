import java.io.BufferedReader;
import java.io.IOException;

class yG_3 implements Runnable {
   final BufferedReader Q;
   private static final String a;

   yG_3(BufferedReader var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      com.ky_4[] var1 = yT_3.c();

      try {
         while (true) {
            String var2;
            if ((var2 = ((BufferedReader)com.c.c(352442332962568947L).get(this)).readLine()) != null) {
               try {
                  System.out.println(a + var2);
                  if (var1 == null) {
                     break;
                  }

                  if (var1 != null) {
                     continue;
                  }
               } catch (IOException var4) {
                  throw a(var4);
               }
            }

            ((BufferedReader)com.c.c(352442332962568947L).get(this)).close();
            break;
         }
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Z\\s7\u0007\"IQK\"x".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 45;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      } else {
         var6 = 45;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 45;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 18;
               break;
            case 1:
               var23 = 3;
               break;
            case 2:
               var23 = 44;
               break;
            case 3:
               var23 = 117;
               break;
            case 4:
               var23 = 88;
               break;
            case 5:
               var23 = 99;
               break;
            default:
               var23 = 13;
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





