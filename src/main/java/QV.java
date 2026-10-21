import com._C;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

class QV implements MouseListener {
   final String V;
   final fX_3 j;
   final JLabel F;
   final Color O;
   final W8 l;
   final JPopupMenu X;
   final Jx_2 y;
   private static final String a;

   QV(Jx_2 var1, String var2, fX_3 var3, JLabel var4, Color var5, W8 var6, JPopupMenu var7) {
      this.y = var1;
      this.V = var2;
      this.j = var3;
      this.F = var4;
      this.O = var5;
      this.l = var6;
      this.X = var7;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var2 = Jx_2.O();
      if (var2 == null) {
         if (var1.getButton() != 1) {
            return;
         }

         ((_C)com.c.c(435031631667149019L).get(com.c.c(169328206873800150L).get(this)))
            .setText(a + new File((String)com.c.c(198856776624497515L).get(this)).getAbsolutePath());
         ((_C)com.c.c(435031631667149019L).get(com.c.c(169328206873800150L).get(this))).setToolTipText((String)com.c.c(198856776624497515L).get(this));
         Method var10000 = (Method)com.c.c(163486738077339335L).get(this);
         Object[] var10001 = com.c.a(com.c.c(198856776624497515L).get(this));
         Method var10003 = com.c.d(586754005152705687L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         var10000 = (Method)com.c.c(269586463206323716L).get(com.c.c(169328206873800150L).get(this));
         var10001 = com.c.a(com.c.c(198856776624497515L).get(this));
         var10003 = com.c.d(565172623409340742L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var10000 = (Method)com.c.c(169328206873800150L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(528723233100399280L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         ((JLabel)com.c.c(633058136790218286L).get(this)).setBackground((Color)com.c.c(287908082145461409L).get(this));
         ((W8)com.c.c(322971539312536767L).get(this)).setBackground((Color)com.c.c(287908082145461409L).get(this));
         ((JPopupMenu)com.c.c(600739725726203285L).get(this)).setVisible(false);
      }

      Method var14 = (Method)com.c.c(169328206873800150L).get(this);
      Object[] var23 = com.c.a(com.c.c(198856776624497515L).get(this));
      Method var33 = com.c.d(491105122976850438L);
      Object[] var27 = var23;
      var23 = var14;
      var14 = var33;

      try {
         var16 = (W8)var14.invoke(var23, var27);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      W8 var3 = var16;
      ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(169328206873800150L).get(this))).remove(var3);
      ((ArrayList)com.c.c(585743319788652558L).get(com.c.c(169328206873800150L).get(this))).add(0, var3);
      ((JPopupMenu)com.c.c(600739725726203285L).get(this)).remove(var3);
      JPopupMenu var17 = (JPopupMenu)com.c.c(600739725726203285L).get(this);
      var27 = (Object[])com.c.c(163486738077339335L).get(this);
      Object[] var34 = com.c.f();
      Method var10005 = com.c.d(284002349345105786L);
      Object[] var10004 = var34;
      var33 = var27;
      Method var29 = var10005;

      try {
         var30 = (Integer)var29.invoke(var33, var10004);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var17.insert(var3, var30 - 1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "丠輪s\u0001".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 123;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      } else {
         var6 = 123;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 123;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 80;
               break;
            case 1:
               var23 = 44;
               break;
            case 2:
               var23 = 50;
               break;
            case 3:
               var23 = 90;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 91;
               break;
            default:
               var23 = 48;
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





