import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class kG_3 extends Thread {
   final yT_3 M;
   private static final String a;
   private static final long b;

   kG_3(yT_3 var1) {
      this.M = var1;
   }

   @Override
   public void run() {
      com.ky_4[] var10000 = yT_3.c();
      byte[] var2 = new byte[(int)b];
      com.ky_4[] var1 = var10000;
      DatagramPacket var3 = new DatagramPacket(var2, var2.length);

      while (true) {
         long var4 = System.currentTimeMillis();

         try {
            ((DatagramSocket)com.c.c(210828978284153058L).get(com.c.c(295464316755375728L).get(this))).receive(var3);
         } catch (IOException var9) {
            if (var1 != null) {
               return;
            }
         }

         byte[] var6 = var3.getData();
         String var7 = new String(var6, 0, var3.getLength());

         try {
            if (var7.equals(a)) {
               com.c.c(404061234137438127L).setBoolean(com.c.c(295464316755375728L).get(this), true);
            }
         } catch (IOException var8) {
            throw a(var8);
         }
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "+Qen:\"R".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 10;
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
         var10007 = 10;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 71;
               break;
            case 1:
               var21 = 40;
               break;
            case 2:
               var21 = 48;
               break;
            case 3:
               var21 = 8;
               break;
            case 4:
               var21 = 89;
               break;
            case 5:
               var21 = 94;
               break;
            default:
               var21 = 61;
         }
      } else {
         var13 = 10;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 2041971949012568956L;
            long var12 = -2605035876162154628L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 10;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 71;
               break;
            case 1:
               var21 = 40;
               break;
            case 2:
               var21 = 48;
               break;
            case 3:
               var21 = 8;
               break;
            case 4:
               var21 = 89;
               break;
            case 5:
               var21 = 94;
               break;
            default:
               var21 = 61;
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
                  var21 = 71;
                  break;
               case 1:
                  var21 = 40;
                  break;
               case 2:
                  var21 = 48;
                  break;
               case 3:
                  var21 = 8;
                  break;
               case 4:
                  var21 = 89;
                  break;
               case 5:
                  var21 = 94;
                  break;
               default:
                  var21 = 61;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 2041971949012568956L;
               long var11 = -2605035876162154628L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 71;
                  break;
               case 1:
                  var21 = 40;
                  break;
               case 2:
                  var21 = 48;
                  break;
               case 3:
                  var21 = 8;
                  break;
               case 4:
                  var21 = 89;
                  break;
               case 5:
                  var21 = 94;
                  break;
               default:
                  var21 = 61;
            }
         }
      }
   }
}





