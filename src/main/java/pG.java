import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class pG {
   KeyboardFocusManager H;
   ArrayList S;

   public pG() {
      com.c.c(297544026394429738L).set(this, new ArrayList());
      com.c.c(482860935260321369L).set(this, KeyboardFocusManager.getCurrentKeyboardFocusManager());
      ((KeyboardFocusManager)com.c.c(482860935260321369L).get(this)).addKeyEventDispatcher(new Oz_2(this));
   }

   public void o(Qh_2 var1) {
      ((ArrayList)com.c.c(297544026394429738L).get(this)).add(var1);
   }

   void W(KeyEvent var1) {
      int[] var10000 = zG.Z();
      Window var3 = SwingUtilities.getWindowAncestor(var1.getComponent());
      int[] var2 = var10000;
      KeyStroke var4 = KeyStroke.getKeyStrokeForEvent(var1);
      Object[] var18 = com.c.f();
      Method var19 = com.c.d(270389152141252877L);
      Object[] var59 = var18;
      Method var38 = null;

      try {
         var10000 = (int[])var19.invoke(var38, var59);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      var38 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var59 = (Object[])var38;
      var38 = var10000;
      Method var21 = var10003;

      try {
         var22 = (u6_2)var21.invoke(var38, var59);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      u6_2 var5 = var22;
      var59 = com.c.a(com.c.c(324822989783513741L).getInt(null));
      Method var10004 = com.c.d(487190762664997585L);
      Object[] var73 = var59;
      u6_2 var62 = var5;
      var38 = var10004;

      try {
         var38 = (Method)var38.invoke(var62, var73);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var59 = com.c.f();
      var10004 = com.c.d(546345160214988812L);
      Object[] var74 = var59;
      var59 = var38;
      var38 = var10004;

      try {
         var44 = (KeyStroke)var38.invoke(var59, var74);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      boolean var23 = var4.equals(var44);
      if (var2 == null) {
         if (!var23) {
            return;
         }

         var23 = var3.getClass().equals(o2_2.class);
      }

      if (!var23) {
         Object[] var24 = com.c.f();
         Method var25 = com.c.d(270389152141252877L);
         var59 = var24;
         var38 = null;

         try {
            var10000 = (int[])var25.invoke(var38, var59);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         Object[] var47 = com.c.f();
         var10003 = com.c.d(634817973682994708L);
         var59 = var47;
         var38 = var10000;
         Method var27 = var10003;

         try {
            var10000 = (int[])var27.invoke(var38, var59);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         Object[] var49 = com.c.f();
         var10003 = com.c.d(240567170779145617L);
         var59 = var49;
         var38 = var10000;
         Method var29 = var10003;

         try {
            var10000 = (int[])var29.invoke(var38, var59);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         Object[] var51 = com.c.f();
         var10003 = com.c.d(402818413346430437L);
         var59 = var51;
         var38 = var10000;
         Method var31 = var10003;

         try {
            var32 = (U)var31.invoke(var38, var59);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         U var6 = var32;
         U var33 = var6;
         if (var2 == null) {
            Object[] var53 = com.c.f();
            var10003 = com.c.d(337722834808748729L);
            var59 = var53;
            U var54 = var6;
            Method var34 = var10003;

            try {
               var35 = (KQ)var34.invoke(var54, var59);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            if (!var35.isVisible()) {
               Object[] var55 = com.c.f();
               var10003 = com.c.d(385826789103549433L);
               var59 = var55;
               U var56 = var6;
               Method var36 = var10003;

               try {
                  var36.invoke(var56, var59);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               if (var2 == null) {
                  return;
               }
            }

            var33 = var6;
         }

         Object[] var57 = com.c.f();
         var10003 = com.c.d(522547499406886283L);
         var59 = var57;
         U var58 = var33;
         Method var37 = var10003;

         try {
            var37.invoke(var58, var59);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }
}





