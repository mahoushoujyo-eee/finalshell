import java.io.IOException;
import java.net.DatagramPacket;

class l3_2 implements Runnable {
   final FO F;
   private static final long a;

   l3_2(FO var1) {
      this.F = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void run() {
      label38: {
         String[] var1 = QI.N();
         if (var1 != null) {
            try {
               if (!this.F.H) {
                  break label38;
               }
            } catch (IOException var9) {
               boolean var10001 = false;
               throw a(var9);
            }
         }

         while (true) {
            byte[] var2 = new byte[(int)a];
            DatagramPacket var3 = new DatagramPacket(var2, var2.length);

            try {
               this.F.K.receive(var3);
               this.F.B(var3);
            } catch (IOException var8) {
               try {
                  if (var1 != null) {
                     break;
                  }
               } catch (IOException var7) {
                  boolean var10 = false;
                  throw a(var7);
               }
            }

            try {
               if (!this.F.H) {
                  break;
               }
            } catch (IOException var6) {
               boolean var11 = false;
               throw a(var6);
            }
         }
      }

      try {
         ;
      } catch (IOException var5) {
         boolean var12 = false;
         throw a(var5);
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   static {
      long var0 = 5808219319646314783L;
      long var10002 = -8117510636330261309L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





