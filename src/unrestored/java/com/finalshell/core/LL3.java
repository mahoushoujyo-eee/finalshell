package com.finalshell.core;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class LL3 implements Transferable {
   public static DataFlavor q;
   public static DataFlavor[] c;
   public final At2 V;

   public LL3(At2 var1) {
      this.V = var1;
   }

   @Override
   public DataFlavor[] getTransferDataFlavors() {
      return c;
   }

   @Override
   public boolean isDataFlavorSupported(DataFlavor var1) {
      return q.equals(var1);
   }

   @Override
   public Object getTransferData(DataFlavor var1) throws UnsupportedFlavorException, IOException {
      return this.V;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "T\u0018[@N\u001a&d3YAB".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 69;
      char[] var10002 = var10003;
      int var3 = var10004;
      char[] var12;
      byte var16;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var12 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 69;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 85;
               break;
            case 1:
               var16 = 50;
               break;
            case 2:
               var16 = 125;
               break;
            case 3:
               var16 = 112;
               break;
            case 4:
               var16 = 102;
               break;
            case 5:
               var16 = 58;
               break;
            default:
               var16 = 13;
         }
      } else {
         var8 = 69;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            q = new DataFlavor(At2.class, var2);
            c = new DataFlavor[]{q};
            return;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 69;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 85;
               break;
            case 1:
               var16 = 50;
               break;
            case 2:
               var16 = 125;
               break;
            case 3:
               var16 = 112;
               break;
            case 4:
               var16 = 102;
               break;
            case 5:
               var16 = 58;
               break;
            default:
               var16 = 13;
         }
      }

      while (true) {
         var12[var10005] = (char)(var10006 ^ var10007 ^ var16);
         var1++;
         if (var8 == 0) {
            var12 = var10002;
            var10005 = var8;
            char var19 = var10002[var8];
            var10007 = var8;
            var10006 = var19;
            switch (var1 % 7) {
               case 0:
                  var16 = 85;
                  break;
               case 1:
                  var16 = 50;
                  break;
               case 2:
                  var16 = 125;
                  break;
               case 3:
                  var16 = 112;
                  break;
               case 4:
                  var16 = 102;
                  break;
               case 5:
                  var16 = 58;
                  break;
               default:
                  var16 = 13;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               q = new DataFlavor(At2.class, var0);
               c = new DataFlavor[]{q};
               return;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 85;
                  break;
               case 1:
                  var16 = 50;
                  break;
               case 2:
                  var16 = 125;
                  break;
               case 3:
                  var16 = 112;
                  break;
               case 4:
                  var16 = 102;
                  break;
               case 5:
                  var16 = 58;
                  break;
               default:
                  var16 = 13;
            }
         }
      }
   }
}





