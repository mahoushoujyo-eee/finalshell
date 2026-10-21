package com.finalshell.core;

import com.finalshell.ui.dialog.Ds2;
import com.finalshell.ui.listener.AJ;
import com.finalshell.ui.listener.EA3;
import com.finalshell.ui.listener.G4;
import com.finalshell.ui.listener.G_;
import com.finalshell.ui.listener.Hk2;
import com.finalshell.ui.listener.KX;
import com.finalshell.ui.listener.Kv4;
import com.finalshell.ui.listener.N42;
import com.finalshell.ui.listener.P4;
import com.finalshell.ui.listener.PB;
import com.finalshell.ui.listener.W8;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import javax.swing.text.JTextComponent;

public class Fs2_2 {
   public static String a;

   public static MouseAdapter F(Component var0, O5 var1) {
      return h(var0, null, var1);
   }

   public static MouseAdapter h(Component var0, com.finalshell.ui.model.HT var1, O5 var2) {
      com.finalshell.ui.listener.UC var3 = new com.finalshell.ui.listener.UC(var1, var2);
      var0.addMouseListener(var3);
      return var3;
   }

   public static MouseAdapter P(Component var0, O5 var1) {
      PB var2 = new PB(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static MouseAdapter H(Component var0, O5 var1) {
      P4 var2 = new P4(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static MouseAdapter W(Component var0, O5 var1) {
      return W(var0, null, var1);
   }

   public static MouseAdapter W(Component var0, com.finalshell.ui.model.HT var1, O5 var2) {
      G4 var3 = new G4(var1, var2);
      var0.addMouseMotionListener(var3);
      return var3;
   }

   public static MouseAdapter J(Component var0, O5 var1) {
      return O(var0, null, var1);
   }

   public static MouseAdapter O(Component var0, com.finalshell.ui.model.HT var1, O5 var2) {
      N42 var3 = new N42(var1, var2);
      var0.addMouseListener(var3);
      return var3;
   }

   public static MouseAdapter q(Component var0, O5 var1) {
      Hk2 var2 = new Hk2(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static MouseAdapter o(Component var0, O5 var1) {
      G_ var2 = new G_(var1);
      var0.addMouseListener(var2);
      return var2;
   }

   public static KeyAdapter G(Component var0, Sr2 var1) {
      return O(var0, null, var1);
   }

   public static KeyAdapter O(Component var0, com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      W8 var3 = new W8(var1, var2);
      var0.addKeyListener(var3);
      return var3;
   }

   public static KeyAdapter Q(Component var0, Sr2 var1) {
      return R(var0, null, var1);
   }

   public static KeyAdapter R(Component var0, com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      com.finalshell.ui.listener.J var3 = new com.finalshell.ui.listener.J(var1, var2);
      var0.addKeyListener(var3);
      return var3;
   }

   public static KeyAdapter u(Component var0, Sr2 var1) {
      return I(var0, null, var1);
   }

   public static KeyAdapter I(Component var0, com.finalshell.ui.model.Cs2 var1, Sr2 var2) {
      com.finalshell.ui.listener.OJ3 var3 = new com.finalshell.ui.listener.OJ3(var1, var2);
      var0.addKeyListener(var3);
      return var3;
   }

   public static FocusAdapter K(Component var0, Az2 var1) {
      KX var2 = new KX(var1);
      var0.addFocusListener(var2);
      return var2;
   }

   public static FocusAdapter t(Component var0, Az2 var1) {
      com.finalshell.ui.listener.Nn2 var2 = new com.finalshell.ui.listener.Nn2(var1);
      var0.addFocusListener(var2);
      return var2;
   }

   public static WindowAdapter G(Window var0, E_ var1) {
      Kv4 var2 = new Kv4(var1);
      var0.addWindowListener(var2);
      return var2;
   }

   public static AJ c(Window var0, E__2 var1) {
      com.finalshell.ui.listener.AU var2 = new com.finalshell.ui.listener.AU(var1);
      var0.addWindowListener(var2);
      var0.addComponentListener(var2);
      return var2;
   }

   public static com.finalshell.ui.model.F5 X(JTextComponent var0, Rk2 var1) {
      EA3 var2 = new EA3(var1);
      var0.getDocument().addDocumentListener(var2);
      com.finalshell.ui.listener.La2 var3 = new com.finalshell.ui.listener.La2(var2);
      var0.addPropertyChangeListener(a, var3);
      return new com.finalshell.ui.model.F5(var2, var3);
   }

   public static R7 r(Ds2 var0, C0_2 var1) {
      RE var2 = new RE(var1);
      var0.D(var2);
      return var2;
   }

   public static R7 E(Ds2 var0, C0_2 var1) {
      Rd2 var2 = new Rd2(var1);
      var0.D(var2);
      return var2;
   }

   public static R7 w(Ds2 var0, C0_2 var1) {
      Ri2 var2 = new Ri2(var1);
      var0.D(var2);
      return var2;
   }

   public static R7 F(Ds2 var0, C0_2 var1) {
      Rf2 var2 = new Rf2(var1);
      var0.D(var2);
      return var2;
   }

   public static D2_3 P(com.finalshell.ui.panel.QL var0, D32 var1) {
      I2_2 var2 = new I2_2(var1);
      var0.o(var2);
      return var2;
   }

   public static D2_3 l(com.finalshell.ui.panel.QL var0, D32 var1) {
      F2_2 var2 = new F2_2(var1);
      var0.o(var2);
      return var2;
   }

   public static D2_3 H(com.finalshell.ui.panel.QL var0, NM3 var1) {
      C_8 var2 = new C_8(var1);
      var0.o(var2);
      return var2;
   }

   public static D2_3 b(com.finalshell.ui.panel.QL var0, D32 var1) {
      C_h_2 var2 = new C_h_2(var1);
      var0.o(var2);
      return var2;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





