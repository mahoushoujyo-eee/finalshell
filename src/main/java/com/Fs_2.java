package com;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import javax.swing.text.JTextComponent;

public class Fs_2 {
   private static final String a;

   public static MouseAdapter F(Component var0, com.O5 var1) {
      return h(var0, null, var1);
   }

   public static MouseAdapter h(Component var0, HT var1, com.O5 var2) {
      uC var3 = new uC(var1, var2);
      var0.addMouseListener(var3);
      return var3;
   }

   public static MouseAdapter P(Component var0, com.O5 var1) {
      PB var2 = new PB(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static MouseAdapter H(Component var0, com.O5 var1) {
      P4 var2 = new P4(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static MouseAdapter W(Component var0, com.O5 var1) {
      return W(var0, null, var1);
   }

   public static MouseAdapter W(Component var0, HT var1, com.O5 var2) {
      G4 var3 = new G4(var1, var2);
      var0.addMouseMotionListener(var3);
      return var3;
   }

   public static MouseAdapter J(Component var0, com.O5 var1) {
      return O(var0, null, var1);
   }

   public static MouseAdapter O(Component var0, HT var1, com.O5 var2) {
      n4_2 var3 = new n4_2(var1, var2);
      var0.addMouseListener(var3);
      return var3;
   }

   public static MouseAdapter q(Component var0, com.O5 var1) {
      Hk_2 var2 = new Hk_2(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static MouseAdapter o(Component var0, com.O5 var1) {
      G_ var2 = new G_(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static KeyAdapter G(Component var0, Sr_2 var1) {
      return O(var0, null, var1);
   }

   public static KeyAdapter O(Component var0, com.Cs_2 var1, Sr_2 var2) {
      com.W8 var3 = new com.W8(var1, var2);
      var0.addKeyListener(var3);
      return var3;
   }

   public static KeyAdapter Q(Component var0, Sr_2 var1) {
      return R(var0, null, var1);
   }

   public static KeyAdapter R(Component var0, com.Cs_2 var1, Sr_2 var2) {
      J var3 = new J(var1, var2);
      var0.addKeyListener(var3);
      return var3;
   }

   public static KeyAdapter u(Component var0, Sr_2 var1) {
      return I(var0, null, var1);
   }

   public static KeyAdapter I(Component var0, com.Cs_2 var1, Sr_2 var2) {
      com.oJ_3 var3 = new com.oJ_3(var1, var2);
      var0.addKeyListener(var3);
      return var3;
   }

   public static FocusAdapter K(Component var0, com.az_2 var1) {
      com.KX var2 = new com.KX(var1);
      var0.addFocusListener(var2);
      return var2;
   }

   public static FocusAdapter t(Component var0, com.az_2 var1) {
      Nn_2 var2 = new Nn_2(var1);
      var0.addFocusListener(var2);
      return var2;
   }

   public static WindowAdapter G(Window var0, E_ var1) {
      com.kv_4 var2 = new com.kv_4(var1);
      var0.addWindowListener(var2);
      return var2;
   }

   public static com.aJ c(Window var0, e__2 var1) {
      com.aU var2 = new com.aU(var1);
      var0.addWindowListener(var2);
      var0.addComponentListener(var2);
      return var2;
   }

   public static com.F5 X(JTextComponent var0, Rk_2 var1) {
      eA_3 var2 = new eA_3(var1);
      var0.getDocument().addDocumentListener(var2);
      com.La_2 var3 = new com.La_2(var2);
      var0.addPropertyChangeListener(a, var3);
      return new com.F5(var2, var3);
   }

   public static R7 r(com.Ds_2 var0, com.C0 var1) {
      RE var2 = new RE(var1);
      var0.D(var2);
      return var2;
   }

   public static R7 E(com.Ds_2 var0, com.C0 var1) {
      Rd_2 var2 = new Rd_2(var1);
      var0.D(var2);
      return var2;
   }

   public static R7 w(com.Ds_2 var0, com.C0 var1) {
      Ri_2 var2 = new Ri_2(var1);
      var0.D(var2);
      return var2;
   }

   public static R7 F(com.Ds_2 var0, com.C0 var1) {
      Rf_2 var2 = new Rf_2(var1);
      var0.D(var2);
      return var2;
   }

   public static _d_2 P(com.QL var0, com.d3_2 var1) {
      _i_2 var2 = new _i_2(var1);
      var0.o(var2);
      return var2;
   }

   public static _d_2 l(com.QL var0, com.d3_2 var1) {
      _f_2 var2 = new _f_2(var1);
      var0.o(var2);
      return var2;
   }

   public static _d_2 H(com.QL var0, nM_3 var1) {
      _8 var2 = new _8(var1);
      var0.o(var2);
      return var2;
   }

   public static _d_2 b(com.QL var0, com.d3_2 var1) {
      _h_2 var2 = new _h_2(var1);
      var0.o(var2);
      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001axUG\u001394\n".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 94;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 94;
         var10006 = var0;
      } else {
         var6 = 94;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 94;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 32;
               break;
            case 1:
               var23 = 73;
               break;
            case 2:
               var23 = 104;
               break;
            case 3:
               var23 = 108;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 2;
               break;
            default:
               var23 = 4;
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





