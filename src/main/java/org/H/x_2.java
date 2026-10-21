package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class x_2 {
   private static final String a;

   protected abstract void R(DataOutputStream var1) throws IOException;

   public abstract boolean x();

   private static org.H.x_2 i(DataInputStream var0) throws IOException {
      byte var1 = var0.readByte();

      try {
         switch (var1) {
            case 1:
               return new s_2(var0.readUTF());
            case 2:
            case 13:
            case 14:
            case 17:
            default:
               throw new org.H.l_2(a + var1);
            case 3:
               return new org.H.N(var0.readInt());
            case 4:
               return new org.H.h_2(var0.readFloat());
            case 5:
               return new D(var0.readLong());
            case 6:
               return new org.H.L(var0.readDouble());
            case 7:
               return new org.H.G(var0.readShort());
            case 8:
               return new org.H.q_2(var0.readShort());
            case 9:
               return new org.H.W(var0.readShort(), var0.readShort());
            case 10:
               return new V(var0.readShort(), var0.readShort());
            case 11:
               return new org.H.E(var0.readShort(), var0.readShort());
            case 12:
               return new org.H.R(var0.readShort(), var0.readShort());
            case 15:
               return new org.H.a_2(var0.readByte(), var0.readShort());
            case 16:
               return new org.H.K(var0.readShort());
            case 18:
               return new org.H.t_2(var0.readShort(), var0.readShort());
         }
      } catch (IOException var2) {
         throw a(var2);
      }
   }

   static org.H.x_2 r(DataInputStream var0) throws IOException {
      return i(var0);
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "myl*\u001f\u00149\u0004tu%\u0000\t<Jc:;\u001c\u00121\u0004c{,S".toCharArray();
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
               var23 = 123;
               break;
            case 1:
               var23 = 72;
               break;
            case 2:
               var23 = 69;
               break;
            case 3:
               var23 = 20;
               break;
            case 4:
               var23 = 44;
               break;
            case 5:
               var23 = 34;
               break;
            default:
               var23 = 2;
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





