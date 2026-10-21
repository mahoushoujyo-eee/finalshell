import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class yS_3 implements Runnable {
   int w;
   final a0 W;
   private final byte[] g;
   private final DataOutputStream c;
   private final int x;
   private final DataInputStream d;
   private final int L;
   private static final long a;

   yS_3(a0 var1, byte[] var2, DataOutputStream var3, int var4, DataInputStream var5, int var6) {
      this.W = var1;
      this.g = var2;
      this.c = var3;
      this.x = var4;
      this.d = var5;
      this.L = var6;
      this.w = 0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      String[] var10000 = QI.N();
      byte[] var2 = new byte[this.W.q];
      int var3 = 0;
      long var4 = System.currentTimeMillis();
      String[] var1 = var10000;

      label154: {
         label153: {
            label152: {
               try {
                  label149: {
                     label148: {
                        label147: {
                           try {
                              var36 = this;
                              if (var1 == null) {
                                 break label147;
                              }

                              if (this.g == null) {
                                 break label149;
                              }
                           } catch (IOException var32) {
                              throw a(var32);
                           }

                           try {
                              var36 = this;
                           } catch (IOException var31) {
                              var37 = var31;
                              boolean var38 = false;
                              break label148;
                           }
                        }

                        try {
                           var36.c.write(this.g, 0, this.x);
                           break label149;
                        } catch (IOException var30) {
                           var37 = var30;
                           boolean var39 = false;
                        }
                     }

                     IOException var6 = var37;
                     var6.printStackTrace();
                     break label153;
                  }
               } catch (Throwable var33) {
                  var35 = var33;
                  boolean var10001 = false;
                  break label152;
               }

               label135:
               try {
                  boolean var34 = false;

                  try {
                     if (var1 == null || (var3 = this.d.read(var2)) > 0) {
                        do {
                           long var7 = (long)((int)a * var3 / this.L);
                           long var9 = System.currentTimeMillis();

                           try {
                              this.c.write(var2, 0, var3);
                           } catch (IOException var27) {
                              if (var1 != null) {
                                 break label154;
                              }
                           }
                        } while ((var3 = this.d.read(var2)) > 0);
                     }
                  } catch (IOException var28) {
                  }
                  break label154;
               } catch (Throwable var29) {
                  var35 = var29;
                  boolean var40 = false;
                  break label135;
               }
            }

            Throwable var12 = var35;
            this.W.W();
            throw var12;
         }

         this.W.W();
         return;
      }

      this.W.W();
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   static {
      long var0 = 2888595925355835383L;
      long var10002 = 940602611923004447L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





