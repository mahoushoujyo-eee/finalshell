package com.finalshell.ui.panel;

import com.finalshell.core.AD_2;
import com.finalshell.core.Qd2_2;
import com.finalshell.core.WH3;
import com.finalshell.core.X0;
import com.finalshell.core.ZK;
import com.finalshell.ui.listener.C62;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import org.jetbrains.annotations.NotNull;

public class XW3 extends JPanel implements FocusListener {
   public final ConnectionProperty i;
   public final L62 G;
   final Cn2 u;
   public static String a;

   public XW3(@NotNull Cn2 var1, WH3 var2, ConnectionProperty var3) {
      super(new FlowLayout(0, 0, 0));
      this.u = var1;
      this.G = new L62(this, null);
      this.i = var3;
      this.setOpaque(false);
      this.setFocusable(false);
      this.addFocusListener(this);
      Wv2 var4 = new Wv2(this);
      var4.addFocusListener(this);
      var4.addMouseListener(new C62(this, var1, var2, var3));
      this.G.o(var4);
      this.add(this.G);
   }

   protected void M(MouseEvent var1) {
      String[] var2 = Cn2.Q$arrString();
      int var10000 = (var1.isPopupTrigger()) ? 1 : 0;
      if (var2 != null) {
         if (var10000 != 0) {
            JPopupMenu var3 = this.B();
            var3.show(var1.getComponent(), var1.getX(), var1.getY());
            if (var2 != null) {
               return;
            }
         }

         var10000 = var1.getClickCount();
      }

      label35: {
         if (var2 != null) {
            if (var10000 != 2) {
      JPopupMenu var4;
      JPopupMenu var4;
               return;
            }

            var4 = var1;
            if (var2 == null) {
               break label35;
            }

            var10000 = var1.isConsumed();
         }

         if (var10000 != 0) {
            return;
         }

         var4 = var1;
      }

      var4.consume();
      this.V();
   }

   protected JPopupMenu B() {
      JPopupMenu var1 = new JPopupMenu();
      AD_2.m(var1, this.u);
      JMenuItem var2 = new JMenuItem(a);
      var2.addActionListener(this::lambda$createPopup$0);
      var1.add(var2);
      return var1;
   }

   public void V() {
      int var1 = Cn2.l(this.u).z$int();
      JLabel var2 = (JLabel)this.G.getComponent(0);
      new X0().B(var1, var2.getText(), var2, new Qd2_2(this));
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.i.M$JComponent().requestFocusInWindow();
   }

   @Override
   public void focusLost(FocusEvent var1) {
   }

   public void lambda$createPopup$0(ActionEvent var1) {
      this.V();
   }

   XW3(Cn2 var1, WH3 var2, ConnectionProperty var3, ZK var4) {
      this(var1, var2, var3);
   }

   static L62 w(XW3 var0) {
      return var0.G;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001f!\u0014\u0018adN\u0019%\u0018".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 109;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 109;
         var10006 = var0;
      } else {
         var6 = 109;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 109;
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
               var23 = 41;
               break;
            case 2:
               var23 = 23;
               break;
            case 3:
               var23 = 20;
               break;
            case 4:
               var23 = 97;
               break;
            case 5:
               var23 = 108;
               break;
            default:
               var23 = 3;
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






